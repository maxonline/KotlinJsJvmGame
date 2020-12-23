package maxonline.client


import com.soywiz.klock.DateTime
import com.soywiz.klock.Frequency
import com.soywiz.klock.milliseconds
import com.soywiz.korge.Korge
import com.soywiz.korge.input.onDown
import com.soywiz.korge.tween.get
import com.soywiz.korge.view.*
import com.soywiz.korgw.GameWindow
import com.soywiz.korim.color.Colors
import com.soywiz.korim.color.RGBA
import kotlinx.browser.document
import maxonline.korge.ConstantTween
import maxonline.korge.constantTween
import maxonline.shared.DeathCircle
import maxonline.shared.GameMessage
import maxonline.shared.Player
import maxonline.shared.PlayerMessage
import org.w3c.dom.HTMLCanvasElement

var network: Network? = null

typealias PlayerId = Short

var me: GamePlayer = GamePlayer(playerId = 0, SolidRect(width = 20.0, height = 5.0, color = Colors.GREEN))
var players: HashMap<PlayerId, GamePlayer> = HashMap()
var deathCircles: List<DeathCircle> = ArrayList()

var myId: Short? = null
var canvas: HTMLCanvasElement? = null
var korgeStage: Stage? = null

suspend fun main() {
    Korge(
        width = 1000,
        height = 600,
        bgcolor = Colors.BURLYWOOD,
        targetFps = 120.0,
        quality = GameWindow.Quality.PERFORMANCE,
        debug = false
    ) {
        korgeStage = this


        addFixedUpdater(timesPerSecond = Frequency(10.0), limitCallsPerFrame = 1) {
            if (canvas == null) {
                canvas = document.getElementsByTagName("body").item(0)?.getElementsByTagName("canvas")
                    ?.item(0) as HTMLCanvasElement
            }

            sendStateToServer()
        }

        onDown {
            if (document.hasPointerLock().not()) {
                canvas?.requestPointerLock()
            } else {
                network?.sendMessage(PlayerMessage(clicked = true))
            }
        }

        canvas?.onmousemove = {
            if (document.hasPointerLock()) {
                me.view.x += it.movementX()
                me.view.y += it.movementY()
            }
        }
        network = Network("ws://" + document.location?.host) { onMessage(it) }

    }
}

fun sendStateToServer() {
    network?.sendMessage(PlayerMessage(Player(me.view.x.toShort(), me.view.y.toShort(), 0, 0, 0, 0, me.playerId)))
}

private var lastPlayersUpdate = DateTime.now().unixMillisLong

fun onMessage(gameMessage: GameMessage) {
    if(korgeStage == null){
        println("No korge stage on ONMEssage!")
        return
    }

    if (gameMessage.yourId != null) {
        myId = gameMessage.yourId
        korgeStage?.addChild(me.view)
    }
    if (gameMessage.players != null) {


        val updatedMe = gameMessage.players.first { it.playerId == myId }

        val now = DateTime.now().unixMillisLong
        val timeToNextUpdate = (now - lastPlayersUpdate)
        lastPlayersUpdate = now

        println("new onMessage. Next Tween lenght: " + timeToNextUpdate)

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
                korgeStage?.addChild(view)

                players[it.playerId] = GamePlayer(
                    it.playerId,
                    view.xy(it.x.toInt(), it.y.toInt()),
                    korgeStage?.constantTween(
                        view::y[it.y.toDouble()],
                        view::x[it.x.toDouble()],
                        time = timeToNextUpdate.milliseconds,
                    )!!
                )
            }

            //}


        }
        players.filter { localPlayer ->
            gameMessage.players.find { playerFromServer -> playerFromServer.playerId == localPlayer.key } == null
        }.run {
            forEach {
                korgeStage?.removeChild(it.value.view)
                players.remove(it.key)
            }
        }


    }

    if (gameMessage.deathCircles != null) {
        deathCircles = gameMessage.deathCircles
    }
}

data class GamePlayer(val playerId: PlayerId, val view: View, val updater: ConstantTween? = null)


