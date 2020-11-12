@file:JsQualifier("spine.canvas")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package spine.canvas

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
import spine.Skeleton

external open class AssetManager(pathPrefix: String = definedExternally) : spine.AssetManager

external open class CanvasTexture(image: HTMLImageElement) : Texture {
    override fun setFilters(minFilter: TextureFilter, magFilter: TextureFilter)
    override fun setWraps(uWrap: TextureWrap, vWrap: TextureWrap)
    override fun dispose()
}

external open class SkeletonRenderer(context: CanvasRenderingContext2D) {
    open var ctx: Any
    open var triangleRendering: Boolean
    open var debugRendering: Boolean
    open var vertices: Any
    open var tempColor: Any
    open fun draw(skeleton: Skeleton)
    open var drawImages: Any
    open var drawTriangles: Any
    open var drawTriangle: Any
    open var computeRegionVertices: Any
    open var computeMeshVertices: Any

    companion object {
        var QUAD_TRIANGLES: Array<Number>
        var VERTEX_SIZE: Number
    }
}

external open class AssetManager(pathPrefix: String = definedExternally) : spine.AssetManager

external open class CanvasTexture(image: HTMLImageElement) : Texture {
    override fun setFilters(minFilter: TextureFilter, magFilter: TextureFilter)
    override fun setWraps(uWrap: TextureWrap, vWrap: TextureWrap)
    override fun dispose()
}

external open class SkeletonRenderer(context: CanvasRenderingContext2D) {
    open var ctx: Any
    open var triangleRendering: Boolean
    open var debugRendering: Boolean
    open var vertices: Any
    open var tempColor: Any
    open fun draw(skeleton: Skeleton)
    open var drawImages: Any
    open var drawTriangles: Any
    open var drawTriangle: Any
    open var computeRegionVertices: Any
    open var computeMeshVertices: Any

    companion object {
        var QUAD_TRIANGLES: Array<Number>
        var VERTEX_SIZE: Number
    }
}