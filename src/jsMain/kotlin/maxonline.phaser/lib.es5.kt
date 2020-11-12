@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package tsstdlib

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

external interface PropertyDescriptor {
    var configurable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enumerable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var value: Any?
        get() = definedExternally
        set(value) = definedExternally
    var writable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    val get: (() -> Any)?
    val set: ((v: Any) -> Unit)?
}

external interface PropertyDescriptorMap {
    @nativeGetter
    operator fun get(s: String): PropertyDescriptor?
    @nativeSetter
    operator fun set(s: String, value: PropertyDescriptor)
}

external interface Object {
    var constructor: Function<*>
    override fun toString(): String
    fun toLocaleString(): String
    fun valueOf(): Any
    fun hasOwnProperty(v: String): Boolean
    fun hasOwnProperty(v: Number): Boolean
    fun hasOwnProperty(v: Any): Boolean
    fun isPrototypeOf(v: Any): Boolean
    fun propertyIsEnumerable(v: String): Boolean
    fun propertyIsEnumerable(v: Number): Boolean
    fun propertyIsEnumerable(v: Any): Boolean
}

external interface ObjectConstructor {
    fun <T, U> assign(target: T, source: U): T /* T & U */
    fun <T, U, V> assign(target: T, source1: U, source2: V): T /* T & U & V */
    fun <T, U, V, W> assign(target: T, source1: U, source2: V, source3: W): T /* T & U & V & W */
    fun assign(target: Any?, vararg sources: Any): Any
    fun getOwnPropertySymbols(o: Any): Array<Any>
    fun keys(o: Any): Array<String>
    fun `is`(value1: Any, value2: Any): Boolean
    fun setPrototypeOf(o: Any, proto: Any?): Any
    @nativeInvoke
    operator fun invoke(): Any
    @nativeInvoke
    operator fun invoke(value: Any): Any
    var prototype: Any
    fun getPrototypeOf(o: Any): Any
    fun getOwnPropertyDescriptor(o: Any, p: String): PropertyDescriptor?
    fun getOwnPropertyDescriptor(o: Any, p: Number): PropertyDescriptor?
    fun getOwnPropertyDescriptor(o: Any, p: Any): PropertyDescriptor?
    fun getOwnPropertyNames(o: Any): Array<String>
    fun create(o: Any?): Any
    fun create(o: Any?, properties: PropertyDescriptorMap /* PropertyDescriptorMap & ThisType<Any> */): Any
    fun defineProperty(o: Any, p: String, attributes: PropertyDescriptor /* PropertyDescriptor & ThisType<Any> */): Any
    fun defineProperty(o: Any, p: Number, attributes: PropertyDescriptor /* PropertyDescriptor & ThisType<Any> */): Any
    fun defineProperty(o: Any, p: Any, attributes: PropertyDescriptor /* PropertyDescriptor & ThisType<Any> */): Any
    fun defineProperties(o: Any, properties: PropertyDescriptorMap /* PropertyDescriptorMap & ThisType<Any> */): Any
    fun <T> seal(o: T): T
    fun <T> freeze(a: Array<T>): Array<T>
    fun <T : Function<*>> freeze(f: T): dynamic
    fun <T> preventExtensions(o: T): T
    fun isSealed(o: Any): Boolean
    fun isFrozen(o: Any): Boolean
    fun isExtensible(o: Any): Boolean
    fun keys(o: Any?): Array<String>
}

external interface FunctionConstructor {
    @nativeInvoke
    operator fun invoke(vararg args: String): Function<*>
    var prototype: Function<*>
}

external interface StringConstructor {
    fun fromCodePoint(vararg codePoints: Number): String
    fun raw(template: Array<String>, vararg substitutions: Any): String
    @nativeInvoke
    operator fun invoke(value: Any = definedExternally): String
    var prototype: String
    fun fromCharCode(vararg codes: Number): String
}

external interface NumberConstructor {
    var EPSILON: Number
    fun isFinite(number: Any): Boolean
    fun isInteger(number: Any): Boolean
    fun isNaN(number: Any): Boolean
    fun isSafeInteger(number: Any): Boolean
    var MAX_SAFE_INTEGER: Number
    var MIN_SAFE_INTEGER: Number
    fun parseFloat(string: String): Number
    fun parseInt(string: String, radix: Number = definedExternally): Number
    @nativeInvoke
    operator fun invoke(value: Any = definedExternally): Number
    var prototype: Number
    var MAX_VALUE: Number
    var MIN_VALUE: Number
    var NaN: Number
    var NEGATIVE_INFINITY: Number
    var POSITIVE_INFINITY: Number
}

typealias TemplateStringsArray = Array<String>

