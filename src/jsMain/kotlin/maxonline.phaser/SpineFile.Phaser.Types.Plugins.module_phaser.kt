@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.Plugins

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

external interface CorePluginContainer {
    var key: String
    var plugin: Function<*>
    var mapping: String?
        get() = definedExternally
        set(value) = definedExternally
    var custom: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CustomPluginContainer {
    var key: String
    var plugin: Function<*>
}

external interface GlobalPlugin {
    var key: String
    var plugin: Function<*>
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var mapping: String?
        get() = definedExternally
        set(value) = definedExternally
}