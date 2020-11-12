@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.GameObjects.PathFollower

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

external interface PathConfig {
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var from: Number?
        get() = definedExternally
        set(value) = definedExternally
    var to: Number?
        get() = definedExternally
        set(value) = definedExternally
    var positionOnPath: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rotateToPath: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rotationOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startAt: Number?
        get() = definedExternally
        set(value) = definedExternally
}