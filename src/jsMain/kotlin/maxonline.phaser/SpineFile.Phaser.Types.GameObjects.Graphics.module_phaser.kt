@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.GameObjects.Graphics

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

external interface FillStyle {
    var color: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alpha: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LineStyle {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var color: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alpha: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$8` {
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RoundedRectRadius {
    var tl: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tr: Number?
        get() = definedExternally
        set(value) = definedExternally
    var br: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bl: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Styles {
    var lineStyle: LineStyle?
        get() = definedExternally
        set(value) = definedExternally
    var fillStyle: FillStyle?
        get() = definedExternally
        set(value) = definedExternally
}