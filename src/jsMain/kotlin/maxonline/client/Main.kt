package maxonline.client


import kotlinx.browser.document
import kotlinx.browser.window
import maxonline.shared.GameMessage
import org.w3c.dom.HTMLCanvasElement
import pixi.typings.app.Application
import pixi.typings.constants.SCALE_MODES
import pixi.typings.loaders.Loader
import pixi.typings.settings.settings
import pixi.utils.Application

typealias PlayerId = Short

lateinit var network: Network
private var game: Game? = null

lateinit var pixiApp: Application

fun main() {
    println("js executing")
    pixi.typings.require("pixi.js")
    pixiApp = Application {
        backgroundColor = (08080808f).toDouble()
        resizeTo = window
    }
    settings.SCALE_MODE = SCALE_MODES.NEAREST

    val rootDiv = document.getElementById("root")
    rootDiv!!.appendChild(pixiApp.view)
    Loader.shared.add("map", "static/map.png").load(::start)
}

fun start() {
    network = Network("ws://" + document.location?.host) { onMessage(it) }

}

private fun onMessage(gameMessage: GameMessage) {
    if (game != null) {
        game!!.onMessage(gameMessage)
    } else {
        val canvas = document.getElementsByTagName("body").item(0)?.getElementsByTagName("canvas")
            ?.item(0) as HTMLCanvasElement

        if (gameMessage.handshake != null) {
            game = Game(gameMessage.handshake.you, pixiApp, canvas, network, gameMessage.handshake.map)
        } else {
            println("recieved no handshake :(")
        }
    }
}
