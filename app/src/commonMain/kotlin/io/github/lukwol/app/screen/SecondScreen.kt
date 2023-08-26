package io.github.lukwol.app.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.lukwol.app.AppRoutes
import io.github.lukwol.navigation.screens.LocalScreensController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondScreen(args: String?) {
    val screensController = LocalScreensController.current

    val firstText = args
        .orEmpty()
        .ifEmpty { "No text passed" }

    var secondText by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
    ) {
        Text(firstText)

        Spacer(Modifier.height(20.dp))

        TextField(
            value = secondText,
            placeholder = {
                Text("Type something else...")
            },
            onValueChange = { secondText = it },
        )

        Spacer(Modifier.height(20.dp))

        Button(
            onClick = {
                screensController.pop()
            },
        ) {
            Text("Go back")
        }

        Spacer(Modifier.height(20.dp))

        Button(
            onClick = {
                screensController.push(
                    route = AppRoutes.ThirdScreenRoute,
                    args = listOf(firstText, secondText),
                )
            },
        ) {
            Text("Go to third screen")
        }
    }
}