@file:JsQualifier("Phaser.Display")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Display

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
import Phaser.Types.Display.InputColorObject
import Phaser.Types.Display.ColorObject
import Phaser.Types.Display.HSVColorObject

external open class Color(red: integer = definedExternally, green: integer = definedExternally, blue: integer = definedExternally, alpha: integer = definedExternally) {
    open var gl: Array<Number>
    open fun transparent(): Color
    open fun setTo(red: integer, green: integer, blue: integer, alpha: integer = definedExternally, updateHSV: Boolean = definedExternally): Color
    open fun setGLTo(red: Number, green: Number, blue: Number, alpha: Number = definedExternally): Color
    open fun setFromRGB(color: InputColorObject): Color
    open fun setFromHSV(h: Number, s: Number, v: Number): Color
    open fun clone(): Color
    open fun gray(shade: integer): Color
    open fun random(min: integer = definedExternally, max: integer = definedExternally): Color
    open fun randomGray(min: integer = definedExternally, max: integer = definedExternally): Color
    open fun saturate(amount: integer): Color
    open fun desaturate(amount: integer): Color
    open fun lighten(amount: integer): Color
    open fun darken(amount: integer): Color
    open fun brighten(amount: integer): Color
    open var color: Number
    open var color32: Number
    open var rgba: String
    open var redGL: Number
    open var greenGL: Number
    open var blueGL: Number
    open var alphaGL: Number
    open var red: Number
    open var green: Number
    open var blue: Number
    open var alpha: Number
    open var h: Number
    open var s: Number
    open var v: Number

    companion object {
        fun ColorToRGBA(color: Number): ColorObject
        fun ComponentToHex(color: integer): String
        fun GetColor(red: integer, green: integer, blue: integer): Number
        fun GetColor32(red: integer, green: integer, blue: integer, alpha: integer): Number
        fun HexStringToColor(hex: String): Color
        fun HSLToColor(h: Number, s: Number, l: Number): Color
        fun HSVColorWheel(s: Number = definedExternally, v: Number = definedExternally): Array<ColorObject>
        fun HSVToRGB(h: Number, s: Number, v: Number, out: ColorObject = definedExternally): dynamic /* Phaser.Types.Display.ColorObject | Phaser.Display.Color */
        fun HSVToRGB(h: Number, s: Number, v: Number, out: Color = definedExternally): dynamic /* Phaser.Types.Display.ColorObject | Phaser.Display.Color */
        fun HueToComponent(p: Number, q: Number, t: Number): Number
        fun IntegerToColor(input: integer): Color
        fun IntegerToRGB(input: integer): ColorObject
        fun ObjectToColor(input: InputColorObject): Color
        fun RandomRGB(min: integer = definedExternally, max: integer = definedExternally): Color
        fun RGBStringToColor(rgb: String): Color
        fun RGBToHSV(r: integer, g: integer, b: integer, out: HSVColorObject = definedExternally): dynamic /* Phaser.Types.Display.HSVColorObject | Phaser.Display.Color */
        fun RGBToHSV(r: integer, g: integer, b: integer, out: Color = definedExternally): dynamic /* Phaser.Types.Display.HSVColorObject | Phaser.Display.Color */
        fun RGBToString(r: integer, g: integer, b: integer, a: integer = definedExternally, prefix: String = definedExternally): String
        fun ValueToColor(input: String): Color
        fun ValueToColor(input: Number): Color
        fun ValueToColor(input: InputColorObject): Color
    }
}

external open class BaseShader(key: String, fragmentSrc: String = definedExternally, vertexSrc: String = definedExternally, uniforms: Any = definedExternally) {
    open var key: String
    open var fragmentSrc: String
    open var vertexSrc: String
    open var uniforms: Any
}