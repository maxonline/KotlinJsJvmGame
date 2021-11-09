@file:Suppress("NOTHING_TO_INLINE")

package pixi.typings.mixin_cache_as_bitmap

import pixi.typings.constants.MSAA_QUALITY
import pixi.typings.core.AbstractRenderer
import pixi.typings.core.Renderer
import pixi.typings.display.DisplayObject
import pixi.typings.display.IDestroyOptions
import pixi.typings.math.Rectangle

inline var DisplayObject.cacheAsBitmap: Boolean
	get() = asDynamic().cacheAsBitmap as Boolean
	set(value) {
		asDynamic().cacheAsBitmap = value
	}
inline var DisplayObject.cacheAsBitmapResolution: Number
	get() = asDynamic().cacheAsBitmapResolution as Number
	set(value) {
		asDynamic().cacheAsBitmapResolution = value
	}
inline var DisplayObject.cacheAsBitMapMultiSample: MSAA_QUALITY
	get() = asDynamic().cacheAsBitMapMultiSample as MSAA_QUALITY
	set(value) {
		asDynamic().cacheAsBitMapMultiSample = value
	}
inline var DisplayObject._cacheAsBitmapResolution: Number
	get() = asDynamic()._cacheAsBitmapResolution as Number
	set(value) {
		asDynamic()._cacheAsBitmapResolution = value
	}
inline var DisplayObject._cacheAsBitmapMultiSample: MSAA_QUALITY
	get() = asDynamic()._cacheAsBitmapMultiSample as MSAA_QUALITY
	set(value) {
		asDynamic()._cacheAsBitmapMultiSample = value
	}
inline var DisplayObject._cacheasBitmap: Boolean
	get() = asDynamic()._cacheasBitmap as Boolean
	set(value) {
		asDynamic()._cacheasBitmap = value
	}
inline var DisplayObject._cacheData: CacheData
	get() = asDynamic()._cacheData as CacheData
	set(value) {
		asDynamic()._cacheData = value
	}

inline fun DisplayObject._renderCached(renderer: Renderer): Unit = asDynamic()._renderCached(renderer) as Unit

inline fun DisplayObject._initCachedDisplayObject(renderer: Renderer): Unit =
	asDynamic()._initCachedDisplayObject(renderer) as Unit

inline fun DisplayObject._calculateCachedBounds(): Unit = asDynamic()._calculateCachedBounds() as Unit

inline fun DisplayObject._getCachedCanvas(): Rectangle = asDynamic()._getCachedCanvas() as Rectangle

inline fun DisplayObject._renderCachedCanvas(renderer: AbstractRenderer): Unit =
	asDynamic()._renderCachedCanvas(renderer) as Unit

inline fun DisplayObject._initCachedDisplayObjectCanvas(renderer: AbstractRenderer): Unit =
	asDynamic()._initCachedDisplayObjectCanvas(renderer) as Unit

inline fun DisplayObject._destroyCachedDisplayObject(): Unit = asDynamic()._destroyCachedDisplayObject() as Unit

inline fun DisplayObject._cacheAsBitmapDestroy(options: IDestroyOptions): Unit =
	asDynamic()._cacheAsBitmapDestroy(options) as Unit

inline fun DisplayObject._cacheAsBitmapDestroy(options: Boolean): Unit = asDynamic()._cacheAsBitmapDestroy(options) as Unit

inline fun DisplayObject._cacheAsBitmapDestroy(): Unit = asDynamic()._cacheAsBitmapDestroy() as Unit