@file:JsQualifier("Phaser.Math.Interpolation")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Math.Interpolation

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

external fun Bezier(v: Array<Number>, k: Number): Number

external fun CatmullRom(v: Array<Number>, k: Number): Number

external fun CubicBezier(t: Number, p0: Number, p1: Number, p2: Number, p3: Number): Number

external fun Linear(v: Array<Number>, k: Number): Number

external fun QuadraticBezier(t: Number, p0: Number, p1: Number, p2: Number): Number

external fun SmootherStep(t: Number, min: Number, max: Number): Number

external fun SmoothStep(t: Number, min: Number, max: Number): Number