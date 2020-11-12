@file:JsQualifier("Phaser.Tweens")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Tweens

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
import Phaser.Types.Tweens.Event
import Phaser.Types.Tweens.TweenBuilderConfig
import Phaser.Events.EventEmitter
import Phaser.Types.Tweens.TweenDataConfig
import Phaser.Scene
import Phaser.Scenes.Systems
import Phaser.Types.Tweens.TimelineBuilderConfig
import Phaser.Types.Tweens.NumberTweenBuilderConfig
import Phaser.Types.Tweens.StaggerConfig

external open class Timeline(manager: TweenManager) : EventEmitter {
    open var manager: TweenManager
    open var isTimeline: Boolean
    open var data: Array<Any>
    open var totalData: Number
    open var useFrames: Boolean
    open var timeScale: Number
    open var loop: Number
    open var loopDelay: Number
    open var loopCounter: Number
    open var completeDelay: Number
    open var countdown: Number
    open var state: integer
    open var paused: Boolean
    open var elapsed: Number
    open var totalElapsed: Number
    open var duration: Number
    open var progress: Number
    open var totalDuration: Number
    open var totalProgress: Number
    open var callbacks: Any?
    open var callbackScope: Any
    open fun dispatchTimelineEvent(event: Event, callback: Function<*>)
    open fun setTimeScale(value: Number): Timeline /* this */
    open fun getTimeScale(): Number
    open fun isPlaying(): Boolean
    open fun add(config: TweenBuilderConfig?): Timeline /* this */
    open fun add(config: Any?): Timeline /* this */
    open fun queue(tween: Tween): Timeline /* this */
    open fun hasOffset(tween: Tween): Boolean
    open fun isOffsetAbsolute(value: Number): Boolean
    open fun isOffsetRelative(value: String): Boolean
    open fun getRelativeOffset(value: String, base: Number): Number
    open fun calcDuration()
    open fun init(): Boolean
    open fun resetTweens(resetFromLoop: Boolean)
    open fun setCallback(type: String, callback: Function<*>, params: Array<Any> = definedExternally, scope: Any? = definedExternally): Timeline /* this */
    open fun makeActive(tween: Tween): TweenManager
    open fun play()
    open fun nextState()
    open fun update(timestamp: Number, delta: Number): Boolean
    open fun stop()
    open fun pause(): Timeline /* this */
    open fun resume(): Timeline /* this */
    open fun hasTarget(target: Any?): Boolean
    override fun destroy()
}

external var CREATED: integer

external var INIT: integer

external var DELAY: integer

external var OFFSET_DELAY: integer

external var PENDING_RENDER: integer

external var PLAYING_FORWARD: integer

external var PLAYING_BACKWARD: integer

external var HOLD_DELAY: integer

external var REPEAT_DELAY: integer

external var COMPLETE: integer

external var PENDING_ADD: integer

external var PAUSED: integer

external var LOOP_DELAY: integer

external var ACTIVE: integer

external var COMPLETE_DELAY: integer

external var PENDING_REMOVE: integer

external var REMOVED: integer

