package maxonline.client

import com.soywiz.klock.DateTime
import com.soywiz.klock.Frequency
import com.soywiz.klock.milliseconds
import com.soywiz.korge.input.onDown
import com.soywiz.korge.tween.get
import com.soywiz.korge.view.*
import com.soywiz.korge.view.Circle
import com.soywiz.korim.color.RGBA
import kotlinx.browser.document
import maxonline.korge.interpolationTween
import maxonline.shared.*
import org.w3c.dom.HTMLCanvasElement

class Game(
    player: Player,
    val stage: Stage,
    val canvas: HTMLCanvasElement,
    val network: Network
) {

    val gamePlayer: GamePlayer;
    var players: HashMap<PlayerId, GamePlayer> = HashMap()
    var circles: HashMap<GameCircle, Circle> = HashMap()

    init {
        gamePlayer = createPlayer(player)
        stage.addChild(gamePlayer.view)

        stage.addFixedUpdater(timesPerSecond = Frequency(10.0), limitCallsPerFrame = 1) {
            sendStateToServer()
        }

        stage.onDown {
            if (document.hasPointerLock().not()) {
                canvas.requestPointerLock()
            } else {
                network.sendMessage(PlayerMessage(clicked = true))
            }
        }

        canvas.onmousemove = {
            if (document.hasPointerLock()) {
                gamePlayer.view.x += it.movementX()
                gamePlayer.view.y += it.movementY()
            }
        }
    }

    private var lastPlayersUpdate = DateTime.now().unixMillisLong

    fun onMessage(gameMessage: GameMessage) {
        if (gameMessage.players != null) {
            val now = DateTime.now().unixMillisLong
            val timeToNextUpdate = (now - lastPlayersUpdate)
            lastPlayersUpdate = now

            val playersFromServer = gameMessage.players//.filterNot { it.playerId == gamePlayer.playerId }
            HandlePlayersUpdate(playersFromServer, timeToNextUpdate)
            handleCirclesUpdate(gameMessage.circles)
        }
    }

    private fun handleCirclesUpdate(circlesFromServer: List<GameCircle>?) {
        circlesFromServer?.forEach { serverCircle ->
            if (circles.contains(serverCircle)) {
                circles[serverCircle]!!.radius = serverCircle.diameter / 2.0
            } else {
                val view = Circle(
                    serverCircle.diameter / 2.0,
                    RGBA(
                        serverCircle.red.toInt(),
                        serverCircle.blue.toInt(),
                        serverCircle.green.toInt()
                    )
                ).xy(serverCircle.x.toInt(), serverCircle.y.toInt())
                    .center()
                circles[serverCircle] = view
                stage.addChild(view)
            }
        }
        circles.filterKeys { !(circlesFromServer?.contains(it) ?: false) }
    }

    private fun HandlePlayersUpdate(
        playersFromServer: List<Player>,
        timeToNextUpdate: Long
    ) {
        playersFromServer.forEach {
            val player = if (players.containsKey(it.playerId)) {
                players[it.playerId]!!
            } else {
                val newPlayer = createPlayer(it)
                stage.addChild(newPlayer.view)
                players[it.playerId] = newPlayer
                newPlayer
            }

            gamePlayer.updater.interpolate(
                player.view::y[it.y.toDouble()],
                player.view::x[it.x.toDouble()],
                time = timeToNextUpdate.milliseconds
            )
        }

        val playersMap = playersFromServer.associateBy { it.playerId }
        players.filterKeys { !playersMap.containsKey(it) }
            .run {
                forEach {
                    stage.removeChild(it.value.view)
                    players.remove(it.key)
                }
            }
    }

    fun sendStateToServer() {
        network.sendMessage(
            PlayerMessage(
                Player(
                    gamePlayer.view.x.toShort(),
                    gamePlayer.view.y.toShort(),
                    0,
                    0,
                    0,
                    0,
                    gamePlayer.playerId
                )
            )
        )
    }

    private fun createPlayer(player: Player): GamePlayer {
        val view = SolidRect(
            width = 20.0,
            height = 5.0,
            color = RGBA(player.red.toInt(), player.blue.toInt(), player.green.toInt())
        )
        return GamePlayer(
            player.playerId, view,
            stage.interpolationTween(
                view::y[player.y.toDouble()],
                view::x[player.x.toDouble()],
                time = 50.milliseconds,
            )
        )
    }

}