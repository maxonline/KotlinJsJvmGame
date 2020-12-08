package maxonline.client


import com.soywiz.korge.Korge
import com.soywiz.korge.input.onMouseDrag
import com.soywiz.korge.view.Circle
import com.soywiz.korge.view.center
import com.soywiz.korge.view.xy
import com.soywiz.korgw.GameWindow
import com.soywiz.korim.color.Colors
import kotlinx.browser.document
import kotlinx.browser.window
import maxonline.shared.DeathCircle
import maxonline.shared.GameMessage
import maxonline.shared.Player
import maxonline.shared.PlayerMessage
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement
import kotlin.math.PI

val canvas: HTMLCanvasElement = document.getElementById("gameCanvas") as HTMLCanvasElement
val context: CanvasRenderingContext2D = canvas.getContext("2d") as CanvasRenderingContext2D
val network = Network("ws://" + document.location?.host) { onMessage(it) }

var me: Player = Player(0, 0, 0, 0, 0, 0, 0)
var players: Collection<Player> = ArrayList()
var deathCircles: List<DeathCircle> = ArrayList()

var myId: Short? = null;

var lastSendTimestamp = 0.0;

suspend fun main() = Korge(width = 1000, height = 600,virtualHeight = 600,virtualWidth = 1000, bgcolor = Colors.BURLYWOOD, targetFps = 120.0, quality = GameWindow.Quality.PERFORMANCE, debug = true) {
    onMouseDrag {
        val circle = Circle(radius = 20.0, fill = Colors.LIGHTGREEN).center().xy(this.globalMouseX, this.globalMouseY)
        addChild(circle)
    }
}

@ExperimentalUnsignedTypes
fun notMain() {
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

fun sendStateToServer() {
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

    if(gameMessage.deathCircles != null){
        deathCircles = gameMessage.deathCircles
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
    deathCircles.forEach {
        paintDeathCircle(
            it.x.toDouble(),
            it.y.toDouble(),
            "rgba(${it.red.toUByte()} ,${it.green.toUByte()} ,${it.blue.toUByte()}, 0.9 )",
            diameter =  it.diameter.toDouble(),
        )

    }

    if (window.performance.now() - lastSendTimestamp > 100) {
        sendStateToServer()
    }

    window.requestAnimationFrame { loop() }
}

private fun paintMouse(x: Double, y: Double, fillStyle: String) {
    context.beginPath();
    context.moveTo(x, y);
    context.lineTo(x+15, y+2);
    context.lineTo(x+10, y+10);
    context.fillStyle = fillStyle
    context.fill();
}

private fun paintDeathCircle(x: Double, y: Double, fillStyle: String, diameter: Double) {
    context.beginPath();
    context.arc(x, y, diameter/2, 0.0, 2 * PI, false);
    context.fillStyle = fillStyle
    context.fill();
}

