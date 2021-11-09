//package maxonline.client
//
//import kotlinx.browser.document
//import maxonline.js.hasPointerLock
//import maxonline.js.movementX
//import maxonline.js.movementY
//import maxonline.js.requestPointerLock
//import maxonline.shared.GameCircle
//import maxonline.shared.GameMessage
//import maxonline.shared.Player
//import maxonline.shared.PlayerMessage
//import org.w3c.dom.HTMLCanvasElement
//
//class Game(
//    player: Player,
//    //stage: Stage,
//    val canvas: HTMLCanvasElement,
//    val network: Network
//) {
//
//    val gamePlayer: GamePlayer;
//    var players: HashMap<PlayerId, GamePlayer> = HashMap()
//    //var circles: HashMap<GameCircle, Circle> = HashMap()
//
//    private val gameContainer = Container()
//
//    init {
//        gamePlayer = createPlayer(player)
//        gameContainer.addChild(gamePlayer.view)
//        gameContainer.addChild(Circle(3.0).xy(100, 100))
//        gameContainer.addChild(Circle(4.0).xy(200, 200))
//        gameContainer.addChild(Circle(5.0).xy(400, 200))
//        val circle = Circle(50.0).xy(100, 400)
//        gameContainer.addChild(circle)
//
//        gameContainer.addFixedUpdater(timesPerSecond = Frequency(10.0), limitCallsPerFrame = 1) {
//            sendStateToServer()
//        }
//
//        val cameraBounds = ClipContainer(1000.0, 1000.0)
//        val camera = Camera()
//        cameraBounds.addChild(camera)
//        camera.addChild(gameContainer)
//        stage.addChild(cameraBounds)
//        //camera.setTo(circle)
//
//        stage.onDown {
//            if (document.hasPointerLock().not()) {
//                canvas.requestPointerLock()
//            } else {
//                network.sendMessage(PlayerMessage(clicked = true))
//            }
//
//            println("canvas width:    ${canvas.width}   stage width:  ${stage.width}  stage.scaledwidth/2:    ${stage.scaledWidth /2 } stage.scaledHeight/2:    ${stage.scaledHeight /2 }gameWindow width:  ${stage.gameWindow.width} stage.x:  ${stage.x}")
//            println("stage.x${stage.x} + gamePlayer.view.x${gamePlayer.view.x} * stage.scaleX${stage.scaleX} - stage.scaledWidth/2${stage.scaledWidth /2 } = ${stage.x + gamePlayer.view.x * stage.scaleX - stage.scaledWidth / 4}")
//        }
//
//        var zoom = 1.0
//
//        canvas.onmousemove = {
//            if (document.hasPointerLock()) {
//                gamePlayer.view.x += it.movementX()
//                gamePlayer.view.y += it.movementY()
//            }
//        }
//        stage.addUpdater {
//            camera.setTo(
//                Rectangle(
//                    stage.x + gamePlayer.view.x * stage.scaleX - stage.scaledWidth / 2*zoom,
//                    stage.y + gamePlayer.view.y * stage.scaleY - stage.scaledHeight / 2*zoom,
//                    stage.scaledWidth*zoom,
//                    stage.scaledWidth*zoom,
//                )
//            )
//        }
//        canvas.onwheel = {
//            zoom +=  it.deltaY * 0.05
//            zoom = minOf( maxOf(zoom, 0.3) , 3.0)
//            ""
//        }
//
//
//    }
//
//    private var lastPlayersUpdate = DateTime.now().unixMillisLong
//
//    fun onMessage(gameMessage: GameMessage) {
//        if (gameMessage.players != null) {
//            val now = DateTime.now().unixMillisLong
//            val timeToNextUpdate = (now - lastPlayersUpdate)
//            lastPlayersUpdate = now
//
//            val playersFromServer = gameMessage.players//.filterNot { it.playerId == gamePlayer.playerId }
//            HandlePlayersUpdate(playersFromServer, timeToNextUpdate)
//            handleCirclesUpdate(gameMessage.circles)
//        }
//    }
//
//    private fun handleCirclesUpdate(circlesFromServer: List<GameCircle>?) {
//        circlesFromServer?.forEach { serverCircle ->
//            if (circles.contains(serverCircle)) {
//                circles[serverCircle]!!.radius = serverCircle.diameter / 2.0
//            } else {
//                val view = Circle(
//                    serverCircle.diameter / 2.0,
//                    RGBA(
//                        serverCircle.red.toInt(),
//                        serverCircle.blue.toInt(),
//                        serverCircle.green.toInt()
//                    )
//                ).xy(serverCircle.x.toInt(), serverCircle.y.toInt())
//                    .center()
//                circles[serverCircle] = view
//                gameContainer.addChild(view)
//            }
//        }
//        circles.filterKeys { !(circlesFromServer?.contains(it) ?: false) }
//
//    }
//
//    private fun HandlePlayersUpdate(
//        playersFromServer: List<Player>,
//        timeToNextUpdate: Long
//    ) {
//        playersFromServer.forEach {
//            val player = if (players.containsKey(it.playerId)) {
//                players[it.playerId]!!
//            } else {
//                val newPlayer = createPlayer(it)
//                gameContainer.addChild(newPlayer.view)
//                players[it.playerId] = newPlayer
//                newPlayer
//            }
//
//            gamePlayer.updater.interpolate(
//                player.view::y[it.y.toDouble()],
//                player.view::x[it.x.toDouble()],
//                time = timeToNextUpdate.milliseconds
//            )
//        }
//
//        val playersMap = playersFromServer.associateBy { it.playerId }
//        players.filterKeys { !playersMap.containsKey(it) }
//            .run {
//                forEach {
//                    gameContainer.removeChild(it.value.view)
//                    players.remove(it.key)
//                }
//            }
//    }
//
//    fun sendStateToServer() {
//        network.sendMessage(
//            PlayerMessage(
//                Player(
//                    gamePlayer.view.x.toInt().toShort(),
//                    gamePlayer.view.y.toInt().toShort(),
//                    0,
//                    0,
//                    0,
//                    0,
//                    gamePlayer.playerId
//                )
//            )
//        )
//    }
//
//    private fun createPlayer(player: Player): GamePlayer {
//        val view = SolidRect(
//            width = 20.0,
//            height = 5.0,
//            color = RGBA(player.red.toInt(), player.blue.toInt(), player.green.toInt())
//        )
//        return GamePlayer(
//            player.playerId, view,
//            gameContainer.interpolationTween(
//                view::y[player.y.toDouble()],
//                view::x[player.x.toDouble()],
//                time = 50.milliseconds,
//            )
//        )
//    }
//
//}