@file:JsQualifier("Phaser.Cameras.Controls")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Cameras.Controls

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
import Phaser.Types.Cameras.Controls.FixedKeyControlConfig
import Phaser.Cameras.Scene2D.Camera
import Phaser.Input.Keyboard.Key
import Phaser.Types.Cameras.Controls.SmoothedKeyControlConfig

external open class FixedKeyControl(config: FixedKeyControlConfig) {
    open var camera: Camera
    open var left: Key
    open var right: Key
    open var up: Key
    open var down: Key
    open var zoomIn: Key
    open var zoomOut: Key
    open var zoomSpeed: Number
    open var speedX: Number
    open var speedY: Number
    open var active: Boolean
    open fun start(): FixedKeyControl /* this */
    open fun stop(): FixedKeyControl /* this */
    open fun setCamera(camera: Camera): FixedKeyControl /* this */
    open fun update(delta: Number)
    open fun destroy()
}

external open class SmoothedKeyControl(config: SmoothedKeyControlConfig) {
    open var camera: Camera
    open var left: Key
    open var right: Key
    open var up: Key
    open var down: Key
    open var zoomIn: Key
    open var zoomOut: Key
    open var zoomSpeed: Number
    open var accelX: Number
    open var accelY: Number
    open var dragX: Number
    open var dragY: Number
    open var maxSpeedX: Number
    open var maxSpeedY: Number
    open var active: Boolean
    open fun start(): SmoothedKeyControl /* this */
    open fun stop(): SmoothedKeyControl /* this */
    open fun setCamera(camera: Camera): SmoothedKeyControl /* this */
    open fun update(delta: Number)
    open fun destroy()
}