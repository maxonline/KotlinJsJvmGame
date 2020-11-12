@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.Renderer.Snapshot

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

typealias SnapshotCallback = (snapshot: dynamic /* Phaser.Display.Color | HTMLImageElement */) -> Unit

external interface SnapshotState {
    var callback: SnapshotCallback
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var encoderOptions: Number?
        get() = definedExternally
        set(value) = definedExternally
    var x: integer?
        get() = definedExternally
        set(value) = definedExternally
    var y: integer?
        get() = definedExternally
        set(value) = definedExternally
    var width: integer?
        get() = definedExternally
        set(value) = definedExternally
    var height: integer?
        get() = definedExternally
        set(value) = definedExternally
    var getPixel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isFramebuffer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var bufferWidth: integer?
        get() = definedExternally
        set(value) = definedExternally
    var bufferHeight: integer?
        get() = definedExternally
        set(value) = definedExternally
}