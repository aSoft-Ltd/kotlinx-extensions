package kotlinx.extensions

import org.w3c.dom.HTMLLinkElement
import org.w3c.dom.Window

fun Window.setIcon(url: String): HTMLLinkElement? {
    val link = (document.querySelector("link[rel*='icon']") ?: document.createElement("link")) as? HTMLLinkElement
    link?.apply {
        type = "image/x-icon"
        rel = "shortcut icon"
        href = url
    }
    document.head?.apply {
        link?.let { removeChild(it) }
        append(link)
    }
    return link
}