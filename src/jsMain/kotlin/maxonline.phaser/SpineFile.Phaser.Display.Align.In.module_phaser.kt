@file:JsQualifier("Phaser.Display.Align.In")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Display.Align.In

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

external fun <G : GameObject> BottomCenter(gameObject: G, alignIn: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> BottomLeft(gameObject: G, alignIn: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> BottomRight(gameObject: G, alignIn: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> Center(gameObject: G, alignIn: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> LeftCenter(gameObject: G, alignIn: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> QuickSet(child: G, alignIn: GameObject, position: integer, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> RightCenter(gameObject: G, alignIn: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> TopCenter(gameObject: G, alignIn: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> TopLeft(gameObject: G, alignIn: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> TopRight(gameObject: G, alignIn: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G