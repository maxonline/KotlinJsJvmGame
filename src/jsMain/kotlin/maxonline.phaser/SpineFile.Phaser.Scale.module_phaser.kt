@file:JsQualifier("Phaser.Scale")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Scale

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
import Phaser.Game
import Phaser.Geom.Rectangle
import Phaser.Structs.Size
import Phaser.Math.Vector2
import Phaser.Device.Fullscreen
import integer
import Phaser.Types.Core.GameConfig
import Phaser.Events.EventEmitter

external enum class Center {
    NO_CENTER,
    CENTER_BOTH,
    CENTER_HORIZONTALLY,
    CENTER_VERTICALLY
}

external enum class Orientation {
    LANDSCAPE,
    PORTRAIT
}

external enum class ScaleModes {
    NONE,
    WIDTH_CONTROLS_HEIGHT,
    HEIGHT_CONTROLS_WIDTH,
    FIT,
    ENVELOP,
    RESIZE
}

external enum class Zoom {
    NO_ZOOM,
    ZOOM_2X,
    ZOOM_4X,
    MAX_ZOOM
}

external open class ScaleManager(game: Game) : EventEmitter {
    open var game: Game
    open var canvas: HTMLCanvasElement
    open var canvasBounds: Rectangle
    open var parent: Any
    open var parentIsWindow: Boolean
    open var parentSize: Size
    open var gameSize: Size
    open var baseSize: Size
    open var displaySize: Size
    open var scaleMode: ScaleModeType
    open var resolution: Number
    open var zoom: Number
    open var _resetZoom: Boolean
    open var displayScale: Vector2
    open var autoRound: Boolean
    open var autoCenter: CenterType
    open var orientation: OrientationType
    open var fullscreen: Fullscreen
    open var fullscreenTarget: Any
    open var dirty: Boolean
    open var resizeInterval: integer
    open fun preBoot()
    open fun boot()
    open fun parseConfig(config: GameConfig)
    open fun getParent(config: GameConfig)
    open fun getParentBounds(): Boolean
    open fun lockOrientation(orientation: String): Boolean
    open fun setParentSize(width: Number, height: Number): ScaleManager /* this */
    open fun setGameSize(width: Number, height: Number): ScaleManager /* this */
    open fun resize(width: Number, height: Number): ScaleManager /* this */
    open fun setZoom(value: integer): ScaleManager /* this */
    open fun setMaxZoom(): ScaleManager /* this */
    open fun refresh(previousWidth: Number = definedExternally, previousHeight: Number = definedExternally): ScaleManager /* this */
    open fun updateOrientation()
    open fun updateScale()
    open fun getMaxZoom(): integer
    open fun updateCenter()
    open fun updateBounds()
    open fun transformX(pageX: Number): Number
    open fun transformY(pageY: Number): Number
    open fun startFullscreen(fullscreenOptions: Any? = definedExternally)
    open fun getFullscreenTarget(): Any?
    open fun removeFullscreenTarget()
    open fun stopFullscreen()
    open fun toggleFullscreen(fullscreenOptions: Any? = definedExternally)
    open fun startListeners()
    open fun onFullScreenChange()
    open fun onFullScreenError()
    open fun step(time: Number, delta: Number)
    open fun stopListeners()
    override fun destroy()
    open var isFullscreen: Boolean
    open var width: Number
    open var height: Number
    open var isPortrait: Boolean
    open var isLandscape: Boolean
    open var isGamePortrait: Boolean
    open var isGameLandscape: Boolean
}

external var NO_CENTER: integer

external var CENTER_BOTH: integer

external var CENTER_HORIZONTALLY: integer

external var CENTER_VERTICALLY: integer

external var LANDSCAPE: String

external var PORTRAIT: String

external var NONE: integer

external var WIDTH_CONTROLS_HEIGHT: integer

external var HEIGHT_CONTROLS_WIDTH: integer

external var FIT: integer

external var ENVELOP: integer

external var RESIZE: integer

external var NO_ZOOM: integer

external var ZOOM_2X: integer

external var ZOOM_4X: integer

external var MAX_ZOOM: integer