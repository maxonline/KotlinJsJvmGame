package pixi.typings.core

import org.khronos.webgl.ArrayBuffer
import pixi.typings.IIndexed
import pixi.typings.Indexed
import pixi.typings.VarArgFun

typealias ImageSource = Any
typealias IArrayBuffer = ArrayBuffer
typealias IRenderingContext = WebGL2RenderingContext
typealias IRendererPlugins = Indexed<String, Any>
typealias IResourcePluginOptions = Indexed<String, Any>

@JsModule("@pixi/core")
open external class ITypedArray : IArrayBuffer, IIndexed<Number, Number> {
	open val length: Number
	override operator fun get(key: Number): Number
	override operator fun set(key: Number, value: Number)
	open val BYTES_PER_ELEMENT: Number
}

typealias UniformsSyncCallback = VarArgFun<Any, Any>
typealias UniformsSyncCallback_2 = VarArgFun<Any, Any>