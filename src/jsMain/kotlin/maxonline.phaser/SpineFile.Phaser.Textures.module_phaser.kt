@file:JsQualifier("Phaser.Textures")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Textures

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
import Phaser.Display.Color
import Phaser.Types.Textures.PixelConfig
import Phaser.Game
import Phaser.GameObjects.RenderTexture
import Phaser.Types.Create.GenerateTextureConfig
import Phaser.Types.Textures.SpriteSheetConfig
import Phaser.Types.Textures.SpriteSheetFromAtlasConfig
import Phaser.GameObjects.GameObject
import EachTextureCallback
import Phaser.Events.EventEmitter

external open class CanvasTexture(manager: TextureManager, key: String, source: HTMLCanvasElement, width: integer, height: integer) : Texture {
    open var canvas: HTMLCanvasElement
    open var context: CanvasRenderingContext2D
    open var width: integer
    open var height: integer
    open var imageData: ImageData
    open var data: Uint8ClampedArray
    open var pixels: Uint32Array
    open var buffer: ArrayBuffer
    open fun update(): CanvasTexture
    open fun draw(x: integer, y: integer, source: HTMLImageElement): CanvasTexture
    open fun draw(x: integer, y: integer, source: HTMLCanvasElement): CanvasTexture
    open fun drawFrame(key: String, frame: String = definedExternally, x: integer = definedExternally, y: integer = definedExternally): CanvasTexture
    open fun drawFrame(key: String): CanvasTexture
    open fun drawFrame(key: String, frame: String = definedExternally): CanvasTexture
    open fun drawFrame(key: String, frame: String = definedExternally, x: integer = definedExternally): CanvasTexture
    open fun drawFrame(key: String, frame: integer = definedExternally, x: integer = definedExternally, y: integer = definedExternally): CanvasTexture
    open fun drawFrame(key: String, frame: integer = definedExternally): CanvasTexture
    open fun drawFrame(key: String, frame: integer = definedExternally, x: integer = definedExternally): CanvasTexture
    open fun setPixel(x: integer, y: integer, red: integer, green: integer, blue: integer, alpha: integer = definedExternally): CanvasTexture /* this */
    open fun putData(imageData: ImageData, x: integer, y: integer, dirtyX: integer = definedExternally, dirtyY: integer = definedExternally, dirtyWidth: integer = definedExternally, dirtyHeight: integer = definedExternally): CanvasTexture /* this */
    open fun getData(x: integer, y: integer, width: integer, height: integer): ImageData
    open fun getPixel(x: integer, y: integer, out: Color = definedExternally): Color
    open fun getPixels(x: integer = definedExternally, y: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally): Array<Array<PixelConfig>>
    open fun getIndex(x: integer, y: integer): integer
    open fun refresh(): CanvasTexture
    open fun getCanvas(): HTMLCanvasElement
    open fun getContext(): CanvasRenderingContext2D
    open fun clear(x: integer = definedExternally, y: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally): CanvasTexture
    open fun setSize(width: integer, height: integer = definedExternally): CanvasTexture
    override fun destroy()
}

external enum class FilterMode {
    LINEAR,
    NEAREST
}

external open class Frame {
    constructor(texture: Texture, name: integer, sourceIndex: integer, x: Number, y: Number, width: Number, height: Number)
    constructor(texture: Texture, name: String, sourceIndex: integer, x: Number, y: Number, width: Number, height: Number)
    open var texture: Texture
    open var name: String
    open var source: TextureSource
    open var sourceIndex: integer
    open var glTexture: WebGLTexture
    open var cutX: integer
    open var cutY: integer
    open var cutWidth: integer
    open var cutHeight: integer
    open var x: integer
    open var y: integer
    open var width: integer
    open var height: integer
    open var halfWidth: integer
    open var halfHeight: integer
    open var centerX: integer
    open var centerY: integer
    open var pivotX: Number
    open var pivotY: Number
    open var customPivot: Boolean
    open var rotated: Boolean
    open var autoRound: integer
    open var customData: Any?
    open var u0: Number
    open var v0: Number
    open var u1: Number
    open var v1: Number
    open fun setSize(width: integer, height: integer, x: integer = definedExternally, y: integer = definedExternally): Frame
    open fun setTrim(actualWidth: Number, actualHeight: Number, destX: Number, destY: Number, destWidth: Number, destHeight: Number): Frame
    open fun setCropUVs(crop: Any?, x: Number, y: Number, width: Number, height: Number, flipX: Boolean, flipY: Boolean): Any?
    open fun updateCropUVs(crop: Any?, flipX: Boolean, flipY: Boolean): Any?
    open fun updateUVs(): Frame
    open fun updateUVsInverted(): Frame
    open fun clone(): Frame
    open fun destroy()
    open var realWidth: Number
    open var realHeight: Number
    open var radius: Number
    open var trimmed: Boolean
    open var canvasData: Any?
}

