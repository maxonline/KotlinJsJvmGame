@file:JsQualifier("spine.webgl")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package spine.webgl

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
import spine.TextureFilter
import spine.TextureWrap
import spine.Texture
import spine.Disposable
import spine.Restorable
import spine.ArrayLike
import spine.Skeleton
import spine.Color
import spine.TextureAtlasRegion
import spine.VertexEffect
import spine.BlendMode

external open class AssetManager : spine.AssetManager {
    constructor(context: ManagedWebGLRenderingContext, pathPrefix: String = definedExternally)
    constructor(context: ManagedWebGLRenderingContext)
    constructor(context: WebGLRenderingContext, pathPrefix: String = definedExternally)
    constructor(context: WebGLRenderingContext)
}

external open class OrthoCamera(viewportWidth: Number, viewportHeight: Number) {
    open var position: Vector3
    open var direction: Vector3
    open var up: Vector3
    open var near: Number
    open var far: Number
    open var zoom: Number
    open var viewportWidth: Number
    open var viewportHeight: Number
    open var projectionView: Matrix4
    open var inverseProjectionView: Matrix4
    open var projection: Matrix4
    open var view: Matrix4
    open var tmp: Any
    open fun update()
    open fun screenToWorld(screenCoords: Vector3, screenWidth: Number, screenHeight: Number): Vector3
    open fun setViewport(viewportWidth: Number, viewportHeight: Number)
}

external open class GLTexture : Texture, Disposable, Restorable {
    constructor(context: ManagedWebGLRenderingContext, image: HTMLImageElement, useMipMaps: Boolean = definedExternally)
    constructor(context: ManagedWebGLRenderingContext, image: HTMLImageElement)
    constructor(context: WebGLRenderingContext, image: HTMLImageElement, useMipMaps: Boolean = definedExternally)
    constructor(context: WebGLRenderingContext, image: HTMLImageElement)
    open var context: Any
    open var texture: Any
    open var boundUnit: Any
    open var useMipMaps: Any
    override fun setFilters(minFilter: TextureFilter, magFilter: TextureFilter)
    override fun setWraps(uWrap: TextureWrap, vWrap: TextureWrap)
    open fun update(useMipMaps: Boolean)
    override fun restore()
    open fun bind(unit: Number = definedExternally)
    open fun unbind()
    override fun dispose()
}

external var M00: Any

external var M01: Any

external var M02: Any

external var M03: Any

external var M10: Any

external var M11: Any

external var M12: Any

external var M13: Any

external var M20: Any

external var M21: Any

external var M22: Any

external var M23: Any

external var M30: Any

external var M31: Any

external var M32: Any

external var M33: Any

external open class Matrix4 {
    open var temp: Float32Array
    open var values: Float32Array
    open fun set(values: ArrayLike<Number>): Matrix4
    open fun transpose(): Matrix4
    open fun identity(): Matrix4
    open fun invert(): Matrix4
    open fun determinant(): Number
    open fun translate(x: Number, y: Number, z: Number): Matrix4
    open fun copy(): Matrix4
    open fun projection(near: Number, far: Number, fovy: Number, aspectRatio: Number): Matrix4
    open fun ortho2d(x: Number, y: Number, width: Number, height: Number): Matrix4
    open fun ortho(left: Number, right: Number, bottom: Number, top: Number, near: Number, far: Number): Matrix4
    open fun multiply(matrix: Matrix4): Matrix4
    open fun multiplyLeft(matrix: Matrix4): Matrix4
    open fun lookAt(position: Vector3, direction: Vector3, up: Vector3): Matrix4 /* this */

    companion object {
        var xAxis: Any
        var yAxis: Any
        var zAxis: Any
        var tmpMatrix: Any
        fun initTemps()
    }
}

external open class Mesh : Disposable, Restorable {
    constructor(context: ManagedWebGLRenderingContext, attributes: Array<VertexAttribute>, maxVertices: Number, maxIndices: Number)
    constructor(context: WebGLRenderingContext, attributes: Array<VertexAttribute>, maxVertices: Number, maxIndices: Number)
    open var attributes: Any
    open var context: Any
    open var vertices: Any
    open var verticesBuffer: Any
    open var verticesLength: Any
    open var dirtyVertices: Any
    open var indices: Any
    open var indicesBuffer: Any
    open var indicesLength: Any
    open var dirtyIndices: Any
    open var elementsPerVertex: Any
    open fun getAttributes(): Array<VertexAttribute>
    open fun maxVertices(): Number
    open fun numVertices(): Number
    open fun setVerticesLength(length: Number)
    open fun getVertices(): Float32Array
    open fun maxIndices(): Number
    open fun numIndices(): Number
    open fun setIndicesLength(length: Number)
    open fun getIndices(): Uint16Array
    open fun getVertexSizeInFloats(): Number
    open fun setVertices(vertices: Array<Number>)
    open fun setIndices(indices: Array<Number>)
    open fun draw(shader: Shader, primitiveType: Number)
    open fun drawWithOffset(shader: Shader, primitiveType: Number, offset: Number, count: Number)
    open fun bind(shader: Shader)
    open fun unbind(shader: Shader)
    open var update: Any
    override fun restore()
    override fun dispose()
}

