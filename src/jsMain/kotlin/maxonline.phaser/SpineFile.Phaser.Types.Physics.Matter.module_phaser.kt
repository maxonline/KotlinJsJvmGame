@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.Physics.Matter

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
import MatterJS.BodyType
import Phaser.Types.Math.Vector2Like
import MatterJS.Vector

external interface MatterBodyConfig {
    var label: String?
        get() = definedExternally
        set(value) = definedExternally
    var parts: Array<BodyType>?
        get() = definedExternally
        set(value) = definedExternally
    var plugin: Any?
        get() = definedExternally
        set(value) = definedExternally
    var angle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var vertices: Array<Vector2Like>?
        get() = definedExternally
        set(value) = definedExternally
    var position: Vector2Like?
        get() = definedExternally
        set(value) = definedExternally
    var force: Vector2Like?
        get() = definedExternally
        set(value) = definedExternally
    var torque: Number?
        get() = definedExternally
        set(value) = definedExternally
    var isSensor: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isStatic: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sleepThreshold: Number?
        get() = definedExternally
        set(value) = definedExternally
    var density: Number?
        get() = definedExternally
        set(value) = definedExternally
    var restitution: Number?
        get() = definedExternally
        set(value) = definedExternally
    var friction: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frictionStatic: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frictionAir: Number?
        get() = definedExternally
        set(value) = definedExternally
    var collisionFilter: MatterCollisionFilter?
        get() = definedExternally
        set(value) = definedExternally
    var slop: Number?
        get() = definedExternally
        set(value) = definedExternally
    var timeScale: Number?
        get() = definedExternally
        set(value) = definedExternally
    var chamfer: dynamic /* Number? | Array<Number>? | Phaser.Types.Physics.Matter.MatterChamferConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var circleRadius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var mass: Number?
        get() = definedExternally
        set(value) = definedExternally
    var inverseMass: Number?
        get() = definedExternally
        set(value) = definedExternally
    var scale: Vector2Like?
        get() = definedExternally
        set(value) = definedExternally
    var gravityScale: Vector2Like?
        get() = definedExternally
        set(value) = definedExternally
    var ignoreGravity: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ignorePointer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var render: MatterBodyRenderConfig?
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

external interface MatterBodyRenderConfig {
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var opacity: Number?
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
    var sprite: Any?
        get() = definedExternally
        set(value) = definedExternally
    var sprite.xOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sprite.yOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MatterBodyTileOptions {
    var isStatic: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var addToWorld: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MatterChamferConfig {
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

external interface MatterCollisionData {
    var collided: Boolean
    var bodyA: BodyType
    var bodyB: BodyType
    var axisBody: BodyType
    var axisNumber: Number
    var depth: Number
    var parentA: BodyType
    var parentB: BodyType
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

external interface MatterCollisionFilter {
    var category: Number?
        get() = definedExternally
        set(value) = definedExternally
    var mask: Number?
        get() = definedExternally
        set(value) = definedExternally
    var group: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MatterCollisionPair {
    var id: String
    var bodyA: BodyType
    var bodyB: BodyType
    var activeContacts: Array<Vector>
    var separation: Number
    var isActive: Boolean
    var confirmedActive: Boolean
    var isSensor: Boolean
    var timeCreated: Number
    var timeUpdated: Number
    var collision: MatterCollisionData
    var inverseMass: Number
    var friction: Number
    var frictionStatic: Number
    var restitution: Number
    var slop: Number
}

external interface MatterConstraintConfig {
    var label: String?
        get() = definedExternally
        set(value) = definedExternally
    var bodyA: BodyType?
        get() = definedExternally
        set(value) = definedExternally
    var bodyB: BodyType?
        get() = definedExternally
        set(value) = definedExternally
    var pointA: Vector2Like?
        get() = definedExternally
        set(value) = definedExternally
    var pointB: Vector2Like?
        get() = definedExternally
        set(value) = definedExternally
    var stiffness: Number?
        get() = definedExternally
        set(value) = definedExternally
    var angularStiffness: Number?
        get() = definedExternally
        set(value) = definedExternally
    var angleA: Number?
        get() = definedExternally
        set(value) = definedExternally
    var angleB: Number?
        get() = definedExternally
        set(value) = definedExternally
    var damping: Number?
        get() = definedExternally
        set(value) = definedExternally
    var length: Number?
        get() = definedExternally
        set(value) = definedExternally
    var plugin: Any?
        get() = definedExternally
        set(value) = definedExternally
    var render: MatterConstraintRenderConfig?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MatterConstraintRenderConfig {
    var visible: Boolean?
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
    var anchorSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var anchorColor: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MatterDebugConfig {
    var showAxes: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showAngleIndicator: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var angleColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var showBroadphase: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var broadphaseColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var showBounds: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var boundsColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var showVelocity: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var velocityColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var showCollisions: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var collisionColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var showSeparation: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var separationColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var showBody: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showStaticBody: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showInternalEdges: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var renderFill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var renderLine: Boolean?
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
    var staticFillColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var staticLineColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var showSleeping: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var staticBodySleepOpacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sleepFillColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sleepLineColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var showSensors: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sensorFillColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sensorLineColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var showPositions: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var positionSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var positionColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var showJoint: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var jointColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var jointLineOpacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var jointLineThickness: Number?
        get() = definedExternally
        set(value) = definedExternally
    var pinSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var pinColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var springColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var anchorColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var anchorSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var showConvexHulls: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hullColor: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MatterRunnerConfig {
    var isFixed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fps: Number?
        get() = definedExternally
        set(value) = definedExternally
    var correction: Number?
        get() = definedExternally
        set(value) = definedExternally
    var deltaSampleSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var delta: Number?
        get() = definedExternally
        set(value) = definedExternally
    var deltaMin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var deltaMax: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MatterSetBodyConfig {
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var radius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxSides: Number?
        get() = definedExternally
        set(value) = definedExternally
    var slope: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sides: Number?
        get() = definedExternally
        set(value) = definedExternally
    var verts: dynamic /* String? | Array<Any>? */
        get() = definedExternally
        set(value) = definedExternally
    var flagInternal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var removeCollinear: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minimumArea: Number?
        get() = definedExternally
        set(value) = definedExternally
    var addToWorld: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MatterTileOptions {
    var body: BodyType?
        get() = definedExternally
        set(value) = definedExternally
    var isStatic: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var addToWorld: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MatterWorldConfig {
    var gravity: dynamic /* Phaser.Types.Math.Vector2Like? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var setBounds: dynamic /* Any? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var setBounds.x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var setBounds.y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var setBounds.width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var setBounds.height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var setBounds.thickness: Number?
        get() = definedExternally
        set(value) = definedExternally
    var setBounds.left: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var setBounds.right: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var setBounds.top: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var setBounds.bottom: Boolean?
        get() = definedExternally
        set(value) = definedExternally
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
    var timing.timestamp: Number?
        get() = definedExternally
        set(value) = definedExternally
    var timing.timeScale: Number?
        get() = definedExternally
        set(value) = definedExternally
    var plugins.attractors: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var plugins.wrap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var plugins.collisionevents: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var correction: Number?
        get() = definedExternally
        set(value) = definedExternally
    var getDelta: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var autoUpdate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var restingThresh: Number?
        get() = definedExternally
        set(value) = definedExternally
    var restingThreshTangent: Number?
        get() = definedExternally
        set(value) = definedExternally
    var positionDampen: Number?
        get() = definedExternally
        set(value) = definedExternally
    var positionWarming: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frictionNormalMultiplier: Number?
        get() = definedExternally
        set(value) = definedExternally
    var debug: dynamic /* Boolean? | Phaser.Types.Physics.Matter.MatterDebugConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var runner: MatterRunnerConfig?
        get() = definedExternally
        set(value) = definedExternally
}