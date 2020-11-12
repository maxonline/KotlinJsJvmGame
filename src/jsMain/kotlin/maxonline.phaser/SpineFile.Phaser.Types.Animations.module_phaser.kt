@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.Animations

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

external interface Animation {
    var key: String?
        get() = definedExternally
        set(value) = definedExternally
    var frames: Array<AnimationFrame>?
        get() = definedExternally
        set(value) = definedExternally
    var defaultTextureKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var frameRate: integer?
        get() = definedExternally
        set(value) = definedExternally
    var duration: integer?
        get() = definedExternally
        set(value) = definedExternally
    var skipMissedFrames: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var delay: integer?
        get() = definedExternally
        set(value) = definedExternally
    var repeat: integer?
        get() = definedExternally
        set(value) = definedExternally
    var repeatDelay: integer?
        get() = definedExternally
        set(value) = definedExternally
    var yoyo: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showOnStart: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hideOnComplete: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AnimationFrame {
    var key: String
    var frame: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GenerateFrameNames {
    var prefix: String?
        get() = definedExternally
        set(value) = definedExternally
    var start: integer?
        get() = definedExternally
        set(value) = definedExternally
    var end: integer?
        get() = definedExternally
        set(value) = definedExternally
    var suffix: String?
        get() = definedExternally
        set(value) = definedExternally
    var zeroPad: integer?
        get() = definedExternally
        set(value) = definedExternally
    var outputArray: Array<AnimationFrame>?
        get() = definedExternally
        set(value) = definedExternally
    var frames: dynamic /* Boolean? | Array<integer>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface GenerateFrameNumbers {
    var start: integer?
        get() = definedExternally
        set(value) = definedExternally
    var end: integer?
        get() = definedExternally
        set(value) = definedExternally
    var first: dynamic /* Boolean? | integer? */
        get() = definedExternally
        set(value) = definedExternally
    var outputArray: Array<AnimationFrame>?
        get() = definedExternally
        set(value) = definedExternally
    var frames: dynamic /* Boolean? | Array<integer>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface JSONAnimation {
    var key: String
    var type: String
    var frames: Array<JSONAnimationFrame>
    var frameRate: integer
    var duration: integer
    var skipMissedFrames: Boolean
    var delay: integer
    var repeat: integer
    var repeatDelay: integer
    var yoyo: Boolean
    var showOnStart: Boolean
    var hideOnComplete: Boolean
}

external interface JSONAnimationFrame {
    var key: String
    var frame: dynamic /* String | integer */
        get() = definedExternally
        set(value) = definedExternally
    var duration: Number
}

external interface JSONAnimations {
    var anims: Array<JSONAnimation>
    var globalTimeScale: Number
}