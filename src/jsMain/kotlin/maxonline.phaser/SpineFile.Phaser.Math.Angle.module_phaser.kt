@file:JsQualifier("Phaser.Math.Angle")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Math.Angle

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

external fun BetweenPoints(point1: Vector2Like, point2: Vector2Like): Number

external fun BetweenPointsY(point1: Vector2Like, point2: Vector2Like): Number

external fun BetweenY(x1: Number, y1: Number, x2: Number, y2: Number): Number

external fun CounterClockwise(angle: Number): Number

external fun Normalize(angle: Number): Number

external fun Random(): Number

external fun RandomDegrees(): Number

external fun Reverse(angle: Number): Number

external fun RotateTo(currentAngle: Number, targetAngle: Number, lerp: Number = definedExternally): Number

external fun ShortestBetween(angle1: Number, angle2: Number): Number

external fun Wrap(angle: Number): Number

external fun WrapDegrees(angle: Number): Number