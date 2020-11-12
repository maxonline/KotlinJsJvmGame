@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Physics.Matter.Components

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
import Phaser.GameObjects.GameObject
import MatterJS.Body
import Phaser.Math.Vector2
import Phaser.Types.Physics.Matter.MatterBodyConfig
import MatterJS.BodyType
import Phaser.Types.Physics.Matter.MatterSetBodyConfig

external interface Bounce {
    fun setBounce(value: Number): GameObject
}

external interface Collision {
    fun setCollisionCategory(value: Number): GameObject
    fun setCollisionGroup(value: Number): GameObject
    fun setCollidesWith(categories: Number): GameObject
    fun setCollidesWith(categories: Array<Number>): GameObject
    fun setOnCollide(callback: Function<*>): GameObject
    fun setOnCollideEnd(callback: Function<*>): GameObject
    fun setOnCollideActive(callback: Function<*>): GameObject
    fun setOnCollideWith(body: Body, callback: Function<*>): GameObject
    fun setOnCollideWith(body: Array<Body>, callback: Function<*>): GameObject
}

external interface Force {
    fun applyForce(force: Vector2): GameObject
    fun applyForceFrom(position: Vector2, force: Vector2): GameObject
    fun thrust(speed: Number): GameObject
    fun thrustLeft(speed: Number): GameObject
    fun thrustRight(speed: Number): GameObject
    fun thrustBack(speed: Number): GameObject
}

external interface Friction {
    fun setFriction(value: Number, air: Number = definedExternally, fstatic: Number = definedExternally): GameObject
    fun setFrictionAir(value: Number): GameObject
    fun setFrictionStatic(value: Number): GameObject
}

external interface Gravity {
    fun setIgnoreGravity(value: Boolean): GameObject
}

external interface Mass {
    fun setMass(value: Number): GameObject
    fun setDensity(value: Number): GameObject
    var centerOfMass: Vector2
}

external interface Sensor {
    fun setSensor(value: Boolean): GameObject
    fun isSensor(): Boolean
}

external interface SetBody {
    fun setRectangle(width: Number, height: Number, options: MatterBodyConfig = definedExternally): GameObject
    fun setCircle(radius: Number, options: MatterBodyConfig = definedExternally): GameObject
    fun setPolygon(sides: Number, radius: Number, options: MatterBodyConfig = definedExternally): GameObject
    fun setTrapezoid(width: Number, height: Number, slope: Number, options: MatterBodyConfig = definedExternally): GameObject
    fun setExistingBody(body: BodyType, addToWorld: Boolean = definedExternally): GameObject
    fun setBody(config: String, options: MatterBodyConfig = definedExternally): GameObject
    fun setBody(config: String): GameObject
    fun setBody(config: MatterSetBodyConfig, options: MatterBodyConfig = definedExternally): GameObject
    fun setBody(config: MatterSetBodyConfig): GameObject
}

external interface Sleep {
    fun setToSleep(): Sleep /* this */
    fun setAwake(): Sleep /* this */
    fun setSleepThreshold(value: Number = definedExternally): Sleep /* this */
    fun setSleepEvents(start: Boolean, end: Boolean): Sleep /* this */
    fun setSleepStartEvent(value: Boolean): Sleep /* this */
    fun setSleepEndEvent(value: Boolean): Sleep /* this */
}

external interface Static {
    fun setStatic(value: Boolean): GameObject
    fun isStatic(): Boolean
}

external interface Transform {
    var x: Number
    var y: Number
    var scaleX: Number
    var scaleY: Number
    var angle: Number
    var rotation: Number
    fun setPosition(x: Number = definedExternally, y: Number = definedExternally): Transform /* this */
    fun setRotation(radians: Number = definedExternally): Transform /* this */
    fun setFixedRotation(): Transform /* this */
    fun setAngle(degrees: Number = definedExternally): Transform /* this */
    fun setScale(x: Number = definedExternally, y: Number = definedExternally, point: Vector2 = definedExternally): Transform /* this */
}

external interface Velocity {
    fun setAngularVelocity(value: Number): GameObject
    fun setVelocityX(x: Number): GameObject
    fun setVelocityY(y: Number): GameObject
    fun setVelocity(x: Number, y: Number = definedExternally): GameObject
}