package kotlinx.extensions

import org.w3c.dom.Element
import org.w3c.dom.HTMLElement
import kotlinx.browser.document

class UIID private constructor(val value: String) {
    companion object {
        private val ids by lazy { mutableListOf<String>() }
        fun getId(name: String = "view"): UIID {
            return if (!ids.contains(name) && document.body?.find<Element>(By.id(name)) == null) {
                UIID(name)
            } else {
                val guess = "$name-id-${(1000000..9999999).random()}"
                if (!ids.contains(guess) && document.body?.find<Element>(By.id(guess)) == null) {
                    UIID(guess)
                } else {
                    getId(name)
                }
            }
        }
    }

    init {
        ids.add(value)
    }

    fun release() {
        ids.remove(value)
    }

    fun <T : HTMLElement> get() = document.body?.find<T>(By.id(value)) ?: throw Exception("Element with ID $value not found")
}