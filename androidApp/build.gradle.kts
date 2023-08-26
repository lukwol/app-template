plugins {
    id("com.android.application")
    kotlin("android")
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
        kotlinCompilerExtensionVersion = "1.4.7"
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
    implementation("androidx.compose.ui:ui:1.4.3")
    implementation("androidx.compose.ui:ui-tooling:1.4.3")
    implementation("androidx.compose.ui:ui-tooling-preview:1.4.3")
    implementation("androidx.compose.foundation:foundation:1.4.3")
    implementation("androidx.compose.material:material:1.4.3")
    implementation("androidx.activity:activity-compose:1.7.1")
}
