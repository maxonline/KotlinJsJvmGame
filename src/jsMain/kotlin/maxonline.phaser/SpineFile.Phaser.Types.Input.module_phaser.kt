@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.Input

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
import integer
import Phaser.Cameras.Scene2D.Camera
import Phaser.GameObjects.Shape

external interface EventData {
    var cancelled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var stopPropagation: Function<*>
}

typealias HitAreaCallback = (hitArea: Any, x: Number, y: Number, gameObject: GameObject) -> Unit

external interface InputConfiguration {
    var hitArea: Any?
        get() = definedExternally
        set(value) = definedExternally
    var hitAreaCallback: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var draggable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var dropZone: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var useHandCursor: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var cursor: String?
        get() = definedExternally
        set(value) = definedExternally
    var pixelPerfect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var alphaTolerance: integer?
        get() = definedExternally
        set(value) = definedExternally
}

external interface InputPluginContainer {
    var key: String
    var plugin: Function<*>
    var mapping: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface InteractiveObject {
    var gameObject: GameObject
    var enabled: Boolean
    var alwaysEnabled: Boolean
    var draggable: Boolean
    var dropZone: Boolean
    var cursor: dynamic /* Boolean | String */
        get() = definedExternally
        set(value) = definedExternally
    var target: GameObject
    var camera: Camera
    var hitArea: Any
    var hitAreaCallback: HitAreaCallback
    var hitAreaDebug: Shape
    var customHitArea: Boolean
    var localX: Number
    var localY: Number
    var dragState: Number /* 0 | 1 | 2 */
    var dragStartX: Number
    var dragStartY: Number
    var dragStartXGlobal: Number
    var dragStartYGlobal: Number
    var dragX: Number
    var dragY: Number
}