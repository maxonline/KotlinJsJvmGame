package maxonline.client


import Two
import kotlinx.browser.document
import kotlinx.browser.window
import maxonline.shared.DeathCircle
import maxonline.shared.GameMessage
import maxonline.shared.Player
import maxonline.shared.PlayerMessage
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLDivElement
import kotlin.math.PI

val container: HTMLDivElement = document.getElementById("gameContainer") as HTMLDivElement
val network = Network("ws://" + document.location?.host) { onMessage(it) }

var me: Player = Player(0, 0, 0, 0, 0, 0, 0)
var players: Collection<Player> = ArrayList()
var deathCircles: List<DeathCircle> = ArrayList()

var myId: Short? = null;

var lastSendTimestamp = 0.0;


@ExperimentalUnsignedTypes
fun main() {
    val params = object  {
         var type: dynamic = "WebGLRenderer"
         var width: Number? = 1000
         var height: Number? = 800
    }

    val two = Two(params).appendTo(container)
    var circle = two.makeCircle(-70, 0, 50);
    var rect = two.makeRectangle(70, 0, 100, 100);
    circle.fill = "#FF8000";
    circle.stroke = "orangered";
    rect.fill = "rgba(0, 200, 255, 0.75)";
    rect.stroke = "#1C75BC";
    two.update()
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

