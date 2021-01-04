package maxonline.client

import com.soywiz.klock.DateTime
import com.soywiz.klock.Frequency
import com.soywiz.klock.milliseconds
import com.soywiz.korge.input.onDown
import com.soywiz.korge.tween.get
import com.soywiz.korge.view.SolidRect
import com.soywiz.korge.view.Stage
import com.soywiz.korge.view.addFixedUpdater
import com.soywiz.korge.view.xy
import com.soywiz.korim.color.RGBA
import kotlinx.browser.document
import maxonline.korge.constantTween
import maxonline.shared.GameMessage
import maxonline.shared.Player
import maxonline.shared.PlayerMessage
import org.w3c.dom.HTMLCanvasElement

class Game(
    val gamePlayer: GamePlayer,
    val stage: Stage,
    val canvas: HTMLCanvasElement,
    val network: Network
) {

    var players: HashMap<PlayerId, GamePlayer> = HashMap()

    init {
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
            val updatedMe = gameMessage.players.first { it.playerId == gamePlayer.playerId }

            val now = DateTime.now().unixMillisLong
            val timeToNextUpdate = (now - lastPlayersUpdate)
            lastPlayersUpdate = now

            gameMessage.players.forEach {
                //if (it != updatedMe) {
                if (players.containsKey(it.playerId)) {
                    val gamePlayer = players[it.playerId]!!
                    val view = gamePlayer.view
                    gamePlayer.updater?.newVariables(
                        view::y[it.y.toDouble()],
                        view::x[ it.x.toDouble()],
                        time = timeToNextUpdate.milliseconds)


                } else {
                    val view = SolidRect(
                        width = 20.0,
                        height = 5.0,
                        color = RGBA(it.red.toInt(), it.blue.toInt(), it.green.toInt())
                    )
                    stage.addChild(view)

                    players[it.playerId] = GamePlayer(
                        it.playerId,
                        view.xy(it.x.toInt(), it.y.toInt()),
                        stage.constantTween(
                            view::y[it.y.toDouble()],
                            view::x[it.x.toDouble()],
                            time = timeToNextUpdate.milliseconds,
                        )
                    )
                }

                //}


            }
            players.filter { localPlayer ->
                gameMessage.players.find { playerFromServer -> playerFromServer.playerId == localPlayer.key } == null
            }.run {
                forEach {
                    stage.removeChild(it.value.view)
                    players.remove(it.key)
                }
            }


        }

        if (gameMessage.deathCircles != null) {
            //deathCircles = gameMessage.deathCircles
        }
    }

    fun sendStateToServer() {
        network.sendMessage(PlayerMessage(Player(gamePlayer.view.x.toShort(), gamePlayer.view.y.toShort(), 0, 0, 0, 0, gamePlayer.playerId)))
    }

}