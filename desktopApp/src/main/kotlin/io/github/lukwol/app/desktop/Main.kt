package io.github.lukwol.app.desktop

import androidx.compose.ui.window.singleWindowApplication
import io.github.lukwol.app.App
import io.github.lukwol.app.initialSetup

fun main() {
    initialSetup()

    singleWindowApplication {
        App()
    }
}
