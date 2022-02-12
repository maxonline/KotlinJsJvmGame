package maxonline.server

import io.ktor.http.cio.websocket.Frame
import io.ktor.websocket.DefaultWebSocketServerSession
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.encodeToByteArray
import kotlinx.serialization.protobuf.ProtoBuf
import maxonline.shared.*
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import kotlin.concurrent.fixedRateTimer
import kotlin.random.Random

class GameServer {
    private val log: Logger = LoggerFactory.getLogger(this.javaClass.name)

    private val sessionToPlayers = HashMap<DefaultWebSocketServerSession, Player>()
    private var circles: List<GameCircle> = ArrayList()
    private val map: MapTiles
    private var lastId: Short = 1

    private val format = ProtoBuf { encodeDefaults = false }
    //private val format = Cbor { encodeDefaults = true }

    val random = Random

    init {
        var lastUpdateTime = System.currentTimeMillis()
        map = loadMap( this.javaClass.classLoader.getResource("map.png"))

        val timer = fixedRateTimer(period = 50) {
            val now = System.currentTimeMillis()
            val deltatime = now - lastUpdateTime;
            update(deltatime)
        }
    }

    private fun update(deltatime: Long) {
        val players = ArrayList(sessionToPlayers.values)

        circles = circles.mapNotNull {
            if (it.diameter < 1) {
                null
            } else {
                it.copy(diameter = (it.diameter - 1).toShort())
            }
        }

        sessionToPlayers.keys.forEach {
            GlobalScope.launch(CoroutineName("update-state-to-all")) {
                val frame = Frame.Binary(
                    true,
                    format.encodeToByteArray(GameMessage(players = players, circles = circles))
                )
                it.send(frame)
            }
        }
    }

    fun onMessage(
        bytes: ByteArray,
        session: DefaultWebSocketServerSession
    ) {
        val playerMessage = format.decodeFromByteArray<PlayerMessage>(bytes)

        if (playerMessage.handshake != null) {
            val storedPlayer = sessionToPlayers[session]
            if (storedPlayer == null) {
                val newPlayer = createNewPlayer()
                sessionToPlayers[session] = newPlayer
                val frame = Frame.Binary(
                    true,
                    format.encodeToByteArray(GameMessage(handshake = HandshakeFromServer(newPlayer, map)))
                )
                GlobalScope.launch(CoroutineName("send-single")) { session.send(frame) }
                println("Sent single to " + newPlayer)
            }
        }

        if (playerMessage.player != null) {
            val storedPlayer = sessionToPlayers[session]
            val updatedPlayer = storedPlayer!!.copy(x = playerMessage.player.x, y = playerMessage.player.y)
            sessionToPlayers[session] = updatedPlayer

        }

        if (playerMessage.clicked == true) {
            val player = sessionToPlayers[session]!!
            circles = circles +
                    GameCircle(
                        30,
                        player.x,
                        player.y,
                        player.red,
                        player.green,
                        player.blue,
                        player.playerId
                    )
        }
    }

    fun onClose(session: DefaultWebSocketServerSession) {
        sessionToPlayers.remove(session)
    }

    private fun createNewPlayer(): Player {
        return Player(
            x = 300,
            y = 300,
            red = random.nextBytes(1)[0],
            green = random.nextBytes(1)[0],
            blue = random.nextBytes(1)[0],
            score = 0,
            playerId = lastId++
        )
    }
}