package kotlinx.extensions

import org.w3c.dom.Document
import kotlin.js.Promise

external interface FontFaceSet {
    val ready: Promise<Any>
    fun check(font: String): Boolean
}

inline val Document.fonts: FontFaceSet get() = asDynamic()["fonts"]