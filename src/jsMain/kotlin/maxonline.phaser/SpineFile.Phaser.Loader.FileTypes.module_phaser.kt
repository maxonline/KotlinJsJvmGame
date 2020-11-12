@file:JsQualifier("Phaser.Loader.FileTypes")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Loader.FileTypes

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
import Phaser.Types.Loader.XHRSettingsObject
import Phaser.Loader.LoaderPlugin
import Phaser.Loader.MultiFile
import Phaser.Types.Loader.FileTypes.JSONFileConfig
import Phaser.Loader.File
import Phaser.Types.Loader.FileTypes.AtlasJSONFileConfig
import Phaser.Types.Loader.FileTypes.AtlasXMLFileConfig
import tsstdlib.AudioContext
import Phaser.Types.Loader.FileTypes.AudioFileConfig
import Phaser.Types.Loader.FileTypes.AudioSpriteFileConfig
import Phaser.Types.Loader.FileTypes.BinaryFileConfig
import Phaser.Types.Loader.FileTypes.BitmapFontFileConfig
import Phaser.Types.Loader.FileTypes.CSSFileConfig
import Phaser.Types.Loader.FileTypes.GLSLFileConfig
import Phaser.Types.Loader.FileTypes.HTMLFileConfig
import integer
import Phaser.Types.Loader.FileTypes.HTMLTextureFileConfig
import Phaser.Types.Loader.FileTypes.ImageFrameConfig
import Phaser.Types.Loader.FileTypes.ImageFileConfig
import Phaser.Types.Loader.FileTypes.MultiAtlasFileConfig
import Phaser.Types.Loader.FileTypes.MultiScriptFileConfig
import Phaser.Types.Loader.FileTypes.PackFileConfig
import Phaser.Types.Loader.FileTypes.PluginFileConfig
import Phaser.Types.Loader.FileTypes.SceneFileConfig
import Phaser.Types.Loader.FileTypes.ScenePluginFileConfig
import Phaser.Types.Loader.FileTypes.ScriptFileConfig
import Phaser.Types.Loader.FileTypes.SpriteSheetFileConfig
import Phaser.Types.Loader.FileTypes.SVGSizeConfig
import Phaser.Types.Loader.FileTypes.SVGFileConfig
import Phaser.Types.Loader.FileTypes.TextFileConfig
import Phaser.Types.Loader.FileTypes.TilemapCSVFileConfig
import Phaser.Types.Loader.FileTypes.TilemapImpactFileConfig
import Phaser.Types.Loader.FileTypes.TilemapJSONFileConfig
import Phaser.Types.Loader.FileTypes.UnityAtlasFileConfig
import Phaser.Types.Loader.FileTypes.VideoFileConfig
import Phaser.Types.Loader.FileTypes.XMLFileConfig

external interface SpineFileConfig {
    var key: String
    var textureURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var textureExtension: String?
        get() = definedExternally
        set(value) = definedExternally
    var textureXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
    var normalMap: String?
        get() = definedExternally
        set(value) = definedExternally
    var atlasURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var atlasExtension: String?
        get() = definedExternally
        set(value) = definedExternally
    var atlasXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external open class SpineFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, jsonURL: String, atlasURL: String, preMultipliedAlpha: Boolean, jsonXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: String, jsonURL: Array<String>, atlasURL: String, preMultipliedAlpha: Boolean, jsonXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: SpineFileConfig, jsonURL: String, atlasURL: String, preMultipliedAlpha: Boolean, jsonXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: SpineFileConfig, jsonURL: Array<String>, atlasURL: String, preMultipliedAlpha: Boolean, jsonXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    open fun addToCache()
}

external open class AnimationJSONFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally, dataKey: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: JSONFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally, dataKey: String = definedExternally)
    constructor(loader: LoaderPlugin, key: JSONFileConfig)
    constructor(loader: LoaderPlugin, key: JSONFileConfig, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: JSONFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    override fun onProcess()
    open fun onLoadComplete()
}

