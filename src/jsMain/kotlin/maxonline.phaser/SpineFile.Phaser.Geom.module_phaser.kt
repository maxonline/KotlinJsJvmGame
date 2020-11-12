@file:JsQualifier("Phaser.Geom")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Geom

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
import Phaser.Math.Vector2
import Phaser.Types.Math.Vector2Like
import CenterFunction

external open class Circle(x: Number = definedExternally, y: Number = definedExternally, radius: Number = definedExternally) {
    open var type: integer
    open var x: Number
    open var y: Number
    open fun contains(x: Number, y: Number): Boolean
    open fun <O : Point> getPoint(position: Number, out: O = definedExternally): O
    open fun <O : Array<Point>> getPoints(quantity: integer, stepRate: Number = definedExternally, output: O = definedExternally): O
    open fun <O : Point> getRandomPoint(point: O = definedExternally): O
    open fun setTo(x: Number = definedExternally, y: Number = definedExternally, radius: Number = definedExternally): Circle /* this */
    open fun setEmpty(): Circle /* this */
    open fun setPosition(x: Number = definedExternally, y: Number = definedExternally): Circle /* this */
    open fun isEmpty(): Boolean
    open var radius: Number
    open var diameter: Number
    open var left: Number
    open var right: Number
    open var top: Number
    open var bottom: Number

    companion object {
        fun Area(circle: Circle): Number
        fun Circumference(circle: Circle): Number
        fun <O : Point> CircumferencePoint(circle: Circle, angle: Number, out: O = definedExternally): O
        fun Clone(source: Circle?): Circle
        fun Clone(source: Any?): Circle
        fun Contains(circle: Circle, x: Number, y: Number): Boolean
        fun ContainsPoint(circle: Circle, point: Point?): Boolean
        fun ContainsPoint(circle: Circle, point: Any?): Boolean
        fun ContainsRect(circle: Circle, rect: Rectangle?): Boolean
        fun ContainsRect(circle: Circle, rect: Any?): Boolean
        fun <O : Circle> CopyFrom(source: Circle, dest: O): O
        fun Equals(circle: Circle, toCompare: Circle): Boolean
        fun <O : Rectangle> GetBounds(circle: Circle, out: O = definedExternally): O
        fun <O : Point> GetPoint(circle: Circle, position: Number, out: O = definedExternally): O
        fun GetPoints(circle: Circle, quantity: integer, stepRate: Number = definedExternally, output: Array<Any> = definedExternally): Array<Point>
        fun <O : Circle> Offset(circle: O, x: Number, y: Number): O
        fun <O : Circle> OffsetPoint(circle: O, point: Point?): O
        fun <O : Circle> OffsetPoint(circle: O, point: Any?): O
        fun <O : Point> Random(circle: Circle, out: O = definedExternally): O
    }
}

external var CIRCLE: integer

external var ELLIPSE: integer

external var LINE: integer

external var POINT: integer

external var POLYGON: integer

external var RECTANGLE: integer

external var TRIANGLE: integer

