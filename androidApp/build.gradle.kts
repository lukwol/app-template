plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "${BuildConstants.Group}.app.android"
    compileSdk = BuildConstants.Android.CompileSdk
    defaultConfig {
        applicationId = BuildConstants.Android.ApplicationId
        minSdk = BuildConstants.Android.MinSdk
        targetSdk = BuildConstants.Android.TargetSdk
        versionCode = BuildConstants.VersionCode
        versionName = BuildConstants.VersionName
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = BuildConstants.JavaVersion
        targetCompatibility = BuildConstants.JavaVersion
    }
    kotlinOptions {
        jvmTarget = BuildConstants.JvmTarget
    }
}

dependencies {
    implementation(projects.app)

    implementation(libs.compose.activity.android)
    implementation(libs.compose.material3.android)
    implementation(libs.navigation.screens.viewmodel)
    implementation(libs.compose.foundation.android)
    implementation(libs.compose.ui.android)
    implementation(libs.compose.preview.android)
    implementation(libs.compose.ui.tooling.android)
}