external open class AtlasJSONFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally, atlasURL: Any? = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally, atlasURL: Any? = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally, atlasURL: Any? = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally, atlasURL: String? = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally, atlasURL: String? = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally, atlasURL: String? = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally, atlasURL: Any? = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally, atlasURL: Any? = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally, atlasURL: Any? = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally, atlasURL: String? = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally, atlasURL: String? = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally, atlasURL: String? = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig, textureURL: String = definedExternally, atlasURL: Any? = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig)
    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig, textureURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig, textureURL: String = definedExternally, atlasURL: Any? = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig, textureURL: String = definedExternally, atlasURL: Any? = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig, textureURL: String = definedExternally, atlasURL: String? = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig, textureURL: String = definedExternally, atlasURL: String? = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig, textureURL: String = definedExternally, atlasURL: String? = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig, textureURL: Array<String> = definedExternally, atlasURL: Any? = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig, textureURL: Array<String> = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig, textureURL: Array<String> = definedExternally, atlasURL: Any? = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig, textureURL: Array<String> = definedExternally, atlasURL: Any? = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig, textureURL: Array<String> = definedExternally, atlasURL: String? = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig, textureURL: Array<String> = definedExternally, atlasURL: String? = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig, textureURL: Array<String> = definedExternally, atlasURL: String? = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    open fun addToCache()
}

external open class AtlasXMLFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally, atlasURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasXMLFileConfig, textureURL: String = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasXMLFileConfig)
    constructor(loader: LoaderPlugin, key: AtlasXMLFileConfig, textureURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasXMLFileConfig, textureURL: String = definedExternally, atlasURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasXMLFileConfig, textureURL: String = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasXMLFileConfig, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasXMLFileConfig, textureURL: Array<String> = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasXMLFileConfig, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: AtlasXMLFileConfig, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    open fun addToCache()
}

external open class AudioFile : File {
    constructor(loader: LoaderPlugin, key: String, urlConfig: Any = definedExternally, xhrSettings: XHRSettingsObject = definedExternally, audioContext: AudioContext = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, urlConfig: Any = definedExternally)
    constructor(loader: LoaderPlugin, key: String, urlConfig: Any = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: AudioFileConfig, urlConfig: Any = definedExternally, xhrSettings: XHRSettingsObject = definedExternally, audioContext: AudioContext = definedExternally)
    constructor(loader: LoaderPlugin, key: AudioFileConfig)
    constructor(loader: LoaderPlugin, key: AudioFileConfig, urlConfig: Any = definedExternally)
    constructor(loader: LoaderPlugin, key: AudioFileConfig, urlConfig: Any = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    override fun onProcess()
}

external open class AudioSpriteFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, jsonURL: String, audioURL: Any = definedExternally, audioConfig: Any = definedExternally, audioXhrSettings: XHRSettingsObject = definedExternally, jsonXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String, jsonURL: String)
    constructor(loader: LoaderPlugin, key: String, jsonURL: String, audioURL: Any = definedExternally)
    constructor(loader: LoaderPlugin, key: String, jsonURL: String, audioURL: Any = definedExternally, audioConfig: Any = definedExternally)
    constructor(loader: LoaderPlugin, key: String, jsonURL: String, audioURL: Any = definedExternally, audioConfig: Any = definedExternally, audioXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: AudioSpriteFileConfig, jsonURL: String, audioURL: Any = definedExternally, audioConfig: Any = definedExternally, audioXhrSettings: XHRSettingsObject = definedExternally, jsonXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: AudioSpriteFileConfig, jsonURL: String)
    constructor(loader: LoaderPlugin, key: AudioSpriteFileConfig, jsonURL: String, audioURL: Any = definedExternally)
    constructor(loader: LoaderPlugin, key: AudioSpriteFileConfig, jsonURL: String, audioURL: Any = definedExternally, audioConfig: Any = definedExternally)
    constructor(loader: LoaderPlugin, key: AudioSpriteFileConfig, jsonURL: String, audioURL: Any = definedExternally, audioConfig: Any = definedExternally, audioXhrSettings: XHRSettingsObject = definedExternally)
    override fun onFileComplete(file: File)
    open fun addToCache()
}

external open class BinaryFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally, dataType: Any = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: BinaryFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally, dataType: Any = definedExternally)
    constructor(loader: LoaderPlugin, key: BinaryFileConfig)
    constructor(loader: LoaderPlugin, key: BinaryFileConfig, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: BinaryFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    override fun onProcess()
}

external open class BitmapFontFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally, fontDataURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, fontDataXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally, fontDataURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally, fontDataURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally, fontDataURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, fontDataXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally, fontDataURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally, fontDataURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: BitmapFontFileConfig, textureURL: String = definedExternally, fontDataURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, fontDataXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: BitmapFontFileConfig)
    constructor(loader: LoaderPlugin, key: BitmapFontFileConfig, textureURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: BitmapFontFileConfig, textureURL: String = definedExternally, fontDataURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: BitmapFontFileConfig, textureURL: String = definedExternally, fontDataURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: BitmapFontFileConfig, textureURL: Array<String> = definedExternally, fontDataURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, fontDataXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: BitmapFontFileConfig, textureURL: Array<String> = definedExternally)
    constructor(loader: LoaderPlugin, key: BitmapFontFileConfig, textureURL: Array<String> = definedExternally, fontDataURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: BitmapFontFileConfig, textureURL: Array<String> = definedExternally, fontDataURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    open fun addToCache()
}

