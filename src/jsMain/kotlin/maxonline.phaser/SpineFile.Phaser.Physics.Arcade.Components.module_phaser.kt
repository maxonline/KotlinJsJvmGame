@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Physics.Arcade.Components

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

external interface Acceleration {
    fun setAcceleration(x: Number, y: Number = definedExternally): Acceleration /* this */
    fun setAccelerationX(value: Number): Acceleration /* this */
    fun setAccelerationY(value: Number): Acceleration /* this */
}

external interface Angular {
    fun setAngularVelocity(value: Number): Angular /* this */
    fun setAngularAcceleration(value: Number): Angular /* this */
    fun setAngularDrag(value: Number): Angular /* this */
}

external interface Bounce {
    fun setBounce(x: Number, y: Number = definedExternally): Bounce /* this */
    fun setBounceX(value: Number): Bounce /* this */
    fun setBounceY(value: Number): Bounce /* this */
    fun setCollideWorldBounds(value: Boolean = definedExternally, bounceX: Number = definedExternally, bounceY: Number = definedExternally): Bounce /* this */
}

external interface Debug {
    fun setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Number): Debug /* this */
    fun setDebugBodyColor(value: Number): Debug /* this */
    var debugShowBody: Boolean
    var debugShowVelocity: Boolean
    var debugBodyColor: Number
}

external interface Drag {
    fun setDrag(x: Number, y: Number = definedExternally): Drag /* this */
    fun setDragX(value: Number): Drag /* this */
    fun setDragY(value: Number): Drag /* this */
    fun setDamping(value: Boolean): Drag /* this */
}

external interface Enable {
    fun enableBody(reset: Boolean, x: Number, y: Number, enableGameObject: Boolean, showGameObject: Boolean): Enable /* this */
    fun disableBody(disableGameObject: Boolean = definedExternally, hideGameObject: Boolean = definedExternally): Enable /* this */
    fun refreshBody(): Enable /* this */
}

external interface Friction {
    fun setFriction(x: Number, y: Number = definedExternally): Friction /* this */
    fun setFrictionX(x: Number): Friction /* this */
    fun setFrictionY(y: Number): Friction /* this */
}

external interface Gravity {
    fun setGravity(x: Number, y: Number = definedExternally): Gravity /* this */
    fun setGravityX(x: Number): Gravity /* this */
    fun setGravityY(y: Number): Gravity /* this */
}

external interface Immovable {
    fun setImmovable(value: Boolean = definedExternally): Immovable /* this */
}

external interface Mass {
    fun setMass(value: Number): Mass /* this */
}

external interface OverlapCirc

external interface OverlapRect

external interface Size {
    fun setOffset(x: Number, y: Number = definedExternally): Size /* this */
    fun setSize(width: Number, height: Number, center: Boolean = definedExternally): Size /* this */
    fun setBodySize(width: Number, height: Number, center: Boolean = definedExternally): Size /* this */
    fun setCircle(radius: Number, offsetX: Number = definedExternally, offsetY: Number = definedExternally): Size /* this */
}

external interface Velocity {
    fun setVelocity(x: Number, y: Number = definedExternally): Velocity /* this */
    fun setVelocityX(x: Number): Velocity /* this */
    fun setVelocityY(y: Number): Velocity /* this */
    fun setMaxVelocity(x: Number, y: Number = definedExternally): Velocity /* this */
}