external open class VertexAttribute(name: String, type: VertexAttributeType, numElements: Number) {
    open var name: String
    open var type: VertexAttributeType
    open var numElements: Number
}

external open class Position2Attribute : VertexAttribute

external open class Position3Attribute : VertexAttribute

external open class TexCoordAttribute(unit: Number = definedExternally) : VertexAttribute

external open class ColorAttribute : VertexAttribute

external open class Color2Attribute : VertexAttribute

external enum class VertexAttributeType {
    Float /* = 0 */
}

external open class PolygonBatcher : Disposable {
    constructor(context: ManagedWebGLRenderingContext, twoColorTint: Boolean = definedExternally, maxVertices: Number = definedExternally)
    constructor(context: ManagedWebGLRenderingContext)
    constructor(context: ManagedWebGLRenderingContext, twoColorTint: Boolean = definedExternally)
    constructor(context: WebGLRenderingContext, twoColorTint: Boolean = definedExternally, maxVertices: Number = definedExternally)
    constructor(context: WebGLRenderingContext)
    constructor(context: WebGLRenderingContext, twoColorTint: Boolean = definedExternally)
    open var context: Any
    open var drawCalls: Any
    open var isDrawing: Any
    open var mesh: Any
    open var shader: Any
    open var lastTexture: Any
    open var verticesLength: Any
    open var indicesLength: Any
    open var srcBlend: Any
    open var dstBlend: Any
    open fun begin(shader: Shader)
    open fun setBlendMode(srcBlend: Number, dstBlend: Number)
    open fun draw(texture: GLTexture, vertices: ArrayLike<Number>, indices: Array<Number>)
    open var flush: Any
    open fun end()
    open fun getDrawCalls(): Number
    override fun dispose()
}

external open class SceneRenderer : Disposable {
    constructor(canvas: HTMLCanvasElement, context: ManagedWebGLRenderingContext, twoColorTint: Boolean = definedExternally)
    constructor(canvas: HTMLCanvasElement, context: ManagedWebGLRenderingContext)
    constructor(canvas: HTMLCanvasElement, context: WebGLRenderingContext, twoColorTint: Boolean = definedExternally)
    constructor(canvas: HTMLCanvasElement, context: WebGLRenderingContext)
    open var context: ManagedWebGLRenderingContext
    open var canvas: HTMLCanvasElement
    open var camera: OrthoCamera
    open var batcher: PolygonBatcher
    open var twoColorTint: Any
    open var batcherShader: Any
    open var shapes: Any
    open var shapesShader: Any
    open var activeRenderer: Any
    open var skeletonRenderer: SkeletonRenderer
    open var skeletonDebugRenderer: SkeletonDebugRenderer
    open var QUAD: Any
    open var QUAD_TRIANGLES: Any
    open var WHITE: Any
    open fun begin()
    open fun drawSkeleton(skeleton: Skeleton, premultipliedAlpha: Boolean = definedExternally, slotRangeStart: Number = definedExternally, slotRangeEnd: Number = definedExternally)
    open fun drawSkeletonDebug(skeleton: Skeleton, premultipliedAlpha: Boolean = definedExternally, ignoredBones: Array<String> = definedExternally)
    open fun drawTexture(texture: GLTexture, x: Number, y: Number, width: Number, height: Number, color: Color = definedExternally)
    open fun drawTextureUV(texture: GLTexture, x: Number, y: Number, width: Number, height: Number, u: Number, v: Number, u2: Number, v2: Number, color: Color = definedExternally)
    open fun drawTextureRotated(texture: GLTexture, x: Number, y: Number, width: Number, height: Number, pivotX: Number, pivotY: Number, angle: Number, color: Color = definedExternally, premultipliedAlpha: Boolean = definedExternally)
    open fun drawRegion(region: TextureAtlasRegion, x: Number, y: Number, width: Number, height: Number, color: Color = definedExternally, premultipliedAlpha: Boolean = definedExternally)
    open fun line(x: Number, y: Number, x2: Number, y2: Number, color: Color = definedExternally, color2: Color = definedExternally)
    open fun triangle(filled: Boolean, x: Number, y: Number, x2: Number, y2: Number, x3: Number, y3: Number, color: Color = definedExternally, color2: Color = definedExternally, color3: Color = definedExternally)
    open fun quad(filled: Boolean, x: Number, y: Number, x2: Number, y2: Number, x3: Number, y3: Number, x4: Number, y4: Number, color: Color = definedExternally, color2: Color = definedExternally, color3: Color = definedExternally, color4: Color = definedExternally)
    open fun rect(filled: Boolean, x: Number, y: Number, width: Number, height: Number, color: Color = definedExternally)
    open fun rectLine(filled: Boolean, x1: Number, y1: Number, x2: Number, y2: Number, width: Number, color: Color = definedExternally)
    open fun polygon(polygonVertices: ArrayLike<Number>, offset: Number, count: Number, color: Color = definedExternally)
    open fun circle(filled: Boolean, x: Number, y: Number, radius: Number, color: Color = definedExternally, segments: Number = definedExternally)
    open fun curve(x1: Number, y1: Number, cx1: Number, cy1: Number, cx2: Number, cy2: Number, x2: Number, y2: Number, segments: Number, color: Color = definedExternally)
    open fun end()
    open fun resize(resizeMode: ResizeMode)
    open var enableRenderer: Any
    override fun dispose()
}