external open class CSSFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: CSSFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: CSSFileConfig)
    constructor(loader: LoaderPlugin, key: CSSFileConfig, url: String = definedExternally)
    override fun onProcess()
}

external open class GLSLFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, shaderType: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, shaderType: String = definedExternally)
    constructor(loader: LoaderPlugin, key: GLSLFileConfig, url: String = definedExternally, shaderType: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: GLSLFileConfig)
    constructor(loader: LoaderPlugin, key: GLSLFileConfig, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: GLSLFileConfig, url: String = definedExternally, shaderType: String = definedExternally)
    override fun onProcess()
    override fun addToCache()
    open fun getShaderName(headerSource: Array<String>): String
    open fun getShaderType(headerSource: Array<String>): String
    open fun getShaderUniforms(headerSource: Array<String>): Any
}

external open class HTML5AudioFile : File {
    constructor(loader: LoaderPlugin, key: String, urlConfig: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, urlConfig: String = definedExternally)
    constructor(loader: LoaderPlugin, key: AudioFileConfig, urlConfig: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: AudioFileConfig)
    constructor(loader: LoaderPlugin, key: AudioFileConfig, urlConfig: String = definedExternally)
    open fun onLoad()
    open fun onError()
    open fun onProgress()
    override fun load()
}

external open class HTMLFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: HTMLFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: HTMLFileConfig)
    constructor(loader: LoaderPlugin, key: HTMLFileConfig, url: String = definedExternally)
    override fun onProcess()
}

external open class HTMLTextureFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, width: integer = definedExternally, height: integer = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, width: integer = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, width: integer = definedExternally, height: integer = definedExternally)
    constructor(loader: LoaderPlugin, key: HTMLTextureFileConfig, url: String = definedExternally, width: integer = definedExternally, height: integer = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: HTMLTextureFileConfig)
    constructor(loader: LoaderPlugin, key: HTMLTextureFileConfig, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: HTMLTextureFileConfig, url: String = definedExternally, width: integer = definedExternally)
    constructor(loader: LoaderPlugin, key: HTMLTextureFileConfig, url: String = definedExternally, width: integer = definedExternally, height: integer = definedExternally)
    override fun onProcess()
    override fun addToCache()
}

external open class ImageFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally, frameConfig: ImageFrameConfig = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: Array<String> = definedExternally, xhrSettings: XHRSettingsObject = definedExternally, frameConfig: ImageFrameConfig = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: Array<String> = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: Array<String> = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: ImageFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally, frameConfig: ImageFrameConfig = definedExternally)
    constructor(loader: LoaderPlugin, key: ImageFileConfig)
    constructor(loader: LoaderPlugin, key: ImageFileConfig, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: ImageFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: ImageFileConfig, url: Array<String> = definedExternally, xhrSettings: XHRSettingsObject = definedExternally, frameConfig: ImageFrameConfig = definedExternally)
    constructor(loader: LoaderPlugin, key: ImageFileConfig, url: Array<String> = definedExternally)
    constructor(loader: LoaderPlugin, key: ImageFileConfig, url: Array<String> = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    override fun onProcess()
    override fun addToCache()
}

