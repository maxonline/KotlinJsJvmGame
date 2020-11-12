@file:JsQualifier("Phaser.Display.Align.To")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Display.Align.To

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
import Phaser.GameObjects.GameObject
import integer

external fun <G : GameObject> BottomCenter(gameObject: G, alignTo: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> BottomLeft(gameObject: G, alignTo: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> BottomRight(gameObject: G, alignTo: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> LeftBottom(gameObject: G, alignTo: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> LeftCenter(gameObject: G, alignTo: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> LeftTop(gameObject: G, alignTo: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> QuickSet(child: G, alignTo: GameObject, position: integer, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> RightBottom(gameObject: G, alignTo: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> RightCenter(gameObject: G, alignTo: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> RightTop(gameObject: G, alignTo: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> TopCenter(gameObject: G, alignTo: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> TopLeft(gameObject: G, alignTo: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> TopRight(gameObject: G, alignTo: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G