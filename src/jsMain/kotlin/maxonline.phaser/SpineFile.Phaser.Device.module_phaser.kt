@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Device

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

external interface Audio {
    var audioData: Boolean
    var dolby: Boolean
    var m4a: Boolean
    var mp3: Boolean
    var ogg: Boolean
    var opus: Boolean
    var wav: Boolean
    var webAudio: Boolean
    var webm: Boolean
}

external interface Browser {
    var chrome: Boolean
    var edge: Boolean
    var firefox: Boolean
    var ie: Boolean
    var mobileSafari: Boolean
    var opera: Boolean
    var safari: Boolean
    var silk: Boolean
    var trident: Boolean
    var chromeVersion: Number
    var firefoxVersion: Number
    var ieVersion: Number
    var safariVersion: Number
    var tridentVersion: Number
}

external interface CanvasFeatures {
    var supportInverseAlpha: Boolean
    var supportNewBlendModes: Boolean
}

external interface Features {
    var canvasBitBltShift: Boolean
    var canvas: Boolean
    var file: Boolean
    var fileSystem: Boolean
    var getUserMedia: Boolean
    var littleEndian: Boolean
    var localStorage: Boolean
    var pointerLock: Boolean
    var support32bit: Boolean
    var vibration: Boolean
    var webGL: Boolean
    var worker: Boolean
}

external interface Fullscreen {
    var available: Boolean
    var keyboard: Boolean
    var cancel: String
    var request: String
}

external interface Input {
    var wheelType: String
    var gamepads: Boolean
    var mspointer: Boolean
    var touch: Boolean
}

external interface OS {
    var android: Boolean
    var chromeOS: Boolean
    var cordova: Boolean
    var crosswalk: Boolean
    var desktop: Boolean
    var ejecta: Boolean
    var electron: Boolean
    var iOS: Boolean
    var iPad: Boolean
    var iPhone: Boolean
    var kindle: Boolean
    var linux: Boolean
    var macOS: Boolean
    var node: Boolean
    var nodeWebkit: Boolean
    var webApp: Boolean
    var windows: Boolean
    var windowsPhone: Boolean
    var iOSVersion: Number
    var pixelRatio: Number
}

external interface Video {
    var h264: Boolean
    var hls: Boolean
    var mp4: Boolean
    var ogg: Boolean
    var vp9: Boolean
    var webm: Boolean
}