package maxonline.client

import kotlinx.browser.document
import kotlinx.browser.window
import maxonline.js.hasPointerLock
import maxonline.js.movementX
import maxonline.js.movementY
import maxonline.js.requestPointerLock
import maxonline.shared.*
import org.w3c.dom.HTMLCanvasElement
import pixi.typings.app.Application
import pixi.typings.display.Container
import pixi.typings.display.DisplayObject
import pixi.typings.graphics.Graphics
import pixi.typings.sprite.Sprite
import pixi.typings.ticker.Ticker
import pixi.typings.utils.rgb2hex
import kotlin.js.Date

class Game(
    player: Player,
    val pixiApp: Application,
    val canvas: HTMLCanvasElement,
    val network: Network,
    val map: MapTiles
) {
    val localPlayer: GamePlayer;
    var players: HashMap<PlayerId, GamePlayer> = HashMap()
    var circles: HashMap<GameCircle, DisplayObject> = HashMap()
    val masks = Container()


    init {
        (0 until   map.height).forEach { y ->
            (0 until map.width).forEach { x ->
                if (map.Map[TileCoordinate(x,y)] == Tile.WALL) {
                    print("#")
                } else {
                    print(" ")
                }
            }
            println()
        }


        val gr = Graphics()
        val renderer = pixiApp.renderer

        gr.beginFill(0.0);
        gr.drawCircle(30.0, 30.0, 30.0);
        gr.endFill();
        pixiApp.stage.addChild(gr)
        //masks.position.x = renderer.width/2
        //masks.position.y = renderer.height/2
        maxonline.client.pixiApp.stage.addChild(masks)

        val map = Container()
        map.position.x = renderer.width/2
        map.position.y = renderer.height/2

        val mapSprite = Sprite.from("static/map.png").apply {
            width = 2000.0
            height = 2000.0
            x = window.innerWidth / 2.0
            y = window.innerHeight / 2.0
        }

        map.addChild(mapSprite)

        map.mask = masks

        maxonline.client.pixiApp.stage.addChild(map)

        localPlayer = createPlayer(player)
        pixiApp.stage.addChild(localPlayer.view)

        pixiApp.stage.position.set(renderer.screen.width/2, renderer.screen.height/2);
        pixiApp.stage.scale.set(1.0)
        pixiApp.stage.pivot.set(localPlayer.view.x, localPlayer.view.y)

        val sendToServerTicker = Ticker()
        sendToServerTicker.maxFPS = 10.0
        sendToServerTicker.add<Any>({ _, _ ->
            sendStateToServer()
        })
        sendToServerTicker.start()

        canvas.onmousedown = {
            if (document.hasPointerLock().not()) {
                canvas.requestPointerLock()
            } else {
                network.sendMessage(PlayerMessage(clicked = true))
            }
        }

        var zoom = 1.0

        canvas.onmousemove = {
            if (document.hasPointerLock()) {
                localPlayer.view.apply {
                    x = localPlayer.view.x + it.movementX()
                    y = localPlayer.view.y + it.movementY()
                }
                pixiApp.stage.pivot.set(localPlayer.view.x, localPlayer.view.y); //now character inside stage is mapped to center of screen
            }
        }

        canvas.onwheel = {
            zoom += it.deltaY * 0.05
            zoom = minOf(maxOf(zoom, 0.3), 3.0)
            pixiApp.stage.scale.set(zoom)
            ""
        }
    }

    private var lastPlayersUpdate = Date.now()

    fun onMessage(gameMessage: GameMessage) {
        if (gameMessage.players != null) {
            val now = Date.now()
            val timeToNextUpdate = (now - lastPlayersUpdate)
            lastPlayersUpdate = now

            val playersFromServer = gameMessage.players//.filterNot { it.playerId == gamePlayer.playerId }
            HandlePlayersUpdate(playersFromServer, timeToNextUpdate.toLong())
            handleCirclesUpdate(gameMessage.circles)
        }
    }

    private fun handleCirclesUpdate(circlesFromServer: List<GameCircle>?) {
        circlesFromServer?.forEach { serverCircle ->
            if (circles.contains(serverCircle)) {
                //circles[serverCircle]!!.radius = serverCircle.diameter / 2.0
            } else {

                val gr = Graphics()
                val hexColor = rgb2hex(
                    arrayOf(
                        serverCircle.red.toDouble(),
                        serverCircle.green.toDouble(),
                        serverCircle.blue.toDouble()
                    )
                )
                gr.beginFill(hexColor);
                gr.drawCircle(serverCircle.x.toDouble(), serverCircle.y.toDouble(), serverCircle.diameter / 2.0);
                gr.endFill();
                circles[serverCircle] = gr
                masks.addChild(gr)
            }
        }
        circles.filterKeys { !(circlesFromServer?.contains(it) ?: false) }

    }

    private fun HandlePlayersUpdate(
        playersFromServer: List<Player>,
        timeToNextUpdate: Long
    ) {
        playersFromServer.filter { it.playerId != localPlayer.playerId }.forEach {
            val player = if (players.containsKey(it.playerId)) {
                players[it.playerId]!!
            } else {
                val newPlayer = createPlayer(it)
                pixiApp.stage.addChild(newPlayer.view)
                players[it.playerId] = newPlayer
                newPlayer
            }

            player.view.apply {
                x = it.x.toDouble()
                y = it.y.toDouble()
            }
        }

        val playersMap = playersFromServer.associateBy { it.playerId }
        players.filterKeys { !playersMap.containsKey(it) }
            .run {
                forEach {
                    pixiApp.stage.removeChild(it.value.view)
                    players.remove(it.key)
                }
            }
    }

    fun sendStateToServer() {
        val playerMessage = PlayerMessage(
            Player(
                localPlayer.view.x.toInt().toShort(),
                localPlayer.view.y.toInt().toShort(),
                0,
                0,
                0,
                0,
                localPlayer.playerId
            )
        )
        network.sendMessage(playerMessage)
    }

    private fun createPlayer(player: Player): GamePlayer {
        val gr = Graphics()
        rgb2hex(arrayOf(player.red.toDouble(), player.green.toDouble(), player.blue.toDouble()))
        val hexColor = rgb2hex(arrayOf(player.red.toDouble(), player.green.toDouble(), player.blue.toDouble()))
        gr.beginFill(hexColor)
        gr.drawRect(
            width = 20.0,
            height = 5.0,
            x = 0.0,
            y = 0.0
        )
        gr.endFill()

        return GamePlayer(
            player.playerId, gr
        )
    }

}

data class GamePlayer(val playerId: PlayerId, val view: DisplayObject)
