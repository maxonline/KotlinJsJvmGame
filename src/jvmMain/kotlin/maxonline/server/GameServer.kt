package maxonline.server

import io.ktor.http.cio.websocket.Frame
import io.ktor.websocket.DefaultWebSocketServerSession
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.encodeToByteArray
import kotlinx.serialization.protobuf.ProtoBuf
import maxonline.shared.GameMessage
import maxonline.shared.Player
import maxonline.shared.PlayerMessage
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import kotlin.random.Random

class GameServer {
    private val log: Logger = LoggerFactory.getLogger(this.javaClass.name)

    private val sessionToPlayers = HashMap<DefaultWebSocketServerSession, Player>()

    private val lastId:Short = 0

    suspend fun onMessage(
        bytes: ByteArray,
        session: DefaultWebSocketServerSession
    ) {
        val playerMessage = ProtoBuf.decodeFromByteArray<PlayerMessage>(bytes)

        val storedPlayer = sessionToPlayers[session]
        val player = if(storedPlayer == null) {
            val newPlayer = createNewPlayer(playerMessage.player)
            sessionToPlayers[session] = newPlayer
            newPlayer
        }
        else{
            val updatedPlayer = storedPlayer.copy(x = playerMessage.player.x, y = playerMessage.player.y)
            sessionToPlayers[session] = updatedPlayer
            updatedPlayer
        }

        val players = ArrayList(sessionToPlayers.values)
        val frame = Frame.Binary(true, ProtoBuf.encodeToByteArray(GameMessage(players, player.playerId)))
        session.send(
            frame
        )
    }

    fun onClose(session: DefaultWebSocketServerSession) {
        sessionToPlayers.remove(session)
    }

    private fun createNewPlayer(oldPlayer: Player): Player {
        val random = Random
        return Player(
            x = oldPlayer.x,
            y = oldPlayer.y,
            red = random.nextBytes(1)[0],
            green = random.nextBytes(1)[0],
            blue = random.nextBytes(1)[0],
            score = 0,
            playerId = lastId
        )
    }
}