import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.compose.multiplatform)
}

compose {
    desktop {
        application {
            mainClass = "${BuildConstants.Group}.app.desktop.MainKt"

            val resourcesPath = "src/main/resources"

            nativeDistributions {
                targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
                appResourcesRootDir.set(project.layout.projectDirectory.dir(resourcesPath))

                packageName = "desktopApp"
                packageVersion = BuildConstants.VersionName

                macOS {
                    jvmArgs("-Dapple.awt.application.appearance=system")
//                    iconFile.set(project.file("$resourcesPath/icon.icns"))
                }

                windows {
//                    iconFile.set(project.file("$resourcesPath/icon.ico"))
                }

                linux {
//                    iconFile.set(project.file("$resourcesPath/icon.png"))
                }
            }

            buildTypes.release.proguard {
                configurationFiles.from(project.file("$resourcesPath/custom.pro"))
                obfuscate.set(true)
            }
        }
    }
}


dependencies {
    implementation(projects.app)
    implementation(projects.presentation)

    implementation(compose.desktop.currentOs)
    implementation(compose.material)
    implementation(libs.navigation.screens.viewmodel)
    implementation(libs.navigation.windows)
    implementation(compose.uiTooling)
    implementation(compose.preview)
}
