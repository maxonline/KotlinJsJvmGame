@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.Cameras.Controls

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
import Phaser.Cameras.Scene2D.Camera
import Phaser.Input.Keyboard.Key

external interface FixedKeyControlConfig {
    var camera: Camera?
        get() = definedExternally
        set(value) = definedExternally
    var left: Key?
        get() = definedExternally
        set(value) = definedExternally
    var right: Key?
        get() = definedExternally
        set(value) = definedExternally
    var up: Key?
        get() = definedExternally
        set(value) = definedExternally
    var down: Key?
        get() = definedExternally
        set(value) = definedExternally
    var zoomIn: Key?
        get() = definedExternally
        set(value) = definedExternally
    var zoomOut: Key?
        get() = definedExternally
        set(value) = definedExternally
    var zoomSpeed: Number?
        get() = definedExternally
        set(value) = definedExternally
    var speed: dynamic /* Number? | Object? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SmoothedKeyControlConfig {
    var camera: Camera?
        get() = definedExternally
        set(value) = definedExternally
    var left: Key?
        get() = definedExternally
        set(value) = definedExternally
    var right: Key?
        get() = definedExternally
        set(value) = definedExternally
    var up: Key?
        get() = definedExternally
        set(value) = definedExternally
    var down: Key?
        get() = definedExternally
        set(value) = definedExternally
    var zoomIn: Key?
        get() = definedExternally
        set(value) = definedExternally
    var zoomOut: Key?
        get() = definedExternally
        set(value) = definedExternally
    var zoomSpeed: Number?
        get() = definedExternally
        set(value) = definedExternally
    var acceleration: dynamic /* Number? | Object? */
        get() = definedExternally
        set(value) = definedExternally
    var drag: dynamic /* Number? | Object? */
        get() = definedExternally
        set(value) = definedExternally
    var maxSpeed: dynamic /* Number? | Object? */
        get() = definedExternally
        set(value) = definedExternally
}