external interface Math {
    fun fround(n: Number): Number
    fun clz32(x: Number): Number
    fun imul(x: Number, y: Number): Number
    fun sign(x: Number): Number
    fun log10(x: Number): Number
    fun log2(x: Number): Number
    fun log1p(x: Number): Number
    fun expm1(x: Number): Number
    fun cosh(x: Number): Number
    fun sinh(x: Number): Number
    fun tanh(x: Number): Number
    fun acosh(x: Number): Number
    fun asinh(x: Number): Number
    fun atanh(x: Number): Number
    fun hypot(vararg values: Number): Number
    fun trunc(x: Number): Number
    fun cbrt(x: Number): Number
    var E: Number
    var LN10: Number
    var LN2: Number
    var LOG2E: Number
    var LOG10E: Number
    var PI: Number
    var SQRT1_2: Number
    var SQRT2: Number
    fun abs(x: Number): Number
    fun acos(x: Number): Number
    fun asin(x: Number): Number
    fun atan(x: Number): Number
    fun atan2(y: Number, x: Number): Number
    fun ceil(x: Number): Number
    fun cos(x: Number): Number
    fun exp(x: Number): Number
    fun floor(x: Number): Number
    fun log(x: Number): Number
    fun max(vararg values: Number): Number
    fun min(vararg values: Number): Number
    fun pow(x: Number, y: Number): Number
    fun random(): Number
    fun round(x: Number): Number
    fun sin(x: Number): Number
    fun sqrt(x: Number): Number
    fun tan(x: Number): Number
}

external interface DateConstructor {
    @nativeInvoke
    operator fun invoke(): String
    var prototype: Date
    fun parse(s: String): Number
    fun UTC(year: Number, month: Number, date: Number = definedExternally, hours: Number = definedExternally, minutes: Number = definedExternally, seconds: Number = definedExternally, ms: Number = definedExternally): Number
    fun now(): Number
}

typealias RegExpMatchArray = Array<String>

typealias RegExpExecArray = Array<String>

external interface RegExpConstructor {
    @nativeInvoke
    operator fun invoke(pattern: RegExp, flags: String = definedExternally): RegExp
    @nativeInvoke
    operator fun invoke(pattern: RegExp): RegExp
    @nativeInvoke
    operator fun invoke(pattern: String, flags: String = definedExternally): RegExp
    @nativeInvoke
    operator fun invoke(pattern: String): RegExp
    var prototype: RegExp
    var `$1`: String
    var `$2`: String
    var `$3`: String
    var `$4`: String
    var `$5`: String
    var `$6`: String
    var `$7`: String
    var `$8`: String
    var `$9`: String
    var lastMatch: String
}

external interface ErrorConstructor {
    @nativeInvoke
    operator fun invoke(message: String = definedExternally): Error
    var prototype: Error
}

external interface ConcatArray<T> {
    var length: Number
    @nativeGetter
    operator fun get(n: Number): T?
    @nativeSetter
    operator fun set(n: Number, value: T)
    fun join(separator: String = definedExternally): String
    fun slice(start: Number = definedExternally, end: Number = definedExternally): Array<T>
}

external interface ArrayConstructor {
    fun <T> from(iterable: Iterable<T>): Array<T>
    fun <T> from(iterable: ArrayLike<T>): Array<T>
    fun <T, U> from(iterable: Iterable<T>, mapfn: (v: T, k: Number) -> U, thisArg: Any = definedExternally): Array<U>
    fun <T, U> from(iterable: Iterable<T>, mapfn: (v: T, k: Number) -> U): Array<U>
    fun <T, U> from(iterable: ArrayLike<T>, mapfn: (v: T, k: Number) -> U, thisArg: Any = definedExternally): Array<U>
    fun <T, U> from(iterable: ArrayLike<T>, mapfn: (v: T, k: Number) -> U): Array<U>
    fun <T> of(vararg items: T): Array<T>
    @nativeInvoke
    operator fun invoke(arrayLength: Number = definedExternally): Array<Any>
    @nativeInvoke
    operator fun invoke(): Array<Any>
    @nativeInvoke
    operator fun <T> invoke(arrayLength: Number): Array<T>
    @nativeInvoke
    operator fun <T> invoke(vararg items: T): Array<T>
    fun isArray(arg: Any): Boolean
    var prototype: Array<Any>
}

external interface PromiseLike<T> {
    fun then(onfulfilled: ((value: T) -> Any?)? = definedExternally, onrejected: ((reason: Any) -> Any?)? = definedExternally): PromiseLike<dynamic /* TResult1 | TResult2 */>
}

external interface ArrayLike<T> {
    var length: Number
    @nativeGetter
    operator fun get(n: Number): T?
    @nativeSetter
    operator fun set(n: Number, value: T)
}

