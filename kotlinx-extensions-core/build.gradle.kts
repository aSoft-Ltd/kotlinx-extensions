plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("tz.co.asoft.library")
    id("io.codearte.nexus-staging")
    signing
}

android {
    configureAndroid("src/androidMain")
    defaultConfig {
        minSdkVersion(9)
    }
}

kotlin {
    android { library() }
    jvm { library() }
    js(IR) { library() }
    val darwinTargets = listOf(
        watchosArm64(),
        watchosArm32(),
        watchosX86(),
        macosX64(),
        iosArm64(),
        iosArm32(),
        iosX64(),
        tvosArm64(),
        tvosX64()
    )

    val linuxTargets = listOf(
        linuxX64(),
    )
    sourceSets {
        val commonMain by getting {
            dependencies {
                api("org.jetbrains.kotlinx:kotlinx-serialization-json:${vers.kotlinx.serialization}")
                api("org.jetbrains.kotlinx:kotlinx-coroutines-core:${vers.kotlinx.coroutines}")
            }
        }

        val jsMain by getting {
            dependencies {
                api("org.jetbrains:kotlin-extensions:${vers.wrappers.extensions}")
                api("org.jetbrains.kotlinx:kotlinx-html:${vers.kotlinx.html}")
                api("org.jetbrains:kotlin-css:${vers.wrappers.css}")
            }
        }
    }
}

aSoftOSSLibrary(
    version = vers.asoft.kotlinx_extensions,
    description = "A bunch of helper classes, functions and extensions generally used in kotlin projects"
)