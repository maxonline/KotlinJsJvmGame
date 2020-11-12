@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.Loader

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

external interface FileConfig {
    var type: String
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var path: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var responseType: String? /* "" | "arraybuffer" | "blob" | "document" | "json" | "text" */
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: dynamic /* Phaser.Types.Loader.XHRSettingsObject? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var config: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface XHRSettingsObject {
    var responseType: String /* "" | "arraybuffer" | "blob" | "document" | "json" | "text" */
    var async: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var user: String?
        get() = definedExternally
        set(value) = definedExternally
    var password: String?
        get() = definedExternally
        set(value) = definedExternally
    var timeout: integer?
        get() = definedExternally
        set(value) = definedExternally
    var headers: Any?
        get() = definedExternally
        set(value) = definedExternally
    var header: String?
        get() = definedExternally
        set(value) = definedExternally
    var headerValue: String?
        get() = definedExternally
        set(value) = definedExternally
    var requestedWith: String?
        get() = definedExternally
        set(value) = definedExternally
    var overrideMimeType: String?
        get() = definedExternally
        set(value) = definedExternally
    var withCredentials: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}