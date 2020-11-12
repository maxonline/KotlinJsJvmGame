@file:JsQualifier("Phaser.Renderer.WebGL.Utils")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Renderer.WebGL.Utils

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

external fun getTintFromFloats(r: Number, g: Number, b: Number, a: Number): Number

external fun getTintAppendFloatAlpha(rgb: Number, a: Number): Number

external fun getTintAppendFloatAlphaAndSwap(rgb: Number, a: Number): Number

external fun getFloatsFromUintRGB(rgb: Number): Array<Any>

external fun getComponentCount(attributes: Array<Any>, glContext: WebGLRenderingContext): Number