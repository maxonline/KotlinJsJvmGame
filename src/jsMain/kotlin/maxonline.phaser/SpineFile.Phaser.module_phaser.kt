@file:JsModule("phaser")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import integer
import Phaser.Types.Core.GameConfig
import Phaser.Core.Config
import Phaser.Events.EventEmitter
import Phaser.Animations.AnimationManager
import Phaser.Textures.TextureManager
import Phaser.Cache.CacheManager
import Phaser.Data.DataManager
import Phaser.Input.InputManager
import Phaser.Scenes.SceneManager
import Phaser.Scale.ScaleManager
import Phaser.Core.TimeStep
import Phaser.Plugins.PluginManager
import Phaser.Device.OS
import Phaser.Device.Browser
import Phaser.Device.Features
import Phaser.Device.Input
import Phaser.Device.Audio
import Phaser.Device.Video
import Phaser.Device.Fullscreen
import Phaser.Device.CanvasFeatures
import Phaser.Types.Scenes.SettingsConfig
import Phaser.Scenes.Systems
import Phaser.Sound.BaseSoundManager
import Phaser.Cameras.Scene2D.CameraManager
import Phaser.GameObjects.GameObjectFactory
import Phaser.GameObjects.GameObjectCreator
import Phaser.Scenes.ScenePlugin
import Phaser.GameObjects.DisplayList
import Phaser.GameObjects.LightsManager
import Phaser.Input.InputPlugin
import Phaser.Loader.LoaderPlugin
import Phaser.Time.Clock
import Phaser.Tweens.TweenManager
import Phaser.Physics.Arcade.ArcadePhysics
import Phaser.Physics.Matter.MatterPhysics
import Product
import Purchase
import AdInstance
import ChooseContextConfig
import LeaderboardScore

external var VERSION: String

external var AUTO: integer

external var CANVAS: integer

external var WEBGL: integer

external var HEADLESS: integer

external var FOREVER: integer

external var NONE: integer

external var UP: integer

external var DOWN: integer

external var LEFT: integer

external var RIGHT: integer

external open class Game(GameConfig: GameConfig = definedExternally) {
    open var config: Config
    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */
    open var domContainer: HTMLDivElement
    open var canvas: HTMLCanvasElement
    open var context: dynamic /* CanvasRenderingContext2D | WebGLRenderingContext */
    open var isBooted: Boolean
    open var isRunning: Boolean
    open var events: EventEmitter
    open var anims: AnimationManager
    open var textures: TextureManager
    open var cache: CacheManager
    open var registry: DataManager
    open var input: InputManager
    open var scene: SceneManager
    open var device: DeviceConf
    open var scale: ScaleManager
    open var sound: dynamic /* Phaser.Sound.NoAudioSoundManager | Phaser.Sound.HTML5AudioSoundManager | Phaser.Sound.WebAudioSoundManager */
    open var loop: TimeStep
    open var plugins: PluginManager
    open var facebook: FacebookInstantGamesPlugin
    open var hasFocus: Boolean
    open fun boot()
    open fun start()
    open fun step(time: Number, delta: Number)
    open fun headlessStep(time: Number, delta: Number)
    open fun onHidden()
    open fun onVisible()
    open fun onBlur()
    open fun onFocus()
    open fun getFrame(): Number
    open fun getTime(): Number
    open fun destroy(removeCanvas: Boolean, noReturn: Boolean = definedExternally)
}

external interface DeviceConf {
    var os: OS
    var browser: Browser
    var features: Features
    var input: Input
    var audio: Audio
    var video: Video
    var fullscreen: Fullscreen
    var canvasFeatures: CanvasFeatures
}

external enum class CSSBlendModes {

}

external enum class BlendModes {
    SKIP_CHECK,
    NORMAL,
    ADD,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    ERASE,
    SOURCE_IN,
    SOURCE_OUT,
    SOURCE_ATOP,
    DESTINATION_OVER,
    DESTINATION_IN,
    DESTINATION_OUT,
    DESTINATION_ATOP,
    LIGHTER,
    COPY,
    XOR
}

external enum class ScaleModes {
    DEFAULT,
    LINEAR,
    NEAREST
}

external open class Scene {
    constructor(config: String)
    constructor(config: SettingsConfig)
    open var sys: Systems
    open var game: Game
    open var anims: AnimationManager
    open var cache: CacheManager
    open var registry: DataManager
    open var sound: BaseSoundManager
    open var textures: TextureManager
    open var events: EventEmitter
    open var cameras: CameraManager
    open var add: GameObjectFactory
    open var make: GameObjectCreator
    open var scene: ScenePlugin
    open var children: DisplayList
    open var lights: LightsManager
    open var data: DataManager
    open var input: InputPlugin
    open var load: LoaderPlugin
    open var time: Clock
    open var tweens: TweenManager
    open var physics: ArcadePhysics
    open var matter: MatterPhysics
    open var facebook: FacebookInstantGamesPlugin
    open var scale: ScaleManager
    open var plugins: PluginManager
    open fun update(time: Number, delta: Number)
}

