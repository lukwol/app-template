package io.github.lukwol.app

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

@Suppress("FunctionName", "unused")
fun MainViewController(): UIViewController {
    initialSetup()
    return ComposeUIViewController {
        App()
    }
}
