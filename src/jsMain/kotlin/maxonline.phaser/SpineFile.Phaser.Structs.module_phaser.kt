@file:JsQualifier("Phaser.Structs")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Structs

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
import EachListCallback
import EachMapCallback
import Phaser.Events.EventEmitter
import EachSetCallback
import Phaser.Math.Vector2

external open class List<T>(parent: Any) {
    open var parent: Any
    open var list: Array<T>
    open var position: integer
    open var addCallback: Function<*>
    open var removeCallback: Function<*>
    open var _sortKey: String
    open fun add(child: T, skipCallback: Boolean = definedExternally): T
    open fun addAt(child: T, index: integer = definedExternally, skipCallback: Boolean = definedExternally): T
    open fun getAt(index: integer): T
    open fun getIndex(child: T): integer
    open fun sort(property: String, handler: Function<*> = definedExternally): Array<T>
    open fun getByName(name: String): T?
    open fun getRandom(startIndex: integer = definedExternally, length: integer = definedExternally): T?
    open fun getFirst(property: String, value: Any, startIndex: Number = definedExternally, endIndex: Number = definedExternally): T?
    open fun getAll(property: String = definedExternally, value: T = definedExternally, startIndex: integer = definedExternally, endIndex: integer = definedExternally): Array<T>
    open fun count(property: String, value: T): integer
    open fun swap(child1: T, child2: T)
    open fun moveTo(child: T, index: integer): T
    open fun remove(child: T, skipCallback: Boolean = definedExternally): T
    open fun removeAt(index: integer, skipCallback: Boolean = definedExternally): T
    open fun removeBetween(startIndex: integer = definedExternally, endIndex: integer = definedExternally, skipCallback: Boolean = definedExternally): Array<T>
    open fun removeAll(skipCallback: Boolean = definedExternally): List<T>
    open fun bringToTop(child: T): T
    open fun sendToBack(child: T): T
    open fun moveUp(child: T): T
    open fun moveDown(child: T): T
    open fun reverse(): List<T>
    open fun shuffle(): List<T>
    open fun replace(oldChild: T, newChild: T): T
    open fun exists(child: T): Boolean
    open fun setAll(property: String, value: T, startIndex: integer = definedExternally, endIndex: integer = definedExternally)
    open fun each(callback: EachListCallback<T>, context: Any = definedExternally, vararg args: Any)
    open fun shutdown()
    open fun destroy()
    open var length: integer
    open var first: T
    open var last: T
    open var next: T
    open var previous: T
}

external interface `T$15`<V> {
    @nativeGetter
    operator fun get(key: String): V?
    @nativeSetter
    operator fun set(key: String, value: V)
}

external open class Map<K, V>(elements: Array<V>) {
    open var entries: `T$15`<Any?>
    open var size: Number
    open fun set(key: K, value: V): Map<K, V>
    open fun get(key: K): V
    open fun getArray(): Array<V>
    open fun has(key: K): Boolean
    open fun delete(key: K): Map<K, V>
    open fun clear(): Map<K, V>
    open fun keys(): Array<K>
    open fun values(): Array<V>
    open fun dump()
    open fun each(callback: EachMapCallback<V>): Map<K, V>
    open fun contains(value: V): Boolean
    open fun merge(map: Map<K, V>, override: Boolean = definedExternally): Map<K, V>
}

external open class ProcessQueue<T> : EventEmitter {
    open fun add(item: T): ProcessQueue<T>
    open fun remove(item: T): ProcessQueue<T>
    open fun removeAll(): ProcessQueue<T> /* this */
    open fun update(): Array<T>
    open fun getActive(): Array<T>
    open var length: integer
    override fun destroy()
}

external open class RTree

external open class Set<T>(elements: Array<T> = definedExternally) {
    open var entries: Array<T>
    open fun set(value: T): Set<T>
    open fun get(property: String, value: T): T
    open fun getArray(): Array<T>
    open fun delete(value: T): Set<T>
    open fun dump()
    open fun each(callback: EachSetCallback<T>, callbackScope: Any = definedExternally): Set<T>
    open fun iterate(callback: EachSetCallback<T>, callbackScope: Any = definedExternally): Set<T>
    open fun iterateLocal(callbackKey: String, vararg args: Any): Set<T>
    open fun clear(): Set<T>
    open fun contains(value: T): Boolean
    open fun union(set: Set<T>): Set<T>
    open fun intersect(set: Set<T>): Set<T>
    open fun difference(set: Set<T>): Set<T>
    open var size: integer
}

external open class Size(width: Number = definedExternally, height: Number = definedExternally, aspectMode: integer = definedExternally, parent: Any = definedExternally) {
    open var aspectMode: integer
    open var aspectRatio: Number
    open var minWidth: Number
    open var minHeight: Number
    open var maxWidth: Number
    open var maxHeight: Number
    open var snapTo: Vector2
    open fun setAspectMode(value: integer = definedExternally): Size /* this */
    open fun setSnap(snapWidth: Number = definedExternally, snapHeight: Number = definedExternally): Size /* this */
    open fun setParent(parent: Any = definedExternally): Size /* this */
    open fun setMin(width: Number = definedExternally, height: Number = definedExternally): Size /* this */
    open fun setMax(width: Number = definedExternally, height: Number = definedExternally): Size /* this */
    open fun setSize(width: Number = definedExternally, height: Number = definedExternally): Size /* this */
    open fun setAspectRatio(ratio: Number): Size /* this */
    open fun resize(width: Number, height: Number = definedExternally): Size /* this */
    open fun getNewWidth(value: Number, checkParent: Boolean = definedExternally): Number
    open fun getNewHeight(value: Number, checkParent: Boolean = definedExternally): Number
    open fun constrain(width: Number = definedExternally, height: Number = definedExternally, fit: Boolean = definedExternally): Size /* this */
    open fun fitTo(width: Number = definedExternally, height: Number = definedExternally): Size /* this */
    open fun envelop(width: Number = definedExternally, height: Number = definedExternally): Size /* this */
    open fun setWidth(width: Number): Size /* this */
    open fun setHeight(height: Number): Size /* this */
    override fun toString(): String
    open fun setCSS(element: HTMLElement)
    open fun copy(destination: Size): Size
    open fun destroy()
    open var width: Number
    open var height: Number

    companion object {
        var NONE: integer
        var WIDTH_CONTROLS_HEIGHT: integer
        var HEIGHT_CONTROLS_WIDTH: integer
        var FIT: integer
        var ENVELOP: integer
    }
}