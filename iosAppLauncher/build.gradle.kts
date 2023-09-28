plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.multiplatform)
}

kotlin {
    @Suppress("OPT_IN_USAGE")
    targetHierarchy.default()

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "launcher"
        }
    }

    sourceSets {
        getByName("iosMain") {
            dependencies {
                implementation(projects.data)
                implementation(projects.domain)
                implementation(projects.presentation)

                implementation(libs.koin.core)
                implementation(libs.koin.compose)
                implementation(compose.material3)
            }
        }
        getByName("iosTest") {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}
