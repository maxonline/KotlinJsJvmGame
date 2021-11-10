package maxonline.client


import kotlinx.browser.document
import kotlinx.browser.window
import maxonline.shared.GameMessage
import org.w3c.dom.HTMLCanvasElement
import pixi.typings.app.Application
import pixi.typings.app.resizeTo
import pixi.typings.loaders.Loader
import pixi.typings.sprite.Sprite
import pixi.typings.ticker.Ticker
import pixi.utils.create
import kotlin.random.Random

typealias PlayerId = Short

lateinit var network: Network
private var game: Game? = null

lateinit var app: Application

fun main() {
    println("js executing")
    pixi.typings.require("pixi.js")
    app = Application.create { backgroundColor = 08080808f }
    app.resizeTo = window

    val rootDiv = document.getElementById("root")
    rootDiv!!.appendChild(app.view)
    Loader.shared.add("test", "static/test.png").load(::start)
}

fun start() {
    println("start")
    val sprite = Sprite.from("static/test.png").apply {
        width = 100
        height = 100
        x = window.innerWidth / 2
        y = window.innerHeight / 2
    }

    Ticker.shared.add<Any>({ _, _ ->
        sprite.apply {
            x = Random.nextFloat() * window.innerWidth
            y = Random.nextFloat() * window.innerHeight
        }
        println("tick")
    })

    app.stage.addChild(sprite)

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



