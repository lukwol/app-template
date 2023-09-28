package io.github.lukwol.app

import androidx.compose.ui.window.ComposeUIViewController
import org.koin.compose.KoinContext
import platform.UIKit.UIViewController

@Suppress("FunctionName", "unused")
fun MainViewController(): UIViewController {
    initialSetup()
    return ComposeUIViewController {
        KoinContext {
            App()
        }
    }
}
