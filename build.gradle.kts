import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.util.capitalizeDecapitalize.toLowerCaseAsciiOnly

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.compose.multiplatform) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.kotlinter) apply false
    alias(libs.plugins.dependency.updates)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.layout.buildDirectory)
}

allprojects {
    apply {
        plugin("org.jmailen.kotlinter")
    }

    tasks.withType<KotlinCompile> {
        compilerOptions {
            if (project.findProperty("enableComposeCompilerReports") == "true") {
                val destinationDir = project.layout.buildDirectory.asFile.get().absolutePath + "/compose_metrics"
                freeCompilerArgs.addAll(
                    listOf(
                        "-P",
                        "plugin:androidx.compose.compiler.plugins.kotlin:reportsDestination=$destinationDir",
                        "-P",
                        "plugin:androidx.compose.compiler.plugins.kotlin:metricsDestination=$destinationDir"
                    )
                )
            }
        }
    }
}

tasks.withType<DependencyUpdatesTask> {
    rejectVersionIf {
        val version = candidate.version.toLowerCaseAsciiOnly()

        listOf("-alpha", "-beta", "-rc")
            .any { it in version }
    }
}
