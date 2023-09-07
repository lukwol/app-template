plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.serialization)
}

kotlin {
    @Suppress("OPT_IN_USAGE")
    targetHierarchy.default()

    jvm()

    androidTarget()

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        getByName("commonMain") {
            dependencies {
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
    }
}

android {
    namespace = "${BuildConstants.Group}.domain"
    compileSdk = BuildConstants.Android.CompileSdk
    defaultConfig {
        minSdk = BuildConstants.Android.MinSdk
    }

    compileOptions {
        sourceCompatibility = BuildConstants.JavaVersion
        targetCompatibility = BuildConstants.JavaVersion
    }
}
