package maxonline.server

import io.ktor.http.cio.websocket.Frame
import io.ktor.websocket.DefaultWebSocketServerSession
import maxonline.shared.Player
import maxonline.shared.PlayerPosition
import maxonline.shared.toByteArray
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.sqrt
import kotlin.random.Random
import kotlin.random.nextUBytes

class GameServer {
    private val log: Logger = LoggerFactory.getLogger(this.javaClass.name)

    private val sessionToPlayers = HashMap<DefaultWebSocketServerSession, Player>()
    private var currentGoalPixel = newGoalPixel()

    suspend fun onMessage(
        bytes: ByteArray,
        session: DefaultWebSocketServerSession
    ) {
        val playerPosition = PlayerPosition(bytes)

        val distanceToGoal = getDistance(playerPosition.x, playerPosition.y, currentGoalPixel)
        val player = sessionToPlayers[session] ?: createNewPlayer(playerPosition, distanceToGoal.toShort())
        sessionToPlayers[session] = player.copy(
            x = playerPosition.x,
            y = playerPosition.y,
            distance = distanceToGoal.toShort()
        )
        if (distanceToGoal == 0) {
            sessionToPlayers[session] = player.copy(score = player.score.inc())

            currentGoalPixel = newGoalPixel()
            sessionToPlayers.putAll(sessionToPlayers.map { entry ->
                val distanceToNewGoal = getDistance(entry.value.x, entry.value.y, currentGoalPixel)
                entry.key to entry.value.copy(distance = distanceToNewGoal.toShort())
            })

        }

        session.send(
            Frame.Binary(true, toByteArray(sessionToPlayers.values.toList()))
        )
    }

    fun onClose(session: DefaultWebSocketServerSession) {
        sessionToPlayers.remove(session)
    }

    private fun newGoalPixel(): Pair<Short, Short> {
        val pixel = Pair(Random.nextInt(0, 1200).toShort(), Random.nextInt(0, 800).toShort())
        log.info("New goal: $pixel")
        return pixel
    }

    private fun createNewPlayer(playerPosition: PlayerPosition, closeness: Short): Player {
        val random = Random
        return Player(
            x = playerPosition.x,
            y = playerPosition.y,
            distance = closeness,
            red = random.nextUBytes(1)[0],
            green = random.nextUBytes(1)[0],
            blue = random.nextUBytes(1)[0],
            score = 0
        )
    }

    private fun getDistance(x1: Short, y1: Short, xy2: Pair<Short, Short>): Int {
        val x2 = xy2.first
        val y2 = xy2.second
        return sqrt((x1.toDouble() - x2).pow(2.0) + (y1.toDouble() - y2).pow(2.0)).roundToInt()
    }
}