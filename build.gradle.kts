plugins {
    id("com.android.library") version "4.1.0"
    kotlin("multiplatform") version "1.4.10"
    id("tz.co.asoft.library") version "0.0.7"
    id("io.codearte.nexus-staging") version "0.22.0"
    signing
}

repositories {
    publicRepos()
}

object vers{
    object asoft {
        val kotlinx_extensions = "0.0.1"
    }
    object kotlinx {
        val html = "0.7.2"
    }
    object wrappers {
        val extensions = "1.0.1-pre.129-kotlin-1.4.10"
        val css = "1.0.0-pre.129-kotlin-1.4.10"
    }
}

android {
    configureAndroid("src/androidMain")
    defaultConfig {
        minSdkVersion(9)
    }
}

kotlin {
    universalLib()
    sourceSets {
        val commonMain by getting {
            dependencies {
                api("org.jetbrains.kotlinx:kotlinx-serialization-json:${versions.kotlinx.serialization}")
                api("org.jetbrains.kotlinx:kotlinx-coroutines-core:${versions.kotlinx.coroutines}")
            }
        }

        val commonTest by getting {
            dependencies {
                api(asoft("test","1.0.1"))
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

aSoftLibrary(
    version = vers.asoft.kotlinx_extensions,
    description = "A bunch of helper classes, functions and extensions generally used in kotlin projects"
)