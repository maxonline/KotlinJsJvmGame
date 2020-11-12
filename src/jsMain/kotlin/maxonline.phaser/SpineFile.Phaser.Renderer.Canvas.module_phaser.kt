@file:JsQualifier("Phaser.Renderer.Canvas")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Renderer.Canvas

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
import integer
import Phaser.Types.Renderer.Snapshot.SnapshotState
import Phaser.Structs.Size
import Phaser.Scene
import Phaser.GameObjects.DisplayList
import Phaser.Cameras.Scene2D.Camera
import Phaser.Types.Renderer.Snapshot.SnapshotCallback
import Phaser.GameObjects.GameObject
import Phaser.Textures.Frame
import Phaser.GameObjects.Components.TransformMatrix

external open class CanvasRenderer(game: Game) {
    open var game: Game
    open var type: integer
    open var drawCount: Number
    open var width: integer
    open var height: integer
    open var config: Any?
    open var gameCanvas: HTMLCanvasElement
    open var gameContext: CanvasRenderingContext2D
    open var currentContext: CanvasRenderingContext2D
    open var antialias: Boolean
    open var blendModes: Array<Any>
    open var snapshotState: SnapshotState
    open fun init()
    open fun onResize(gameSize: Size, baseSize: Size, displaySize: Size, resolution: Number = definedExternally)
    open fun resize(width: Number = definedExternally, height: Number = definedExternally)
    open fun resetTransform()
    open fun setBlendMode(blendMode: String): CanvasRenderer /* this */
    open fun setContext(ctx: CanvasRenderingContext2D = definedExternally): CanvasRenderer /* this */
    open fun setAlpha(alpha: Number): CanvasRenderer /* this */
    open fun preRender()
    open fun render(scene: Scene, children: DisplayList, interpolationPercentage: Number, camera: Camera)
    open fun postRender()
    open fun snapshotCanvas(canvas: HTMLCanvasElement, callback: SnapshotCallback, getPixel: Boolean = definedExternally, x: integer = definedExternally, y: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, type: String = definedExternally, encoderOptions: Number = definedExternally): CanvasRenderer /* this */
    open fun snapshot(callback: SnapshotCallback, type: String = definedExternally, encoderOptions: Number = definedExternally): CanvasRenderer /* this */
    open fun snapshotArea(x: integer, y: integer, width: integer, height: integer, callback: SnapshotCallback, type: String = definedExternally, encoderOptions: Number = definedExternally): CanvasRenderer /* this */
    open fun snapshotPixel(x: integer, y: integer, callback: SnapshotCallback): CanvasRenderer /* this */
    open fun batchSprite(sprite: GameObject, frame: Frame, camera: Camera, parentTransformMatrix: TransformMatrix = definedExternally)
    open fun destroy()
}

external fun GetBlendModes(): Array<Any>

external fun SetTransform(renderer: CanvasRenderer, ctx: CanvasRenderingContext2D, src: GameObject, camera: Camera, parentMatrix: TransformMatrix = definedExternally): Boolean