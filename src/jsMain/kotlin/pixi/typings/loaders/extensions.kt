package pixi.typings.loaders

import pixi.typings.app.IApplicationOptions
import pixi.typings.core.Resource
import pixi.typings.core.Texture

inline var ILoaderResource.texture: Texture<Resource>
	get() = asDynamic().texture as Texture<Resource>
	set(value) {
		asDynamic().texture = value
	}

inline var IApplicationOptions.sharedLoader: Boolean?
	get() = asDynamic().sharedLoader as? Boolean
	set(value) {
		asDynamic().sharedLoader = value
	}
