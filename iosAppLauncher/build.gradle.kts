plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.multiplatform)
}

kotlin {
    applyDefaultHierarchyTemplate()

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
        iosMain {
            dependencies {
                implementation(projects.data)
                implementation(projects.domain)
                implementation(projects.presentation)

                implementation(platform(libs.koin.bom.get()))
                implementation(libs.koin.core)
                implementation(libs.koin.compose)
                implementation(compose.material3)
            }
        }
        iosTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}
