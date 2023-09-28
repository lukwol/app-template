pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        google()
        mavenCentral()

    }
}

rootProject.name = "app-template"
include(":androidApp")
include(":desktopApp")
include(":iosAppLauncher")
include(":data")
include(":domain")
include(":presentation")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
