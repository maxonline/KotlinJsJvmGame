@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.GameObjects

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

external interface GameObjectConfig {
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var depth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var flipX: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var flipY: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var scale: dynamic /* Number? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var scrollFactor: dynamic /* Number? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var rotation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var angle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alpha: Number?
        get() = definedExternally
        set(value) = definedExternally
    var origin: dynamic /* Number? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var scaleMode: Number?
        get() = definedExternally
        set(value) = definedExternally
    var blendMode: Number?
        get() = definedExternally
        set(value) = definedExternally
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var add: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface JSONGameObject {
    var name: String
    var type: String
    var x: Number
    var y: Number
    var scale: Any?
    var scale.x: Number
    var scale.y: Number
    var origin: Any?
    var origin.x: Number
    var origin.y: Number
    var flipX: Boolean
    var flipY: Boolean
    var rotation: Number
    var alpha: Number
    var visible: Boolean
    var scaleMode: integer
    var blendMode: dynamic /* integer | String */
        get() = definedExternally
        set(value) = definedExternally
    var textureKey: String
    var frameKey: String
    var data: Any?
}