external open class JSONFile : File {
    constructor(loader: LoaderPlugin, key: String, url: Any? = definedExternally, xhrSettings: XHRSettingsObject = definedExternally, dataKey: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: Any? = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: Any? = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String? = definedExternally, xhrSettings: XHRSettingsObject = definedExternally, dataKey: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String? = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String? = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: JSONFileConfig, url: Any? = definedExternally, xhrSettings: XHRSettingsObject = definedExternally, dataKey: String = definedExternally)
    constructor(loader: LoaderPlugin, key: JSONFileConfig)
    constructor(loader: LoaderPlugin, key: JSONFileConfig, url: Any? = definedExternally)
    constructor(loader: LoaderPlugin, key: JSONFileConfig, url: Any? = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: JSONFileConfig, url: String? = definedExternally, xhrSettings: XHRSettingsObject = definedExternally, dataKey: String = definedExternally)
    constructor(loader: LoaderPlugin, key: JSONFileConfig, url: String? = definedExternally)
    constructor(loader: LoaderPlugin, key: JSONFileConfig, url: String? = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    override fun onProcess()
}

external open class MultiAtlasFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, atlasURL: String = definedExternally, path: String = definedExternally, baseURL: String = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, atlasURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, atlasURL: String = definedExternally, path: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, atlasURL: String = definedExternally, path: String = definedExternally, baseURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, atlasURL: String = definedExternally, path: String = definedExternally, baseURL: String = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: MultiAtlasFileConfig, atlasURL: String = definedExternally, path: String = definedExternally, baseURL: String = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: MultiAtlasFileConfig)
    constructor(loader: LoaderPlugin, key: MultiAtlasFileConfig, atlasURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: MultiAtlasFileConfig, atlasURL: String = definedExternally, path: String = definedExternally)
    constructor(loader: LoaderPlugin, key: MultiAtlasFileConfig, atlasURL: String = definedExternally, path: String = definedExternally, baseURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: MultiAtlasFileConfig, atlasURL: String = definedExternally, path: String = definedExternally, baseURL: String = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally)
    override fun onFileComplete(file: File)
    open fun addToCache()
}

external open class MultiScriptFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, url: Array<String> = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: Array<String> = definedExternally)
    constructor(loader: LoaderPlugin, key: MultiScriptFileConfig, url: Array<String> = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: MultiScriptFileConfig)
    constructor(loader: LoaderPlugin, key: MultiScriptFileConfig, url: Array<String> = definedExternally)
    open fun addToCache()
}

external open class PackFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally, dataKey: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: PackFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally, dataKey: String = definedExternally)
    constructor(loader: LoaderPlugin, key: PackFileConfig)
    constructor(loader: LoaderPlugin, key: PackFileConfig, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: PackFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    override fun onProcess()
}

external open class PluginFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, start: Boolean = definedExternally, mapping: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, start: Boolean = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, start: Boolean = definedExternally, mapping: String = definedExternally)
    constructor(loader: LoaderPlugin, key: PluginFileConfig, url: String = definedExternally, start: Boolean = definedExternally, mapping: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: PluginFileConfig)
    constructor(loader: LoaderPlugin, key: PluginFileConfig, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: PluginFileConfig, url: String = definedExternally, start: Boolean = definedExternally)
    constructor(loader: LoaderPlugin, key: PluginFileConfig, url: String = definedExternally, start: Boolean = definedExternally, mapping: String = definedExternally)
    override fun onProcess()
}

external open class SceneFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: SceneFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: SceneFileConfig)
    constructor(loader: LoaderPlugin, key: SceneFileConfig, url: String = definedExternally)
    override fun onProcess()
    override fun addToCache()
}

external open class ScenePluginFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, systemKey: String = definedExternally, sceneKey: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, systemKey: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, systemKey: String = definedExternally, sceneKey: String = definedExternally)
    constructor(loader: LoaderPlugin, key: ScenePluginFileConfig, url: String = definedExternally, systemKey: String = definedExternally, sceneKey: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: ScenePluginFileConfig)
    constructor(loader: LoaderPlugin, key: ScenePluginFileConfig, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: ScenePluginFileConfig, url: String = definedExternally, systemKey: String = definedExternally)
    constructor(loader: LoaderPlugin, key: ScenePluginFileConfig, url: String = definedExternally, systemKey: String = definedExternally, sceneKey: String = definedExternally)
    override fun onProcess()
}

external open class ScriptFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: ScriptFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: ScriptFileConfig)
    constructor(loader: LoaderPlugin, key: ScriptFileConfig, url: String = definedExternally)
    override fun onProcess()
}

external open class SpriteSheetFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, frameConfig: ImageFrameConfig = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, frameConfig: ImageFrameConfig = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: Array<String> = definedExternally, frameConfig: ImageFrameConfig = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: Array<String> = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: Array<String> = definedExternally, frameConfig: ImageFrameConfig = definedExternally)
    constructor(loader: LoaderPlugin, key: SpriteSheetFileConfig, url: String = definedExternally, frameConfig: ImageFrameConfig = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: SpriteSheetFileConfig)
    constructor(loader: LoaderPlugin, key: SpriteSheetFileConfig, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: SpriteSheetFileConfig, url: String = definedExternally, frameConfig: ImageFrameConfig = definedExternally)
    constructor(loader: LoaderPlugin, key: SpriteSheetFileConfig, url: Array<String> = definedExternally, frameConfig: ImageFrameConfig = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: SpriteSheetFileConfig, url: Array<String> = definedExternally)
    constructor(loader: LoaderPlugin, key: SpriteSheetFileConfig, url: Array<String> = definedExternally, frameConfig: ImageFrameConfig = definedExternally)
    override fun addToCache()
}