external open class Ellipse(x: Number = definedExternally, y: Number = definedExternally, width: Number = definedExternally, height: Number = definedExternally) {
    open var type: integer
    open var x: Number
    open var y: Number
    open var width: Number
    open var height: Number
    open fun contains(x: Number, y: Number): Boolean
    open fun <O : Point> getPoint(position: Number, out: O = definedExternally): O
    open fun <O : Array<Point>> getPoints(quantity: integer, stepRate: Number = definedExternally, output: O = definedExternally): O
    open fun <O : Point> getRandomPoint(point: O = definedExternally): O
    open fun setTo(x: Number, y: Number, width: Number, height: Number): Ellipse /* this */
    open fun setEmpty(): Ellipse /* this */
    open fun setPosition(x: Number, y: Number): Ellipse /* this */
    open fun setSize(width: Number, height: Number = definedExternally): Ellipse /* this */
    open fun isEmpty(): Boolean
    open fun getMinorRadius(): Number
    open fun getMajorRadius(): Number
    open var left: Number
    open var right: Number
    open var top: Number
    open var bottom: Number

    companion object {
        fun Area(ellipse: Ellipse): Number
        fun Circumference(ellipse: Ellipse): Number
        fun <O : Point> CircumferencePoint(ellipse: Ellipse, angle: Number, out: O = definedExternally): O
        fun Clone(source: Ellipse): Ellipse
        fun Contains(ellipse: Ellipse, x: Number, y: Number): Boolean
        fun ContainsPoint(ellipse: Ellipse, point: Point?): Boolean
        fun ContainsPoint(ellipse: Ellipse, point: Any?): Boolean
        fun ContainsRect(ellipse: Ellipse, rect: Rectangle?): Boolean
        fun ContainsRect(ellipse: Ellipse, rect: Any?): Boolean
        fun <O : Ellipse> CopyFrom(source: Ellipse, dest: O): O
        fun Equals(ellipse: Ellipse, toCompare: Ellipse): Boolean
        fun <O : Rectangle> GetBounds(ellipse: Ellipse, out: O = definedExternally): O
        fun <O : Point> GetPoint(ellipse: Ellipse, position: Number, out: O = definedExternally): O
        fun <O : Array<Point>> GetPoints(ellipse: Ellipse, quantity: integer, stepRate: Number = definedExternally, out: O = definedExternally): O
        fun <O : Ellipse> Offset(ellipse: O, x: Number, y: Number): O
        fun <O : Ellipse> OffsetPoint(ellipse: O, point: Point?): O
        fun <O : Ellipse> OffsetPoint(ellipse: O, point: Any?): O
        fun <O : Point> Random(ellipse: Ellipse, out: O = definedExternally): O
    }
}

external open class Line(x1: Number = definedExternally, y1: Number = definedExternally, x2: Number = definedExternally, y2: Number = definedExternally) {
    open var type: integer
    open var x1: Number
    open var y1: Number
    open var x2: Number
    open var y2: Number
    open fun <O : Point> getPoint(position: Number, output: O = definedExternally): O
    open fun <O : Array<Point>> getPoints(quantity: integer, stepRate: integer = definedExternally, output: O = definedExternally): O
    open fun <O : Point> getRandomPoint(point: O = definedExternally): O
    open fun setTo(x1: Number = definedExternally, y1: Number = definedExternally, x2: Number = definedExternally, y2: Number = definedExternally): Line /* this */
    open fun <O : Vector2> getPointA(vec2: O = definedExternally): O
    open fun <O : Vector2> getPointB(vec2: O = definedExternally): O
    open var left: Number
    open var right: Number
    open var top: Number
    open var bottom: Number

    companion object {
        fun Angle(line: Line): Number
        fun BresenhamPoints(line: Line, stepRate: integer = definedExternally, results: Array<Vector2Like> = definedExternally): Array<Vector2Like>
        fun CenterOn(line: Line, x: Number, y: Number): Line
        fun Clone(source: Line): Line
        fun <O : Line> CopyFrom(source: Line, dest: O): O
        fun Equals(line: Line, toCompare: Line): Boolean
        fun Extend(line: Line, left: Number, right: Number = definedExternally): Line
        fun <O : Array<Point>> GetEasedPoints(line: Line, ease: String, quantity: integer, collinearThreshold: Number = definedExternally, easeParams: Array<Number> = definedExternally): O
        fun <O : Array<Point>> GetEasedPoints(line: Line, ease: Function<*>, quantity: integer, collinearThreshold: Number = definedExternally, easeParams: Array<Number> = definedExternally): O
        fun <O : Point> GetMidPoint(line: Line, out: O = definedExternally): O
        fun <O : Point> GetNearestPoint(line: Line, point: Point?, out: O = definedExternally): O
        fun <O : Point> GetNearestPoint(line: Line, point: Any?, out: O = definedExternally): O
        fun <O : Point> GetNormal(line: Line, out: O = definedExternally): O
        fun <O : Point> GetPoint(line: Line, position: Number, out: O = definedExternally): O
        fun <O : Array<Point>> GetPoints(line: Line, quantity: integer, stepRate: Number = definedExternally, out: O = definedExternally): O
        fun <O : Point> GetShortestDistance(line: Line, point: Point?): O
        fun <O : Point> GetShortestDistance(line: Line, point: Any?): O
        fun Height(line: Line): Number
        fun Length(line: Line): Number
        fun NormalAngle(line: Line): Number
        fun NormalX(line: Line): Number
        fun NormalY(line: Line): Number
        fun <O : Line> Offset(line: O, x: Number, y: Number): O
        fun PerpSlope(line: Line): Number
        fun <O : Point> Random(line: Line, out: O = definedExternally): O
        fun ReflectAngle(lineA: Line, lineB: Line): Number
        fun <O : Line> Rotate(line: O, angle: Number): O
        fun <O : Line> RotateAroundPoint(line: O, point: Point?, angle: Number): O
        fun <O : Line> RotateAroundPoint(line: O, point: Any?, angle: Number): O
        fun <O : Line> RotateAroundXY(line: O, x: Number, y: Number, angle: Number): O
        fun <O : Line> SetToAngle(line: O, x: Number, y: Number, angle: Number, length: Number): O
        fun Slope(line: Line): Number
        fun Width(line: Line): Number
    }
}

