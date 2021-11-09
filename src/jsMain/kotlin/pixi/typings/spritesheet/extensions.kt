package pixi.typings.spritesheet

import pixi.typings.Indexed
import pixi.typings.core.Resource
import pixi.typings.core.Texture
import pixi.typings.loaders.LoaderResource

inline var LoaderResource.spritesheet: Spritesheet
	get() = asDynamic().spritesheet as Spritesheet
	set(value) {
		asDynamic().spritesheet = value
	}

inline var LoaderResource.textures: Indexed<String, Texture<Resource>>
	get() = asDynamic().textures as Indexed<String, Texture<Resource>>
	set(value) {
		asDynamic().textures = value
	}