package kotlinx.extensions.serialization

import kotlinx.serialization.json.Json

val Json by lazy { Json { ignoreUnknownKeys = true; isLenient = true } }