external open class FacebookInstantGamesPlugin(game: Game) : EventEmitter {
    open var game: Game
    open var data: DataManager
    open var hasLoaded: Boolean
    open var dataLocked: Boolean
    open var supportedAPIs: Array<String>
    open var entryPoint: String
    open var entryPointData: Any
    open var contextID: String
    open var contextType: String
    open var locale: String
    open var platform: String
    open var version: String
    open var playerID: String
    open var playerName: String
    open var playerPhotoURL: String
    open var playerCanSubscribeBot: Boolean
    open var paymentsReady: Boolean
    open var catalog: Array<Product>
    open var purchases: Array<Purchase>
    open var leaderboards: Array<FacebookInstantGamesLeaderboard>
    open var ads: Array<AdInstance>
    open fun showLoadProgress(scene: Scene): FacebookInstantGamesPlugin /* this */
    open fun gameStarted()
    open fun checkAPI(api: String): Boolean
    open fun getID(): String
    open fun getType(): String
    open fun getLocale(): String
    open fun getPlatform(): String
    open fun getSDKVersion(): String
    open fun getPlayerID(): String
    open fun getPlayerName(): String
    open fun getPlayerPhotoURL(): String
    open fun loadPlayerPhoto(scene: Scene, key: String): FacebookInstantGamesPlugin /* this */
    open fun canSubscribeBot(): FacebookInstantGamesPlugin /* this */
    open fun subscribeBot(): FacebookInstantGamesPlugin /* this */
    open fun getData(keys: String): FacebookInstantGamesPlugin /* this */
    open fun getData(keys: Array<String>): FacebookInstantGamesPlugin /* this */
    open fun saveData(data: Any?): FacebookInstantGamesPlugin /* this */
    open fun flushData(): FacebookInstantGamesPlugin /* this */
    open fun getStats(keys: Array<String> = definedExternally): FacebookInstantGamesPlugin /* this */
    open fun saveStats(data: Any?): FacebookInstantGamesPlugin /* this */
    open fun incStats(data: Any?): FacebookInstantGamesPlugin /* this */
    open fun saveSession(data: Any?): FacebookInstantGamesPlugin /* this */
    open fun openShare(text: String, key: String, frame: String = definedExternally, sessionData: Any? = definedExternally): FacebookInstantGamesPlugin /* this */
    open fun openInvite(text: String, key: String, frame: String = definedExternally, sessionData: Any? = definedExternally): FacebookInstantGamesPlugin /* this */
    open fun openRequest(text: String, key: String, frame: String = definedExternally, sessionData: Any? = definedExternally): FacebookInstantGamesPlugin /* this */
    open fun openChallenge(text: String, key: String, frame: String = definedExternally, sessionData: Any? = definedExternally): FacebookInstantGamesPlugin /* this */
    open fun isSizeBetween(min: integer = definedExternally, max: integer = definedExternally): Any?
    open fun switchContext(contextID: String): FacebookInstantGamesPlugin /* this */
    open fun chooseContext(options: ChooseContextConfig = definedExternally): FacebookInstantGamesPlugin /* this */
    open fun createContext(playerID: String): FacebookInstantGamesPlugin /* this */
    open fun getPlayers(): FacebookInstantGamesPlugin /* this */
    open fun getCatalog(): FacebookInstantGamesPlugin /* this */
    open fun getProduct(productID: String): Product
    open fun purchase(productID: String, developerPayload: String = definedExternally): FacebookInstantGamesPlugin /* this */
    open fun getPurchases(): FacebookInstantGamesPlugin /* this */
    open fun consumePurchase(purchaseToken: String): FacebookInstantGamesPlugin /* this */
    open fun update(cta: String, text: Any?, key: String, frame: String, template: String, updateData: Any?): FacebookInstantGamesPlugin /* this */
    open fun update(cta: String, text: Any?, key: String, frame: integer, template: String, updateData: Any?): FacebookInstantGamesPlugin /* this */
    open fun updateLeaderboard(cta: String, text: Any?, key: String, frame: String, template: String, updateData: Any?): FacebookInstantGamesPlugin /* this */
    open fun updateLeaderboard(cta: String, text: Any?, key: String, frame: integer, template: String, updateData: Any?): FacebookInstantGamesPlugin /* this */
    open fun switchGame(appID: String, data: Any? = definedExternally): FacebookInstantGamesPlugin /* this */
    open fun createShortcut(): FacebookInstantGamesPlugin /* this */
    open fun quit()
    open fun log(name: String, value: Number = definedExternally, params: Any? = definedExternally): FacebookInstantGamesPlugin /* this */
    open fun preloadAds(placementID: String): FacebookInstantGamesPlugin /* this */
    open fun preloadAds(placementID: Array<String>): FacebookInstantGamesPlugin /* this */
    open fun preloadVideoAds(placementID: String): FacebookInstantGamesPlugin /* this */
    open fun preloadVideoAds(placementID: Array<String>): FacebookInstantGamesPlugin /* this */
    open fun showAd(placementID: String): FacebookInstantGamesPlugin /* this */
    open fun showVideo(placementID: String): FacebookInstantGamesPlugin /* this */
    open fun matchPlayer(matchTag: String = definedExternally, switchImmediately: Boolean = definedExternally): FacebookInstantGamesPlugin /* this */
    open fun getLeaderboard(name: String): FacebookInstantGamesPlugin /* this */
    override fun destroy()
}

external open class FacebookInstantGamesLeaderboard(plugin: FacebookInstantGamesPlugin, data: Any) : EventEmitter {
    open var plugin: FacebookInstantGamesPlugin
    open var ref: Any
    open var name: String
    open var contextID: String
    open var entryCount: integer
    open var playerScore: LeaderboardScore
    open var scores: Array<LeaderboardScore>
    open fun getEntryCount(): FacebookInstantGamesLeaderboard /* this */
    open fun setScore(score: integer, data: String = definedExternally): FacebookInstantGamesLeaderboard /* this */
    open fun setScore(score: integer): FacebookInstantGamesLeaderboard /* this */
    open fun setScore(score: integer, data: Any = definedExternally): FacebookInstantGamesLeaderboard /* this */
    open fun getPlayerScore(): FacebookInstantGamesLeaderboard /* this */
    open fun getScores(count: integer = definedExternally, offset: integer = definedExternally): FacebookInstantGamesLeaderboard /* this */
    open fun getConnectedScores(): FacebookInstantGamesLeaderboard /* this */
}