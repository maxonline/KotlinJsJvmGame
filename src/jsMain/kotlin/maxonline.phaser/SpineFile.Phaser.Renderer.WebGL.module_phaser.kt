@file:JsQualifier("Phaser.Renderer.WebGL")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Renderer.WebGL

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
import Phaser.Game
import integer
import Phaser.Scene
import Phaser.Cameras.Scene2D.Camera
import Phaser.Types.Renderer.Snapshot.SnapshotState
import Phaser.Cameras.Scene2D.BaseCamera
import Phaser.Display.Masks.GeometryMask
import tsstdlib.GLenum
import Phaser.Structs.Size
import Phaser.GameObjects.GameObject
import Phaser.Types.Renderer.Snapshot.SnapshotCallback

external open class WebGLPipeline(config: Any?) {
    open var name: String
    open var game: Game
    open var view: HTMLCanvasElement
    open var resolution: Number
    open var width: Number
    open var height: Number
    open var gl: WebGLRenderingContext
    open var vertexCount: Number
    open var vertexCapacity: integer
    open var renderer: WebGLRenderer
    open var vertexData: ArrayBuffer
    open var vertexBuffer: WebGLBuffer
    open var program: WebGLProgram
    open var attributes: Any?
    open var vertexSize: integer
    open var topology: integer
    open var bytes: Uint8Array
    open var vertexComponentCount: integer
    open var flushLocked: Boolean
    open var active: Boolean
    open fun boot()
    open fun addAttribute(name: String, size: integer, type: integer, normalized: Boolean, offset: integer): WebGLPipeline /* this */
    open fun shouldFlush(): Boolean
    open fun resize(width: Number, height: Number, resolution: Number): WebGLPipeline /* this */
    open fun bind(): WebGLPipeline /* this */
    open fun onBind(): WebGLPipeline /* this */
    open fun onPreRender(): WebGLPipeline /* this */
    open fun onRender(scene: Scene, camera: Camera): WebGLPipeline /* this */
    open fun onPostRender(): WebGLPipeline /* this */
    open fun flush(): WebGLPipeline /* this */
    open fun destroy(): WebGLPipeline /* this */
    open fun setFloat1(name: String, x: Number): WebGLPipeline /* this */
    open fun setFloat2(name: String, x: Number, y: Number): WebGLPipeline /* this */
    open fun setFloat3(name: String, x: Number, y: Number, z: Number): WebGLPipeline /* this */
    open fun setFloat4(name: String, x: Number, y: Number, z: Number, w: Number): WebGLPipeline /* this */
    open fun setFloat1v(name: String, arr: Float32Array): WebGLPipeline /* this */
    open fun setFloat2v(name: String, arr: Float32Array): WebGLPipeline /* this */
    open fun setFloat3v(name: String, arr: Float32Array): WebGLPipeline /* this */
    open fun setFloat4v(name: String, arr: Float32Array): WebGLPipeline /* this */
    open fun setInt1(name: String, x: integer): WebGLPipeline /* this */
    open fun setInt2(name: String, x: integer, y: integer): WebGLPipeline /* this */
    open fun setInt3(name: String, x: integer, y: integer, z: integer): WebGLPipeline /* this */
    open fun setInt4(name: String, x: integer, y: integer, z: integer, w: integer): WebGLPipeline /* this */
    open fun setMatrix2(name: String, transpose: Boolean, matrix: Float32Array): WebGLPipeline /* this */
    open fun setMatrix3(name: String, transpose: Boolean, matrix: Float32Array): WebGLPipeline /* this */
    open fun setMatrix4(name: String, transpose: Boolean, matrix: Float32Array): WebGLPipeline /* this */
}

