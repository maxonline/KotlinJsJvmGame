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
import Two.ConstructorParams
import Two.Types
import Two.Group
import Two.Line
import Two.Rectangle
import Two.RoundedRectangle
import Two.Circle
import Two.Ellipse
import Two.Star
import Two.Polygon
import Two.ArcSegment
import Two.Path
import Two.Vector
import Two.Utils.Collection
import Two.Anchor
import Two.BoundingClientRect
import tsstdlib.Record
import Two.Commands
import Two.`T$0`
import Two.Stop
import Two.LinearGradient
import Two.RadialGradient
import Two.Text

@JsModule("definitely-typed")
external open class Two(params: ConstructorParams = definedExternally) {
    open var type: Types
    open var frameCount: Number
    open var timeDelta: Number
    open var width: Number
    open var height: Number
    open var playing: Boolean
    open var renderer: dynamic /* SVGRenderer | WebGLRenderer | CanvasRenderer */
    open var scene: Group
    open fun appendTo(domElement: HTMLElement): Two /* this */
    open fun play(): Two /* this */
    open fun pause(): Two /* this */
    open fun update(): Two /* this */
    open fun render(): Two /* this */
    open fun add(vararg objects: Any /* Path | Group | Text */): Two /* this */
    open fun add(objects: Array<Any /* Path | Group | Text */>): Two /* this */
    open fun remove(vararg objects: Any /* Path | Group | Text */): Two /* this */
    open fun remove(objects: Array<Any /* Path | Group | Text */>): Two /* this */
    open fun clear(): Two /* this */
    open fun makeLine(x1: Number, y1: Number, x2: Number, y2: Number): Line
    open fun makeRectangle(x: Number, y: Number, width: Number, height: Number): Rectangle
    open fun makeRoundedRectangle(x: Number, y: Number, width: Number, height: Number, radius: Number): RoundedRectangle
    open fun makeCircle(x: Number, y: Number, radius: Number): Circle
    open fun makeEllipse(x: Number, y: Number, width: Number, height: Number): Ellipse
    open fun makeStar(ox: Number, oy: Number, or: Number, ir: Number, sides: Number): Star
    open fun makePolygon(x: Number, y: Number, radius: Number, sides: Number): Polygon
    open fun makeArcSegment(ox: Number, oy: Number, ir: Number, or: Number, sa: Number, ea: Number, res: Number = definedExternally): ArcSegment
    open fun makeCurve(vararg coords: Any /* Number | Boolean */): Path
    open fun makeCurve(points: Array<Vector>, open: Boolean = definedExternally): Path
    open fun makeCurve(points: Array<Vector>): Path
    open fun makePath(vararg coords: Any /* Number | Boolean */): Path
    open fun makePath(points: Array<Vector>, open: Boolean = definedExternally): Path
    open fun makePath(points: Array<Vector>): Path
    open fun makeGroup(objects: Array<Any /* Path | Group | Text */>): Group
    open fun makeGroup(vararg objects: Any /* Path | Group | Text */): Group
    open fun interpret(svgNode: SVGElement): Group
    open fun bind(event: String, callback: (args: Any) -> Unit): Two /* this */
    open fun unbind(event: String?, callback: ((args: Any) -> Unit)?): Two /* this */
    interface ConstructorParams {
        var type: Types?
            get() = definedExternally
            set(value) = definedExternally
        var width: Number?
            get() = definedExternally
            set(value) = definedExternally
        var height: Number?
            get() = definedExternally
            set(value) = definedExternally
        var autostart: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var fullscreen: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ratio: Number?
            get() = definedExternally
            set(value) = definedExternally
    }
    open class Error(message: String) {
        open var message: String
    }
    open class Path(vertices: Array<Vector>, closed: Boolean, curved: Boolean, manual: Boolean = definedExternally) {
        open var id: Number
        open var stroke: dynamic /* String | LinearGradient | RadialGradient */
        open var fill: dynamic /* String | LinearGradient | RadialGradient */
        open var linewidth: Number
        open var opacity: Number
        open var cap: String
        open var join: String
        open var miter: Number
        open var rotation: Number
        open var scale: Number
        open var translation: Vector
        open var parent: Group
        open var vertices: Collection<Anchor>
        open var closed: Boolean
        open var curved: Boolean
        open var automatic: Boolean
        open var beginning: Number
        open var ending: Number
        open var clip: Boolean
        open fun clone(): Path /* this */
        open fun center(): Path /* this */
        open fun addTo(group: Group): Path /* this */
        open fun remove(): Path /* this */
        open fun getBoundingClientRect(shallow: Boolean = definedExternally): BoundingClientRect
        open fun noFill(): Path /* this */
        open fun noStroke(): Path /* this */
        open fun plot(): Path /* this */
        open fun subdivide(): Path /* this */

        companion object {
            fun MakeObservable(obj: Any): Any
        }
    }
    open class Line(x1: Number, y1: Number, x2: Number, y2: Number) : Path
    open class Rectangle(x: Number, y: Number, width: Number, height: Number) : Path
    open class RoundedRectangle(x: Number, y: Number, width: Number, height: Number, radius: Number = definedExternally) : Path
    open class Ellipse(x: Number, y: Number, width: Number, height: Number) : Path
    open class Star(ox: Number, oy: Number, or: Number, ir: Number = definedExternally, sides: Number = definedExternally) : Path
    open class Polygon(x: Number, y: Number, radius: Number, sides: Number = definedExternally) : Path
    open class Circle(x: Number, y: Number, radius: Number) : Path
    open class ArcSegment(ox: Number, oy: Number, ir: Number, or: Number, sa: Number, ea: Number, res: Number = definedExternally) : Path
    open class Group {
        open var id: String
        open var stroke: dynamic /* String | LinearGradient | RadialGradient */
        open var fill: dynamic /* String | LinearGradient | RadialGradient */
        open var linewidth: Number
        open var opacity: Number
        open var cap: String
        open var join: String
        open var miter: Number
        open var rotation: Number
        open var scale: Number
        open var translation: Vector
        open var children: Array<dynamic /* typealias _Object = dynamic */>
        open var parent: Group
        open var mask: Path
        open fun clone(): Group /* this */
        open fun center(): Group /* this */
        open fun addTo(group: Group): Group /* this */
        open fun add(vararg objects: dynamic /* typealias _Object = dynamic */): Group /* this */
        open fun add(objects: Array<dynamic /* typealias _Object = dynamic */>): Group /* this */
        open fun remove(vararg objects: dynamic /* typealias _Object = dynamic */): Group /* this */
        open fun remove(objects: Array<dynamic /* typealias _Object = dynamic */>): Group /* this */
        open fun getBoundingClientRect(shallow: Boolean = definedExternally): BoundingClientRect
        open fun noFill(): Group /* this */
        open fun noStroke(): Group /* this */

        companion object {
            fun MakeObservable(obj: Any): Any
        }
    }
    interface BoundingClientRect : Record<String /* "top" | "left" | "right" | "bottom" | "width" | "height" */, Number>
    open class Vector(x: Number, y: Number) {
        open var x: Number
        open var y: Number
        open fun set(x: Number, y: Number): Vector /* this */
        open fun copy(v: Vector): Vector /* this */
        open fun clear(): Vector /* this */
        open fun clone(): Vector /* this */
        open fun add(v1: Vector, v2: Vector): Vector /* this */
        open fun addSelf(v: Vector): Vector /* this */
        open fun sub(v1: Vector, v2: Vector): Vector /* this */
        open fun subSelf(v: Vector): Vector /* this */
        open fun multiplySelf(v: Vector): Vector /* this */
        open fun multiplyScalar(value: Number): Vector /* this */
        open fun divideScalar(value: Number): Vector /* this */
        open fun negate(): Vector /* this */
        open fun dot(v: Vector): Number
        open fun lengthSquared(): Number
        open fun length(): Number
        open fun normalize(): Vector /* this */
        open fun distanceTo(v: Vector): Number
        open fun distanceToSquared(v: Vector): Number
        open fun setLength(length: Number): Vector /* this */
        open fun equals(v: Vector): Boolean
        open fun lerp(v: Vector, t: Number): Vector /* this */
        open fun isZero(): Boolean
    }
    interface `T$0` {
        var right: Vector
        var left: Vector
    }
    open class Anchor : Vector {
        constructor(x: Number, y: Number, lx: Number, ly: Number, rx: Number, ry: Number, command: Commands)
        constructor(x: Number, y: Number, lx: Number, ly: Number, rx: Number, ry: Number, command: String)
        open var command: dynamic /* Commands | String */
        open var controls: `T$0`
        open fun listen(): Anchor /* this */
        open fun ignore(): Anchor /* this */

        companion object {
            fun AppendCurveProperties()
        }
    }
    open class Stop(offset: Number, color: String, opacity: Number) {
        open var offset: Number
        open var color: String
        open var opacity: Number
        open fun clone(): Stop /* this */
    }
    open class LinearGradient(x1: Number, y1: Number, x2: Number, y2: Number, stops: Array<Stop>) {
        open var left: Vector
        open var right: Vector
        open var spread: String
        open var stops: Collection<Stop>
        open fun clone(): LinearGradient /* this */
    }
    open class RadialGradient(x: Number, y: Number, radius: Number, stops: Array<Stop>, fx: Number = definedExternally, fy: Number = definedExternally) {
        open var center: Vector
        open var radius: Number
        open var focal: Vector
        open var spread: String
        open var stops: Collection<Stop>
        open fun clone(): RadialGradient /* this */
    }
    open class Text(message: String, x: Number, y: Number, styles: Any = definedExternally) {
        open var value: String
        open var family: String
        open var size: Number
        open var leading: Number
        open var alignment: String
        open var fill: dynamic /* String | LinearGradient | RadialGradient */
        open var stroke: dynamic /* String | LinearGradient | RadialGradient */
        open var linewidth: Number
        open var style: String
        open var weight: dynamic /* Number | String */
        open var decoration: String
        open var baseline: String
        open var opacity: Number
        open var visible: Boolean
        open var rotation: Number
        open var scale: Number
        open var translation: Vector
        open fun clone(): Text /* this */
        open fun getBoundingClientRect(shallow: Boolean = definedExternally): Any
        open fun noFill(): Text /* this */
        open fun noStroke(): Text /* this */

        companion object {
            fun MakeObservable(obj: Any): Any
        }
    }
    open class SVGRenderer
    open class WebGLRenderer
    open class CanvasRenderer

    companion object {
        var Array: Any
        var Properties: Array<Any>
        var Resolution: Number
        var Instances: Array<Two>
        fun noConflict(): Two
    }
}