external open class Point(x: Number = definedExternally, y: Number = definedExternally) {
    open var type: integer
    open var x: Number
    open var y: Number
    open fun setTo(x: Number = definedExternally, y: Number = definedExternally): Point /* this */

    companion object {
        fun <O : Point> Ceil(point: O): O
        fun Clone(source: Point): Point
        fun <O : Point> CopyFrom(source: Point, dest: O): O
        fun Equals(point: Point, toCompare: Point): Boolean
        fun <O : Point> Floor(point: O): O
        fun <O : Point> GetCentroid(points: Array<Vector2Like>, out: O = definedExternally): O
        fun GetMagnitude(point: Point): Number
        fun GetMagnitudeSq(point: Point): Number
        fun <O : Rectangle> GetRectangleFromPoints(points: Array<Vector2Like>, out: O = definedExternally): O
        fun <O : Point> Interpolate(pointA: Point, pointB: Point, t: Number = definedExternally, out: O = definedExternally): O
        fun <O : Point> Invert(point: O): O
        fun <O : Point> Negative(point: Point, out: O = definedExternally): O
        fun <O : Point> Project(pointA: Point, pointB: Point, out: O = definedExternally): O
        fun <O : Point> ProjectUnit(pointA: Point, pointB: Point, out: O = definedExternally): O
        fun <O : Point> SetMagnitude(point: O, magnitude: Number): O
    }
}

external open class Polygon(points: Array<Point> = definedExternally) {
    open var type: integer
    open var area: Number
    open var points: Array<Point>
    open fun contains(x: Number, y: Number): Boolean
    open fun setTo(points: Array<Any>): Polygon /* this */
    open fun calculateArea(): Number
    open fun <O : Array<Point>> getPoints(quantity: integer, stepRate: Number = definedExternally, output: O = definedExternally): O

    companion object {
        fun Clone(polygon: Polygon): Polygon
        fun Contains(polygon: Polygon, x: Number, y: Number): Boolean
        fun ContainsPoint(polygon: Polygon, point: Point): Boolean
        fun <O : Rectangle> GetAABB(polygon: Polygon, out: O = definedExternally): O
        fun <O : Array<Number>> GetNumberArray(polygon: Polygon, output: O = definedExternally): O
        fun GetPoints(polygon: Polygon, quantity: integer, stepRate: Number = definedExternally, output: Array<Any> = definedExternally): Array<Point>
        fun Perimeter(polygon: Polygon): Number
        fun <O : Polygon> Reverse(polygon: O): O
        fun <O : Polygon> Smooth(polygon: O): O
    }
}

