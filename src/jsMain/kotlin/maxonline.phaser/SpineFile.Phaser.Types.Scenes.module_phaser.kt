@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.Scenes

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
import Phaser.Types.Core.PhysicsConfig
import Phaser.Types.Core.LoaderConfig
import Phaser.Scene

external interface CreateSceneFromObjectConfig {
    var init: SceneInitCallback?
        get() = definedExternally
        set(value) = definedExternally
    var preload: ScenePreloadCallback?
        get() = definedExternally
        set(value) = definedExternally
    var create: SceneCreateCallback?
        get() = definedExternally
        set(value) = definedExternally
    var update: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var extend: Any?
        get() = definedExternally
        set(value) = definedExternally
//    var extend.data: Any?
//        get() = definedExternally
//        set(value) = definedExternally
}

typealias SceneCreateCallback = (data: Any?) -> Unit

typealias SceneInitCallback = (data: Any?) -> Unit

typealias ScenePreloadCallback = () -> Unit

external interface SceneTransitionConfig {
    var target: String
    var duration: integer?
        get() = definedExternally
        set(value) = definedExternally
    var sleep: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var remove: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var allowInput: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var moveAbove: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var moveBelow: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onUpdate: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var onUpdateScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var data: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$12` {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}

external interface SettingsConfig {
    var key: String?
        get() = definedExternally
        set(value) = definedExternally
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var pack: dynamic /* Boolean? | Phaser.Types.Loader.FileTypes.PackFileSection? */
        get() = definedExternally
        set(value) = definedExternally
    var cameras: dynamic /* Phaser.Types.Cameras.Scene2D.JSONCamera? | Array<Phaser.Types.Cameras.Scene2D.JSONCamera>? */
        get() = definedExternally
        set(value) = definedExternally
    var map: `T$12`?
        get() = definedExternally
        set(value) = definedExternally
    var mapAdd: `T$12`?
        get() = definedExternally
        set(value) = definedExternally
    var physics: PhysicsConfig?
        get() = definedExternally
        set(value) = definedExternally
    var loader: LoaderConfig?
        get() = definedExternally
        set(value) = definedExternally
    var plugins: dynamic /* Boolean? | Any? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SettingsObject {
    var status: Number
    var key: String
    var active: Boolean
    var visible: Boolean
    var isBooted: Boolean
    var isTransition: Boolean
    var transitionFrom: Scene
    var transitionDuration: integer
    var transitionAllowInput: Boolean
    var data: Any?
    var pack: dynamic /* Boolean | Phaser.Types.Loader.FileTypes.PackFileSection */
        get() = definedExternally
        set(value) = definedExternally
    var cameras: dynamic /* Phaser.Types.Cameras.Scene2D.JSONCamera | Array<Phaser.Types.Cameras.Scene2D.JSONCamera> */
        get() = definedExternally
        set(value) = definedExternally
    var map: `T$12`
    var physics: PhysicsConfig
    var loader: LoaderConfig
    var plugins: dynamic /* Boolean | Any */
        get() = definedExternally
        set(value) = definedExternally
}