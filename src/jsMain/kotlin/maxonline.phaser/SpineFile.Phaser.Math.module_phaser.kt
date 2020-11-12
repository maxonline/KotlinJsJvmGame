@file:JsQualifier("Phaser.Math")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Math

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
import Phaser.Geom.Point
import Phaser.Types.Math.Vector2Like
import Phaser.Types.Math.SinCosTable

external fun Average(values: Array<Number>): Number

external fun Bernstein(n: Number, i: Number): Number

external fun Between(min: integer, max: integer): integer

external fun CatmullRom(t: Number, p0: Number, p1: Number, p2: Number, p3: Number): Number

external fun CeilTo(value: Number, place: Number = definedExternally, base: integer = definedExternally): Number

external fun Clamp(value: Number, min: Number, max: Number): Number

external var PI2: Number

external var TAU: Number

external var EPSILON: Number

external var DEG_TO_RAD: Number

external var RAD_TO_DEG: Number

external var RND: RandomDataGenerator

external var MIN_SAFE_INTEGER: Number

external var MAX_SAFE_INTEGER: Number

external fun DegToRad(degrees: integer): Number

external fun Difference(a: Number, b: Number): Number

external fun Factorial(value: Number): Number

external fun FloatBetween(min: Number, max: Number): Number

external fun FloorTo(value: Number, place: integer = definedExternally, base: integer = definedExternally): Number

external fun FromPercent(percent: Number, min: Number, max: Number = definedExternally): Number

external fun GetSpeed(distance: Number, time: integer): Number

external fun IsEven(value: Number): Boolean

external fun IsEvenStrict(value: Number): Boolean

external fun Linear(p0: Number, p1: Number, t: Number): Number

external open class Matrix3(m: Matrix3 = definedExternally) {
    open var `val`: Float32Array
    open fun clone(): Matrix3
    open fun set(src: Matrix3): Matrix3
    open fun copy(src: Matrix3): Matrix3
    open fun fromMat4(m: Matrix4): Matrix3
    open fun fromArray(a: Array<Any>): Matrix3
    open fun identity(): Matrix3
    open fun transpose(): Matrix3
    open fun invert(): Matrix3
    open fun adjoint(): Matrix3
    open fun determinant(): Number
    open fun multiply(src: Matrix3): Matrix3
    open fun translate(v: Vector2): Matrix3
    open fun translate(v: Vector3): Matrix3
    open fun translate(v: Vector4): Matrix3
    open fun rotate(rad: Number): Matrix3
    open fun scale(v: Vector2): Matrix3
    open fun scale(v: Vector3): Matrix3
    open fun scale(v: Vector4): Matrix3
    open fun fromQuat(q: Quaternion): Matrix3
    open fun normalFromMat4(m: Matrix4): Matrix3
}

external open class Matrix4(m: Matrix4 = definedExternally) {
    open var `val`: Float32Array
    open fun clone(): Matrix4
    open fun set(src: Matrix4): Matrix4
    open fun copy(src: Matrix4): Matrix4
    open fun fromArray(a: Array<Any>): Matrix4
    open fun zero(): Matrix4
    open fun xyz(x: Number, y: Number, z: Number): Matrix4
    open fun scaling(x: Number, y: Number, z: Number): Matrix4
    open fun identity(): Matrix4
    open fun transpose(): Matrix4
    open fun invert(): Matrix4
    open fun adjoint(): Matrix4
    open fun determinant(): Number
    open fun multiply(src: Matrix4): Matrix4
    open fun multiplyLocal(src: Matrix4): Matrix4
    open fun translate(v: Vector3): Matrix4
    open fun translate(v: Vector4): Matrix4
    open fun translateXYZ(x: Number, y: Number, z: Number): Matrix4
    open fun scale(v: Vector3): Matrix4
    open fun scale(v: Vector4): Matrix4
    open fun scaleXYZ(x: Number, y: Number, z: Number): Matrix4
    open fun makeRotationAxis(axis: Vector3, angle: Number): Matrix4
    open fun makeRotationAxis(axis: Vector4, angle: Number): Matrix4
    open fun rotate(rad: Number, axis: Vector3): Matrix4
    open fun rotateX(rad: Number): Matrix4
    open fun rotateY(rad: Number): Matrix4
    open fun rotateZ(rad: Number): Matrix4
    open fun fromRotationTranslation(q: Quaternion, v: Vector3): Matrix4
    open fun fromQuat(q: Quaternion): Matrix4
    open fun frustum(left: Number, right: Number, bottom: Number, top: Number, near: Number, far: Number): Matrix4
    open fun perspective(fovy: Number, aspect: Number, near: Number, far: Number): Matrix4
    open fun perspectiveLH(width: Number, height: Number, near: Number, far: Number): Matrix4
    open fun ortho(left: Number, right: Number, bottom: Number, top: Number, near: Number, far: Number): Matrix4
    open fun lookAt(eye: Vector3, center: Vector3, up: Vector3): Matrix4
    open fun yawPitchRoll(yaw: Number, pitch: Number, roll: Number): Matrix4
    open fun setWorldMatrix(rotation: Vector3, position: Vector3, scale: Vector3, viewMatrix: Matrix4 = definedExternally, projectionMatrix: Matrix4 = definedExternally): Matrix4
}

