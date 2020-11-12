@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.Textures

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

external interface PixelConfig {
    var x: integer
    var y: integer
    var color: integer
    var alpha: Number
}

external interface SpriteSheetConfig {
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

external interface SpriteSheetFromAtlasConfig {
    var atlas: String
    var frame: String
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