external var LINEAR: integer

external var NEAREST: integer

external open class Texture {
    constructor(manager: TextureManager, key: String, source: HTMLImageElement, width: Number = definedExternally, height: Number = definedExternally)
    constructor(manager: TextureManager, key: String, source: HTMLImageElement)
    constructor(manager: TextureManager, key: String, source: HTMLImageElement, width: Number = definedExternally)
    constructor(manager: TextureManager, key: String, source: HTMLCanvasElement, width: Number = definedExternally, height: Number = definedExternally)
    constructor(manager: TextureManager, key: String, source: HTMLCanvasElement)
    constructor(manager: TextureManager, key: String, source: HTMLCanvasElement, width: Number = definedExternally)
    constructor(manager: TextureManager, key: String, source: Array<HTMLImageElement>, width: Number = definedExternally, height: Number = definedExternally)
    constructor(manager: TextureManager, key: String, source: Array<HTMLImageElement>)
    constructor(manager: TextureManager, key: String, source: Array<HTMLImageElement>, width: Number = definedExternally)
    constructor(manager: TextureManager, key: String, source: Array<HTMLCanvasElement>, width: Number = definedExternally, height: Number = definedExternally)
    constructor(manager: TextureManager, key: String, source: Array<HTMLCanvasElement>)
    constructor(manager: TextureManager, key: String, source: Array<HTMLCanvasElement>, width: Number = definedExternally)
    open var manager: TextureManager
    open var key: String
    open var source: Array<TextureSource>
    open var dataSource: Array<Any>
    open var frames: Any?
    open var customData: Any?
    open var firstFrame: String
    open var frameTotal: integer
    open fun add(name: integer, sourceIndex: integer, x: Number, y: Number, width: Number, height: Number): Frame
    open fun add(name: String, sourceIndex: integer, x: Number, y: Number, width: Number, height: Number): Frame
    open fun remove(name: String): Boolean
    open fun has(name: String): Boolean
    open fun get(name: String = definedExternally): Frame
    open fun get(): Frame
    open fun get(name: integer = definedExternally): Frame
    open fun getTextureSourceIndex(source: TextureSource): integer
    open fun getFramesFromTextureSource(sourceIndex: integer, includeBase: Boolean = definedExternally): Array<Frame>
    open fun getFrameNames(includeBase: Boolean = definedExternally): Array<String>
    open fun getSourceImage(name: String = definedExternally): dynamic /* HTMLImageElement | HTMLCanvasElement | Phaser.GameObjects.RenderTexture */
    open fun getSourceImage(): dynamic /* HTMLImageElement | HTMLCanvasElement | Phaser.GameObjects.RenderTexture */
    open fun getSourceImage(name: integer = definedExternally): dynamic /* HTMLImageElement | HTMLCanvasElement | Phaser.GameObjects.RenderTexture */
    open fun getDataSourceImage(name: String = definedExternally): dynamic /* HTMLImageElement | HTMLCanvasElement */
    open fun getDataSourceImage(): dynamic /* HTMLImageElement | HTMLCanvasElement */
    open fun getDataSourceImage(name: integer = definedExternally): dynamic /* HTMLImageElement | HTMLCanvasElement */
    open fun setDataSource(data: HTMLImageElement)
    open fun setDataSource(data: HTMLCanvasElement)
    open fun setDataSource(data: Array<HTMLImageElement>)
    open fun setDataSource(data: Array<HTMLCanvasElement>)
    open fun setFilter(filterMode: FilterMode)
    open fun destroy()
}

