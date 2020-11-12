@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.Curves

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

external interface EllipseCurveConfig {
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var xRadius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var yRadius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startAngle: integer?
        get() = definedExternally
        set(value) = definedExternally
    var endAngle: integer?
        get() = definedExternally
        set(value) = definedExternally
    var clockwise: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rotation: integer?
        get() = definedExternally
        set(value) = definedExternally
}

external interface JSONCurve {
    var type: String
    var points: Array<Number>
}

external interface JSONEllipseCurve {
    var type: String
    var x: Number
    var y: Number
    var xRadius: Number
    var yRadius: Number
    var startAngle: integer
    var endAngle: integer
    var clockwise: Boolean
    var rotation: integer
}

external interface JSONPath {
    var type: String
    var x: Number
    var y: Number
    var autoClose: Boolean
    var curves: Array<JSONCurve>
}