external open class WebGLRenderer(game: Game) {
    open var config: Any?
    open var game: Game
    open var type: integer
    open var width: integer
    open var height: integer
    open var canvas: HTMLCanvasElement
    open var blendModes: Array<Any>
    open var nativeTextures: Array<Any>
    open var contextLost: Boolean
    open var pipelines: Any?
    open var snapshotState: SnapshotState
    open var currentActiveTextureUnit: integer
    open var currentTextures: Array<Any>
    open var currentFramebuffer: WebGLFramebuffer
    open var currentPipeline: WebGLPipeline
    open var currentProgram: WebGLProgram
    open var currentVertexBuffer: WebGLBuffer
    open var currentIndexBuffer: WebGLBuffer
    open var currentBlendMode: integer
    open var currentScissorEnabled: Boolean
    open var currentScissor: Uint32Array
    open var scissorStack: Uint32Array
    open var contextLostHandler: Function<*>
    open var contextRestoredHandler: Function<*>
    open var gl: WebGLRenderingContext
    open var supportedExtensions: Any?
    open var extensions: Any?
    open var glFormats: Array<Any>
    open var compression: Array<Any>
    open var drawingBufferHeight: Number
    open var blankTexture: WebGLTexture
    open var defaultCamera: BaseCamera
    open var maskCount: integer
    open var maskStack: Array<GeometryMask>
    open var currentMask: Any
    open var currentCameraMask: Any
    open var glFuncMap: Any
    open var currentType: String
    open var newType: Boolean
    open var nextTypeMatch: Boolean
    open var mipmapFilter: GLenum
    open fun init(config: Any?): WebGLRenderer /* this */
    open fun onResize(gameSize: Size, baseSize: Size, displaySize: Size, resolution: Number = definedExternally)
    open fun resize(width: Number = definedExternally, height: Number = definedExternally, resolution: Number = definedExternally): WebGLRenderer /* this */
    open fun hasExtension(extensionName: String): Boolean
    open fun getExtension(extensionName: String): Any?
    open fun flush()
    open fun hasPipeline(pipelineName: String): Boolean
    open fun getPipeline(pipelineName: String): WebGLPipeline
    open fun removePipeline(pipelineName: String): WebGLRenderer /* this */
    open fun addPipeline(pipelineName: String, pipelineInstance: WebGLPipeline): WebGLPipeline
    open fun pushScissor(x: integer, y: integer, width: integer, height: integer, drawingBufferHeight: integer = definedExternally): Array<integer>
    open fun setScissor(x: integer, y: integer, width: integer, height: integer, drawingBufferHeight: integer = definedExternally)
    open fun popScissor()
    open fun setPipeline(pipelineInstance: WebGLPipeline, gameObject: GameObject = definedExternally): WebGLPipeline
    open fun hasActiveStencilMask(): Boolean
    open fun rebindPipeline(pipelineInstance: WebGLPipeline)
    open fun clearPipeline()
    open fun setBlendMode(blendModeId: integer, force: Boolean = definedExternally): Boolean
    open fun addBlendMode(func: Array<GLenum>, equation: GLenum): integer
    open fun updateBlendMode(index: integer, func: Function<*>, equation: Function<*>): WebGLRenderer /* this */
    open fun removeBlendMode(index: integer): WebGLRenderer /* this */
    open fun setTexture2D(texture: WebGLTexture, textureUnit: integer, flush: Boolean = definedExternally): WebGLRenderer /* this */
    open fun setFramebuffer(framebuffer: WebGLFramebuffer, updateScissor: Boolean = definedExternally): WebGLRenderer /* this */
    open fun setProgram(program: WebGLProgram): WebGLRenderer /* this */
    open fun setVertexBuffer(vertexBuffer: WebGLBuffer): WebGLRenderer /* this */
    open fun setIndexBuffer(indexBuffer: WebGLBuffer): WebGLRenderer /* this */
    open fun createTextureFromSource(source: Any?, width: integer, height: integer, scaleMode: integer): WebGLTexture
    open fun createTexture2D(mipLevel: integer, minFilter: integer, magFilter: integer, wrapT: integer, wrapS: integer, format: integer, pixels: Any?, width: integer, height: integer, pma: Boolean = definedExternally, forceSize: Boolean = definedExternally, flipY: Boolean = definedExternally): WebGLTexture
    open fun createFramebuffer(width: integer, height: integer, renderTexture: WebGLTexture, addDepthStencilBuffer: Boolean): WebGLFramebuffer
    open fun createProgram(vertexShader: String, fragmentShader: String): WebGLProgram
    open fun createVertexBuffer(initialDataOrSize: ArrayBuffer, bufferUsage: integer): WebGLBuffer
    open fun createIndexBuffer(initialDataOrSize: ArrayBuffer, bufferUsage: integer): WebGLBuffer
    open fun deleteTexture(texture: WebGLTexture): WebGLRenderer /* this */
    open fun deleteFramebuffer(framebuffer: WebGLFramebuffer): WebGLRenderer /* this */
    open fun deleteProgram(program: WebGLProgram): WebGLRenderer /* this */
    open fun deleteBuffer(vertexBuffer: WebGLBuffer): WebGLRenderer /* this */
    open fun preRenderCamera(camera: Camera)
    open fun postRenderCamera(camera: Camera)
    open fun preRender()
    open fun render(scene: Scene, children: GameObject, interpolationPercentage: Number, camera: Camera)
    open fun postRender()
    open fun snapshot(callback: SnapshotCallback, type: String = definedExternally, encoderOptions: Number = definedExternally): WebGLRenderer /* this */
    open fun snapshotArea(x: integer, y: integer, width: integer, height: integer, callback: SnapshotCallback, type: String = definedExternally, encoderOptions: Number = definedExternally): WebGLRenderer /* this */
    open fun snapshotPixel(x: integer, y: integer, callback: SnapshotCallback): WebGLRenderer /* this */
    open fun snapshotFramebuffer(framebuffer: WebGLFramebuffer, bufferWidth: integer, bufferHeight: integer, callback: SnapshotCallback, getPixel: Boolean = definedExternally, x: integer = definedExternally, y: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, type: String = definedExternally, encoderOptions: Number = definedExternally): WebGLRenderer /* this */
    open fun canvasToTexture(srcCanvas: HTMLCanvasElement, dstTexture: WebGLTexture = definedExternally, noRepeat: Boolean = definedExternally, flipY: Boolean = definedExternally): WebGLTexture
    open fun createCanvasTexture(srcCanvas: HTMLCanvasElement, noRepeat: Boolean = definedExternally, flipY: Boolean = definedExternally): WebGLTexture
    open fun updateCanvasTexture(srcCanvas: HTMLCanvasElement, dstTexture: WebGLTexture, flipY: Boolean = definedExternally): WebGLTexture
    open fun createVideoTexture(srcVideo: HTMLVideoElement, noRepeat: Boolean = definedExternally, flipY: Boolean = definedExternally): WebGLTexture
    open fun updateVideoTexture(srcVideo: HTMLVideoElement, dstTexture: WebGLTexture, flipY: Boolean = definedExternally): WebGLTexture
    open fun setTextureFilter(texture: integer, filter: integer): WebGLRenderer /* this */
    open fun setFloat1(program: WebGLProgram, name: String, x: Number): WebGLRenderer /* this */
    open fun setFloat2(program: WebGLProgram, name: String, x: Number, y: Number): WebGLRenderer /* this */
    open fun setFloat3(program: WebGLProgram, name: String, x: Number, y: Number, z: Number): WebGLRenderer /* this */
    open fun setFloat4(program: WebGLProgram, name: String, x: Number, y: Number, z: Number, w: Number): WebGLRenderer /* this */
    open fun setFloat1v(program: WebGLProgram, name: String, arr: Float32Array): WebGLRenderer /* this */
    open fun setFloat2v(program: WebGLProgram, name: String, arr: Float32Array): WebGLRenderer /* this */
    open fun setFloat3v(program: WebGLProgram, name: String, arr: Float32Array): WebGLRenderer /* this */
    open fun setFloat4v(program: WebGLProgram, name: String, arr: Float32Array): WebGLRenderer /* this */
    open fun setInt1(program: WebGLProgram, name: String, x: integer): WebGLRenderer /* this */
    open fun setInt2(program: WebGLProgram, name: String, x: integer, y: integer): WebGLRenderer /* this */
    open fun setInt3(program: WebGLProgram, name: String, x: integer, y: integer, z: integer): WebGLRenderer /* this */
    open fun setInt4(program: WebGLProgram, name: String, x: integer, y: integer, z: integer, w: integer): WebGLRenderer /* this */
    open fun setMatrix2(program: WebGLProgram, name: String, transpose: Boolean, matrix: Float32Array): WebGLRenderer /* this */
    open fun setMatrix3(program: WebGLProgram, name: String, transpose: Boolean, matrix: Float32Array): WebGLRenderer /* this */
    open fun setMatrix4(program: WebGLProgram, name: String, transpose: Boolean, matrix: Float32Array): WebGLRenderer /* this */
    open fun getMaxTextures(): integer
    open fun getMaxTextureSize(): integer
    open fun destroy()
}