plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.serialization)
}

kotlin {
    @Suppress("OPT_IN_USAGE")
    targetHierarchy.default()

    jvm()

    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = BuildConstants.JvmTarget
            }
        }
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        getByName("commonMain") {
            dependencies {
                implementation(projects.domain)

                implementation(libs.coroutines.core)
                implementation(libs.kotlin.serialization.json)
                implementation(libs.koin.core)
            }
        }
        getByName("commonTest") {
            dependencies {
                implementation(libs.coroutines.test)
                implementation(kotlin("test"))
            }
        }
        getByName("androidInstrumentedTest") {
            dependencies {
                implementation(libs.test.runner.android)
            }
        }
    }
}

android {
    namespace = "${BuildConstants.Group}.data"
    compileSdk = BuildConstants.Android.CompileSdk
    defaultConfig {
        minSdk = BuildConstants.Android.MinSdk
        testInstrumentationRunner = BuildConstants.Android.TestInstrumentationRunner
    }

    compileOptions {
        sourceCompatibility = BuildConstants.JavaVersion
        targetCompatibility = BuildConstants.JavaVersion
    }
}
