package kotlinx.extensions

import kotlinx.html.CommonAttributeGroupFacade
import org.w3c.dom.Element
import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget
import org.w3c.files.File

inline val EventTarget?.value: String get() = asDynamic().value.toString()

inline val EventTarget?.files: Array<File> get() = asDynamic().files

inline fun <T : Element> EventTarget.to() = unsafeCast<T>()

inline fun <T> Event.targetElement(): T where T : Element, T : CommonAttributeGroupFacade {
    return target?.to<T>() ?: throw error("Can't map the event's target element")
}