@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.Core

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
import tsstdlib.AudioContext
import Phaser.Game
import integer
import Phaser.Types.Physics.Arcade.ArcadeWorldConfig
import Phaser.Types.Physics.Matter.MatterWorldConfig
import Phaser.Scale.ScaleModeType
import Phaser.Scale.CenterType

external interface AudioConfig {
    var disableWebAudio: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var context: AudioContext?
        get() = definedExternally
        set(value) = definedExternally
    var noAudio: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BannerConfig {
    var hidePhaser: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var text: String?
        get() = definedExternally
        set(value) = definedExternally
    var background: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

typealias BootCallback = (game: Game) -> Unit

external interface CallbacksConfig {
    var preBoot: BootCallback?
        get() = definedExternally
        set(value) = definedExternally
    var postBoot: BootCallback?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DOMContainerConfig {
    var createContainer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var behindCanvas: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface FPSConfig {
    var min: integer?
        get() = definedExternally
        set(value) = definedExternally
    var target: integer?
        get() = definedExternally
        set(value) = definedExternally
    var forceSetTimeOut: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var deltaHistory: integer?
        get() = definedExternally
        set(value) = definedExternally
    var panicMax: integer?
        get() = definedExternally
        set(value) = definedExternally
    var smoothStep: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GameConfig {
    var width: integer?
        get() = definedExternally
        set(value) = definedExternally
    var height: integer?
        get() = definedExternally
        set(value) = definedExternally
    var zoom: Number?
        get() = definedExternally
        set(value) = definedExternally
    var resolution: Number?
        get() = definedExternally
        set(value) = definedExternally
    var type: Number?
        get() = definedExternally
        set(value) = definedExternally
    var parent: HTMLElement? /* HTMLElement? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var canvas: HTMLCanvasElement?
        get() = definedExternally
        set(value) = definedExternally
    var canvasStyle: String?
        get() = definedExternally
        set(value) = definedExternally
    var customEnvironment: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var context: CanvasRenderingContext2D?
        get() = definedExternally
        set(value) = definedExternally
    var scene: Phaser.Scene? /* Phaser.Scene? | Array<Phaser.Scene>? | Phaser.Types.Scenes.SettingsConfig? | Array<Phaser.Types.Scenes.SettingsConfig>? | Phaser.Types.Scenes.CreateSceneFromObjectConfig? | Array<Phaser.Types.Scenes.CreateSceneFromObjectConfig>? | Function<*>? | Array<Function<*>>? */
        get() = definedExternally
        set(value) = definedExternally
    var seed: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var version: String?
        get() = definedExternally
        set(value) = definedExternally
    var autoFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var input: dynamic /* Boolean? | Phaser.Types.Core.InputConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var disableContextMenu: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var transparent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var banner: dynamic /* Boolean? | Phaser.Types.Core.BannerConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var dom: DOMContainerConfig?
        get() = definedExternally
        set(value) = definedExternally
    var fps: FPSConfig?
        get() = definedExternally
        set(value) = definedExternally
    var render: RenderConfig?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var callbacks: CallbacksConfig?
        get() = definedExternally
        set(value) = definedExternally
    var loader: LoaderConfig?
        get() = definedExternally
        set(value) = definedExternally
    var images: ImagesConfig?
        get() = definedExternally
        set(value) = definedExternally
    var physics: PhysicsConfig?
        get() = definedExternally
        set(value) = definedExternally
    var plugins: dynamic /* Phaser.Types.Core.PluginObject? | Array<Phaser.Types.Core.PluginObjectItem>? */
        get() = definedExternally
        set(value) = definedExternally
    var scale: ScaleConfig?
        get() = definedExternally
        set(value) = definedExternally
    var audio: AudioConfig?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GamepadInputConfig {
    var target: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ImagesConfig {
    var default: String?
        get() = definedExternally
        set(value) = definedExternally
    var missing: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface InputConfig {
    var keyboard: dynamic /* Boolean? | Phaser.Types.Core.KeyboardInputConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var mouse: dynamic /* Boolean? | Phaser.Types.Core.MouseInputConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var touch: dynamic /* Boolean? | Phaser.Types.Core.TouchInputConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var gamepad: dynamic /* Boolean? | Phaser.Types.Core.GamepadInputConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var activePointers: integer?
        get() = definedExternally
        set(value) = definedExternally
    var smoothFactor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var windowEvents: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface KeyboardInputConfig {
    var target: Any?
        get() = definedExternally
        set(value) = definedExternally
    var capture: Array<integer>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LoaderConfig {
    var baseURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var path: String?
        get() = definedExternally
        set(value) = definedExternally
    var maxParallelDownloads: integer?
        get() = definedExternally
        set(value) = definedExternally
    var crossOrigin: String?
        get() = definedExternally
        set(value) = definedExternally
    var responseType: String?
        get() = definedExternally
        set(value) = definedExternally
    var async: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var user: String?
        get() = definedExternally
        set(value) = definedExternally
    var password: String?
        get() = definedExternally
        set(value) = definedExternally
    var timeout: integer?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MouseInputConfig {
    var target: Any?
        get() = definedExternally
        set(value) = definedExternally
    var capture: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

typealias NOOP = () -> Unit

external interface PhysicsConfig {
    var default: String?
        get() = definedExternally
        set(value) = definedExternally
    var arcade: ArcadeWorldConfig?
        get() = definedExternally
        set(value) = definedExternally
    var matter: MatterWorldConfig?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PluginObject {
    var global: Array<PluginObjectItem>?
        get() = definedExternally
        set(value) = definedExternally
    var scene: Array<PluginObjectItem>?
        get() = definedExternally
        set(value) = definedExternally
    var default: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var defaultMerge: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PluginObjectItem {
    var key: String?
        get() = definedExternally
        set(value) = definedExternally
    var plugin: Any?
        get() = definedExternally
        set(value) = definedExternally
    var start: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var systemKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var sceneKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var mapping: String?
        get() = definedExternally
        set(value) = definedExternally
    var data: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RenderConfig {
    var antialias: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var antialiasGL: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var desynchronized: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var pixelArt: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var roundPixels: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var transparent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var clearBeforeRender: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var premultipliedAlpha: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var failIfMajorPerformanceCaveat: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var powerPreference: String?
        get() = definedExternally
        set(value) = definedExternally
    var batchSize: integer?
        get() = definedExternally
        set(value) = definedExternally
    var maxLights: integer?
        get() = definedExternally
        set(value) = definedExternally
    var mipmapFilter: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ScaleConfig {
    var width: dynamic /* integer? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var height: dynamic /* integer? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var zoom: dynamic /* Phaser.Scale.ZoomType? | integer? */
        get() = definedExternally
        set(value) = definedExternally
    var resolution: Number?
        get() = definedExternally
        set(value) = definedExternally
    var parent: dynamic /* HTMLElement? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var expandParent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var mode: ScaleModeType?
        get() = definedExternally
        set(value) = definedExternally
    var min: WidthHeight?
        get() = definedExternally
        set(value) = definedExternally
    var max: WidthHeight?
        get() = definedExternally
        set(value) = definedExternally
    var autoRound: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var autoCenter: CenterType?
        get() = definedExternally
        set(value) = definedExternally
    var resizeInterval: integer?
        get() = definedExternally
        set(value) = definedExternally
    var fullscreenTarget: dynamic /* HTMLElement? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

typealias TimeStepCallback = (time: Number, average: Number, interpolation: Number) -> Unit

external interface TouchInputConfig {
    var target: Any?
        get() = definedExternally
        set(value) = definedExternally
    var capture: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WidthHeight {
    var width: integer?
        get() = definedExternally
        set(value) = definedExternally
    var height: integer?
        get() = definedExternally
        set(value) = definedExternally
}