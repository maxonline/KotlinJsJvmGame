@file:JsModule("@pixi/filter-noise")

package pixi.typings.filter_noise

import pixi.typings.core.Filter

open external class NoiseFilter(noise: Number = definedExternally, seed: Number = definedExternally) : Filter {
	open var noise: Number
	open var seed: Number
}

