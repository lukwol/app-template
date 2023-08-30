package io.github.lukwol.app

import androidx.compose.ui.test.hasSetTextAction
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class AppTest {

    @get:Rule
    val compose = createComposeRule()

    @Before
    fun setUp() {
        initialSetup()
        compose.setContent { App() }
    }

    @Test
    fun exampleNavigationTest() {
        with(compose) {
            onNode(hasSetTextAction()).apply {
                performTextInput("FooBar")
                hasText("FooBar")
            }
            onNodeWithText("Go to second screen").apply {
                assertExists()
                performClick()
            }

            onNodeWithText("Go back").assertExists()
            onNodeWithText("Go to third screen").assertExists()
        }
    }
}
