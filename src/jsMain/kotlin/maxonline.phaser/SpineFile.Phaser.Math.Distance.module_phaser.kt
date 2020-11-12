@file:JsQualifier("Phaser.Math.Distance")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Math.Distance

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
import Phaser.Types.Math.Vector2Like

external fun Between(x1: Number, y1: Number, x2: Number, y2: Number): Number

external fun BetweenPoints(a: Vector2Like, b: Vector2Like): Number

external fun BetweenPointsSquared(a: Vector2Like, b: Vector2Like): Number

external fun Chebyshev(x1: Number, y1: Number, x2: Number, y2: Number): Number

external fun Power(x1: Number, y1: Number, x2: Number, y2: Number, pow: Number): Number

external fun Snake(x1: Number, y1: Number, x2: Number, y2: Number): Number

external fun Squared(x1: Number, y1: Number, x2: Number, y2: Number): Number