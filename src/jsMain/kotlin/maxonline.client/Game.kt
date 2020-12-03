package maxonline.client


import kotlinx.browser.document
import kotlinx.browser.window
import maxonline.shared.DeathCircle
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
var deathCircles: List<DeathCircle> = ArrayList()

var myId: Short? = null;

var lastSendTimestamp = 0.0;

var config = object {
    val width = 800
    val height = 600
    //val type: Phaser.WEBGL
    //val parent: 'phaser-example',

}

    var game  = Phaser.Game(config)


@ExperimentalUnsignedTypes
fun main() {

}
fun create() {

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


