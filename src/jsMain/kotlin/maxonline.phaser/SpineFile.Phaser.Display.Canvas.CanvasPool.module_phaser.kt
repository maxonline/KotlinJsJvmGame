@file:JsQualifier("Phaser.Display.Canvas.CanvasPool")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Display.Canvas.CanvasPool

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

external fun create(parent: Any, width: integer = definedExternally, height: integer = definedExternally, canvasType: integer = definedExternally, selfParent: Boolean = definedExternally): HTMLCanvasElement

external fun create2D(parent: Any, width: integer = definedExternally, height: integer = definedExternally): HTMLCanvasElement

external fun createWebGL(parent: Any, width: integer = definedExternally, height: integer = definedExternally): HTMLCanvasElement

external fun first(canvasType: integer = definedExternally): HTMLCanvasElement

external fun remove(parent: Any)

external fun total(): integer

external fun free(): integer

external fun disableSmoothing()

external fun enableSmoothing()