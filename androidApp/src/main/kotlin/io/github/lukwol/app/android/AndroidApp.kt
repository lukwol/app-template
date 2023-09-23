package io.github.lukwol.app.android

import android.app.Application
import io.github.lukwol.app.initialSetup

class AndroidApp : Application() {

    override fun onCreate() {
        super.onCreate()

        initialSetup()
    }
}
