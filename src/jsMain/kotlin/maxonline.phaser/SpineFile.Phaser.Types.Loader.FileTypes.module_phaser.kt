@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.Loader.FileTypes

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
import tsstdlib.AudioContext
import integer
import Phaser.Types.Loader.FileConfig

external interface AtlasJSONFileConfig {
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
    var atlasURL: dynamic /* Any? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var atlasExtension: String?
        get() = definedExternally
        set(value) = definedExternally
    var atlasXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AtlasXMLFileConfig {
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

external interface AudioFileConfig {
    var key: String
    var urlConfig: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
    var audioContext: AudioContext?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AudioSpriteFileConfig {
    var key: String
    var jsonURL: String
    var jsonXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
    var audioURL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var audioConfig: Any?
        get() = definedExternally
        set(value) = definedExternally
    var audioXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BinaryFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
    var dataType: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BitmapFontFileConfig {
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
    var fontDataURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var fontDataExtension: String?
        get() = definedExternally
        set(value) = definedExternally
    var fontDataXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CSSFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GLSLFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var shaderType: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface HTMLFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface HTMLTextureFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
    var width: integer?
        get() = definedExternally
        set(value) = definedExternally
    var height: integer?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ImageFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var normalMap: String?
        get() = definedExternally
        set(value) = definedExternally
    var frameConfig: ImageFrameConfig?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ImageFrameConfig {
    var frameWidth: integer
    var frameHeight: integer?
        get() = definedExternally
        set(value) = definedExternally
    var startFrame: integer?
        get() = definedExternally
        set(value) = definedExternally
    var endFrame: integer?
        get() = definedExternally
        set(value) = definedExternally
    var margin: integer?
        get() = definedExternally
        set(value) = definedExternally
    var spacing: integer?
        get() = definedExternally
        set(value) = definedExternally
}

external interface JSONFileConfig {
    var key: String
    var url: dynamic /* String? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var dataKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MultiAtlasFileConfig {
    var key: String
    var atlasURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var atlasExtension: String?
        get() = definedExternally
        set(value) = definedExternally
    var atlasXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
    var path: String?
        get() = definedExternally
        set(value) = definedExternally
    var baseURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var textureXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MultiScriptFileConfig {
    var key: String
    var url: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PackFileConfig {
    var key: String
    var url: dynamic /* String? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var dataKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PackFileSection {
    var files: Array<FileConfig>
    var baseURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var defaultType: String?
        get() = definedExternally
        set(value) = definedExternally
    var path: String?
        get() = definedExternally
        set(value) = definedExternally
    var prefix: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PluginFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var start: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var mapping: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SceneFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ScenePluginFileConfig {
    var key: String
    var url: dynamic /* String? | Function<*>? */
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var systemKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var sceneKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ScriptFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SpriteSheetFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var normalMap: String?
        get() = definedExternally
        set(value) = definedExternally
    var frameConfig: ImageFrameConfig?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SVGFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
    var svgConfig: SVGSizeConfig?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SVGSizeConfig {
    var width: integer?
        get() = definedExternally
        set(value) = definedExternally
    var height: integer?
        get() = definedExternally
        set(value) = definedExternally
    var scale: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TextFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TilemapCSVFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TilemapImpactFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TilemapJSONFileConfig {
    var key: String
    var url: dynamic /* Any? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface UnityAtlasFileConfig {
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

external interface VideoFileConfig {
    var key: dynamic /* String | Phaser.Types.Loader.FileTypes.VideoFileConfig */
        get() = definedExternally
        set(value) = definedExternally
    var urlConfig: Any?
        get() = definedExternally
        set(value) = definedExternally
    var loadEvent: String?
        get() = definedExternally
        set(value) = definedExternally
    var asBlob: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var noAudio: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface XMLFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}