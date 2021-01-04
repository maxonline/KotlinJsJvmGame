package maxonline.client


import com.soywiz.klock.milliseconds
import com.soywiz.korge.Korge
import com.soywiz.korge.tween.get
import com.soywiz.korge.view.SolidRect
import com.soywiz.korge.view.Stage
import com.soywiz.korge.view.View
import com.soywiz.korgw.GameWindow
import com.soywiz.korim.color.Colors
import com.soywiz.korim.color.RGBA
import kotlinx.browser.document
import maxonline.korge.ConstantTween
import maxonline.korge.constantTween
import maxonline.shared.GameMessage
import org.w3c.dom.HTMLCanvasElement

typealias PlayerId = Short

private var network: Network? = Network("ws://" + document.location?.host) { onMessage(it) }
private var korgeStage: Stage? = null
private var game: Game? = null

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
    }
}

private fun onMessage(gameMessage: GameMessage) {
    if (game != null) {
        game!!.onMessage(gameMessage)
    } else {
        val canvas = document.getElementsByTagName("body").item(0)?.getElementsByTagName("canvas")
            ?.item(0) as HTMLCanvasElement

        if (gameMessage.handshake != null) {
            val newMe = gameMessage.handshake.you
            val view = SolidRect(
                width = 20.0,
                height = 5.0,
                color = RGBA(newMe.red.toInt(), newMe.blue.toInt(), newMe.green.toInt())
            )
            val gamePlayer = GamePlayer(
                newMe.playerId, view,
                korgeStage?.constantTween(
                    view::y[newMe.y.toDouble()],
                    view::x[newMe.x.toDouble()],
                    time = 50.milliseconds,
                )!!
            )
            korgeStage?.addChild(view)

            game = Game(gamePlayer, korgeStage!!, canvas, network!!)
        }else{
            println("recieved no handshake :(")
        }
    }
}

data class GamePlayer(val playerId: PlayerId, val view: View, val updater: ConstantTween)


