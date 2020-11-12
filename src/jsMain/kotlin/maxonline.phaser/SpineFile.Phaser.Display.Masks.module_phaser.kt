@file:JsQualifier("Phaser.Display.Masks")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Display.Masks

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
import Phaser.Scene
import Phaser.GameObjects.GameObject
import Phaser.Renderer.Canvas.CanvasRenderer
import Phaser.Cameras.Scene2D.Camera
import Phaser.Renderer.WebGL.WebGLRenderer
import Phaser.GameObjects.Graphics

external open class BitmapMask(scene: Scene, renderable: GameObject) {
    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */
    open var bitmapMask: GameObject
    open var maskTexture: WebGLTexture
    open var mainTexture: WebGLTexture
    open var dirty: Boolean
    open var mainFramebuffer: WebGLFramebuffer
    open var maskFramebuffer: WebGLFramebuffer
    open var prevFramebuffer: WebGLFramebuffer
    open var invertAlpha: Boolean
    open var isStencil: Boolean
    open fun setBitmap(renderable: GameObject)
    open fun preRenderWebGL(renderer: CanvasRenderer, maskedObject: GameObject, camera: Camera)
    open fun preRenderWebGL(renderer: WebGLRenderer, maskedObject: GameObject, camera: Camera)
    open fun postRenderWebGL(renderer: CanvasRenderer)
    open fun postRenderWebGL(renderer: WebGLRenderer)
    open fun preRenderCanvas(renderer: CanvasRenderer, mask: GameObject, camera: Camera)
    open fun preRenderCanvas(renderer: WebGLRenderer, mask: GameObject, camera: Camera)
    open fun postRenderCanvas(renderer: CanvasRenderer)
    open fun postRenderCanvas(renderer: WebGLRenderer)
    open fun destroy()
}

external open class GeometryMask(scene: Scene, graphicsGeometry: Graphics) {
    open var geometryMask: Graphics
    open var invertAlpha: Boolean
    open var isStencil: Boolean
    open fun setShape(graphicsGeometry: Graphics): GeometryMask /* this */
    open fun setInvertAlpha(value: Boolean = definedExternally): GeometryMask /* this */
    open fun preRenderWebGL(renderer: WebGLRenderer, child: GameObject, camera: Camera)
    open fun applyStencil(renderer: WebGLRenderer, camera: Camera, inc: Boolean)
    open fun postRenderWebGL(renderer: WebGLRenderer)
    open fun preRenderCanvas(renderer: CanvasRenderer, mask: GameObject, camera: Camera)
    open fun postRenderCanvas(renderer: CanvasRenderer)
    open fun destroy()
}