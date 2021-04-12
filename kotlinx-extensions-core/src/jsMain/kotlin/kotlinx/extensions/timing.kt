package kotlinx.extensions

fun afterTimeout(timeout: Int, callback: () -> Unit) = setTimeout(callback, timeout)