external open class TextureManager(game: Game) : EventEmitter {
    open var game: Game
    open var name: String
    open var list: Any?
    open fun checkKey(key: String): Boolean
    open fun remove(key: String): TextureManager
    open fun remove(key: Texture): TextureManager
    open fun removeKey(key: String): TextureManager
    open fun addBase64(key: String, data: Any): TextureManager /* this */
    open fun getBase64(key: String, frame: String = definedExternally, type: String = definedExternally, encoderOptions: Number = definedExternally): String
    open fun getBase64(key: String): String
    open fun getBase64(key: String, frame: String = definedExternally): String
    open fun getBase64(key: String, frame: String = definedExternally, type: String = definedExternally): String
    open fun getBase64(key: String, frame: integer = definedExternally, type: String = definedExternally, encoderOptions: Number = definedExternally): String
    open fun getBase64(key: String, frame: integer = definedExternally): String
    open fun getBase64(key: String, frame: integer = definedExternally, type: String = definedExternally): String
    open fun addImage(key: String, source: HTMLImageElement, dataSource: HTMLImageElement = definedExternally): Texture
    open fun addImage(key: String, source: HTMLImageElement): Texture
    open fun addImage(key: String, source: HTMLImageElement, dataSource: HTMLCanvasElement = definedExternally): Texture
    open fun addGLTexture(key: String, glTexture: WebGLTexture, width: Number, height: Number): Texture
    open fun addRenderTexture(key: String, renderTexture: RenderTexture): Texture
    open fun generate(key: String, config: GenerateTextureConfig): Texture
    open fun createCanvas(key: String, width: integer = definedExternally, height: integer = definedExternally): CanvasTexture
    open fun addCanvas(key: String, source: HTMLCanvasElement, skipCache: Boolean = definedExternally): CanvasTexture
    open fun addAtlas(key: String, source: HTMLImageElement, data: Any?, dataSource: HTMLImageElement = definedExternally): Texture
    open fun addAtlas(key: String, source: HTMLImageElement, data: Any?): Texture
    open fun addAtlas(key: String, source: HTMLImageElement, data: Any?, dataSource: HTMLCanvasElement = definedExternally): Texture
    open fun addAtlas(key: String, source: HTMLImageElement, data: Any?, dataSource: Array<HTMLImageElement> = definedExternally): Texture
    open fun addAtlas(key: String, source: HTMLImageElement, data: Any?, dataSource: Array<HTMLCanvasElement> = definedExternally): Texture
    open fun addAtlasJSONArray(key: String, source: HTMLImageElement, data: Any?, dataSource: Any /* HTMLImageElement | HTMLCanvasElement | Array<HTMLImageElement> | Array<HTMLCanvasElement> */ = definedExternally): Texture
    open fun addAtlasJSONArray(key: String, source: HTMLImageElement, data: Any?): Texture
    open fun addAtlasJSONArray(key: String, source: HTMLImageElement, data: Array<Any?>?, dataSource: Any /* HTMLImageElement | HTMLCanvasElement | Array<HTMLImageElement> | Array<HTMLCanvasElement> */ = definedExternally): Texture
    open fun addAtlasJSONArray(key: String, source: HTMLImageElement, data: Array<Any?>?): Texture
    open fun addAtlasJSONArray(key: String, source: Array<HTMLImageElement>, data: Any?, dataSource: Any /* HTMLImageElement | HTMLCanvasElement | Array<HTMLImageElement> | Array<HTMLCanvasElement> */ = definedExternally): Texture
    open fun addAtlasJSONArray(key: String, source: Array<HTMLImageElement>, data: Any?): Texture
    open fun addAtlasJSONArray(key: String, source: Array<HTMLImageElement>, data: Array<Any?>?, dataSource: Any /* HTMLImageElement | HTMLCanvasElement | Array<HTMLImageElement> | Array<HTMLCanvasElement> */ = definedExternally): Texture
    open fun addAtlasJSONArray(key: String, source: Array<HTMLImageElement>, data: Array<Any?>?): Texture
    open fun addAtlasJSONHash(key: String, source: HTMLImageElement, data: Any?, dataSource: HTMLImageElement = definedExternally): Texture
    open fun addAtlasJSONHash(key: String, source: HTMLImageElement, data: Any?): Texture
    open fun addAtlasJSONHash(key: String, source: HTMLImageElement, data: Any?, dataSource: HTMLCanvasElement = definedExternally): Texture
    open fun addAtlasJSONHash(key: String, source: HTMLImageElement, data: Any?, dataSource: Array<HTMLImageElement> = definedExternally): Texture
    open fun addAtlasJSONHash(key: String, source: HTMLImageElement, data: Any?, dataSource: Array<HTMLCanvasElement> = definedExternally): Texture
    open fun addAtlasXML(key: String, source: HTMLImageElement, data: Any?, dataSource: HTMLImageElement = definedExternally): Texture
    open fun addAtlasXML(key: String, source: HTMLImageElement, data: Any?): Texture
    open fun addAtlasXML(key: String, source: HTMLImageElement, data: Any?, dataSource: HTMLCanvasElement = definedExternally): Texture
    open fun addAtlasXML(key: String, source: HTMLImageElement, data: Any?, dataSource: Array<HTMLImageElement> = definedExternally): Texture
    open fun addAtlasXML(key: String, source: HTMLImageElement, data: Any?, dataSource: Array<HTMLCanvasElement> = definedExternally): Texture
    open fun addUnityAtlas(key: String, source: HTMLImageElement, data: Any?, dataSource: HTMLImageElement = definedExternally): Texture
    open fun addUnityAtlas(key: String, source: HTMLImageElement, data: Any?): Texture
    open fun addUnityAtlas(key: String, source: HTMLImageElement, data: Any?, dataSource: HTMLCanvasElement = definedExternally): Texture
    open fun addUnityAtlas(key: String, source: HTMLImageElement, data: Any?, dataSource: Array<HTMLImageElement> = definedExternally): Texture
    open fun addUnityAtlas(key: String, source: HTMLImageElement, data: Any?, dataSource: Array<HTMLCanvasElement> = definedExternally): Texture
    open fun addSpriteSheet(key: String, source: HTMLImageElement, config: SpriteSheetConfig): Texture
    open fun addSpriteSheetFromAtlas(key: String, config: SpriteSheetFromAtlasConfig): Texture
    open fun create(key: String, source: HTMLImageElement, width: integer, height: integer): Texture
    open fun exists(key: String): Boolean
    open fun get(key: String): Texture
    open fun get(key: Texture): Texture
    open fun cloneFrame(key: String, frame: String): Frame
    open fun cloneFrame(key: String, frame: integer): Frame
    open fun getFrame(key: String, frame: String = definedExternally): Frame
    open fun getFrame(key: String): Frame
    open fun getFrame(key: String, frame: integer = definedExternally): Frame
    open fun getTextureKeys(): Array<String>
    open fun getPixel(x: integer, y: integer, key: String, frame: String = definedExternally): Color
    open fun getPixel(x: integer, y: integer, key: String): Color
    open fun getPixel(x: integer, y: integer, key: String, frame: integer = definedExternally): Color
    open fun getPixelAlpha(x: integer, y: integer, key: String, frame: String = definedExternally): integer
    open fun getPixelAlpha(x: integer, y: integer, key: String): integer
    open fun getPixelAlpha(x: integer, y: integer, key: String, frame: integer = definedExternally): integer
    open fun setTexture(gameObject: GameObject, key: String, frame: String = definedExternally): GameObject
    open fun setTexture(gameObject: GameObject, key: String): GameObject
    open fun setTexture(gameObject: GameObject, key: String, frame: integer = definedExternally): GameObject
    open fun renameTexture(currentKey: String, newKey: String): Boolean
    open fun each(callback: EachTextureCallback, scope: Any?, vararg args: Any)
    override fun destroy()
}