external enum class ResizeMode {
    Stretch /* = 0 */,
    Expand /* = 1 */,
    Fit /* = 2 */
}

external open class Shader : Disposable, Restorable {
    constructor(context: ManagedWebGLRenderingContext, vertexShader: String, fragmentShader: String)
    constructor(context: WebGLRenderingContext, vertexShader: String, fragmentShader: String)
    open var vertexShader: Any
    open var fragmentShader: Any
    open var context: Any
    open var vs: Any
    open var vsSource: Any
    open var fs: Any
    open var fsSource: Any
    open var program: Any
    open var tmp2x2: Any
    open var tmp3x3: Any
    open var tmp4x4: Any
    open fun getProgram(): WebGLProgram
    open fun getVertexShader(): String
    open fun getFragmentShader(): String
    open fun getVertexShaderSource(): String
    open fun getFragmentSource(): String
    open var compile: Any
    open var compileShader: Any
    open var compileProgram: Any
    override fun restore()
    open fun bind()
    open fun unbind()
    open fun setUniformi(uniform: String, value: Number)
    open fun setUniformf(uniform: String, value: Number)
    open fun setUniform2f(uniform: String, value: Number, value2: Number)
    open fun setUniform3f(uniform: String, value: Number, value2: Number, value3: Number)
    open fun setUniform4f(uniform: String, value: Number, value2: Number, value3: Number, value4: Number)
    open fun setUniform2x2f(uniform: String, value: ArrayLike<Number>)
    open fun setUniform3x3f(uniform: String, value: ArrayLike<Number>)
    open fun setUniform4x4f(uniform: String, value: ArrayLike<Number>)
    open fun getUniformLocation(uniform: String): WebGLUniformLocation
    open fun getAttributeLocation(attribute: String): Number
    override fun dispose()

    companion object {
        var MVP_MATRIX: String
        var POSITION: String
        var COLOR: String
        var COLOR2: String
        var TEXCOORDS: String
        var SAMPLER: String
        fun newColoredTextured(context: ManagedWebGLRenderingContext): Shader
        fun newColoredTextured(context: WebGLRenderingContext): Shader
        fun newTwoColoredTextured(context: ManagedWebGLRenderingContext): Shader
        fun newTwoColoredTextured(context: WebGLRenderingContext): Shader
        fun newColored(context: ManagedWebGLRenderingContext): Shader
        fun newColored(context: WebGLRenderingContext): Shader
    }
}

external open class ShapeRenderer : Disposable {
    constructor(context: ManagedWebGLRenderingContext, maxVertices: Number = definedExternally)
    constructor(context: ManagedWebGLRenderingContext)
    constructor(context: WebGLRenderingContext, maxVertices: Number = definedExternally)
    constructor(context: WebGLRenderingContext)
    open var context: Any
    open var isDrawing: Any
    open var mesh: Any
    open var shapeType: Any
    open var color: Any
    open var shader: Any
    open var vertexIndex: Any
    open var tmp: Any
    open var srcBlend: Any
    open var dstBlend: Any
    open fun begin(shader: Shader)
    open fun setBlendMode(srcBlend: Number, dstBlend: Number)
    open fun setColor(color: Color)
    open fun setColorWith(r: Number, g: Number, b: Number, a: Number)
    open fun point(x: Number, y: Number, color: Color = definedExternally)
    open fun line(x: Number, y: Number, x2: Number, y2: Number, color: Color = definedExternally)
    open fun triangle(filled: Boolean, x: Number, y: Number, x2: Number, y2: Number, x3: Number, y3: Number, color: Color = definedExternally, color2: Color = definedExternally, color3: Color = definedExternally)
    open fun quad(filled: Boolean, x: Number, y: Number, x2: Number, y2: Number, x3: Number, y3: Number, x4: Number, y4: Number, color: Color = definedExternally, color2: Color = definedExternally, color3: Color = definedExternally, color4: Color = definedExternally)
    open fun rect(filled: Boolean, x: Number, y: Number, width: Number, height: Number, color: Color = definedExternally)
    open fun rectLine(filled: Boolean, x1: Number, y1: Number, x2: Number, y2: Number, width: Number, color: Color = definedExternally)
    open fun x(x: Number, y: Number, size: Number)
    open fun polygon(polygonVertices: ArrayLike<Number>, offset: Number, count: Number, color: Color = definedExternally)
    open fun circle(filled: Boolean, x: Number, y: Number, radius: Number, color: Color = definedExternally, segments: Number = definedExternally)
    open fun curve(x1: Number, y1: Number, cx1: Number, cy1: Number, cx2: Number, cy2: Number, x2: Number, y2: Number, segments: Number, color: Color = definedExternally)
    open var vertex: Any
    open fun end()
    open var flush: Any
    open var check: Any
    override fun dispose()
}

