@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

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
import Phaser.Scene
import Phaser.GameObjects.Components.TransformMatrix
import Phaser.Geom.Rectangle
import Phaser.Geom.Point
import Phaser.Math.Vector2
import Phaser.GameObjects.GameObject
import Phaser.GameObjects.Container
import Phaser.BlendModes
import Phaser.Display.Masks.BitmapMask
import Phaser.Display.Masks.GeometryMask
import Phaser.GameObjects.Graphics
import Phaser.GameObjects.Components.AlphaSingle
import Phaser.GameObjects.Components.BlendMode
import Phaser.GameObjects.Components.ComputedSize
import Phaser.GameObjects.Components.Depth
import Phaser.GameObjects.Components.Mask
import Phaser.GameObjects.Components.Transform
import Phaser.GameObjects.Components.Visible
import Phaser.Types.GameObjects.GameObjectConfig

external open class SpineContainer(scene: Scene, pluginManager: SpinePlugin, x: Number = definedExternally, y: Number = definedExternally, children: Array<SpineGameObject> = definedExternally) : Container, AlphaSingle, BlendMode, ComputedSize, Depth, Mask, Transform, Visible {
    override var list: Array<SpineGameObject>
    override var exclusive: Boolean
    override var maxSize: Number
    override var position: Number
    override var localTransform: TransformMatrix
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setExclusive(value: Boolean): SpineContainer /* this */
    override fun getBounds(output: Rectangle): Rectangle
    override fun pointToContainer(source: Any?, output: Any?): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */
    override fun pointToContainer(source: Any?): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */
    override fun pointToContainer(source: Any?, output: Point?): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */
    override fun pointToContainer(source: Any?, output: Vector2?): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */
    override fun pointToContainer(source: Point?, output: Any?): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */
    override fun pointToContainer(source: Point?): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */
    override fun pointToContainer(source: Point?, output: Point?): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */
    override fun pointToContainer(source: Point?, output: Vector2?): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */
    override fun pointToContainer(source: Vector2?, output: Any?): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */
    override fun pointToContainer(source: Vector2?): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */
    override fun pointToContainer(source: Vector2?, output: Point?): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */
    override fun pointToContainer(source: Vector2?, output: Vector2?): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */
    override fun getBoundsTransformMatrix(): TransformMatrix
    open fun add(child: SpineGameObject): SpineContainer /* this */
    override fun add(child: GameObject): Container /* this */
    open fun add(child: Array<SpineGameObject>): SpineContainer /* this */
    override fun add(child: Array<GameObject>): Container /* this */
    open fun addAt(child: SpineGameObject, index: Number = definedExternally): SpineContainer /* this */
    open fun addAt(child: SpineGameObject): SpineContainer /* this */
    override fun addAt(child: GameObject): Container /* this */
    open fun addAt(child: Array<SpineGameObject>, index: Number = definedExternally): SpineContainer /* this */
    open fun addAt(child: Array<SpineGameObject>): SpineContainer /* this */
    override fun addAt(child: Array<GameObject>): Container /* this */
    override fun getAt(index: Number): SpineGameObject
    open fun getIndex(child: SpineGameObject): Number
    override fun getIndex(child: GameObject): integer
    override fun sort(property: String, handler: Function<*>): SpineContainer /* this */
    override fun getByName(name: String): SpineGameObject
    override fun getRandom(startIndex: Number, length: Number): SpineGameObject
    override fun getFirst(property: String, value: Any, startIndex: Number, endIndex: Number): SpineGameObject
    override fun getAll(property: String, value: Any, startIndex: Number, endIndex: Number): Array<SpineGameObject>
    override fun count(property: String, value: Any, startIndex: Number, endIndex: Number): Number
    open fun swap(child1: SpineGameObject, child2: SpineGameObject): SpineContainer /* this */
    override fun swap(child1: GameObject, child2: GameObject): Container /* this */
    open fun moveTo(child: SpineGameObject, index: Number): SpineContainer /* this */
    open fun remove(child: SpineGameObject, destroyChild: Boolean = definedExternally): SpineContainer /* this */
    override fun remove(child: GameObject, destroyChild: Boolean): Container /* this */
    open fun remove(child: SpineGameObject): SpineContainer /* this */
    override fun remove(child: GameObject): Container /* this */
    open fun remove(child: Array<SpineGameObject>, destroyChild: Boolean = definedExternally): SpineContainer /* this */
    override fun remove(child: Array<GameObject>, destroyChild: Boolean): Container /* this */
    open fun remove(child: Array<SpineGameObject>): SpineContainer /* this */
    override fun remove(child: Array<GameObject>): Container /* this */
    override fun removeAt(index: Number, destroyChild: Boolean): SpineContainer /* this */
    override fun removeBetween(startIndex: Number, endIndex: Number, destroyChild: Boolean): SpineContainer /* this */
    override fun removeAll(destroyChild: Boolean): SpineContainer /* this */
    open fun bringToTop(child: SpineGameObject): SpineContainer /* this */
    override fun bringToTop(child: GameObject): Container /* this */
    open fun sendToBack(child: SpineGameObject): SpineContainer /* this */
    override fun sendToBack(child: GameObject): Container /* this */
    open fun moveUp(child: SpineGameObject): SpineContainer /* this */
    override fun moveUp(child: GameObject): Container /* this */
    open fun moveDown(child: SpineGameObject): SpineContainer /* this */
    override fun moveDown(child: GameObject): Container /* this */
    override fun reverse(): SpineContainer /* this */
    override fun shuffle(): SpineContainer /* this */
    open fun replace(oldChild: SpineGameObject, newChild: SpineGameObject, destroyChild: Boolean = definedExternally): SpineContainer /* this */
    override fun replace(oldChild: GameObject, newChild: GameObject, destroyChild: Boolean): Container /* this */
    open fun exists(child: SpineGameObject): Boolean
    override fun exists(child: GameObject): Boolean
    override fun setAll(property: String, value: Any, startIndex: Number, endIndex: Number): SpineContainer /* this */
    override fun each(callback: Function<*>, context: Any?, vararg args: Any): SpineContainer /* this */
    override fun iterate(callback: Function<*>, context: Any?, vararg args: Any): SpineContainer /* this */
    override fun setScrollFactor(x: Number, y: Number, updateChildren: Boolean): SpineContainer /* this */
    override var length: Number
    override var first: SpineGameObject
    override var last: SpineGameObject
    override var next: SpineGameObject
    override var previous: SpineGameObject
    override fun preDestroy()
    override fun clearAlpha(): SpineContainer /* this */
    override fun setAlpha(value: Number): SpineContainer /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* SpineContainer | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* SpineContainer | BlendMode */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): SpineContainer /* this */
    override fun setDisplaySize(width: Number, height: Number): SpineContainer /* this */
    override var depth: Number
    override fun setDepth(value: Number): SpineContainer /* this */
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): dynamic /* SpineContainer | Mask */
    override fun setMask(mask: GeometryMask): dynamic /* SpineContainer | Mask */
    override fun clearMask(destroyMask: Boolean): SpineContainer /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): SpineContainer /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): SpineContainer /* this */
    override fun setRotation(radians: Number): SpineContainer /* this */
    override fun setAngle(degrees: Number): SpineContainer /* this */
    override fun setScale(x: Number, y: Number): SpineContainer /* this */
    override fun setX(value: Number): SpineContainer /* this */
    override fun setY(value: Number): SpineContainer /* this */
    override fun setZ(value: Number): SpineContainer /* this */
    override fun setW(value: Number): SpineContainer /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): SpineContainer /* this */
}

external interface SpineContainerConfig : GameObjectConfig {
    override var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var children: dynamic /* SpineGameObject? | Array<SpineGameObject>? */
        get() = definedExternally
        set(value) = definedExternally
}