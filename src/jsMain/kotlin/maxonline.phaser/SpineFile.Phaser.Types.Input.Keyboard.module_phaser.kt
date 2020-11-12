@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.Input.Keyboard

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
import Phaser.Input.Keyboard.Key

external interface CursorKeys {
    var up: Key?
        get() = definedExternally
        set(value) = definedExternally
    var down: Key?
        get() = definedExternally
        set(value) = definedExternally
    var left: Key?
        get() = definedExternally
        set(value) = definedExternally
    var right: Key?
        get() = definedExternally
        set(value) = definedExternally
    var space: Key?
        get() = definedExternally
        set(value) = definedExternally
    var shift: Key?
        get() = definedExternally
        set(value) = definedExternally
}

typealias KeyboardKeydownCallback = (event: KeyboardEvent) -> Unit

external interface KeyComboConfig {
    var resetOnWrongKey: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var maxKeyDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var resetOnMatch: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var deleteOnMatch: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}