external enum class ShapeType {
    Point /* = 0 */,
    Line /* = 1 */,
    Filled /* = 4 */
}

external open class SkeletonDebugRenderer : Disposable {
    constructor(context: ManagedWebGLRenderingContext)
    constructor(context: WebGLRenderingContext)
    open var boneLineColor: Color
    open var boneOriginColor: Color
    open var attachmentLineColor: Color
    open var triangleLineColor: Color
    open var pathColor: Color
    open var clipColor: Color
    open var aabbColor: Color
    open var drawBones: Boolean
    open var drawRegionAttachments: Boolean
    open var drawBoundingBoxes: Boolean
    open var drawMeshHull: Boolean
    open var drawMeshTriangles: Boolean
    open var drawPaths: Boolean
    open var drawSkeletonXY: Boolean
    open var drawClipping: Boolean
    open var premultipliedAlpha: Boolean
    open var scale: Number
    open var boneWidth: Number
    open var context: Any
    open var bounds: Any
    open var temp: Any
    open var vertices: Any
    open fun draw(shapes: ShapeRenderer, skeleton: Skeleton, ignoredBones: Array<String> = definedExternally)
    override fun dispose()

    companion object {
        var LIGHT_GRAY: Any
        var GREEN: Any
    }
}

external open class SkeletonRenderer(context: ManagedWebGLRenderingContext, twoColorTint: Boolean = definedExternally) {
    open var premultipliedAlpha: Boolean
    open var vertexEffect: VertexEffect
    open var tempColor: Any
    open var tempColor2: Any
    open var vertices: Any
    open var vertexSize: Any
    open var twoColorTint: Any
    open var renderable: Any
    open var clipper: Any
    open var temp: Any
    open var temp2: Any
    open var temp3: Any
    open var temp4: Any
    open fun draw(batcher: PolygonBatcher, skeleton: Skeleton, slotRangeStart: Number = definedExternally, slotRangeEnd: Number = definedExternally)

    companion object {
        var QUAD_TRIANGLES: Array<Number>
    }
}

external open class Vector3(x: Number = definedExternally, y: Number = definedExternally, z: Number = definedExternally) {
    open var x: Number
    open var y: Number
    open var z: Number
    open fun setFrom(v: Vector3): Vector3
    open fun set(x: Number, y: Number, z: Number): Vector3
    open fun add(v: Vector3): Vector3
    open fun sub(v: Vector3): Vector3
    open fun scale(s: Number): Vector3
    open fun normalize(): Vector3
    open fun cross(v: Vector3): Vector3
    open fun multiply(matrix: Matrix4): Vector3
    open fun project(matrix: Matrix4): Vector3
    open fun dot(v: Vector3): Number
    open fun length(): Number
    open fun distance(v: Vector3): Number
}

external open class ManagedWebGLRenderingContext {
    open var canvas: dynamic /* HTMLCanvasElement | OffscreenCanvas */
    open var gl: WebGLRenderingContext
    open var restorables: Any
    constructor(canvasOrContext: HTMLCanvasElement, contextConfig: Any = definedExternally)
    constructor(canvasOrContext: HTMLCanvasElement)
    constructor(canvasOrContext: WebGLRenderingContext, contextConfig: Any = definedExternally)
    constructor(canvasOrContext: WebGLRenderingContext)
    open fun addRestorable(restorable: Restorable)
    open fun removeRestorable(restorable: Restorable)
}

external open class WebGLBlendModeConverter {
    companion object {
        var ZERO: Number
        var ONE: Number
        var SRC_COLOR: Number
        var ONE_MINUS_SRC_COLOR: Number
        var SRC_ALPHA: Number
        var ONE_MINUS_SRC_ALPHA: Number
        var DST_ALPHA: Number
        var ONE_MINUS_DST_ALPHA: Number
        var DST_COLOR: Number
        fun getDestGLBlendMode(blendMode: BlendMode): Number
        fun getSourceGLBlendMode(blendMode: BlendMode, premultipliedAlpha: Boolean = definedExternally): Number
    }
}

