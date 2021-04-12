package kotlinx.extensions

import org.w3c.dom.ImageBitmap
import org.w3c.dom.ImageBitmapOptions
import org.w3c.dom.ImageBitmapSource
import org.w3c.dom.WindowOrWorkerGlobalScope
import org.w3c.fetch.RequestInit
import org.w3c.fetch.Response
import kotlin.js.Promise

external val globalThis: WindowOrWorkerGlobalScope

external fun setTimeout(handler: () -> Unit, timeout: Int = definedExternally, vararg arguments: Any?): Int
external fun clearTimeout(handle: Int = definedExternally)
external fun setInterval(handler: () -> Unit, timeout: Int = definedExternally, vararg arguments: Any?): Int
external fun clearInterval(handle: Int = definedExternally)
external fun createImageBitmap(
    image: ImageBitmapSource,
    options: ImageBitmapOptions = definedExternally
): Promise<ImageBitmap>

external fun createImageBitmap(
    image: ImageBitmapSource,
    sx: Int,
    sy: Int,
    sw: Int,
    sh: Int,
    options: ImageBitmapOptions = definedExternally
): Promise<ImageBitmap>

external fun fetch(input: dynamic, init: RequestInit = definedExternally): Promise<Response>