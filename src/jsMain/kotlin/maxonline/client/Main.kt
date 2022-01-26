package maxonline.client


import kotlinx.browser.document
import kotlinx.browser.window
import maxonline.shared.GameMessage
import org.w3c.dom.HTMLCanvasElement
import pixi.typings.app.Application
import pixi.typings.loaders.Loader
import pixi.typings.sprite.Sprite
import pixi.typings.ticker.Ticker
import pixi.utils.Application
import kotlin.random.Random

typealias PlayerId = Short

lateinit var network: Network
private var game: Game? = null

lateinit var app: Application

fun main() {
    println("js executing")
    pixi.typings.require("pixi.js")
    app = Application {
        backgroundColor = (08080808f).toDouble()
        resizeTo = window
    }

    val rootDiv = document.getElementById("root")
    rootDiv!!.appendChild(app.view)
    Loader.shared.add("kotlin", "static/kotlin.png").load(::start)
}

fun start() {
    println("start")


    network = Network("ws://" + document.location?.host) { onMessage(it) }
    println("start done")

}

private fun onMessage(gameMessage: GameMessage) {
    if (game != null) {
        game!!.onMessage(gameMessage)
    } else {
        val canvas = document.getElementsByTagName("body").item(0)?.getElementsByTagName("canvas")
            ?.item(0) as HTMLCanvasElement

        if (gameMessage.handshake != null) {
            game = Game(gameMessage.handshake.you, app, canvas, network)
        } else {
            println("recieved no handshake :(")
        }
    }
}



