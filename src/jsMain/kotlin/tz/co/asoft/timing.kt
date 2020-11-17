package tz.co.asoft

import kotlinx.browser.window

fun afterTimeout(timeout: Int, callback: () -> Unit) = window.setTimeout(callback, timeout)