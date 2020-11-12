@file:JsQualifier("Phaser.Actions")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Actions

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
import Phaser.GameObjects.GameObject
import Phaser.Types.Actions.CallCallback
import Phaser.Types.Actions.GridAlignConfig
import Phaser.Geom.Circle
import Phaser.Geom.Ellipse
import Phaser.Geom.Line
import Phaser.Geom.Rectangle
import Phaser.Geom.Triangle
import Phaser.Types.Input.HitAreaCallback
import Phaser.Math.Vector2

external fun <G : Array<GameObject>> AlignTo(items: G, position: integer, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : Array<GameObject>> Angle(items: G, value: Number, step: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> Call(items: G, callback: CallCallback, context: Any): G

external fun <G : Array<GameObject>> GetFirst(items: G, compare: Any?, index: integer = definedExternally): dynamic /* Any? | Phaser.GameObjects.GameObject? */

external fun <G : Array<GameObject>> GetLast(items: G, compare: Any?, index: integer = definedExternally): dynamic /* Any? | Phaser.GameObjects.GameObject? */

external fun <G : Array<GameObject>> GridAlign(items: G, options: GridAlignConfig): G

external fun <G : Array<GameObject>> IncAlpha(items: G, value: Number, step: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> IncX(items: G, value: Number, step: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> IncXY(items: G, x: Number, y: Number = definedExternally, stepX: Number = definedExternally, stepY: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> IncY(items: G, value: Number, step: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> PlaceOnCircle(items: G, circle: Circle, startAngle: Number = definedExternally, endAngle: Number = definedExternally): G

external fun <G : Array<GameObject>> PlaceOnEllipse(items: G, ellipse: Ellipse, startAngle: Number = definedExternally, endAngle: Number = definedExternally): G

external fun <G : Array<GameObject>> PlaceOnLine(items: G, line: Line): G

external fun <G : Array<GameObject>> PlaceOnRectangle(items: G, rect: Rectangle, shift: integer = definedExternally): G

external fun <G : Array<GameObject>> PlaceOnTriangle(items: G, triangle: Triangle, stepRate: Number = definedExternally): G

external fun <G : Array<GameObject>> PlayAnimation(items: G, key: String, startFrame: String = definedExternally): G

external fun <G : Array<GameObject>> PlayAnimation(items: G, key: String): dynamic

external fun <G : Array<GameObject>> PlayAnimation(items: G, key: String, startFrame: integer = definedExternally): G

external fun <G : Array<GameObject>> PropertyValueInc(items: G, key: String, value: Number, step: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> PropertyValueSet(items: G, key: String, value: Number, step: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> RandomCircle(items: G, circle: Circle): G

external fun <G : Array<GameObject>> RandomEllipse(items: G, ellipse: Ellipse): G

external fun <G : Array<GameObject>> RandomLine(items: G, line: Line): G

external fun <G : Array<GameObject>> RandomRectangle(items: G, rect: Rectangle): G

external fun <G : Array<GameObject>> RandomTriangle(items: G, triangle: Triangle): G

external fun <G : Array<GameObject>> Rotate(items: G, value: Number, step: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> RotateAround(items: G, point: Any?, angle: Number): G

external fun <G : Array<GameObject>> RotateAroundDistance(items: G, point: Any?, angle: Number, distance: Number): G

external fun <G : Array<GameObject>> ScaleX(items: G, value: Number, step: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> ScaleXY(items: G, scaleX: Number, scaleY: Number = definedExternally, stepX: Number = definedExternally, stepY: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> ScaleY(items: G, value: Number, step: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> SetAlpha(items: G, value: Number, step: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> SetBlendMode(items: G, value: Number, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> SetDepth(items: G, value: Number, step: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> SetHitArea(items: G, hitArea: Any, hitAreaCallback: HitAreaCallback): G

external fun <G : Array<GameObject>> SetOrigin(items: G, originX: Number, originY: Number = definedExternally, stepX: Number = definedExternally, stepY: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> SetRotation(items: G, value: Number, step: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> SetScale(items: G, scaleX: Number, scaleY: Number = definedExternally, stepX: Number = definedExternally, stepY: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> SetScaleX(items: G, value: Number, step: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> SetScaleY(items: G, value: Number, step: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> SetScrollFactor(items: G, scrollFactorX: Number, scrollFactorY: Number = definedExternally, stepX: Number = definedExternally, stepY: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> SetScrollFactorX(items: G, value: Number, step: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> SetScrollFactorY(items: G, value: Number, step: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> SetTint(items: G, topLeft: Number, topRight: Number = definedExternally, bottomLeft: Number = definedExternally, bottomRight: Number = definedExternally): G

external fun <G : Array<GameObject>> SetVisible(items: G, value: Boolean, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> SetX(items: G, value: Number, step: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> SetXY(items: G, x: Number, y: Number = definedExternally, stepX: Number = definedExternally, stepY: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>> SetY(items: G, value: Number, step: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): G

external fun <G : Array<GameObject>, O : Vector2> ShiftPosition(items: G, x: Number, y: Number, direction: integer = definedExternally, output: O = definedExternally): O

external fun <G : Array<GameObject>> Shuffle(items: G): G

external fun <G : Array<GameObject>> SmootherStep(items: G, property: String, min: Number, max: Number, inc: Boolean = definedExternally): G

external fun <G : Array<GameObject>> SmoothStep(items: G, property: String, min: Number, max: Number, inc: Boolean = definedExternally): G

external fun <G : Array<GameObject>> Spread(items: G, property: String, min: Number, max: Number, inc: Boolean = definedExternally): G

external fun <G : Array<GameObject>> ToggleVisible(items: G): G

external fun <G : Array<GameObject>> WrapInRectangle(items: G, rect: Rectangle, padding: Number = definedExternally): G