external open class TextureSource {
    constructor(texture: Texture, source: HTMLImageElement, width: integer = definedExternally, height: integer = definedExternally, flipY: Boolean = definedExternally)
    constructor(texture: Texture, source: HTMLImageElement)
    constructor(texture: Texture, source: HTMLImageElement, width: integer = definedExternally)
    constructor(texture: Texture, source: HTMLImageElement, width: integer = definedExternally, height: integer = definedExternally)
    constructor(texture: Texture, source: HTMLCanvasElement, width: integer = definedExternally, height: integer = definedExternally, flipY: Boolean = definedExternally)
    constructor(texture: Texture, source: HTMLCanvasElement)
    constructor(texture: Texture, source: HTMLCanvasElement, width: integer = definedExternally)
    constructor(texture: Texture, source: HTMLCanvasElement, width: integer = definedExternally, height: integer = definedExternally)
    constructor(texture: Texture, source: HTMLVideoElement, width: integer = definedExternally, height: integer = definedExternally, flipY: Boolean = definedExternally)
    constructor(texture: Texture, source: HTMLVideoElement)
    constructor(texture: Texture, source: HTMLVideoElement, width: integer = definedExternally)
    constructor(texture: Texture, source: HTMLVideoElement, width: integer = definedExternally, height: integer = definedExternally)
    constructor(texture: Texture, source: RenderTexture, width: integer = definedExternally, height: integer = definedExternally, flipY: Boolean = definedExternally)
    constructor(texture: Texture, source: RenderTexture)
    constructor(texture: Texture, source: RenderTexture, width: integer = definedExternally)
    constructor(texture: Texture, source: RenderTexture, width: integer = definedExternally, height: integer = definedExternally)
    constructor(texture: Texture, source: WebGLTexture, width: integer = definedExternally, height: integer = definedExternally, flipY: Boolean = definedExternally)
    constructor(texture: Texture, source: WebGLTexture)
    constructor(texture: Texture, source: WebGLTexture, width: integer = definedExternally)
    constructor(texture: Texture, source: WebGLTexture, width: integer = definedExternally, height: integer = definedExternally)
    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */
    open var texture: Texture
    open var source: dynamic /* HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | Phaser.GameObjects.RenderTexture | WebGLTexture */
    open var image: dynamic /* HTMLImageElement | HTMLCanvasElement | HTMLVideoElement */
    open var compressionAlgorithm: integer
    open var resolution: Number
    open var width: integer
    open var height: integer
    open var scaleMode: Number
    open var isCanvas: Boolean
    open var isVideo: Boolean
    open var isRenderTexture: Boolean
    open var isGLTexture: Boolean
    open var isPowerOf2: Boolean
    open var glTexture: WebGLTexture
    open var flipY: Boolean
    open fun init(game: Game)
    open fun setFilter(filterMode: FilterMode)
    open fun setFlipY(value: Boolean = definedExternally)
    open fun update()
    open fun destroy()
}