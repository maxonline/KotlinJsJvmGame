@file:JsQualifier("Phaser.Renderer.WebGL.Pipelines")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Renderer.WebGL.Pipelines

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
import Phaser.Cameras.Scene2D.Camera
import Phaser.Renderer.WebGL.WebGLPipeline
import Phaser.Scene
import integer
import Phaser.GameObjects.Components.TransformMatrix
import Phaser.GameObjects.Sprite
import Phaser.GameObjects.Image
import Phaser.Textures.Frame

external open class BitmapMaskPipeline(config: Any?) : WebGLPipeline {
    open var vertexViewF32: Float32Array
    open var maxQuads: Number
    open var resolutionDirty: Boolean
    override fun onBind(): BitmapMaskPipeline /* this */
    override fun resize(width: Number, height: Number, resolution: Number): BitmapMaskPipeline /* this */
    open fun beginMask(mask: GameObject, maskedObject: GameObject, camera: Camera)
    open fun endMask(mask: GameObject)
}

external interface ModelViewProjection {
    var modelMatrixDirty: Boolean
    var viewMatrixDirty: Boolean
    var projectionMatrixDirty: Boolean
    var modelMatrix: Float32Array
    var viewMatrix: Float32Array
    var projectionMatrix: Float32Array
    fun mvpInit()
    fun mvpUpdate()
    fun modelIdentity()
    fun modelScale(x: Number, y: Number, z: Number): ModelViewProjection /* this */
    fun modelTranslate(x: Number, y: Number, z: Number): ModelViewProjection /* this */
    fun modelRotateX(radians: Number): ModelViewProjection /* this */
    fun modelRotateY(radians: Number): ModelViewProjection /* this */
    fun modelRotateZ(radians: Number): ModelViewProjection /* this */
    fun viewIdentity(): ModelViewProjection /* this */
    fun viewScale(x: Number, y: Number, z: Number): ModelViewProjection /* this */
    fun viewTranslate(x: Number, y: Number, z: Number): ModelViewProjection /* this */
    fun viewRotateX(radians: Number): ModelViewProjection /* this */
    fun viewRotateY(radians: Number): ModelViewProjection /* this */
    fun viewRotateZ(radians: Number): ModelViewProjection /* this */
    fun viewLoad2D(matrix2D: Float32Array): ModelViewProjection /* this */
    fun viewLoad(matrix: Float32Array): ModelViewProjection /* this */
    fun projIdentity(): ModelViewProjection /* this */
    fun projOrtho(left: Number, right: Number, bottom: Number, top: Number, near: Number, far: Number): ModelViewProjection /* this */
    fun projPersp(fovY: Number, aspectRatio: Number, near: Number, far: Number): ModelViewProjection /* this */
}

external open class ForwardDiffuseLightPipeline(config: Any?) : TextureTintPipeline {
    override fun onRender(scene: Scene, camera: Camera): ForwardDiffuseLightPipeline /* this */
    open fun batchTexture(gameObject: GameObject, texture: WebGLTexture, textureWidth: integer, textureHeight: integer, srcX: Number, srcY: Number, srcWidth: Number, srcHeight: Number, scaleX: Number, scaleY: Number, rotation: Number, flipX: Boolean, flipY: Boolean, scrollFactorX: Number, scrollFactorY: Number, displayOriginX: Number, displayOriginY: Number, frameX: Number, frameY: Number, frameWidth: Number, frameHeight: Number, tintTL: integer, tintTR: integer, tintBL: integer, tintBR: integer, tintEffect: Number, uOffset: Number, vOffset: Number, camera: Camera, parentTransformMatrix: TransformMatrix)
    open fun setNormalMap(gameObject: GameObject)
    open fun setNormalMapRotation(rotation: Number)
    override fun batchSprite(sprite: Sprite, camera: Camera, parentTransformMatrix: TransformMatrix)
}