external fun MaxAdd(value: Number, amount: Number, max: Number): Number

external fun MinSub(value: Number, amount: Number, min: Number): Number

external fun Percent(value: Number, min: Number, max: Number = definedExternally, upperMax: Number = definedExternally): Number

external open class Quaternion(x: Number = definedExternally, y: Number = definedExternally, z: Number = definedExternally, w: Number = definedExternally) {
    open var x: Number
    open var y: Number
    open var z: Number
    open var w: Number
    open fun copy(src: Quaternion): Quaternion
    open fun copy(src: Vector4): Quaternion
    open fun set(x: Number? = definedExternally, y: Number = definedExternally, z: Number = definedExternally, w: Number = definedExternally): Quaternion
    open fun set(): Quaternion
    open fun set(x: Number? = definedExternally): Quaternion
    open fun set(x: Number? = definedExternally, y: Number = definedExternally): Quaternion
    open fun set(x: Number? = definedExternally, y: Number = definedExternally, z: Number = definedExternally): Quaternion
    open fun set(x: Any? = definedExternally, y: Number = definedExternally, z: Number = definedExternally, w: Number = definedExternally): Quaternion
    open fun set(x: Any? = definedExternally): Quaternion
    open fun set(x: Any? = definedExternally, y: Number = definedExternally): Quaternion
    open fun set(x: Any? = definedExternally, y: Number = definedExternally, z: Number = definedExternally): Quaternion
    open fun add(v: Quaternion): Quaternion
    open fun add(v: Vector4): Quaternion
    open fun subtract(v: Quaternion): Quaternion
    open fun subtract(v: Vector4): Quaternion
    open fun scale(scale: Number): Quaternion
    open fun length(): Number
    open fun lengthSq(): Number
    open fun normalize(): Quaternion
    open fun dot(v: Quaternion): Number
    open fun dot(v: Vector4): Number
    open fun lerp(v: Quaternion, t: Number = definedExternally): Quaternion
    open fun lerp(v: Quaternion): Quaternion
    open fun lerp(v: Vector4, t: Number = definedExternally): Quaternion
    open fun lerp(v: Vector4): Quaternion
    open fun rotationTo(a: Vector3, b: Vector3): Quaternion
    open fun setAxes(view: Vector3, right: Vector3, up: Vector3): Quaternion
    open fun identity(): Quaternion
    open fun setAxisAngle(axis: Vector3, rad: Number): Quaternion
    open fun multiply(b: Quaternion): Quaternion
    open fun multiply(b: Vector4): Quaternion
    open fun slerp(b: Quaternion, t: Number): Quaternion
    open fun slerp(b: Vector4, t: Number): Quaternion
    open fun invert(): Quaternion
    open fun conjugate(): Quaternion
    open fun rotateX(rad: Number): Quaternion
    open fun rotateY(rad: Number): Quaternion
    open fun rotateZ(rad: Number): Quaternion
    open fun calculateW(): Quaternion
    open fun fromMat3(mat: Matrix3): Quaternion
}

external fun RadToDeg(radians: Number): integer

external open class RandomDataGenerator {
    constructor(seeds: String = definedExternally)
    constructor()
    constructor(seeds: Array<String> = definedExternally)
    open var signs: Array<Number>
    open fun init(seeds: String)
    open fun init(seeds: Array<String>)
    open fun sow(seeds: Array<String>)
    open fun integer(): Number
    open fun frac(): Number
    open fun real(): Number
    open fun integerInRange(min: Number, max: Number): Number
    open fun between(min: Number, max: Number): Number
    open fun realInRange(min: Number, max: Number): Number
    open fun normal(): Number
    open fun uuid(): String
    open fun <T> pick(array: Array<T>): T
    open fun sign(): Number
    open fun <T> weightedPick(array: Array<T>): T
    open fun timestamp(min: Number, max: Number): Number
    open fun angle(): Number
    open fun rotation(): Number
    open fun state(state: String = definedExternally): String
    open fun <T> shuffle(array: Array<T> = definedExternally): Array<T>
}