external open class AssetManager : spine.AssetManager {
    constructor(context: ManagedWebGLRenderingContext, pathPrefix: String = definedExternally)
    constructor(context: ManagedWebGLRenderingContext)
    constructor(context: WebGLRenderingContext, pathPrefix: String = definedExternally)
    constructor(context: WebGLRenderingContext)
}

external open class OrthoCamera(viewportWidth: Number, viewportHeight: Number) {
    open var position: Vector3
    open var direction: Vector3
    open var up: Vector3
    open var near: Number
    open var far: Number
    open var zoom: Number
    open var viewportWidth: Number
    open var viewportHeight: Number
    open var projectionView: Matrix4
    open var inverseProjectionView: Matrix4
    open var projection: Matrix4
    open var view: Matrix4
    open var tmp: Any
    open fun update()
    open fun screenToWorld(screenCoords: Vector3, screenWidth: Number, screenHeight: Number): Vector3
    open fun setViewport(viewportWidth: Number, viewportHeight: Number)
}

external open class GLTexture : Texture, Disposable, Restorable {
    constructor(context: ManagedWebGLRenderingContext, image: HTMLImageElement, useMipMaps: Boolean = definedExternally)
    constructor(context: ManagedWebGLRenderingContext, image: HTMLImageElement)
    constructor(context: WebGLRenderingContext, image: HTMLImageElement, useMipMaps: Boolean = definedExternally)
    constructor(context: WebGLRenderingContext, image: HTMLImageElement)
    open var context: Any
    open var texture: Any
    open var boundUnit: Any
    open var useMipMaps: Any
    override fun setFilters(minFilter: TextureFilter, magFilter: TextureFilter)
    override fun setWraps(uWrap: TextureWrap, vWrap: TextureWrap)
    open fun update(useMipMaps: Boolean)
    override fun restore()
    open fun bind(unit: Number = definedExternally)
    open fun unbind()
    override fun dispose()
}

external var M00: Any

external var M01: Any

external var M02: Any

external var M03: Any

external var M10: Any

external var M11: Any

external var M12: Any

external var M13: Any

external var M20: Any

external var M21: Any

external var M22: Any

external var M23: Any

external var M30: Any

external var M31: Any

external var M32: Any

external var M33: Any

external open class Matrix4 {
    open var temp: Float32Array
    open var values: Float32Array
    open fun set(values: ArrayLike<Number>): Matrix4
    open fun transpose(): Matrix4
    open fun identity(): Matrix4
    open fun invert(): Matrix4
    open fun determinant(): Number
    open fun translate(x: Number, y: Number, z: Number): Matrix4
    open fun copy(): Matrix4
    open fun projection(near: Number, far: Number, fovy: Number, aspectRatio: Number): Matrix4
    open fun ortho2d(x: Number, y: Number, width: Number, height: Number): Matrix4
    open fun ortho(left: Number, right: Number, bottom: Number, top: Number, near: Number, far: Number): Matrix4
    open fun multiply(matrix: Matrix4): Matrix4
    open fun multiplyLeft(matrix: Matrix4): Matrix4
    open fun lookAt(position: Vector3, direction: Vector3, up: Vector3): Matrix4 /* this */

    companion object {
        var xAxis: Any
        var yAxis: Any
        var zAxis: Any
        var tmpMatrix: Any
        fun initTemps()
    }
}

external open class Mesh : Disposable, Restorable {
    constructor(context: ManagedWebGLRenderingContext, attributes: Array<VertexAttribute>, maxVertices: Number, maxIndices: Number)
    constructor(context: WebGLRenderingContext, attributes: Array<VertexAttribute>, maxVertices: Number, maxIndices: Number)
    open var attributes: Any
    open var context: Any
    open var vertices: Any
    open var verticesBuffer: Any
    open var verticesLength: Any
    open var dirtyVertices: Any
    open var indices: Any
    open var indicesBuffer: Any
    open var indicesLength: Any
    open var dirtyIndices: Any
    open var elementsPerVertex: Any
    open fun getAttributes(): Array<VertexAttribute>
    open fun maxVertices(): Number
    open fun numVertices(): Number
    open fun setVerticesLength(length: Number)
    open fun getVertices(): Float32Array
    open fun maxIndices(): Number
    open fun numIndices(): Number
    open fun setIndicesLength(length: Number)
    open fun getIndices(): Uint16Array
    open fun getVertexSizeInFloats(): Number
    open fun setVertices(vertices: Array<Number>)
    open fun setIndices(indices: Array<Number>)
    open fun draw(shader: Shader, primitiveType: Number)
    open fun drawWithOffset(shader: Shader, primitiveType: Number, offset: Number, count: Number)
    open fun bind(shader: Shader)
    open fun unbind(shader: Shader)
    open var update: Any
    override fun restore()
    override fun dispose()
}

