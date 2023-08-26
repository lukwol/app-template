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
        mavenLocal()
    }
}

rootProject.name = "AppTemplate"
include(":androidApp")
include(":desktopApp")
include(":app")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