external open class TextureTintPipeline(config: Any?) : WebGLPipeline {
    open var vertexViewF32: Float32Array
    open var vertexViewU32: Uint32Array
    open var maxQuads: integer
    open var batches: Array<Any>
    override fun onBind(): TextureTintPipeline /* this */
    override fun resize(width: Number, height: Number, resolution: Number): TextureTintPipeline /* this */
    open fun setTexture2D(texture: WebGLTexture = definedExternally, unit: integer = definedExternally): TextureTintPipeline
    open fun requireTextureBatch(texture: WebGLTexture, unit: integer): Boolean
    open fun pushBatch(texture: WebGLTexture, unit: integer)
    override fun flush(): TextureTintPipeline /* this */
    open fun batchSprite(sprite: Image, camera: Camera, parentTransformMatrix: TransformMatrix = definedExternally)
    open fun batchSprite(sprite: Image, camera: Camera)
    open fun batchSprite(sprite: Sprite, camera: Camera, parentTransformMatrix: TransformMatrix = definedExternally)
    open fun batchSprite(sprite: Sprite, camera: Camera)
    open fun batchQuad(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, u0: Number, v0: Number, u1: Number, v1: Number, tintTL: Number, tintTR: Number, tintBL: Number, tintBR: Number, tintEffect: Number, texture: WebGLTexture = definedExternally, unit: integer = definedExternally): Boolean
    open fun batchQuad(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, u0: Number, v0: Number, u1: Number, v1: Number, tintTL: Number, tintTR: Number, tintBL: Number, tintBR: Number, tintEffect: Number): Boolean
    open fun batchQuad(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, u0: Number, v0: Number, u1: Number, v1: Number, tintTL: Number, tintTR: Number, tintBL: Number, tintBR: Number, tintEffect: Number, texture: WebGLTexture = definedExternally): Boolean
    open fun batchQuad(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, u0: Number, v0: Number, u1: Number, v1: Number, tintTL: Number, tintTR: Number, tintBL: Number, tintBR: Number, tintEffect: Boolean, texture: WebGLTexture = definedExternally, unit: integer = definedExternally): Boolean
    open fun batchQuad(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, u0: Number, v0: Number, u1: Number, v1: Number, tintTL: Number, tintTR: Number, tintBL: Number, tintBR: Number, tintEffect: Boolean): Boolean
    open fun batchQuad(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, u0: Number, v0: Number, u1: Number, v1: Number, tintTL: Number, tintTR: Number, tintBL: Number, tintBR: Number, tintEffect: Boolean, texture: WebGLTexture = definedExternally): Boolean
    open fun batchTri(x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, u0: Number, v0: Number, u1: Number, v1: Number, tintTL: Number, tintTR: Number, tintBL: Number, tintEffect: Number, texture: WebGLTexture = definedExternally, unit: integer = definedExternally): Boolean
    open fun batchTri(x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, u0: Number, v0: Number, u1: Number, v1: Number, tintTL: Number, tintTR: Number, tintBL: Number, tintEffect: Number): Boolean
    open fun batchTri(x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, u0: Number, v0: Number, u1: Number, v1: Number, tintTL: Number, tintTR: Number, tintBL: Number, tintEffect: Number, texture: WebGLTexture = definedExternally): Boolean
    open fun batchTri(x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, u0: Number, v0: Number, u1: Number, v1: Number, tintTL: Number, tintTR: Number, tintBL: Number, tintEffect: Boolean, texture: WebGLTexture = definedExternally, unit: integer = definedExternally): Boolean
    open fun batchTri(x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, u0: Number, v0: Number, u1: Number, v1: Number, tintTL: Number, tintTR: Number, tintBL: Number, tintEffect: Boolean): Boolean
    open fun batchTri(x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, u0: Number, v0: Number, u1: Number, v1: Number, tintTL: Number, tintTR: Number, tintBL: Number, tintEffect: Boolean, texture: WebGLTexture = definedExternally): Boolean
    open fun batchTexture(gameObject: GameObject, texture: WebGLTexture, textureWidth: integer, textureHeight: integer, srcX: Number, srcY: Number, srcWidth: Number, srcHeight: Number, scaleX: Number, scaleY: Number, rotation: Number, flipX: Boolean, flipY: Boolean, scrollFactorX: Number, scrollFactorY: Number, displayOriginX: Number, displayOriginY: Number, frameX: Number, frameY: Number, frameWidth: Number, frameHeight: Number, tintTL: integer, tintTR: integer, tintBL: integer, tintBR: integer, tintEffect: Number, uOffset: Number, vOffset: Number, camera: Camera, parentTransformMatrix: TransformMatrix, skipFlip: Boolean = definedExternally)
    open fun batchTextureFrame(frame: Frame, x: Number, y: Number, tint: Number, alpha: Number, transformMatrix: TransformMatrix, parentTransformMatrix: TransformMatrix = definedExternally)
    open fun drawFillRect(x: Number, y: Number, width: Number, height: Number, color: Number, alpha: Number)
    open fun batchFillRect(x: Number, y: Number, width: Number, height: Number, currentMatrix: TransformMatrix, parentMatrix: TransformMatrix)
    open fun batchFillTriangle(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number, currentMatrix: TransformMatrix, parentMatrix: TransformMatrix)
    open fun batchStrokeTriangle(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number, lineWidth: Number, currentMatrix: TransformMatrix, parentMatrix: TransformMatrix)
    open fun batchFillPath(path: Array<Any>, currentMatrix: TransformMatrix, parentMatrix: TransformMatrix)
    open fun batchStrokePath(path: Array<Any>, lineWidth: Number, pathOpen: Boolean, currentMatrix: TransformMatrix, parentMatrix: TransformMatrix)
    open fun batchLine(ax: Number, ay: Number, bx: Number, by: Number, aLineWidth: Number, bLineWidth: Number, currentMatrix: Float32Array)
}

external open class TextureTintStripPipeline(config: Any?) : WebGLPipeline {
    open var vertexViewF32: Float32Array
    open var vertexViewU32: Uint32Array
    open var maxQuads: integer
    open var batches: Array<Any>
    override fun onBind(): TextureTintStripPipeline /* this */
    override fun resize(width: Number, height: Number, resolution: Number): TextureTintStripPipeline /* this */
    open fun setTexture2D(texture: WebGLTexture = definedExternally, unit: integer = definedExternally): TextureTintStripPipeline
    open fun requireTextureBatch(texture: WebGLTexture, unit: integer): Boolean
    open fun pushBatch(texture: WebGLTexture, unit: integer)
    override fun flush(): TextureTintStripPipeline /* this */
}