@file:JsQualifier("Phaser.Events")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Events

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

external open class EventEmitter {
    open fun shutdown()
    open fun destroy()
    open fun eventNames(): Array<dynamic /* String | Any */>
    open fun listeners(event: String): Array<Function<*>>
    open fun listeners(event: Any): Array<Function<*>>
    open fun listenerCount(event: String): Number
    open fun listenerCount(event: Any): Number
    open fun emit(event: String, vararg args: Any): Boolean
    open fun emit(event: Any, vararg args: Any): Boolean
    open fun on(event: String, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */
    open fun on(event: String, fn: Function<*>): EventEmitter /* this */
    open fun on(event: Any, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */
    open fun on(event: Any, fn: Function<*>): EventEmitter /* this */
    open fun addListener(event: String, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */
    open fun addListener(event: String, fn: Function<*>): EventEmitter /* this */
    open fun addListener(event: Any, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */
    open fun addListener(event: Any, fn: Function<*>): EventEmitter /* this */
    open fun once(event: String, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */
    open fun once(event: String, fn: Function<*>): EventEmitter /* this */
    open fun once(event: Any, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */
    open fun once(event: Any, fn: Function<*>): EventEmitter /* this */
    open fun removeListener(event: String, fn: Function<*> = definedExternally, context: Any = definedExternally, once: Boolean = definedExternally): EventEmitter /* this */
    open fun removeListener(event: String): EventEmitter /* this */
    open fun removeListener(event: String, fn: Function<*> = definedExternally): EventEmitter /* this */
    open fun removeListener(event: String, fn: Function<*> = definedExternally, context: Any = definedExternally): EventEmitter /* this */
    open fun removeListener(event: Any, fn: Function<*> = definedExternally, context: Any = definedExternally, once: Boolean = definedExternally): EventEmitter /* this */
    open fun removeListener(event: Any): EventEmitter /* this */
    open fun removeListener(event: Any, fn: Function<*> = definedExternally): EventEmitter /* this */
    open fun removeListener(event: Any, fn: Function<*> = definedExternally, context: Any = definedExternally): EventEmitter /* this */
    open fun off(event: String, fn: Function<*> = definedExternally, context: Any = definedExternally, once: Boolean = definedExternally): EventEmitter /* this */
    open fun off(event: String): EventEmitter /* this */
    open fun off(event: String, fn: Function<*> = definedExternally): EventEmitter /* this */
    open fun off(event: String, fn: Function<*> = definedExternally, context: Any = definedExternally): EventEmitter /* this */
    open fun off(event: Any, fn: Function<*> = definedExternally, context: Any = definedExternally, once: Boolean = definedExternally): EventEmitter /* this */
    open fun off(event: Any): EventEmitter /* this */
    open fun off(event: Any, fn: Function<*> = definedExternally): EventEmitter /* this */
    open fun off(event: Any, fn: Function<*> = definedExternally, context: Any = definedExternally): EventEmitter /* this */
    open fun removeAllListeners(event: String = definedExternally): EventEmitter /* this */
    open fun removeAllListeners(): EventEmitter /* this */
    open fun removeAllListeners(event: Any = definedExternally): EventEmitter /* this */
}