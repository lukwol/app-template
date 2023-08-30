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

                implementation(compose.material3)
                implementation(libs.navigation.screens.viewmodel)
                implementation(libs.kotlin.serialization.json)
                implementation(libs.koin.core)
                implementation(libs.koin.compose)
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
        }
        getByName("iosMain") {
            dependsOn(getByName("nonAndroidMain"))
        }
        getByName("commonTest") {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        create("composeUiTest") {
            dependsOn(getByName("commonTest"))
            dependencies {
                implementation(compose.desktop.uiTestJUnit4)
            }
        }
        getByName("androidInstrumentedTest") {
            dependsOn(getByName("composeUiTest"))
            dependencies {
                implementation(libs.test.runner.android)
            }
        }
        create("desktopTest") {
            dependsOn(getByName("composeUiTest"))
            getByName("jvmTest").dependsOn(this)
            dependencies {
                implementation(compose.desktop.currentOs)
            }
        }
        getByName("iosTest")
    }
}

android {
    namespace = "${BuildConstants.Group}.presentation"
    compileSdk = BuildConstants.Android.CompileSdk
    defaultConfig {
        minSdk = BuildConstants.Android.MinSdk
        testInstrumentationRunner = BuildConstants.Android.TestInstrumentationRunner
    }

    compileOptions {
        sourceCompatibility = BuildConstants.JavaVersion
        targetCompatibility = BuildConstants.JavaVersion
    }

    dependencies {
        debugImplementation(libs.compose.ui.test.manifest.android)
    }
}
