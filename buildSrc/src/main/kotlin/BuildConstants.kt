import org.gradle.api.JavaVersion.VERSION_17

object BuildConstants {
    const val Group = "io.github.lukwol"
    const val VersionCode = 1
    const val VersionName = "1.0.0"
    const val JvmTarget = "17"
    val JavaVersion = VERSION_17

    object Android {
        const val ApplicationId = "$Group.app.android"
        const val MinSdk = 29
        const val TargetSdk = 34
        const val CompileSdk = TargetSdk
    }
}
