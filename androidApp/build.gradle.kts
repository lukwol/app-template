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
    implementation(project(":app"))
}
