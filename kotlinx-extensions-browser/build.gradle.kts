plugins {
    kotlin("js")
    id("tz.co.asoft.library")
    id("io.codearte.nexus-staging")
    signing
}

kotlin {
    js(IR) { browserLib() }
    sourceSets {
        val main by getting {
            dependencies {
                api(project(":kotlinx-extensions-core"))
                api("org.jetbrains.kotlinx:kotlinx-coroutines-core:${vers.kotlinx.coroutines}")
                api("org.jetbrains:kotlin-extensions:${vers.wrappers.extensions}")
                api("org.jetbrains.kotlinx:kotlinx-html:${vers.kotlinx.html}")
                api("org.jetbrains:kotlin-css:${vers.wrappers.css}")
            }
        }
    }
}
//
//aSoftOSSLibrary(
//    version = vers.asoft.kotlinx_extensions,
//    description = "A bunch of helper classes, functions and extensions generally used in kotlin for browser projects"
//)