external open class Rectangle(x: Number = definedExternally, y: Number = definedExternally, width: Number = definedExternally, height: Number = definedExternally) {
    open var type: integer
    open var x: Number
    open var y: Number
    open var width: Number
    open var height: Number
    open fun contains(x: Number, y: Number): Boolean
    open fun <O : Point> getPoint(position: Number, output: O = definedExternally): O
    open fun <O : Array<Point>> getPoints(quantity: integer, stepRate: Number = definedExternally, output: O = definedExternally): O
    open fun <O : Point> getRandomPoint(point: O = definedExternally): O
    open fun setTo(x: Number, y: Number, width: Number, height: Number): Rectangle /* this */
    open fun setEmpty(): Rectangle /* this */
    open fun setPosition(x: Number, y: Number = definedExternally): Rectangle /* this */
    open fun setSize(width: Number, height: Number = definedExternally): Rectangle /* this */
    open fun isEmpty(): Boolean
    open fun <O : Line> getLineA(line: O = definedExternally): O
    open fun <O : Line> getLineB(line: O = definedExternally): O
    open fun <O : Line> getLineC(line: O = definedExternally): O
    open fun <O : Line> getLineD(line: O = definedExternally): O
    open var left: Number
    open var right: Number
    open var top: Number
    open var bottom: Number
    open var centerX: Number
    open var centerY: Number

    companion object {
        fun Area(rect: Rectangle): Number
        fun <O : Rectangle> Ceil(rect: O): O
        fun <O : Rectangle> CeilAll(rect: O): O
        fun <O : Rectangle> CenterOn(rect: O, x: Number, y: Number): O
        fun Clone(source: Rectangle): Rectangle
        fun Contains(rect: Rectangle, x: Number, y: Number): Boolean
        fun ContainsPoint(rect: Rectangle, point: Point): Boolean
        fun ContainsRect(rectA: Rectangle, rectB: Rectangle): Boolean
        fun <O : Rectangle> CopyFrom(source: Rectangle, dest: O): O
        fun Decompose(rect: Rectangle, out: Array<Any> = definedExternally): Array<Any>
        fun Equals(rect: Rectangle, toCompare: Rectangle): Boolean
        fun <O : Rectangle> FitInside(target: O, source: Rectangle): O
        fun <O : Rectangle> FitOutside(target: O, source: Rectangle): O
        fun <O : Rectangle> Floor(rect: O): O
        fun <O : Rectangle> FloorAll(rect: O): O
        fun <O : Rectangle> FromPoints(points: Array<Any>, out: O = definedExternally): O
        fun <O : Rectangle> FromXY(x1: Number, y1: Number, x2: Number, y2: Number, out: O = definedExternally): O
        fun GetAspectRatio(rect: Rectangle): Number
        fun <O : Point> GetCenter(rect: Rectangle, out: O = definedExternally): O
        fun <O : Point> GetPoint(rectangle: Rectangle, position: Number, out: O = definedExternally): O
        fun <O : Array<Point>> GetPoints(rectangle: Rectangle, step: Number, quantity: integer, out: O = definedExternally): O
        fun <O : Point> GetSize(rect: Rectangle, out: O = definedExternally): O
        fun <O : Rectangle> Inflate(rect: O, x: Number, y: Number): O
        fun <O : Rectangle> Intersection(rectA: Rectangle, rectB: Rectangle, out: Rectangle = definedExternally): O
        fun <O : Array<Point>> MarchingAnts(rect: Rectangle, step: Number = definedExternally, quantity: integer = definedExternally, out: O = definedExternally): O
        fun <O : Rectangle> MergePoints(target: O, points: Array<Point>): O
        fun <O : Rectangle> MergeRect(target: O, source: Rectangle): O
        fun <O : Rectangle> MergeXY(target: O, x: Number, y: Number): O
        fun <O : Rectangle> Offset(rect: O, x: Number, y: Number): O
        fun <O : Rectangle> OffsetPoint(rect: O, point: Point): O
        fun <O : Rectangle> OffsetPoint(rect: O, point: Vector2): O
        fun Overlaps(rectA: Rectangle, rectB: Rectangle): Boolean
        fun Perimeter(rect: Rectangle): Number
        fun <O : Point> PerimeterPoint(rectangle: Rectangle, angle: integer, out: O = definedExternally): O
        fun <O : Point> Random(rect: Rectangle, out: O): O
        fun <O : Point> RandomOutside(outer: Rectangle, inner: Rectangle, out: O = definedExternally): O
        fun SameDimensions(rect: Rectangle, toCompare: Rectangle): Boolean
        fun <O : Rectangle> Scale(rect: O, x: Number, y: Number): O
        fun <O : Rectangle> Union(rectA: Rectangle, rectB: Rectangle, out: O = definedExternally): O
    }
}

