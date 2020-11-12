@file:JsQualifier("Phaser.Core")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Core

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
import Phaser.Types.Core.GameConfig
import Phaser.Scale.ScaleModeType
import integer
import Phaser.Scale.CenterType
import Phaser.Types.Core.AudioConfig
import Phaser.Types.Core.FPSConfig
import Phaser.Display.Color
import Phaser.Types.Core.BootCallback
import Phaser.Types.Core.PhysicsConfig
import Phaser.Game
import Phaser.DOM.RequestAnimationFrame
import Phaser.Types.Core.TimeStepCallback

external open class Config(GameConfig: GameConfig = definedExternally) {
    open var width: dynamic /* integer | String */
    open var height: dynamic /* integer | String */
    open var zoom: dynamic /* Phaser.Scale.ZoomType | integer */
    open var resolution: Number
    open var parent: Any
    open var scaleMode: ScaleModeType
    open var expandParent: Boolean
    open var autoRound: integer
    open var autoCenter: CenterType
    open var resizeInterval: integer
    open var fullscreenTarget: dynamic /* HTMLElement | String */
    open var minWidth: integer
    open var maxWidth: integer
    open var minHeight: integer
    open var maxHeight: integer
    open var renderType: Number
    open var canvas: HTMLCanvasElement
    open var context: dynamic /* CanvasRenderingContext2D | WebGLRenderingContext */
    open var canvasStyle: String
    open var customEnvironment: Boolean
    open var sceneConfig: Any?
    open var seed: Array<String>
    open var gameTitle: String
    open var gameURL: String
    open var gameVersion: String
    open var autoFocus: Boolean
    open var domCreateContainer: Boolean
    open var domBehindCanvas: Boolean
    open var inputKeyboard: Boolean
    open var inputKeyboardEventTarget: Any
    open var inputKeyboardCapture: Array<integer>
    open var inputMouse: dynamic /* Boolean? | Any? */
    open var inputMouseEventTarget: Any
    open var inputMouseCapture: Boolean
    open var inputTouch: Boolean
    open var inputTouchEventTarget: Any
    open var inputTouchCapture: Boolean
    open var inputActivePointers: integer
    open var inputSmoothFactor: integer
    open var inputWindowEvents: Boolean
    open var inputGamepad: Boolean
    open var inputGamepadEventTarget: Any
    open var disableContextMenu: Boolean
    open var audio: AudioConfig
    open var hideBanner: Boolean
    open var hidePhaser: Boolean
    open var bannerTextColor: String
    open var bannerBackgroundColor: Array<String>
    open var fps: FPSConfig
    open var antialias: Boolean
    open var antialiasGL: Boolean
    open var mipmapFilter: String
    open var desynchronized: Boolean
    open var roundPixels: Boolean
    open var pixelArt: Boolean
    open var transparent: Boolean
    open var clearBeforeRender: Boolean
    open var premultipliedAlpha: Boolean
    open var failIfMajorPerformanceCaveat: Boolean
    open var powerPreference: String
    open var batchSize: integer
    open var maxLights: integer
    open var backgroundColor: Color
    open var preBoot: BootCallback
    open var postBoot: BootCallback
    open var physics: PhysicsConfig
    open var defaultPhysicsSystem: dynamic /* Boolean | String */
    open var loaderBaseURL: String
    open var loaderPath: String
    open var loaderMaxParallelDownloads: integer
    open var loaderCrossOrigin: String?
    open var loaderResponseType: String
    open var loaderAsync: Boolean
    open var loaderUser: String
    open var loaderPassword: String
    open var loaderTimeout: integer
    open var loaderWithCredentials: Boolean
    open var installGlobalPlugins: Any
    open var installScenePlugins: Any
    open var defaultPlugins: Any
    open var defaultImage: String
    open var missingImage: String
}

external fun CreateRenderer(game: Game)

external fun DebugHeader(game: Game)

external open class TimeStep(game: Game, config: FPSConfig) {
    open var game: Game
    open var raf: RequestAnimationFrame
    open var started: Boolean
    open var running: Boolean
    open var minFps: integer
    open var targetFps: integer
    open var actualFps: integer
    open var nextFpsUpdate: integer
    open var framesThisSecond: integer
    open var callback: TimeStepCallback
    open var forceSetTimeOut: Boolean
    open var time: Number
    open var startTime: Number
    open var lastTime: Number
    open var frame: integer
    open var inFocus: Boolean
    open var delta: integer
    open var deltaIndex: integer
    open var deltaHistory: Array<integer>
    open var deltaSmoothingMax: integer
    open var panicMax: integer
    open var rawDelta: Number
    open var now: Number
    open var smoothStep: Boolean
    open fun blur()
    open fun focus()
    open fun pause()
    open fun resume()
    open fun resetDelta()
    open fun start(callback: TimeStepCallback)
    open fun step()
    open fun tick()
    open fun sleep()
    open fun wake(seamless: Boolean = definedExternally)
    open fun getDuration(): Number
    open fun getDurationMS(): Number
    open fun stop(): TimeStep /* this */
    open fun destroy()
}

external fun VisibilityHandler(game: Game)