package pixi.typings.mixin_get_global_position

import pixi.typings.display.DisplayObject
import pixi.typings.math.Point

inline fun DisplayObject.getGlobalPosition(point: Point, skipUpdate: Boolean): Point =
	asDynamic().getGlobalPosition(point, skipUpdate) as Point

inline fun DisplayObject.getGlobalPosition(point: Point): Point = asDynamic().getGlobalPosition(point) as Point
inline fun DisplayObject.getGlobalPosition(): Point = asDynamic().getGlobalPosition() as Point