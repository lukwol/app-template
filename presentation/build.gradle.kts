plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.kotlin.serialization)
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
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

                implementation(compose.runtime)
                implementation(compose.ui)
                implementation(compose.material)
                implementation(libs.navigation.screens)
                implementation(libs.kotlin.serialization.json)
            }
        }
        getByName("commonTest") {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

android {
    namespace = "${BuildConstants.Group}.presentation"
    compileSdk = BuildConstants.Android.CompileSdk
    defaultConfig {
        minSdk = BuildConstants.Android.MinSdk
    }

    compileOptions {
        sourceCompatibility = BuildConstants.JavaVersion
        targetCompatibility = BuildConstants.JavaVersion
    }
}