external open class VertexAttribute(name: String, type: VertexAttributeType, numElements: Number) {
    open var name: String
    open var type: VertexAttributeType
    open var numElements: Number
}

external open class Position2Attribute : VertexAttribute

external open class Position3Attribute : VertexAttribute

external open class TexCoordAttribute(unit: Number = definedExternally) : VertexAttribute

external open class ColorAttribute : VertexAttribute

external open class Color2Attribute : VertexAttribute

external enum class VertexAttributeType {
    Float /* = 0 */
}

external open class PolygonBatcher : Disposable {
    constructor(context: ManagedWebGLRenderingContext, twoColorTint: Boolean = definedExternally, maxVertices: Number = definedExternally)
    constructor(context: ManagedWebGLRenderingContext)
    constructor(context: ManagedWebGLRenderingContext, twoColorTint: Boolean = definedExternally)
    constructor(context: WebGLRenderingContext, twoColorTint: Boolean = definedExternally, maxVertices: Number = definedExternally)
    constructor(context: WebGLRenderingContext)
    constructor(context: WebGLRenderingContext, twoColorTint: Boolean = definedExternally)
    open var context: Any
    open var drawCalls: Any
    open var isDrawing: Any
    open var mesh: Any
    open var shader: Any
    open var lastTexture: Any
    open var verticesLength: Any
    open var indicesLength: Any
    open var srcBlend: Any
    open var dstBlend: Any
    open fun begin(shader: Shader)
    open fun setBlendMode(srcBlend: Number, dstBlend: Number)
    open fun draw(texture: GLTexture, vertices: ArrayLike<Number>, indices: Array<Number>)
    open var flush: Any
    open fun end()
    open fun getDrawCalls(): Number
    override fun dispose()
}

external open class SceneRenderer : Disposable {
    constructor(canvas: HTMLCanvasElement, context: ManagedWebGLRenderingContext, twoColorTint: Boolean = definedExternally)
    constructor(canvas: HTMLCanvasElement, context: ManagedWebGLRenderingContext)
    constructor(canvas: HTMLCanvasElement, context: WebGLRenderingContext, twoColorTint: Boolean = definedExternally)
    constructor(canvas: HTMLCanvasElement, context: WebGLRenderingContext)
    open var context: ManagedWebGLRenderingContext
    open var canvas: HTMLCanvasElement
    open var camera: OrthoCamera
    open var batcher: PolygonBatcher
    open var twoColorTint: Any
    open var batcherShader: Any
    open var shapes: Any
    open var shapesShader: Any
    open var activeRenderer: Any
    open var skeletonRenderer: SkeletonRenderer
    open var skeletonDebugRenderer: SkeletonDebugRenderer
    open var QUAD: Any
    open var QUAD_TRIANGLES: Any
    open var WHITE: Any
    open fun begin()
    open fun drawSkeleton(skeleton: Skeleton, premultipliedAlpha: Boolean = definedExternally, slotRangeStart: Number = definedExternally, slotRangeEnd: Number = definedExternally)
    open fun drawSkeletonDebug(skeleton: Skeleton, premultipliedAlpha: Boolean = definedExternally, ignoredBones: Array<String> = definedExternally)
    open fun drawTexture(texture: GLTexture, x: Number, y: Number, width: Number, height: Number, color: Color = definedExternally)
    open fun drawTextureUV(texture: GLTexture, x: Number, y: Number, width: Number, height: Number, u: Number, v: Number, u2: Number, v2: Number, color: Color = definedExternally)
    open fun drawTextureRotated(texture: GLTexture, x: Number, y: Number, width: Number, height: Number, pivotX: Number, pivotY: Number, angle: Number, color: Color = definedExternally, premultipliedAlpha: Boolean = definedExternally)
    open fun drawRegion(region: TextureAtlasRegion, x: Number, y: Number, width: Number, height: Number, color: Color = definedExternally, premultipliedAlpha: Boolean = definedExternally)
    open fun line(x: Number, y: Number, x2: Number, y2: Number, color: Color = definedExternally, color2: Color = definedExternally)
    open fun triangle(filled: Boolean, x: Number, y: Number, x2: Number, y2: Number, x3: Number, y3: Number, color: Color = definedExternally, color2: Color = definedExternally, color3: Color = definedExternally)
    open fun quad(filled: Boolean, x: Number, y: Number, x2: Number, y2: Number, x3: Number, y3: Number, x4: Number, y4: Number, color: Color = definedExternally, color2: Color = definedExternally, color3: Color = definedExternally, color4: Color = definedExternally)
    open fun rect(filled: Boolean, x: Number, y: Number, width: Number, height: Number, color: Color = definedExternally)
    open fun rectLine(filled: Boolean, x1: Number, y1: Number, x2: Number, y2: Number, width: Number, color: Color = definedExternally)
    open fun polygon(polygonVertices: ArrayLike<Number>, offset: Number, count: Number, color: Color = definedExternally)
    open fun circle(filled: Boolean, x: Number, y: Number, radius: Number, color: Color = definedExternally, segments: Number = definedExternally)
    open fun curve(x1: Number, y1: Number, cx1: Number, cy1: Number, cx2: Number, cy2: Number, x2: Number, y2: Number, segments: Number, color: Color = definedExternally)
    open fun end()
    open fun resize(resizeMode: ResizeMode)
    open var enableRenderer: Any
    override fun dispose()
}

