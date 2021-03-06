package kotlinx.extensions.actions

class Action<T>(val name: String, val handler: (obj: T) -> Unit) {
    inline operator fun invoke(obj: T) = handler(obj)
}