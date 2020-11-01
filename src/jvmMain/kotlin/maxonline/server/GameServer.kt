package maxonline.server

import io.ktor.http.cio.websocket.Frame
import io.ktor.websocket.DefaultWebSocketServerSession
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.encodeToByteArray
import kotlinx.serialization.protobuf.ProtoBuf
import maxonline.shared.DeathCircle
import maxonline.shared.GameMessage
import maxonline.shared.Player
import maxonline.shared.PlayerMessage
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import kotlin.concurrent.fixedRateTimer
import kotlin.random.Random

class GameServer {
    private val log: Logger = LoggerFactory.getLogger(this.javaClass.name)

    private val sessionToPlayers = HashMap<DefaultWebSocketServerSession, Player>()
    private var deathCircles: List<DeathCircle> = ArrayList()

    private var lastId: Short = 1

    private val format = ProtoBuf { encodeDefaults = false }
    //private val format = Cbor { encodeDefaults = true }

    val random = Random

    init {
        var lastUpdateTime = System.currentTimeMillis()

        val timer = fixedRateTimer(period = 50) {
            val now = System.currentTimeMillis()
            val deltatime = now - lastUpdateTime;
            update(deltatime)
        }
    }

    private fun update(deltatime: Long) {
        val players = ArrayList(sessionToPlayers.values)

        deathCircles = deathCircles.mapNotNull {
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
                    format.encodeToByteArray(GameMessage(players = players, deathCircles = deathCircles))
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

        if (playerMessage.player != null) {
            val storedPlayer = sessionToPlayers[session]
            if (storedPlayer == null) {
                val newPlayer = createNewPlayer(playerMessage.player)
                sessionToPlayers[session] = newPlayer
                val frame = Frame.Binary(true, format.encodeToByteArray(GameMessage(yourId = newPlayer.playerId)))
                GlobalScope.launch(CoroutineName("send-single")) { session.send(frame) }
            } else {
                val updatedPlayer = storedPlayer.copy(x = playerMessage.player.x, y = playerMessage.player.y)
                sessionToPlayers[session] = updatedPlayer
            }
        }

        if (playerMessage.clicked == true) {
            val player = sessionToPlayers[session]!!
            deathCircles = deathCircles +
                    DeathCircle(
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

    private fun createNewPlayer(oldPlayer: Player): Player {
        return Player(
            x = oldPlayer.x,
            y = oldPlayer.y,
            red = random.nextBytes(1)[0],
            green = random.nextBytes(1)[0],
            blue = random.nextBytes(1)[0],
            score = 0,
            playerId = lastId++
        )
    }
}