external enum class ResizeMode {
    Stretch /* = 0 */,
    Expand /* = 1 */,
    Fit /* = 2 */
}

external open class Shader : Disposable, Restorable {
    constructor(context: ManagedWebGLRenderingContext, vertexShader: String, fragmentShader: String)
    constructor(context: WebGLRenderingContext, vertexShader: String, fragmentShader: String)
    open var vertexShader: Any
    open var fragmentShader: Any
    open var context: Any
    open var vs: Any
    open var vsSource: Any
    open var fs: Any
    open var fsSource: Any
    open var program: Any
    open var tmp2x2: Any
    open var tmp3x3: Any
    open var tmp4x4: Any
    open fun getProgram(): WebGLProgram
    open fun getVertexShader(): String
    open fun getFragmentShader(): String
    open fun getVertexShaderSource(): String
    open fun getFragmentSource(): String
    open var compile: Any
    open var compileShader: Any
    open var compileProgram: Any
    override fun restore()
    open fun bind()
    open fun unbind()
    open fun setUniformi(uniform: String, value: Number)
    open fun setUniformf(uniform: String, value: Number)
    open fun setUniform2f(uniform: String, value: Number, value2: Number)
    open fun setUniform3f(uniform: String, value: Number, value2: Number, value3: Number)
    open fun setUniform4f(uniform: String, value: Number, value2: Number, value3: Number, value4: Number)
    open fun setUniform2x2f(uniform: String, value: ArrayLike<Number>)
    open fun setUniform3x3f(uniform: String, value: ArrayLike<Number>)
    open fun setUniform4x4f(uniform: String, value: ArrayLike<Number>)
    open fun getUniformLocation(uniform: String): WebGLUniformLocation
    open fun getAttributeLocation(attribute: String): Number
    override fun dispose()

    companion object {
        var MVP_MATRIX: String
        var POSITION: String
        var COLOR: String
        var COLOR2: String
        var TEXCOORDS: String
        var SAMPLER: String
        fun newColoredTextured(context: ManagedWebGLRenderingContext): Shader
        fun newColoredTextured(context: WebGLRenderingContext): Shader
        fun newTwoColoredTextured(context: ManagedWebGLRenderingContext): Shader
        fun newTwoColoredTextured(context: WebGLRenderingContext): Shader
        fun newColored(context: ManagedWebGLRenderingContext): Shader
        fun newColored(context: WebGLRenderingContext): Shader
    }
}

external open class ShapeRenderer : Disposable {
    constructor(context: ManagedWebGLRenderingContext, maxVertices: Number = definedExternally)
    constructor(context: ManagedWebGLRenderingContext)
    constructor(context: WebGLRenderingContext, maxVertices: Number = definedExternally)
    constructor(context: WebGLRenderingContext)
    open var context: Any
    open var isDrawing: Any
    open var mesh: Any
    open var shapeType: Any
    open var color: Any
    open var shader: Any
    open var vertexIndex: Any
    open var tmp: Any
    open var srcBlend: Any
    open var dstBlend: Any
    open fun begin(shader: Shader)
    open fun setBlendMode(srcBlend: Number, dstBlend: Number)
    open fun setColor(color: Color)
    open fun setColorWith(r: Number, g: Number, b: Number, a: Number)
    open fun point(x: Number, y: Number, color: Color = definedExternally)
    open fun line(x: Number, y: Number, x2: Number, y2: Number, color: Color = definedExternally)
    open fun triangle(filled: Boolean, x: Number, y: Number, x2: Number, y2: Number, x3: Number, y3: Number, color: Color = definedExternally, color2: Color = definedExternally, color3: Color = definedExternally)
    open fun quad(filled: Boolean, x: Number, y: Number, x2: Number, y2: Number, x3: Number, y3: Number, x4: Number, y4: Number, color: Color = definedExternally, color2: Color = definedExternally, color3: Color = definedExternally, color4: Color = definedExternally)
    open fun rect(filled: Boolean, x: Number, y: Number, width: Number, height: Number, color: Color = definedExternally)
    open fun rectLine(filled: Boolean, x1: Number, y1: Number, x2: Number, y2: Number, width: Number, color: Color = definedExternally)
    open fun x(x: Number, y: Number, size: Number)
    open fun polygon(polygonVertices: ArrayLike<Number>, offset: Number, count: Number, color: Color = definedExternally)
    open fun circle(filled: Boolean, x: Number, y: Number, radius: Number, color: Color = definedExternally, segments: Number = definedExternally)
    open fun curve(x1: Number, y1: Number, cx1: Number, cy1: Number, cx2: Number, cy2: Number, x2: Number, y2: Number, segments: Number, color: Color = definedExternally)
    open var vertex: Any
    open fun end()
    open var flush: Any
    open var check: Any
    override fun dispose()
}