external fun RandomXY(vector: Vector2, scale: Number = definedExternally): Vector2

external fun RandomXYZ(vec3: Vector3, radius: Number = definedExternally): Vector3

external fun RandomXYZW(vec4: Vector4, scale: Number = definedExternally): Vector4

external fun Rotate(point: Point?, angle: Number): Point

external fun Rotate(point: Any?, angle: Number): Point

external fun <T : Vector2Like> RotateAround(point: T, x: Number, y: Number, angle: Number): T

external fun <T : Vector2Like> RotateAroundDistance(point: T, x: Number, y: Number, angle: Number, distance: Number): T

external fun <T : Vector2Like> RotateTo(point: T, x: Number, y: Number, angle: Number, distance: Number): T

external fun RotateVec3(vec: Vector3, axis: Vector3, radians: Number): Vector3

external fun RoundAwayFromZero(value: Number): Number

external fun RoundTo(value: Number, place: integer = definedExternally, base: integer = definedExternally): Number

external fun SinCosTableGenerator(length: Number, sinAmp: Number = definedExternally, cosAmp: Number = definedExternally, frequency: Number = definedExternally): SinCosTable

external fun SmootherStep(x: Number, min: Number, max: Number): Number

external fun SmoothStep(x: Number, min: Number, max: Number): Number

external fun ToXY(index: integer, width: integer, height: integer, out: Vector2 = definedExternally): Vector2

external fun TransformXY(x: Number, y: Number, positionX: Number, positionY: Number, rotation: Number, scaleX: Number, scaleY: Number, output: Vector2? = definedExternally): dynamic /* Phaser.Math.Vector2? | Phaser.Geom.Point? | Any? */

external fun TransformXY(x: Number, y: Number, positionX: Number, positionY: Number, rotation: Number, scaleX: Number, scaleY: Number): dynamic /* Phaser.Math.Vector2? | Phaser.Geom.Point? | Any? */

external fun TransformXY(x: Number, y: Number, positionX: Number, positionY: Number, rotation: Number, scaleX: Number, scaleY: Number, output: Point? = definedExternally): dynamic /* Phaser.Math.Vector2? | Phaser.Geom.Point? | Any? */

external fun TransformXY(x: Number, y: Number, positionX: Number, positionY: Number, rotation: Number, scaleX: Number, scaleY: Number, output: Any? = definedExternally): dynamic /* Phaser.Math.Vector2? | Phaser.Geom.Point? | Any? */

external open class Vector2 {
    constructor(x: Number = definedExternally, y: Number = definedExternally)
    constructor()
    constructor(x: Number = definedExternally)
    constructor(x: Vector2Like = definedExternally, y: Number = definedExternally)
    constructor(x: Vector2Like = definedExternally)
    open var x: Number
    open var y: Number
    open fun clone(): Vector2
    open fun copy(src: Vector2): Vector2
    open fun setFromObject(obj: Vector2Like): Vector2
    open fun set(x: Number, y: Number = definedExternally): Vector2
    open fun setTo(x: Number, y: Number = definedExternally): Vector2
    open fun setToPolar(azimuth: Number, radius: Number = definedExternally): Vector2
    open fun equals(v: Vector2): Boolean
    open fun fuzzyEquals(v: Vector2, epsilon: Number = definedExternally): Boolean
    open fun angle(): Number
    open fun setAngle(angle: Number): Vector2
    open fun add(src: Vector2): Vector2
    open fun subtract(src: Vector2): Vector2
    open fun multiply(src: Vector2): Vector2
    open fun scale(value: Number): Vector2
    open fun divide(src: Vector2): Vector2
    open fun negate(): Vector2
    open fun distance(src: Vector2): Number
    open fun distanceSq(src: Vector2): Number
    open fun length(): Number
    open fun setLength(length: Number): Vector2
    open fun lengthSq(): Number
    open fun normalize(): Vector2
    open fun normalizeRightHand(): Vector2
    open fun normalizeLeftHand(): Vector2
    open fun dot(src: Vector2): Number
    open fun cross(src: Vector2): Number
    open fun lerp(src: Vector2, t: Number = definedExternally): Vector2
    open fun transformMat3(mat: Matrix3): Vector2
    open fun transformMat4(mat: Matrix4): Vector2
    open fun reset(): Vector2
    open fun limit(max: Number): Vector2
    open fun reflect(normal: Vector2): Vector2
    open fun mirror(axis: Vector2): Vector2
    open fun rotate(delta: Number): Vector2

    companion object {
        var ZERO: Vector2
        var RIGHT: Vector2
        var LEFT: Vector2
        var UP: Vector2
        var DOWN: Vector2
        var ONE: Vector2
    }
}

