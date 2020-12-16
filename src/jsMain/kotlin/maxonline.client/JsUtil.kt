package maxonline.client

import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.events.MouseEvent

inline fun Element.requestPointerLock(): Unit = asDynamic().requestPointerLock()
inline fun Document.hasPointerLock() = asDynamic().pointerLockElement != null
inline fun MouseEvent.movementX() = asDynamic().movementX as Double
inline fun MouseEvent.movementY() = asDynamic().movementY as Double