external open class SVGFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, svgConfig: SVGSizeConfig = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, svgConfig: SVGSizeConfig = definedExternally)
    constructor(loader: LoaderPlugin, key: SVGFileConfig, url: String = definedExternally, svgConfig: SVGSizeConfig = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: SVGFileConfig)
    constructor(loader: LoaderPlugin, key: SVGFileConfig, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: SVGFileConfig, url: String = definedExternally, svgConfig: SVGSizeConfig = definedExternally)
    override fun onProcess()
    override fun addToCache()
}

external open class TextFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: TextFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: TextFileConfig)
    constructor(loader: LoaderPlugin, key: TextFileConfig, url: String = definedExternally)
    override fun onProcess()
}

external open class TilemapCSVFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: TilemapCSVFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: TilemapCSVFileConfig)
    constructor(loader: LoaderPlugin, key: TilemapCSVFileConfig, url: String = definedExternally)
    override fun onProcess()
    override fun addToCache()
}

external open class TilemapImpactFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: TilemapImpactFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: TilemapImpactFileConfig)
    constructor(loader: LoaderPlugin, key: TilemapImpactFileConfig, url: String = definedExternally)
    override fun addToCache()
}

external open class TilemapJSONFile : File {
    constructor(loader: LoaderPlugin, key: String, url: Any? = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: Any? = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String? = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String? = definedExternally)
    constructor(loader: LoaderPlugin, key: TilemapJSONFileConfig, url: Any? = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: TilemapJSONFileConfig)
    constructor(loader: LoaderPlugin, key: TilemapJSONFileConfig, url: Any? = definedExternally)
    constructor(loader: LoaderPlugin, key: TilemapJSONFileConfig, url: String? = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: TilemapJSONFileConfig, url: String? = definedExternally)
    override fun addToCache()
}

external open class UnityAtlasFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally, atlasURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: UnityAtlasFileConfig, textureURL: String = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: UnityAtlasFileConfig)
    constructor(loader: LoaderPlugin, key: UnityAtlasFileConfig, textureURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: UnityAtlasFileConfig, textureURL: String = definedExternally, atlasURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: UnityAtlasFileConfig, textureURL: String = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: UnityAtlasFileConfig, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: UnityAtlasFileConfig, textureURL: Array<String> = definedExternally)
    constructor(loader: LoaderPlugin, key: UnityAtlasFileConfig, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally)
    constructor(loader: LoaderPlugin, key: UnityAtlasFileConfig, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally)
    open fun addToCache()
}

external open class VideoFile : File {
    constructor(loader: LoaderPlugin, key: String, urlConfig: Any = definedExternally, loadEvent: String = definedExternally, asBlob: Boolean = definedExternally, noAudio: Boolean = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, urlConfig: Any = definedExternally)
    constructor(loader: LoaderPlugin, key: String, urlConfig: Any = definedExternally, loadEvent: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, urlConfig: Any = definedExternally, loadEvent: String = definedExternally, asBlob: Boolean = definedExternally)
    constructor(loader: LoaderPlugin, key: String, urlConfig: Any = definedExternally, loadEvent: String = definedExternally, asBlob: Boolean = definedExternally, noAudio: Boolean = definedExternally)
    constructor(loader: LoaderPlugin, key: VideoFileConfig, urlConfig: Any = definedExternally, loadEvent: String = definedExternally, asBlob: Boolean = definedExternally, noAudio: Boolean = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: VideoFileConfig)
    constructor(loader: LoaderPlugin, key: VideoFileConfig, urlConfig: Any = definedExternally)
    constructor(loader: LoaderPlugin, key: VideoFileConfig, urlConfig: Any = definedExternally, loadEvent: String = definedExternally)
    constructor(loader: LoaderPlugin, key: VideoFileConfig, urlConfig: Any = definedExternally, loadEvent: String = definedExternally, asBlob: Boolean = definedExternally)
    constructor(loader: LoaderPlugin, key: VideoFileConfig, urlConfig: Any = definedExternally, loadEvent: String = definedExternally, asBlob: Boolean = definedExternally, noAudio: Boolean = definedExternally)
    override fun onProcess()
    override fun load()
}

external open class XMLFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: XMLFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally)
    constructor(loader: LoaderPlugin, key: XMLFileConfig)
    constructor(loader: LoaderPlugin, key: XMLFileConfig, url: String = definedExternally)
    override fun onProcess()
}