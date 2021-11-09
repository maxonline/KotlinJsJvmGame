package pixi.typings.text_bitmap

import pixi.typings.loaders.IResourceMetadata
import pixi.typings.loaders.LoaderResource

external interface IBitmapFontResource {
	var bitmapFont: BitMapFont
}

inline var LoaderResource.bitmapFont: BitMapFont?
	get() = asDynamic().bitmapFont as? BitMapFont
	set(value) {
		asDynamic().bitmapFont = value
	}

external interface IBitmapFontResourceMetadata {
	var pageFile: String
}

inline var IResourceMetadata.pageFile: String?
	get() = asDynamic().pageFile as? String
	set(value) {
		asDynamic().pageFile = value
	}