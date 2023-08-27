package io.github.lukwol.app.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import io.github.lukwol.app.App
import io.github.lukwol.app.initialSetup

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initialSetup()

        setContent {
            App()
        }
    }
}
