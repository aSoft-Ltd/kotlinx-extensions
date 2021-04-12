package kotlinx.extensions

import kotlinx.css.*

inline fun CSSBuilder.centerContent() {
    textAlign = TextAlign.center
    justifyContent = JustifyContent.center
}

inline fun CSSBuilder.centerSelf() {
    justifySelf = JustifyContent.center
}

var CSSBuilder.justifyItems: JustifyContent
    inline set(value) = put("justify-items", value.toString())
    inline get() = JustifyContent.valueOf("justify-items")

var CSSBuilder.gridArea: String
    inline set(value) = put("grid-area", value)
    inline get() = declarations["grid-area"] as String

var CSSBuilder.justifySelf: JustifyContent
    inline set(value) = put("justify-self", value.toString())
    inline get() = JustifyContent.valueOf(declarations["justify-self"].toString())