external enum class ShapeType {
    Point /* = 0 */,
    Line /* = 1 */,
    Filled /* = 4 */
}

external open class SkeletonDebugRenderer : Disposable {
    constructor(context: ManagedWebGLRenderingContext)
    constructor(context: WebGLRenderingContext)
    open var boneLineColor: Color
    open var boneOriginColor: Color
    open var attachmentLineColor: Color
    open var triangleLineColor: Color
    open var pathColor: Color
    open var clipColor: Color
    open var aabbColor: Color
    open var drawBones: Boolean
    open var drawRegionAttachments: Boolean
    open var drawBoundingBoxes: Boolean
    open var drawMeshHull: Boolean
    open var drawMeshTriangles: Boolean
    open var drawPaths: Boolean
    open var drawSkeletonXY: Boolean
    open var drawClipping: Boolean
    open var premultipliedAlpha: Boolean
    open var scale: Number
    open var boneWidth: Number
    open var context: Any
    open var bounds: Any
    open var temp: Any
    open var vertices: Any
    open fun draw(shapes: ShapeRenderer, skeleton: Skeleton, ignoredBones: Array<String> = definedExternally)
    override fun dispose()

    companion object {
        var LIGHT_GRAY: Any
        var GREEN: Any
    }
}

external open class SkeletonRenderer(context: ManagedWebGLRenderingContext, twoColorTint: Boolean = definedExternally) {
    open var premultipliedAlpha: Boolean
    open var vertexEffect: VertexEffect
    open var tempColor: Any
    open var tempColor2: Any
    open var vertices: Any
    open var vertexSize: Any
    open var twoColorTint: Any
    open var renderable: Any
    open var clipper: Any
    open var temp: Any
    open var temp2: Any
    open var temp3: Any
    open var temp4: Any
    open fun draw(batcher: PolygonBatcher, skeleton: Skeleton, slotRangeStart: Number = definedExternally, slotRangeEnd: Number = definedExternally)

    companion object {
        var QUAD_TRIANGLES: Array<Number>
    }
}

external open class Vector3(x: Number = definedExternally, y: Number = definedExternally, z: Number = definedExternally) {
    open var x: Number
    open var y: Number
    open var z: Number
    open fun setFrom(v: Vector3): Vector3
    open fun set(x: Number, y: Number, z: Number): Vector3
    open fun add(v: Vector3): Vector3
    open fun sub(v: Vector3): Vector3
    open fun scale(s: Number): Vector3
    open fun normalize(): Vector3
    open fun cross(v: Vector3): Vector3
    open fun multiply(matrix: Matrix4): Vector3
    open fun project(matrix: Matrix4): Vector3
    open fun dot(v: Vector3): Number
    open fun length(): Number
    open fun distance(v: Vector3): Number
}

external open class ManagedWebGLRenderingContext {
    open var canvas: dynamic /* HTMLCanvasElement | OffscreenCanvas */
    open var gl: WebGLRenderingContext
    open var restorables: Any
    constructor(canvasOrContext: HTMLCanvasElement, contextConfig: Any = definedExternally)
    constructor(canvasOrContext: HTMLCanvasElement)
    constructor(canvasOrContext: WebGLRenderingContext, contextConfig: Any = definedExternally)
    constructor(canvasOrContext: WebGLRenderingContext)
    open fun addRestorable(restorable: Restorable)
    open fun removeRestorable(restorable: Restorable)
}

external open class WebGLBlendModeConverter {
    companion object {
        var ZERO: Number
        var ONE: Number
        var SRC_COLOR: Number
        var ONE_MINUS_SRC_COLOR: Number
        var SRC_ALPHA: Number
        var ONE_MINUS_SRC_ALPHA: Number
        var DST_ALPHA: Number
        var ONE_MINUS_DST_ALPHA: Number
        var DST_COLOR: Number
        fun getDestGLBlendMode(blendMode: BlendMode): Number
        fun getSourceGLBlendMode(blendMode: BlendMode, premultipliedAlpha: Boolean = definedExternally): Number
    }
}