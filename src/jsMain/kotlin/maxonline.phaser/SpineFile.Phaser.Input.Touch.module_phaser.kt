@file:JsQualifier("Phaser.Input.Touch")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Input.Touch

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
import Phaser.Input.InputManager

external open class TouchManager(inputManager: InputManager) {
    open var manager: InputManager
    open var capture: Boolean
    open var enabled: Boolean
    open var target: Any
    open var onTouchStart: Function<*>
    open var onTouchStartWindow: Function<*>
    open var onTouchMove: Function<*>
    open var onTouchEnd: Function<*>
    open var onTouchEndWindow: Function<*>
    open var onTouchCancel: Function<*>
    open var onTouchCancelWindow: Function<*>
    open var onTouchOver: Function<*>
    open var onTouchOut: Function<*>
    open fun disableContextMenu(): TouchManager /* this */
    open fun startListeners()
    open fun stopListeners()
    open fun destroy()
}