external open class Tween : EventEmitter {
    constructor(parent: TweenManager, data: Array<TweenDataConfig>, targets: Array<Any>)
    constructor(parent: Timeline, data: Array<TweenDataConfig>, targets: Array<Any>)
    open var parent: dynamic /* Phaser.Tweens.TweenManager | Phaser.Tweens.Timeline */
    open var parentIsTimeline: Boolean
    open var data: Array<TweenDataConfig>
    open var totalData: integer
    open var targets: Array<Any?>
    open var totalTargets: integer
    open var useFrames: Boolean
    open var timeScale: Number
    open var loop: Number
    open var loopDelay: Number
    open var loopCounter: Number
    open var startDelay: Number
    open var hasStarted: Boolean
    open var isSeeking: Boolean
    open var completeDelay: Number
    open var countdown: Number
    open var offset: Number
    open var calculatedOffset: Number
    open var state: integer
    open var paused: Boolean
    open var elapsed: Number
    open var totalElapsed: Number
    open var duration: Number
    open var progress: Number
    open var totalDuration: Number
    open var totalProgress: Number
    open var callbacks: Any?
    open var callbackScope: Any
    open fun getValue(index: integer = definedExternally): Number
    open fun setTimeScale(value: Number): Tween /* this */
    open fun getTimeScale(): Number
    open fun isPlaying(): Boolean
    open fun isPaused(): Boolean
    open fun hasTarget(target: Any?): Boolean
    open fun updateTo(key: String, value: Any, startToCurrent: Boolean = definedExternally): Tween /* this */
    open fun restart(): Tween /* this */
    open fun calcDuration()
    open fun init(): Boolean
    open fun makeActive()
    open fun nextState()
    open fun pause(): Tween /* this */
    open fun play(resetFromTimeline: Boolean = definedExternally): Tween /* this */
    open fun resetTweenData(resetFromLoop: Boolean)
    open fun resume(): Tween /* this */
    open fun seek(toPosition: Number, delta: Number = definedExternally): Tween /* this */
    open fun setCallback(type: String, callback: Function<*>, params: Array<Any> = definedExternally, scope: Any = definedExternally): Tween /* this */
    open fun complete(delay: Number = definedExternally): Tween /* this */
    open fun remove(): Tween /* this */
    open fun stop(resetTo: Number = definedExternally): Tween /* this */
    open fun update(timestamp: Number, delta: Number): Boolean
    open fun dispatchTweenDataEvent(event: Event, callback: Function<*>, tweenData: TweenDataConfig)
    open fun dispatchTweenEvent(event: Event, callback: Function<*>)
    open fun setStateFromEnd(tween: Tween, tweenData: TweenDataConfig, diff: Number): integer
    open fun setStateFromStart(tween: Tween, tweenData: TweenDataConfig, diff: Number): integer
    open fun updateTweenData(tween: Tween, tweenData: TweenDataConfig, delta: Number): Boolean
}

external fun TweenData(target: Any, index: integer, key: String, getEnd: Function<*>, getStart: Function<*>, getActive: Function<*>, ease: Function<*>, delay: Number, duration: Number, yoyo: Boolean, hold: Number, repeat: Number, repeatDelay: Number, flipX: Boolean, flipY: Boolean): TweenDataConfig

external open class TweenManager(scene: Scene) {
    open var scene: Scene
    open var systems: Systems
    open var timeScale: Number
    open fun createTimeline(config: TimelineBuilderConfig = definedExternally): Timeline
    open fun timeline(config: TimelineBuilderConfig = definedExternally): Timeline
    open fun create(config: TweenBuilderConfig?): Tween
    open fun create(config: Any?): Tween
    open fun add(config: TweenBuilderConfig?): Tween
    open fun add(config: Any?): Tween
    open fun existing(tween: Tween): TweenManager
    open fun addCounter(config: NumberTweenBuilderConfig): Tween
    open fun stagger(value: Number, config: StaggerConfig): Function<*>
    open fun stagger(value: Array<Number>, config: StaggerConfig): Function<*>
    open fun preUpdate()
    open fun update(timestamp: Number, delta: Number)
    open fun remove(tween: Tween): TweenManager
    open fun makeActive(tween: Tween): TweenManager
    open fun each(callback: Function<*>, scope: Any? = definedExternally, vararg args: Any)
    open fun getAllTweens(): Array<Tween>
    open fun getGlobalTimeScale(): Number
    open fun getTweensOf(target: Any?): Array<Tween>
    open fun getTweensOf(target: Array<Any>?): Array<Tween>
    open fun isTweening(target: Any?): Boolean
    open fun killAll(): TweenManager
    open fun killTweensOf(target: Any?): TweenManager
    open fun killTweensOf(target: Array<Any>?): TweenManager
    open fun pauseAll(): TweenManager
    open fun resumeAll(): TweenManager
    open fun setGlobalTimeScale(value: Number): TweenManager
    open fun shutdown()
    open fun destroy()
}