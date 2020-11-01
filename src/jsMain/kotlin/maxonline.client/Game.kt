package maxonline.client


import kotlinx.browser.document
import kotlinx.browser.window
import maxonline.shared.GameMessage
import maxonline.shared.Player
import maxonline.shared.PlayerMessage
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement

val canvas: HTMLCanvasElement = document.getElementById("gameCanvas") as HTMLCanvasElement
val context: CanvasRenderingContext2D = canvas.getContext("2d") as CanvasRenderingContext2D
val network = Network("ws://" + document.location?.host) { onMessage(it) }

var me: Player = Player(0, 0, 0, 0, 0, 0, 0)
var players: Collection<Player> = ArrayList()

var myId: Short? = null;

var lastSendTimestamp = 0.0;

@ExperimentalUnsignedTypes
fun main() {
    canvas.width = 800
    canvas.height = 600


    canvas.onmousedown = {
        if (document.asDynamic().pointerLockElement != null) {
            network.sendMessage(PlayerMessage(clicked = true))
        } else {
            canvas.asDynamic().requestPointerLock()
        }
    }

    canvas.onmousemove = {
        if (document.asDynamic().pointerLockElement != null) {
            val x = me.x + it.asDynamic().movementX as Double
            val y = me.y + it.asDynamic().movementY as Double
            me = me.copy(x = x.toShort(), y = y.toShort())
            canvas.asDynamic().requestPointerLock()
        }
    }
    window.onload = {
        loop()
    }
}

fun sendState() {
    network.sendMessage(PlayerMessage(me))
    lastSendTimestamp = window.performance.now()
}

fun onMessage(gameMessage: GameMessage) {
    if (gameMessage.yourId != null) {
         myId = gameMessage.yourId
    }
    if (gameMessage.players != null) {
        me = gameMessage.players.first { it.playerId == myId }.copy(x = me.x, y = me.y)
        players = gameMessage.players.filterNot { it.playerId == myId }
    }
}


fun loop() {
    context.setTransform(1.0, 0.0, 0.0, 1.0, 0.0, 0.0);//reset the transform matrix as it is cumulative
    context.clearRect(
        0.0,
        0.0,
        canvas.width.toDouble(),
        canvas.height.toDouble()
    )

    val x = me.x.toDouble()
    val y = me.y.toDouble()
    context.translate(-x + canvas.width.toDouble() / 2, -y + canvas.width.toDouble() / 2);

    context.fillStyle = "black"
    context.fillRect(100.0, 100.0, 10.0, 10.0);

    paintMouse(x, y, "rgba(${me.red.toUByte()} ,${me.green.toUByte()} ,${me.blue.toUByte()}, 1 )")

    players.forEach {
        paintMouse(
            it.x.toDouble(),
            it.y.toDouble(),
            "rgba(${it.red.toUByte()} ,${it.green.toUByte()} ,${it.blue.toUByte()}, 0.8 )"
        )

    }

    if (window.performance.now() - lastSendTimestamp > 100) {
        sendState()
    }

    window.requestAnimationFrame { loop() }
}

private fun paintMouse(x: Double, y: Double, fillStyle: String) {
    context.fillStyle = fillStyle
    context.fillRect(x, y, 10.0, 2.0); // mouse
    context.fillRect(x + 3, y-3, 2.0, 6.0); // mouse
}

