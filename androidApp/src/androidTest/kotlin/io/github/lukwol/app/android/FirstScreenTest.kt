package io.github.lukwol.app.android

import androidx.compose.ui.test.hasSetTextAction
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextClearance
import androidx.compose.ui.test.performTextInput
import io.github.lukwol.presentation.screen.first.FirstScreen
import io.github.lukwol.presentation.screen.first.FirstScreenViewModel
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class FirstScreenTest {

    @get:Rule
    val compose = createComposeRule()

    @Before
    fun setUp() {
        compose.setContent {
            FirstScreen(
                viewModel = FirstScreenViewModel().apply { text = "Foo" },
            )
        }
    }

    @Test
    fun exampleFirstScreenTest() {
        with(compose) {
            onNode(hasSetTextAction()).apply {
                hasText("Foo")
                performTextClearance()
                performTextInput("Bar")
                hasText("Bar")
            }

            onNodeWithText("Go to second screen").assertExists()
        }
    }
}
