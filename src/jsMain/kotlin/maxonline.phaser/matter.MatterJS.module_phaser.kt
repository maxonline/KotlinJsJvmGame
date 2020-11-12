@file:JsModule("matter")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package MatterJS

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

external interface IChamfer {
    var radius: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var quality: Number?
        get() = definedExternally
        set(value) = definedExternally
    var qualityMin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var qualityMax: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IChamferableBodyDefinition : IBodyDefinition {
    var chamfer: IChamfer?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IBodyDefinition {
    var angle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var angularSpeed: Number?
        get() = definedExternally
        set(value) = definedExternally
    var angularVelocity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var area: Number?
        get() = definedExternally
        set(value) = definedExternally
    var axes: Array<Vector>?
        get() = definedExternally
        set(value) = definedExternally
    var bounds: IBound?
        get() = definedExternally
        set(value) = definedExternally
    var density: Number?
        get() = definedExternally
        set(value) = definedExternally
    var force: Vector?
        get() = definedExternally
        set(value) = definedExternally
    var friction: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frictionAir: Number?
        get() = definedExternally
        set(value) = definedExternally
    var inertia: Number?
        get() = definedExternally
        set(value) = definedExternally
    var inverseInertia: Number?
        get() = definedExternally
        set(value) = definedExternally
    var inverseMass: Number?
        get() = definedExternally
        set(value) = definedExternally
    var isSensor: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isSleeping: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isStatic: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var label: String?
        get() = definedExternally
        set(value) = definedExternally
    var mass: Number?
        get() = definedExternally
        set(value) = definedExternally
    var motion: Number?
        get() = definedExternally
        set(value) = definedExternally
    var position: Vector?
        get() = definedExternally
        set(value) = definedExternally
    var render: IBodyRenderOptions?
        get() = definedExternally
        set(value) = definedExternally
    var restitution: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sleepThreshold: Number?
        get() = definedExternally
        set(value) = definedExternally
    var slop: Number?
        get() = definedExternally
        set(value) = definedExternally
    var speed: Number?
        get() = definedExternally
        set(value) = definedExternally
    var timeScale: Number?
        get() = definedExternally
        set(value) = definedExternally
    var torque: Number?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var velocity: Vector?
        get() = definedExternally
        set(value) = definedExternally
    var vertices: Array<Vector>?
        get() = definedExternally
        set(value) = definedExternally
    var parts: Array<BodyType>?
        get() = definedExternally
        set(value) = definedExternally
    var parent: BodyType?
        get() = definedExternally
        set(value) = definedExternally
    var frictionStatic: Number?
        get() = definedExternally
        set(value) = definedExternally
    var collisionFilter: ICollisionFilter?
        get() = definedExternally
        set(value) = definedExternally
    var gameObject: Any?
        get() = definedExternally
        set(value) = definedExternally
    var gravityScale: Vector?
        get() = definedExternally
        set(value) = definedExternally
    var ignoreGravity: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ignorePointer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onCollideCallback: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var onCollideEndCallback: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var onCollideActiveCallback: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var onCollideWith: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IBodyRenderOptions {
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var opacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sprite: IBodyRenderOptionsSprite?
        get() = definedExternally
        set(value) = definedExternally
    var fillColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var fillOpacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lineColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lineOpacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lineThickness: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IBodyRenderOptionsSprite {
    var xOffset: Number
    var yOffset: Number
}

external interface `T$16` {
    var x: Number
    var y: Number
}

external interface IBound {
    var min: `T$16`
    var max: `T$16`
}

external interface ICompositeDefinition {
    var bodies: Array<BodyType>?
        get() = definedExternally
        set(value) = definedExternally
    var composites: Array<CompositeType>?
        get() = definedExternally
        set(value) = definedExternally
    var constraints: Array<ConstraintType>?
        get() = definedExternally
        set(value) = definedExternally
    var id: Number?
        get() = definedExternally
        set(value) = definedExternally
    var isModified: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var label: String?
        get() = definedExternally
        set(value) = definedExternally
    var parent: CompositeType?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IConstraintDefinition {
    var bodyA: IBodyDefinition?
        get() = definedExternally
        set(value) = definedExternally
    var bodyB: IBodyDefinition?
        get() = definedExternally
        set(value) = definedExternally
    var id: Number?
        get() = definedExternally
        set(value) = definedExternally
    var label: String?
        get() = definedExternally
        set(value) = definedExternally
    var length: Number?
        get() = definedExternally
        set(value) = definedExternally
    var pointA: Vector?
        get() = definedExternally
        set(value) = definedExternally
    var pointB: Vector?
        get() = definedExternally
        set(value) = definedExternally
    var render: IConstraintRenderDefinition?
        get() = definedExternally
        set(value) = definedExternally
    var stiffness: Number?
        get() = definedExternally
        set(value) = definedExternally
    var damping: Number?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IConstraintRenderDefinition {
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var anchors: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var lineColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lineOpacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lineThickness: Number?
        get() = definedExternally
        set(value) = definedExternally
    var pinSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var anchorColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var anchorSize: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IEngineDefinition {
    var positionIterations: Number?
        get() = definedExternally
        set(value) = definedExternally
    var velocityIterations: Number?
        get() = definedExternally
        set(value) = definedExternally
    var constraintIterations: Number?
        get() = definedExternally
        set(value) = definedExternally
    var enableSleeping: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var timing: IEngineTimingOptions?
        get() = definedExternally
        set(value) = definedExternally
    var grid: Grid?
        get() = definedExternally
        set(value) = definedExternally
    var world: World?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IEngineTimingOptions {
    var timeScale: Number
    var timestamp: Number
}

external interface IMouseConstraintDefinition {
    var constraint: ConstraintType?
        get() = definedExternally
        set(value) = definedExternally
    var collisionFilter: ICollisionFilter?
        get() = definedExternally
        set(value) = definedExternally
    var body: BodyType?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IGridDefinition

external interface IPair {
    var id: Number
    var bodyA: Body
    var bodyB: Body
    var contacts: Any
    var activeContacts: Any
    var separation: Number
    var isActive: Boolean
    var timeCreated: Number
    var timeUpdated: Number
    var inverseMass: Number
    var friction: Number
    var frictionStatic: Number
    var restitution: Number
    var slop: Number
}

external interface ICollisionData {
    var collided: Boolean
    var bodyA: Body
    var bodyB: Body
    var axisBody: Body
    var axisNumber: Number
    var depth: Number
    var parentA: Body
    var parentB: Body
    var normal: Vector
    var tangent: Vector
    var penetration: Vector
    var supports: Array<Vector>
    var inverseMass: Number
    var friction: Number
    var frictionStatic: Number
    var restitution: Number
    var slop: Number
}

external interface ICollisionPair {
    var id: String
    var bodyA: Body
    var bodyB: Body
    var activeContacts: Array<Vector>
    var separation: Number
    var isActive: Boolean
    var confirmedActive: Boolean
    var isSensor: Boolean
    var timeCreated: Number
    var timeUpdated: Number
    var collision: ICollisionData
    var inverseMass: Number
    var friction: Number
    var frictionStatic: Number
    var restitution: Number
    var slop: Number
}

external interface ICollisionFilter {
    var category: Number
    var mask: Number
    var group: Number
}

external interface IRunnerOptions {
    var isFixed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var delta: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IWorldDefinition : ICompositeDefinition {
    var gravity: Gravity?
        get() = definedExternally
        set(value) = definedExternally
    var bounds: IBound?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gravity : Vector {
    var scale: Number
}

external interface IEvent<T> {
    var name: String
    var source: T
}

external interface IEventComposite<T> : IEvent<T> {
    var `object`: Any
}

external interface IEventTimestamped<T> : IEvent<T> {
    var timestamp: Number
}

external interface IEventCollision<T> : IEventTimestamped<T> {
    var pairs: Array<IPair>
}

external interface CompositeType {
    var id: Number
    var type: String
    var parent: CompositeType?
        get() = definedExternally
        set(value) = definedExternally
    var isModified: Boolean
    var bodies: Array<BodyType>
    var constraints: Array<ConstraintType>
    var composites: Array<CompositeType>
    var label: String
    var plugin: Any
}

external interface ConstraintType {
    var bodyA: BodyType?
        get() = definedExternally
        set(value) = definedExternally
    var bodyB: BodyType?
        get() = definedExternally
        set(value) = definedExternally
    var pointA: Vector
    var pointB: Vector
    var length: Number
    var id: Number
    var label: String
    var type: String
    var stiffness: Number
    var damping: Number
    var angularStiffness: Number
    var angleA: Number
    var angleB: Number
    var plugin: Any
    var render: IConstraintRenderDefinition
}

external interface BodyType {
    var id: Number
    var type: String
    var label: String
    var parts: Array<BodyType>
    var plugin: Any
    var angle: Number
    var vertices: Array<Vector>?
        get() = definedExternally
        set(value) = definedExternally
    var position: Vector
    var force: Vector
    var torque: Number
    var positionImpulse: Vector
    var previousPositionImpulse: Vector
    var constraintImpulse: Vector
    var totalContacts: Number
    var speed: Number
    var angularSpeed: Number
    var velocity: Vector
    var angularVelocity: Number
    var isSensor: Boolean
    var isStatic: Boolean
    var isSleeping: Boolean
    var motion: Number
    var sleepThreshold: Number
    var density: Number
    var restitution: Number
    var friction: Number
    var frictionStatic: Number
    var frictionAir: Number
    var collisionFilter: ICollisionFilter
    var slop: Number
    var timeScale: Number
    var events: Any?
        get() = definedExternally
        set(value) = definedExternally
    var bounds: IBound
    var chamfer: IChamfer?
        get() = definedExternally
        set(value) = definedExternally
    var circleRadius: Number
    var positionPrev: Vector
    var anglePrev: Number
    var parent: BodyType
    var axes: Array<Vector>?
        get() = definedExternally
        set(value) = definedExternally
    var area: Number
    var mass: Number
    var inverseMass: Number
    var inertia: Number
    var inverseInertia: Number
    var _original: Any
    var render: IBodyRenderOptions
    var gameObject: Any?
        get() = definedExternally
        set(value) = definedExternally
    var scale: Vector
    var centerOfMass: Vector
    var centerOffset: Vector
    var gravityScale: Vector
    var ignoreGravity: Boolean
    var ignorePointer: Boolean
    var onCollideCallback: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var onCollideEndCallback: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var onCollideActiveCallback: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var onCollideWith: Any?
        get() = definedExternally
        set(value) = definedExternally
    var setOnCollideWith: (body: BodyType, callback: Function<*>) -> BodyType
}

external fun use(vararg plugins: Any /* Plugin | String */)

external open class Axes {
    companion object {
        fun fromVertices(vertices: Array<Vector>): Array<Vector>
        fun rotate(axes: Array<Vector>, angle: Number)
    }
}

external open class AxesFactory {
    open fun fromVertices(vertices: Array<Vector>): Array<Vector>
    open fun rotate(axes: Array<Vector>, angle: Number)
}

external open class Bodies {
    companion object {
        fun circle(x: Number, y: Number, radius: Number, options: IBodyDefinition = definedExternally, maxSides: Number = definedExternally): BodyType
        fun polygon(x: Number, y: Number, sides: Number, radius: Number, options: IChamferableBodyDefinition = definedExternally): BodyType
        fun rectangle(x: Number, y: Number, width: Number, height: Number, options: IChamferableBodyDefinition = definedExternally): BodyType
        fun trapezoid(x: Number, y: Number, width: Number, height: Number, slope: Number, options: IChamferableBodyDefinition = definedExternally): BodyType
        fun fromVertices(x: Number, y: Number, vertexSets: Array<Array<Vector>>, options: IBodyDefinition = definedExternally, flagInternal: Boolean = definedExternally, removeCollinear: Number = definedExternally, minimumArea: Number = definedExternally): BodyType
    }
}

external open class BodiesFactory {
    open fun circle(x: Number, y: Number, radius: Number, options: IBodyDefinition = definedExternally, maxSides: Number = definedExternally): BodyType
    open fun polygon(x: Number, y: Number, sides: Number, radius: Number, options: IChamferableBodyDefinition = definedExternally): BodyType
    open fun rectangle(x: Number, y: Number, width: Number, height: Number, options: IChamferableBodyDefinition = definedExternally): BodyType
    open fun trapezoid(x: Number, y: Number, width: Number, height: Number, slope: Number, options: IChamferableBodyDefinition = definedExternally): BodyType
    open fun fromVertices(x: Number, y: Number, vertexSets: Array<Array<Vector>>, options: IBodyDefinition = definedExternally, flagInternal: Boolean = definedExternally, removeCollinear: Number = definedExternally, minimumArea: Number = definedExternally): BodyType
}

external open class Body {
    companion object {
        fun applyForce(body: BodyType, position: Vector, force: Vector)
        fun create(options: IChamferableBodyDefinition): Body
        fun rotate(body: BodyType, rotation: Number)
        fun nextGroup(isNonColliding: Boolean): Number
        fun nextCategory(): Number
        fun set(body: BodyType, settings: Any, value: Any = definedExternally)
        fun setMass(body: BodyType, mass: Number)
        fun setDensity(body: BodyType, density: Number)
        fun setInertia(body: BodyType, inertia: Number)
        fun setVertices(body: BodyType, vertices: Array<Vector>)
        fun setParts(body: BodyType, parts: Array<BodyType>, autoHull: Boolean = definedExternally)
        fun setPosition(body: BodyType, position: Vector)
        fun setAngle(body: BodyType, angle: Number)
        fun setVelocity(body: BodyType, velocity: Vector)
        fun setAngularVelocity(body: BodyType, velocity: Number)
        fun setStatic(body: BodyType, isStatic: Boolean)
        fun scale(body: BodyType, scaleX: Number, scaleY: Number, point: Vector = definedExternally)
        fun translate(body: BodyType, translation: Vector)
        fun update(body: BodyType, deltaTime: Number, timeScale: Number, correction: Number)
    }
}

external open class BodyFactory {
    open fun applyForce(body: BodyType, position: Vector, force: Vector)
    open fun create(options: IChamferableBodyDefinition): BodyType
    open fun rotate(body: BodyType, rotation: Number)
    open fun nextGroup(isNonColliding: Boolean): Number
    open fun nextCategory(): Number
    open fun set(body: BodyType, settings: Any, value: Any = definedExternally)
    open fun setMass(body: BodyType, mass: Number)
    open fun setDensity(body: BodyType, density: Number)
    open fun setInertia(body: BodyType, inertia: Number)
    open fun setVertices(body: BodyType, vertices: Array<Vector>)
    open fun setParts(body: BodyType, parts: Array<BodyType>, autoHull: Boolean = definedExternally)
    open fun setPosition(body: BodyType, position: Vector)
    open fun setAngle(body: BodyType, angle: Number)
    open fun setVelocity(body: BodyType, velocity: Vector)
    open fun setAngularVelocity(body: BodyType, velocity: Number)
    open fun setStatic(body: BodyType, isStatic: Boolean)
    open fun scale(body: BodyType, scaleX: Number, scaleY: Number, point: Vector = definedExternally)
    open fun translate(body: BodyType, translation: Vector)
    open fun update(body: BodyType, deltaTime: Number, timeScale: Number, correction: Number)
}

external open class Bounds {
    companion object {
        fun create(vertices: Vertices): IBound
        fun update(bounds: IBound, vertices: Vertices, velocity: Vector)
        fun contains(bounds: IBound, point: Vector): Boolean
        fun overlaps(boundsA: IBound, boundsB: IBound): Boolean
        fun translate(bounds: IBound, vector: Vector)
        fun shift(bounds: IBound, position: Vector)
    }
}

external open class BoundsFactory {
    open fun create(vertices: Vertices): IBound
    open fun update(bounds: IBound, vertices: Vertices, velocity: Vector)
    open fun contains(bounds: IBound, point: Vector): Boolean
    open fun overlaps(boundsA: IBound, boundsB: IBound): Boolean
    open fun translate(bounds: IBound, vector: Vector)
    open fun shift(bounds: IBound, position: Vector)
}

external open class Composite {
    companion object {
        fun add(composite: CompositeType, obj: BodyType): CompositeType
        fun add(composite: CompositeType, obj: CompositeType): CompositeType
        fun add(composite: CompositeType, obj: ConstraintType): CompositeType
        fun allBodies(composite: CompositeType): Array<BodyType>
        fun allComposites(composite: CompositeType): Array<CompositeType>
        fun allConstraints(composite: CompositeType): Array<ConstraintType>
        fun clear(composite: CompositeType, keepStatic: Boolean, deep: Boolean = definedExternally)
        fun create(options: ICompositeDefinition = definedExternally): CompositeType
        fun get(composite: CompositeType, id: Number, type: String): dynamic /* BodyType | CompositeType | ConstraintType */
        fun move(compositeA: CompositeType, objects: Array<Any /* BodyType | CompositeType | ConstraintType */>, compositeB: CompositeType): CompositeType
        fun rebase(composite: CompositeType): CompositeType
        fun remove(composite: CompositeType, obj: BodyType, deep: Boolean = definedExternally): CompositeType
        fun remove(composite: CompositeType, obj: CompositeType, deep: Boolean = definedExternally): CompositeType
        fun remove(composite: CompositeType, obj: ConstraintType, deep: Boolean = definedExternally): CompositeType
        fun setModified(composite: CompositeType, isModified: Boolean, updateParents: Boolean = definedExternally, updateChildren: Boolean = definedExternally)
        fun translate(composite: CompositeType, translation: Vector, recursive: Boolean = definedExternally)
        fun rotate(composite: CompositeType, rotation: Number, point: Vector, recursive: Boolean = definedExternally)
        fun scale(composite: CompositeType, scaleX: Number, scaleY: Number, point: Vector, recursive: Boolean = definedExternally)
    }
}

external open class CompositeFactory {
    open fun add(composite: CompositeType, obj: BodyType): CompositeType
    open fun add(composite: CompositeType, obj: CompositeType): CompositeType
    open fun add(composite: CompositeType, obj: ConstraintType): CompositeType
    open fun allBodies(composite: CompositeType): Array<BodyType>
    open fun allComposites(composite: CompositeType): Array<CompositeType>
    open fun allConstraints(composite: CompositeType): Array<ConstraintType>
    open fun clear(composite: CompositeType, keepStatic: Boolean, deep: Boolean = definedExternally)
    open fun create(options: ICompositeDefinition = definedExternally): CompositeType
    open fun get(composite: CompositeType, id: Number, type: String): dynamic /* BodyType | CompositeType | ConstraintType */
    open fun move(compositeA: CompositeType, objects: Array<Any /* BodyType | CompositeType | ConstraintType */>, compositeB: CompositeType): CompositeType
    open fun rebase(composite: CompositeType): CompositeType
    open fun remove(composite: CompositeType, obj: BodyType, deep: Boolean = definedExternally): CompositeType
    open fun remove(composite: CompositeType, obj: BodyType): CompositeType
    open fun remove(composite: CompositeType, obj: CompositeType, deep: Boolean = definedExternally): CompositeType
    open fun remove(composite: CompositeType, obj: CompositeType): CompositeType
    open fun remove(composite: CompositeType, obj: ConstraintType, deep: Boolean = definedExternally): CompositeType
    open fun remove(composite: CompositeType, obj: ConstraintType): CompositeType
    open fun setModified(composite: CompositeType, isModified: Boolean, updateParents: Boolean = definedExternally, updateChildren: Boolean = definedExternally)
    open fun translate(composite: CompositeType, translation: Vector, recursive: Boolean = definedExternally)
    open fun rotate(composite: CompositeType, rotation: Number, point: Vector, recursive: Boolean = definedExternally)
    open fun scale(composite: CompositeType, scaleX: Number, scaleY: Number, point: Vector, recursive: Boolean = definedExternally)
}

external open class Composites {
    companion object {
        fun car(xx: Number, yy: Number, width: Number, height: Number, wheelSize: Number): CompositeType
        fun chain(composite: CompositeType, xOffsetA: Number, yOffsetA: Number, xOffsetB: Number, yOffsetB: Number, options: Any): CompositeType
        fun mesh(composite: CompositeType, columns: Number, rows: Number, crossBrace: Boolean, options: Any): CompositeType
        fun newtonsCradle(xx: Number, yy: Number, number: Number, size: Number, length: Number): CompositeType
        fun pyramid(xx: Number, yy: Number, columns: Number, rows: Number, columnGap: Number, rowGap: Number, callback: Function<*>): CompositeType
        fun softBody(xx: Number, yy: Number, columns: Number, rows: Number, columnGap: Number, rowGap: Number, crossBrace: Boolean, particleRadius: Number, particleOptions: Any, constraintOptions: Any): CompositeType
        fun stack(xx: Number, yy: Number, columns: Number, rows: Number, columnGap: Number, rowGap: Number, callback: Function<*>): CompositeType
    }
}

external open class CompositesFactory {
    open fun car(xx: Number, yy: Number, width: Number, height: Number, wheelSize: Number): CompositeType
    open fun chain(composite: CompositeType, xOffsetA: Number, yOffsetA: Number, xOffsetB: Number, yOffsetB: Number, options: Any): CompositeType
    open fun mesh(composite: CompositeType, columns: Number, rows: Number, crossBrace: Boolean, options: Any): CompositeType
    open fun newtonsCradle(xx: Number, yy: Number, number: Number, size: Number, length: Number): CompositeType
    open fun pyramid(xx: Number, yy: Number, columns: Number, rows: Number, columnGap: Number, rowGap: Number, callback: Function<*>): CompositeType
    open fun softBody(xx: Number, yy: Number, columns: Number, rows: Number, columnGap: Number, rowGap: Number, crossBrace: Boolean, particleRadius: Number, particleOptions: Any, constraintOptions: Any): CompositeType
    open fun stack(xx: Number, yy: Number, columns: Number, rows: Number, columnGap: Number, rowGap: Number, callback: Function<*>): CompositeType
}

external open class Constraint {
    companion object {
        fun create(options: IConstraintDefinition): ConstraintType
    }
}

external open class ConstraintFactory {
    open fun create(options: IConstraintDefinition): ConstraintType
}

external open class Engine {
    open var broadphase: Grid
    open var constraintIterations: Number
    open var enabled: Boolean
    open var enableSleeping: Boolean
    open var pairs: Any
    open var positionIterations: Number
    open var timing: IEngineTimingOptions
    open var velocityIterations: Number
    open var world: World

    companion object {
        fun clear(engine: Engine)
        fun create(element: HTMLElement = definedExternally, options: IEngineDefinition = definedExternally): Engine
        fun create(element: IEngineDefinition = definedExternally, options: IEngineDefinition = definedExternally): Engine
        fun create(options: IEngineDefinition = definedExternally): Engine
        fun merge(engineA: Engine, engineB: Engine)
        fun update(engine: Engine, delta: Number = definedExternally, correction: Number = definedExternally): Engine
        fun run(engine: Engine)
    }
}

external open class Grid {
    companion object {
        fun create(options: IGridDefinition = definedExternally): Grid
        fun update(grid: Grid, bodies: Array<BodyType>, engine: Engine, forceUpdate: Boolean)
        fun clear(grid: Grid)
    }
}

external open class GridFactory {
    open fun create(options: IGridDefinition = definedExternally): Grid
    open fun update(grid: Grid, bodies: Array<BodyType>, engine: Engine, forceUpdate: Boolean)
    open fun clear(grid: Grid)
}

external open class MouseConstraint {
    open var constraint: ConstraintType
    open var collisionFilter: ICollisionFilter
    open var body: BodyType
    open var type: String

    companion object {
        fun create(engine: Engine, options: IMouseConstraintDefinition = definedExternally): MouseConstraint
    }
}

external open class Pairs {
    companion object {
        fun clear(pairs: Any): Any
    }
}

external open class PairsFactory {
    open fun clear(pairs: Any): Any
}

external open class Pair {
    companion object {
        fun create(collision: ICollisionData, timestamp: Number): IPair
        fun update(pair: IPair, collision: ICollisionData, timestamp: Number)
        fun setActive(pair: IPair, isActive: Boolean, timestamp: Number)
        fun id(bodyA: BodyType, bodyB: BodyType): String
    }
}

external open class PairFactory {
    open fun create(collision: ICollisionData, timestamp: Number): IPair
    open fun update(pair: IPair, collision: ICollisionData, timestamp: Number)
    open fun setActive(pair: IPair, isActive: Boolean, timestamp: Number)
    open fun id(bodyA: BodyType, bodyB: BodyType): String
}

external open class Detector {
    companion object {
        fun collisions(broadphasePairs: Array<IPair>, engine: Engine): Array<ICollisionData>
        fun canCollide(filterA: ICollisionFilter, filterB: ICollisionFilter): Boolean
    }
}

external open class DetectorFactory {
    open fun collisions(broadphasePairs: Array<IPair>, engine: Engine): Array<ICollisionData>
    open fun canCollide(filterA: ICollisionFilter, filterB: ICollisionFilter): Boolean
}

external open class Resolver {
    companion object {
        fun preSolvePosition(pairs: Array<IPair>)
        fun solvePosition(pairs: Array<IPair>, bodies: Array<BodyType>, timeScale: Number)
        fun postSolvePosition(bodies: Array<BodyType>)
        fun preSolveVelocity(pairs: Array<IPair>)
        fun solveVelocity(pairs: Array<IPair>, timeScale: Number)
    }
}

external open class ResolverFactory {
    open fun preSolvePosition(pairs: Array<IPair>)
    open fun solvePosition(pairs: Array<IPair>, bodies: Array<BodyType>, timeScale: Number)
    open fun postSolvePosition(bodies: Array<BodyType>)
    open fun preSolveVelocity(pairs: Array<IPair>)
    open fun solveVelocity(pairs: Array<IPair>, timeScale: Number)
}

external open class SAT {
    companion object {
        fun collides(bodyA: BodyType, bodyB: BodyType, previousCollision: ICollisionData): ICollisionData
    }
}

external open class SATFactory {
    open fun collides(bodyA: BodyType, bodyB: BodyType, previousCollision: ICollisionData): ICollisionData
}

external open class Query {
    companion object {
        fun ray(bodies: Array<BodyType>, startPoint: Vector, endPoint: Vector, rayWidth: Number = definedExternally): Array<ICollisionData>
        fun region(bodies: Array<BodyType>, bounds: Bounds, outside: Boolean = definedExternally): Array<BodyType>
        fun point(bodies: Array<BodyType>, point: Vector): Array<BodyType>
    }
}

external open class QueryFactory {
    open fun ray(bodies: Array<BodyType>, startPoint: Vector, endPoint: Vector, rayWidth: Number = definedExternally): Array<ICollisionData>
    open fun region(bodies: Array<BodyType>, bounds: Bounds, outside: Boolean = definedExternally): Array<BodyType>
    open fun point(bodies: Array<BodyType>, point: Vector): Array<BodyType>
}

external open class Runner {
    open var enabled: Boolean
    open var isFixed: Boolean
    open var delta: Number

    companion object {
        fun create(options: IRunnerOptions): Runner
        fun run(runner: Runner, engine: Engine): Runner
        fun run(engine: Engine): Runner
        fun tick(runner: Runner, engine: Engine, time: Number)
        fun stop(runner: Runner)
        fun start(runner: Runner, engine: Engine)
    }
}

external open class Sleeping {
    companion object {
        fun set(body: BodyType, isSleeping: Boolean)
    }
}

external open class SleepingFactory {
    open fun set(body: BodyType, isSleeping: Boolean)
}

external open class Svg {
    companion object {
        fun pathToVertices(path: SVGPathElement, sampleLength: Number): Array<Vector>
    }
}

external open class SvgFactory {
    open fun pathToVertices(path: SVGPathElement, sampleLength: Number): Array<Vector>
}

external open class Vector {
    open var x: Number
    open var y: Number

    companion object {
        fun create(x: Number = definedExternally, y: Number = definedExternally): Vector
        fun clone(vector: Vector): Vector
        fun cross3(vectorA: Vector, vectorB: Vector, vectorC: Vector): Number
        fun add(vectorA: Vector, vectorB: Vector, output: Vector = definedExternally): Vector
        fun angle(vectorA: Vector, vectorB: Vector): Number
        fun cross(vectorA: Vector, vectorB: Vector): Number
        fun div(vector: Vector, scalar: Number): Vector
        fun dot(vectorA: Vector, vectorB: Vector): Number
        fun magnitude(vector: Vector): Number
        fun magnitudeSquared(vector: Vector): Number
        fun mult(vector: Vector, scalar: Number): Vector
        fun neg(vector: Vector): Vector
        fun normalise(vector: Vector): Vector
        fun perp(vector: Vector, negate: Boolean = definedExternally): Vector
        fun rotate(vector: Vector, angle: Number): Vector
        fun rotateAbout(vector: Vector, angle: Number, point: Vector, output: Vector = definedExternally): Vector
        fun sub(vectorA: Vector, vectorB: Vector, optional: Vector = definedExternally): Vector
    }
}

external open class VectorFactory {
    open fun create(x: Number = definedExternally, y: Number = definedExternally): Vector
    open fun clone(vector: Vector): Vector
    open fun cross3(vectorA: Vector, vectorB: Vector, vectorC: Vector): Number
    open fun add(vectorA: Vector, vectorB: Vector, output: Vector = definedExternally): Vector
    open fun angle(vectorA: Vector, vectorB: Vector): Number
    open fun cross(vectorA: Vector, vectorB: Vector): Number
    open fun div(vector: Vector, scalar: Number): Vector
    open fun dot(vectorA: Vector, vectorB: Vector): Number
    open fun magnitude(vector: Vector): Number
    open fun magnitudeSquared(vector: Vector): Number
    open fun mult(vector: Vector, scalar: Number): Vector
    open fun neg(vector: Vector): Vector
    open fun normalise(vector: Vector): Vector
    open fun perp(vector: Vector, negate: Boolean = definedExternally): Vector
    open fun rotate(vector: Vector, angle: Number): Vector
    open fun rotateAbout(vector: Vector, angle: Number, point: Vector, output: Vector = definedExternally): Vector
    open fun sub(vectorA: Vector, vectorB: Vector, optional: Vector = definedExternally): Vector
}

external open class Vertices {
    companion object {
        fun mean(vertices: Array<Vector>): Array<Vector>
        fun clockwiseSort(vertices: Array<Vector>): Array<Vector>
        fun isConvex(vertices: Array<Vector>): Boolean
        fun hull(vertices: Array<Vector>): Array<Vector>
        fun area(vertices: Array<Vector>, signed: Boolean): Number
        fun centre(vertices: Array<Vector>): Vector
        fun chamfer(vertices: Array<Vector>, radius: Number, quality: Number, qualityMin: Number, qualityMax: Number)
        fun chamfer(vertices: Array<Vector>, radius: Array<Number>, quality: Number, qualityMin: Number, qualityMax: Number)
        fun contains(vertices: Array<Vector>, point: Vector): Boolean
        fun create(points: Array<Vector>, body: BodyType): Array<Vector>
        fun fromPath(path: String, body: BodyType): Array<Vector>
        fun inertia(vertices: Array<Vector>, mass: Number): Number
        fun rotate(vertices: Array<Vector>, angle: Number, point: Vector)
        fun scale(vertices: Array<Vector>, scaleX: Number, scaleY: Number, point: Vector)
        fun translate(vertices: Array<Vector>, vector: Vector, scalar: Number)
    }
}

external open class VerticesFactory {
    open fun mean(vertices: Array<Vector>): Array<Vector>
    open fun clockwiseSort(vertices: Array<Vector>): Array<Vector>
    open fun isConvex(vertices: Array<Vector>): Boolean
    open fun hull(vertices: Array<Vector>): Array<Vector>
    open fun area(vertices: Array<Vector>, signed: Boolean): Number
    open fun centre(vertices: Array<Vector>): Vector
    open fun chamfer(vertices: Array<Vector>, radius: Number, quality: Number, qualityMin: Number, qualityMax: Number)
    open fun chamfer(vertices: Array<Vector>, radius: Array<Number>, quality: Number, qualityMin: Number, qualityMax: Number)
    open fun contains(vertices: Array<Vector>, point: Vector): Boolean
    open fun create(points: Array<Vector>, body: BodyType): Array<Vector>
    open fun fromPath(path: String, body: BodyType): Array<Vector>
    open fun inertia(vertices: Array<Vector>, mass: Number): Number
    open fun rotate(vertices: Array<Vector>, angle: Number, point: Vector)
    open fun scale(vertices: Array<Vector>, scaleX: Number, scaleY: Number, point: Vector)
    open fun translate(vertices: Array<Vector>, vector: Vector, scalar: Number)
}

external open class World {
    open var gravity: Gravity
    open var bounds: Bounds

    companion object {
        fun add(world: World, body: BodyType): World
        fun add(world: World, body: Array<BodyType>): World
        fun add(world: World, body: CompositeType): World
        fun add(world: World, body: Array<CompositeType>): World
        fun add(world: World, body: ConstraintType): World
        fun add(world: World, body: Array<ConstraintType>): World
        fun add(world: World, body: MouseConstraint): World
        fun addBody(world: World, body: BodyType): World
        fun addComposite(world: World, composite: CompositeType): World
        fun addConstraint(world: World, constraint: ConstraintType): World
        fun clear(world: World, keepStatic: Boolean)
        fun create(options: IWorldDefinition): World
    }
}

external open class Events {
    companion object {
        fun on(obj: BodyType, name: String /* "sleepStart" */, callback: (e: IEvent<BodyType>) -> Unit)
        fun on(obj: Engine, name: String /* "beforeAdd" */, callback: (e: IEventComposite<CompositeType>) -> Unit)
        fun on(obj: Engine, name: String /* "afterUpdate" */, callback: (e: IEventTimestamped<Engine>) -> Unit)
        fun on(obj: Engine, name: String /* "collisionActive" */, callback: (e: IEventCollision<Engine>) -> Unit)
        fun on(obj: Engine, name: String /* "beforeTick" */, callback: (e: IEventTimestamped<Runner>) -> Unit)
        fun on(obj: Any, name: String, callback: (e: Any) -> Unit)
        fun off(obj: Any, eventName: String, callback: (e: Any) -> Unit)
        fun trigger(obj: Any, eventNames: String, event: (e: Any) -> Unit = definedExternally)
    }
}

external interface `T$17` {
    var name: String
    var range: String
}

external interface `T$18` {
    var name: String
    var version: String
}

external interface `T$19` {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    @nativeGetter
    operator fun get(`_`: String): Any?
    @nativeSetter
    operator fun set(`_`: String, value: Any)
}

external interface `T$20` {
    var uses: Array<dynamic /* Plugin | String */>?
        get() = definedExternally
        set(value) = definedExternally
    @nativeGetter
    operator fun get(`_`: String): Any?
    @nativeSetter
    operator fun set(`_`: String, value: Any)
}

external interface `T$21` {
    @nativeGetter
    operator fun get(`_`: String): Array<String>?
    @nativeSetter
    operator fun set(`_`: String, value: Array<String>)
}

external interface `T$22` {
    @nativeGetter
    operator fun get(`_`: String): Array<String>?
    @nativeSetter
    operator fun set(`_`: String, value: Array<String>)
}

external interface `T$23` {
    var isRange: Boolean
    var version: String
    var range: String
    var operator: String
    var parts: Array<Number>
    var prerelease: String
    var number: Number
}

external open class Plugin {
    open var name: String
    open var version: String
    open var install: () -> Unit
    open var `for`: String

    companion object {
        fun register(plugin: Plugin): Plugin
        fun resolve(dependency: String): Plugin?
        fun isPlugin(obj: Any): Boolean
        fun toString(plugin: String): String
        fun toString(plugin: Plugin): String
        fun isFor(plugin: Plugin, module: `T$19`): Boolean
        fun use(module: `T$20`, plugins: Array<Any /* Plugin | String */>)
        fun dependencies(module: `T$17`, tracked: `T$21` = definedExternally): dynamic /* `T$22`? | String? */
        fun dependencies(module: `T$18`, tracked: `T$21` = definedExternally): dynamic /* `T$22`? | String? */
        fun dependencies(module: String, tracked: `T$21` = definedExternally): dynamic /* `T$22`? | String? */
        fun dependencyParse(dependency: `T$17`): `T$17`
        fun dependencyParse(dependency: `T$18`): `T$17`
        fun dependencyParse(dependency: String): `T$17`
        fun versionParse(range: String): `T$23`
        fun versionSatisfies(version: String, range: String): Boolean
    }
}