@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.Display

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

external interface ColorObject {
    var r: Number
    var g: Number
    var b: Number
    var a: Number
}

external interface HSVColorObject {
    var h: Number
    var s: Number
    var v: Number
}

external interface InputColorObject {
    var r: Number?
        get() = definedExternally
        set(value) = definedExternally
    var g: Number?
        get() = definedExternally
        set(value) = definedExternally
    var b: Number?
        get() = definedExternally
        set(value) = definedExternally
    var a: Number?
        get() = definedExternally
        set(value) = definedExternally
}