external open class Vector3(x: Number = definedExternally, y: Number = definedExternally, z: Number = definedExternally) {
    open var x: Number
    open var y: Number
    open var z: Number
    open fun up(): Vector3
    open fun clone(): Vector3
    open fun crossVectors(a: Vector3, b: Vector3): Vector3
    open fun equals(v: Vector3): Boolean
    open fun copy(src: Vector2): Vector3
    open fun copy(src: Vector3): Vector3
    open fun set(x: Number?, y: Number = definedExternally, z: Number = definedExternally): Vector3
    open fun set(x: Number?): Vector3
    open fun set(x: Number?, y: Number = definedExternally): Vector3
    open fun set(x: Any?, y: Number = definedExternally, z: Number = definedExternally): Vector3
    open fun set(x: Any?): Vector3
    open fun set(x: Any?, y: Number = definedExternally): Vector3
    open fun add(v: Vector2): Vector3
    open fun add(v: Vector3): Vector3
    open fun subtract(v: Vector2): Vector3
    open fun subtract(v: Vector3): Vector3
    open fun multiply(v: Vector2): Vector3
    open fun multiply(v: Vector3): Vector3
    open fun scale(scale: Number): Vector3
    open fun divide(v: Vector2): Vector3
    open fun divide(v: Vector3): Vector3
    open fun negate(): Vector3
    open fun distance(v: Vector2): Number
    open fun distance(v: Vector3): Number
    open fun distanceSq(v: Vector2): Number
    open fun distanceSq(v: Vector3): Number
    open fun length(): Number
    open fun lengthSq(): Number
    open fun normalize(): Vector3
    open fun dot(v: Vector3): Number
    open fun cross(v: Vector3): Vector3
    open fun lerp(v: Vector3, t: Number = definedExternally): Vector3
    open fun transformMat3(mat: Matrix3): Vector3
    open fun transformMat4(mat: Matrix4): Vector3
    open fun transformCoordinates(mat: Matrix4): Vector3
    open fun transformQuat(q: Quaternion): Vector3
    open fun project(mat: Matrix4): Vector3
    open fun unproject(viewport: Vector4, invProjectionView: Matrix4): Vector3
    open fun reset(): Vector3

    companion object {
        var ZERO: Vector3
        var RIGHT: Vector3
        var LEFT: Vector3
        var UP: Vector3
        var DOWN: Vector3
        var FORWARD: Vector3
        var BACK: Vector3
        var ONE: Vector3
    }
}

external open class Vector4(x: Number = definedExternally, y: Number = definedExternally, z: Number = definedExternally, w: Number = definedExternally) {
    open var x: Number
    open var y: Number
    open var z: Number
    open var w: Number
    open fun clone(): Vector4
    open fun copy(src: Vector4): Vector4
    open fun equals(v: Vector4): Boolean
    open fun set(x: Number?, y: Number, z: Number, w: Number): Vector4
    open fun set(x: Any?, y: Number, z: Number, w: Number): Vector4
    open fun add(v: Vector2): Vector4
    open fun add(v: Vector3): Vector4
    open fun add(v: Vector4): Vector4
    open fun subtract(v: Vector2): Vector4
    open fun subtract(v: Vector3): Vector4
    open fun subtract(v: Vector4): Vector4
    open fun scale(scale: Number): Vector4
    open fun length(): Number
    open fun lengthSq(): Number
    open fun normalize(): Vector4
    open fun dot(v: Vector4): Number
    open fun lerp(v: Vector4, t: Number = definedExternally): Vector4
    open fun multiply(v: Vector2): Vector4
    open fun multiply(v: Vector3): Vector4
    open fun multiply(v: Vector4): Vector4
    open fun divide(v: Vector2): Vector4
    open fun divide(v: Vector3): Vector4
    open fun divide(v: Vector4): Vector4
    open fun distance(v: Vector2): Number
    open fun distance(v: Vector3): Number
    open fun distance(v: Vector4): Number
    open fun distanceSq(v: Vector2): Number
    open fun distanceSq(v: Vector3): Number
    open fun distanceSq(v: Vector4): Number
    open fun negate(): Vector4
    open fun transformMat4(mat: Matrix4): Vector4
    open fun transformQuat(q: Quaternion): Vector4
    open fun reset(): Vector4
}

external fun Within(a: Number, b: Number, tolerance: Number): Boolean

external fun Wrap(value: Number, min: Number, max: Number): Number