external open class Triangle(x1: Number = definedExternally, y1: Number = definedExternally, x2: Number = definedExternally, y2: Number = definedExternally, x3: Number = definedExternally, y3: Number = definedExternally) {
    open var type: integer
    open var x1: Number
    open var y1: Number
    open var x2: Number
    open var y2: Number
    open var x3: Number
    open var y3: Number
    open fun contains(x: Number, y: Number): Boolean
    open fun <O : Point> getPoint(position: Number, output: O = definedExternally): O
    open fun <O : Array<Point>> getPoints(quantity: integer, stepRate: Number = definedExternally, output: O = definedExternally): O
    open fun <O : Point> getRandomPoint(point: O = definedExternally): O
    open fun setTo(x1: Number = definedExternally, y1: Number = definedExternally, x2: Number = definedExternally, y2: Number = definedExternally, x3: Number = definedExternally, y3: Number = definedExternally): Triangle /* this */
    open fun <O : Line> getLineA(line: O = definedExternally): O
    open fun <O : Line> getLineB(line: O = definedExternally): O
    open fun <O : Line> getLineC(line: O = definedExternally): O
    open var left: Number
    open var right: Number
    open var top: Number
    open var bottom: Number

    companion object {
        fun Area(triangle: Triangle): Number
        fun BuildEquilateral(x: Number, y: Number, length: Number): Triangle
        fun <O : Array<Triangle>> BuildFromPolygon(data: Array<Any>, holes: Array<Any> = definedExternally, scaleX: Number = definedExternally, scaleY: Number = definedExternally, out: O = definedExternally): O
        fun BuildRight(x: Number, y: Number, width: Number, height: Number): Triangle
        fun <O : Triangle> CenterOn(triangle: O, x: Number, y: Number, centerFunc: CenterFunction = definedExternally): O
        fun <O : Point> Centroid(triangle: Triangle, out: O = definedExternally): O
        fun <O : Vector2> CircumCenter(triangle: Triangle, out: O = definedExternally): O
        fun <O : Circle> CircumCircle(triangle: Triangle, out: O = definedExternally): O
        fun Clone(source: Triangle): Triangle
        fun Contains(triangle: Triangle, x: Number, y: Number): Boolean
        fun ContainsArray(triangle: Triangle, points: Array<Point>, returnFirst: Boolean = definedExternally, out: Array<Any> = definedExternally): Array<Point>
        fun ContainsPoint(triangle: Triangle, point: Point): Boolean
        fun ContainsPoint(triangle: Triangle, point: Vector2): Boolean
        fun ContainsPoint(triangle: Triangle, point: Any): Boolean
        fun <O : Triangle> CopyFrom(source: Triangle, dest: O): O
        fun Decompose(triangle: Triangle, out: Array<Any> = definedExternally): Array<Any>
        fun Equals(triangle: Triangle, toCompare: Triangle): Boolean
        fun <O : Point> GetPoint(triangle: Triangle, position: Number, out: O = definedExternally): O
        fun <O : Point> GetPoints(triangle: Triangle, quantity: integer, stepRate: Number, out: O = definedExternally): O
        fun <O : Point> InCenter(triangle: Triangle, out: O = definedExternally): O
        fun <O : Triangle> Offset(triangle: O, x: Number, y: Number): O
        fun Perimeter(triangle: Triangle): Number
        fun <O : Point> Random(triangle: Triangle, out: O = definedExternally): O
        fun <O : Triangle> Rotate(triangle: O, angle: Number): O
        fun <O : Triangle> RotateAroundPoint(triangle: O, point: Point, angle: Number): O
        fun <O : Triangle> RotateAroundXY(triangle: O, x: Number, y: Number, angle: Number): O
    }
}