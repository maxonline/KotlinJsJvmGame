@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

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
import Phaser.Plugins.PluginManager
import Phaser.Cache.BaseCache
import Phaser.Textures.TextureManager
import spine.webgl.SceneRenderer
import spine.webgl.SkeletonDebugRenderer
import spine.TextureAtlas
import spine.Skeleton
import spine.Bone
import spine.Vector2
import spine.VertexEffect
import Phaser.Plugins.ScenePlugin

external open class SpinePlugin(scene: Scene, pluginManager: PluginManager) : ScenePlugin {
    open var isWebGL: Boolean
    open var cache: BaseCache
    open var spineTextures: BaseCache
    open var json: BaseCache
    open var textures: TextureManager
    open var drawDebug: Boolean
    open var gl: WebGLRenderingContext
    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */
    open var sceneRenderer: SceneRenderer
    open var skeletonRenderer: dynamic /* spine.canvas.SkeletonRenderer | spine.webgl.SkeletonRenderer */
    open var skeletonDebugRenderer: SkeletonDebugRenderer
    open var plugin: Any
    open fun getAtlasCanvas(key: String): TextureAtlas
    open fun getAtlasWebGL(key: String): TextureAtlas
    open fun worldToLocal(x: Number, y: Number, skeleton: Skeleton, bone: Bone = definedExternally): Vector2
    open fun getVector2(x: Number, y: Number): Vector2
    open fun getVector3(x: Number, y: Number, z: Number): Vector2
    open fun setDebugBones(value: Boolean = definedExternally): SpinePlugin
    open fun setDebugRegionAttachments(value: Boolean = definedExternally): SpinePlugin
    open fun setDebugBoundingBoxes(value: Boolean = definedExternally): SpinePlugin
    open fun setDebugMeshHull(value: Boolean = definedExternally): SpinePlugin
    open fun setDebugMeshTriangles(value: Boolean = definedExternally): SpinePlugin
    open fun setDebugPaths(value: Boolean = definedExternally): SpinePlugin
    open fun setDebugSkeletonXY(value: Boolean = definedExternally): SpinePlugin
    open fun setDebugClipping(value: Boolean = definedExternally): SpinePlugin
    open fun setEffect(effect: VertexEffect = definedExternally): SpinePlugin
    open fun createSkeleton(key: String, skeletonJSON: Any? = definedExternally): Any?
    open fun createAnimationState(skeleton: Skeleton): Any
    open fun getBounds(skeleton: Skeleton): Any
    open fun onResize()
    open fun add(x: Number, y: Number, key: String = definedExternally, animationName: String = definedExternally, loop: Boolean = definedExternally): SpineGameObject
    open fun make(config: SpineGameObjectConfig, addToScene: Boolean = definedExternally): SpineGameObject
}