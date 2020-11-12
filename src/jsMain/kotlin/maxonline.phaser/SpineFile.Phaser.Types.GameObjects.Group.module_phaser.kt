@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.GameObjects.Group

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
import Phaser.GameObjects.GameObject
import integer
import Phaser.Types.Input.HitAreaCallback

typealias GroupCallback = (item: GameObject) -> Unit

external interface GroupConfig {
    var classType: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var maxSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var defaultKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var defaultFrame: dynamic /* String? | integer? */
        get() = definedExternally
        set(value) = definedExternally
    var runChildUpdate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var createCallback: GroupCallback?
        get() = definedExternally
        set(value) = definedExternally
    var removeCallback: GroupCallback?
        get() = definedExternally
        set(value) = definedExternally
    var createMultipleCallback: GroupMultipleCreateCallback?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GroupCreateConfig {
    var classType: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var key: dynamic /* String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var frame: dynamic /* String? | Array<String>? | integer? | Array<integer>? */
        get() = definedExternally
        set(value) = definedExternally
    var quantity: integer?
        get() = definedExternally
        set(value) = definedExternally
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var repeat: integer?
        get() = definedExternally
        set(value) = definedExternally
    var randomKey: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var randomFrame: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var yoyo: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var frameQuantity: integer?
        get() = definedExternally
        set(value) = definedExternally
    var max: integer?
        get() = definedExternally
        set(value) = definedExternally
    var setXY: Any?
        get() = definedExternally
        set(value) = definedExternally
//    var setXY.x: Number?
//        get() = definedExternally
//        set(value) = definedExternally
//    var setXY.y: Number?
//        get() = definedExternally
//        set(value) = definedExternally
//    var setXY.stepX: Number?
//        get() = definedExternally
//        set(value) = definedExternally
//    var setXY.stepY: Number?
//        get() = definedExternally
//        set(value) = definedExternally
    var setRotation: Any?
        get() = definedExternally
        set(value) = definedExternally
//    var setRotation.value: Number?
//        get() = definedExternally
//        set(value) = definedExternally
//    var setRotation.step: Number?
//        get() = definedExternally
//        set(value) = definedExternally
    var setScale: Any?
        get() = definedExternally
        set(value) = definedExternally
//    var setScale.x: Number?
//        get() = definedExternally
//        set(value) = definedExternally
//    var setScale.y: Number?
//        get() = definedExternally
//        set(value) = definedExternally
//    var setScale.stepX: Number?
//        get() = definedExternally
//        set(value) = definedExternally
//    var setScale.stepY: Number?
//        get() = definedExternally
//        set(value) = definedExternally
    var setAlpha: Any?
        get() = definedExternally
        set(value) = definedExternally
//    var setAlpha.value: Number?
//        get() = definedExternally
//        set(value) = definedExternally
//    var setAlpha.step: Number?
//        get() = definedExternally
//        set(value) = definedExternally
    var setDepth: Any?
        get() = definedExternally
        set(value) = definedExternally
//    var setDepth.value: Number?
//        get() = definedExternally
//        set(value) = definedExternally
//    var setDepth.step: Number?
//        get() = definedExternally
//        set(value) = definedExternally
    var setScrollFactor: Any?
        get() = definedExternally
        set(value) = definedExternally
//    var setScrollFactor.x: Number?
//        get() = definedExternally
//        set(value) = definedExternally
//    var setScrollFactor.y: Number?
//        get() = definedExternally
//        set(value) = definedExternally
//    var setScrollFactor.stepX: Number?
//        get() = definedExternally
//        set(value) = definedExternally
//    var setScrollFactor.stepY: Number?
//        get() = definedExternally
//        set(value) = definedExternally
    var hitArea: Any?
        get() = definedExternally
        set(value) = definedExternally
    var hitAreaCallback: HitAreaCallback?
        get() = definedExternally
        set(value) = definedExternally
    var gridAlign: dynamic /* Boolean? | Phaser.Types.Actions.GridAlignConfig? */
        get() = definedExternally
        set(value) = definedExternally
}

typealias GroupMultipleCreateCallback = (items: Array<GameObject>) -> Unit