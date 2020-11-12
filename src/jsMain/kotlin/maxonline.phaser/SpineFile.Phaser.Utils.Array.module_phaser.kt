@file:JsQualifier("Phaser.Utils.Array")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Utils.Array

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

external fun Add(array: Array<Any>, item: Any, limit: integer = definedExternally, callback: Function<*> = definedExternally, context: Any? = definedExternally): Array<Any>

external fun Add(array: Array<Any>, item: Any): Array<Any>

external fun Add(array: Array<Any>, item: Any, limit: integer = definedExternally): Array<Any>

external fun Add(array: Array<Any>, item: Any, limit: integer = definedExternally, callback: Function<*> = definedExternally): Array<Any>

external fun Add(array: Array<Any>, item: Array<Any>, limit: integer = definedExternally, callback: Function<*> = definedExternally, context: Any? = definedExternally): Array<Any>

external fun Add(array: Array<Any>, item: Array<Any>): Array<Any>

external fun Add(array: Array<Any>, item: Array<Any>, limit: integer = definedExternally): Array<Any>

external fun Add(array: Array<Any>, item: Array<Any>, limit: integer = definedExternally, callback: Function<*> = definedExternally): Array<Any>

external fun AddAt(array: Array<Any>, item: Any, index: integer = definedExternally, limit: integer = definedExternally, callback: Function<*> = definedExternally, context: Any? = definedExternally): Array<Any>

external fun AddAt(array: Array<Any>, item: Any): Array<Any>

external fun AddAt(array: Array<Any>, item: Any, index: integer = definedExternally): Array<Any>

external fun AddAt(array: Array<Any>, item: Any, index: integer = definedExternally, limit: integer = definedExternally): Array<Any>

external fun AddAt(array: Array<Any>, item: Any, index: integer = definedExternally, limit: integer = definedExternally, callback: Function<*> = definedExternally): Array<Any>

external fun AddAt(array: Array<Any>, item: Array<Any>, index: integer = definedExternally, limit: integer = definedExternally, callback: Function<*> = definedExternally, context: Any? = definedExternally): Array<Any>

external fun AddAt(array: Array<Any>, item: Array<Any>): Array<Any>

external fun AddAt(array: Array<Any>, item: Array<Any>, index: integer = definedExternally): Array<Any>

external fun AddAt(array: Array<Any>, item: Array<Any>, index: integer = definedExternally, limit: integer = definedExternally): Array<Any>

external fun AddAt(array: Array<Any>, item: Array<Any>, index: integer = definedExternally, limit: integer = definedExternally, callback: Function<*> = definedExternally): Array<Any>

external fun BringToTop(array: Array<Any>, item: Any): Any

external fun CountAllMatching(array: Array<Any>, property: String, value: Any, startIndex: integer = definedExternally, endIndex: integer = definedExternally): integer

external fun Each(array: Array<Any>, callback: Function<*>, context: Any?, vararg args: Any): Array<Any>

external fun EachInRange(array: Array<Any>, callback: Function<*>, context: Any?, startIndex: integer, endIndex: integer, vararg args: Any): Array<Any>

external fun FindClosestInSorted(value: Number, array: Array<Any>, key: String = definedExternally): dynamic /* Number | Any */

external fun GetAll(array: Array<Any>, property: String = definedExternally, value: Any = definedExternally, startIndex: integer = definedExternally, endIndex: integer = definedExternally): Array<Any>

external fun GetFirst(array: Array<Any>, property: String = definedExternally, value: Any = definedExternally, startIndex: integer = definedExternally, endIndex: integer = definedExternally): Any?

external fun GetRandom(array: Array<Any>, startIndex: integer = definedExternally, length: integer = definedExternally): Any

external fun MoveDown(array: Array<Any>, item: Any): Array<Any>

external fun MoveTo(array: Array<Any>, item: Any, index: integer): Any

external fun MoveUp(array: Array<Any>, item: Any): Array<Any>

external fun NumberArray(start: Number, end: Number, prefix: String = definedExternally, suffix: String = definedExternally): dynamic /* Array<Number> | Array<String> */

external fun NumberArrayStep(start: Number = definedExternally, end: Number = definedExternally, step: Number = definedExternally): Array<Number>

external fun QuickSelect(arr: Array<Any>, k: integer, left: integer = definedExternally, right: integer = definedExternally, compare: Function<*> = definedExternally)

external fun Range(a: Array<Any>, b: Array<Any>, options: Any? = definedExternally): Array<Any>

external fun Remove(array: Array<Any>, item: Any, callback: Function<*> = definedExternally, context: Any? = definedExternally): dynamic /* Any | Array<Any> */

external fun Remove(array: Array<Any>, item: Any): dynamic /* Any | Array<Any> */

external fun Remove(array: Array<Any>, item: Any, callback: Function<*> = definedExternally): dynamic /* Any | Array<Any> */

external fun Remove(array: Array<Any>, item: Array<Any>, callback: Function<*> = definedExternally, context: Any? = definedExternally): dynamic /* Any | Array<Any> */

external fun Remove(array: Array<Any>, item: Array<Any>): dynamic /* Any | Array<Any> */

external fun Remove(array: Array<Any>, item: Array<Any>, callback: Function<*> = definedExternally): dynamic /* Any | Array<Any> */

external fun RemoveAt(array: Array<Any>, index: integer, callback: Function<*> = definedExternally, context: Any? = definedExternally): Any

external fun RemoveBetween(array: Array<Any>, startIndex: integer, endIndex: integer, callback: Function<*> = definedExternally, context: Any? = definedExternally): Array<Any>

external fun RemoveRandomElement(array: Array<Any>, start: integer = definedExternally, length: integer = definedExternally): Any?

external fun Replace(array: Array<Any>, oldChild: Any, newChild: Any): Boolean

external fun RotateLeft(array: Array<Any>, total: integer = definedExternally): Any

external fun RotateRight(array: Array<Any>, total: integer = definedExternally): Any

external fun SafeRange(array: Array<Any>, startIndex: integer, endIndex: integer, throwError: Boolean = definedExternally): Boolean

external fun SendToBack(array: Array<Any>, item: Any): Any

external fun SetAll(array: Array<Any>, property: String, value: Any, startIndex: integer = definedExternally, endIndex: integer = definedExternally): Array<Any>

external fun <T> Shuffle(array: Array<T>): Array<T>

external fun SpliceOne(array: Array<Any>, index: integer): Any

external fun StableSort(arr: Array<Any>, comp: Function<*>): Array<Any>

external fun Swap(array: Array<Any>, item1: Any, item2: Any): Array<Any>