@file:JsQualifier("Phaser.Time")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Time

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
import Phaser.Scene
import Phaser.Scenes.Systems
import Phaser.Types.Time.TimerEventConfig

external open class Clock(scene: Scene) {
    open var scene: Scene
    open var systems: Systems
    open var now: Number
    open var timeScale: Number
    open var paused: Boolean
    open fun addEvent(config: TimerEventConfig): TimerEvent
    open fun delayedCall(delay: Number, callback: Function<*>, args: Array<Any> = definedExternally, callbackScope: Any = definedExternally): TimerEvent
    open fun clearPendingEvents(): Clock
    open fun removeAllEvents(): Clock
    open fun preUpdate(time: Number, delta: Number)
    open fun update(time: Number, delta: Number)
}

external open class TimerEvent(config: TimerEventConfig) {
    open var delay: Number
    open var repeat: Number
    open var repeatCount: Number
    open var loop: Boolean
    open var callback: Function<*>
    open var callbackScope: Any?
    open var args: Array<Any>
    open var timeScale: Number
    open var startAt: Number
    open var elapsed: Number
    open var paused: Boolean
    open var hasDispatched: Boolean
    open fun reset(config: TimerEventConfig): TimerEvent
    open fun getProgress(): Number
    open fun getOverallProgress(): Number
    open fun getRepeatCount(): Number
    open fun getElapsed(): Number
    open fun getElapsedSeconds(): Number
    open fun remove(dispatchCallback: Boolean = definedExternally)
    open fun destroy()
}