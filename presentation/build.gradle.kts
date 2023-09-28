plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.multiplatform)
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
                implementation(projects.domain)

                implementation(libs.navigation.screens.viewmodel)
                implementation(libs.kotlin.serialization.json)
                implementation(libs.koin.core)
                implementation(libs.koin.compose)
                implementation(compose.material3)
            }
        }
        getByName("androidMain") {
            dependencies {
                implementation(libs.koin.android)
                implementation(libs.koin.android.compose)
            }
        }
        create("nonAndroidMain") {
            dependsOn(getByName("commonMain"))
            getByName("iosMain").dependsOn(this)
        }
        create("desktopMain") {
            getByName("jvmMain").dependsOn(this)
            dependsOn(getByName("nonAndroidMain"))
            dependencies {
                implementation(libs.navigation.windows)
            }
        }
        getByName("iosMain") {
            dependsOn(getByName("nonAndroidMain"))
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
