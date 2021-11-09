package pixi.typings.interaction

import pixi.typings.display.DisplayObject

typealias InteractionCallback = (interactionEvent: InteractionEvent, displayObject: DisplayObject, hit: Boolean?) -> Unit
typealias InteractivePointerEvent = Any /* PointerEvent | TouchEvent | MouseEvent */