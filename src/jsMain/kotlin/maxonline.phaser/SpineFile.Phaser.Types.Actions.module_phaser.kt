@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.Actions

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

typealias CallCallback = (item: GameObject) -> Unit

external interface GridAlignConfig {
    var width: integer?
        get() = definedExternally
        set(value) = definedExternally
    var height: integer?
        get() = definedExternally
        set(value) = definedExternally
    var cellWidth: integer?
        get() = definedExternally
        set(value) = definedExternally
    var cellHeight: integer?
        get() = definedExternally
        set(value) = definedExternally
    var position: integer?
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
}