typealias Readonly<T> = Any

typealias Record<K, T> = Any

external interface ThisType<T>

external interface ArrayBufferTypes {
    var ArrayBuffer: ArrayBuffer
}

external interface ArrayBufferConstructor {
    var prototype: ArrayBuffer
    fun isView(arg: Any): Boolean
}

external interface DataViewConstructor

external interface Int8ArrayConstructor {
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally, thisArg: Any = definedExternally): Int8Array
    fun from(arrayLike: Iterable<Number>): Int8Array
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally): Int8Array
    var prototype: Int8Array
    var BYTES_PER_ELEMENT: Number
    fun of(vararg items: Number): Int8Array
    fun from(arrayLike: ArrayLike<Number>): Int8Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number, thisArg: Any = definedExternally): Int8Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number): Int8Array
}

external interface Uint8ArrayConstructor {
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally, thisArg: Any = definedExternally): Uint8Array
    fun from(arrayLike: Iterable<Number>): Uint8Array
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally): Uint8Array
    var prototype: Uint8Array
    var BYTES_PER_ELEMENT: Number
    fun of(vararg items: Number): Uint8Array
    fun from(arrayLike: ArrayLike<Number>): Uint8Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number, thisArg: Any = definedExternally): Uint8Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number): Uint8Array
}

external interface Uint8ClampedArrayConstructor {
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally, thisArg: Any = definedExternally): Uint8ClampedArray
    fun from(arrayLike: Iterable<Number>): Uint8ClampedArray
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally): Uint8ClampedArray
    var prototype: Uint8ClampedArray
    var BYTES_PER_ELEMENT: Number
    fun of(vararg items: Number): Uint8ClampedArray
    fun from(arrayLike: ArrayLike<Number>): Uint8ClampedArray
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number, thisArg: Any = definedExternally): Uint8ClampedArray
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number): Uint8ClampedArray
}

external interface Int16ArrayConstructor {
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally, thisArg: Any = definedExternally): Int16Array
    fun from(arrayLike: Iterable<Number>): Int16Array
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally): Int16Array
    var prototype: Int16Array
    var BYTES_PER_ELEMENT: Number
    fun of(vararg items: Number): Int16Array
    fun from(arrayLike: ArrayLike<Number>): Int16Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number, thisArg: Any = definedExternally): Int16Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number): Int16Array
}

external interface Uint16ArrayConstructor {
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally, thisArg: Any = definedExternally): Uint16Array
    fun from(arrayLike: Iterable<Number>): Uint16Array
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally): Uint16Array
    var prototype: Uint16Array
    var BYTES_PER_ELEMENT: Number
    fun of(vararg items: Number): Uint16Array
    fun from(arrayLike: ArrayLike<Number>): Uint16Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number, thisArg: Any = definedExternally): Uint16Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number): Uint16Array
}

external interface Int32ArrayConstructor {
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally, thisArg: Any = definedExternally): Int32Array
    fun from(arrayLike: Iterable<Number>): Int32Array
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally): Int32Array
    var prototype: Int32Array
    var BYTES_PER_ELEMENT: Number
    fun of(vararg items: Number): Int32Array
    fun from(arrayLike: ArrayLike<Number>): Int32Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number, thisArg: Any = definedExternally): Int32Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number): Int32Array
}

external interface Uint32ArrayConstructor {
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally, thisArg: Any = definedExternally): Uint32Array
    fun from(arrayLike: Iterable<Number>): Uint32Array
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally): Uint32Array
    var prototype: Uint32Array
    var BYTES_PER_ELEMENT: Number
    fun of(vararg items: Number): Uint32Array
    fun from(arrayLike: ArrayLike<Number>): Uint32Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number, thisArg: Any = definedExternally): Uint32Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number): Uint32Array
}

external interface Float32ArrayConstructor {
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally, thisArg: Any = definedExternally): Float32Array
    fun from(arrayLike: Iterable<Number>): Float32Array
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally): Float32Array
    var prototype: Float32Array
    var BYTES_PER_ELEMENT: Number
    fun of(vararg items: Number): Float32Array
    fun from(arrayLike: ArrayLike<Number>): Float32Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number, thisArg: Any = definedExternally): Float32Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number): Float32Array
}

external interface Float64ArrayConstructor {
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally, thisArg: Any = definedExternally): Float64Array
    fun from(arrayLike: Iterable<Number>): Float64Array
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally): Float64Array
    var prototype: Float64Array
    var BYTES_PER_ELEMENT: Number
    fun of(vararg items: Number): Float64Array
    fun from(arrayLike: ArrayLike<Number>): Float64Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number, thisArg: Any = definedExternally): Float64Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number): Float64Array
}