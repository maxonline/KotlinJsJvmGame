package maxonline.client


import com.soywiz.korge.Korge
import com.soywiz.korge.view.Stage
import com.soywiz.korge.view.View
import com.soywiz.korgw.GameWindow
import com.soywiz.korim.color.Colors
import kotlinx.browser.document
import maxonline.korge.InterpolationTween
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
        debug = true
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
            game = Game(gameMessage.handshake.you, korgeStage!!, canvas, network!!)
        } else {
            println("recieved no handshake :(")
        }
    }
}

data class GamePlayer(val playerId: PlayerId, val view: View, val updater: InterpolationTween)


