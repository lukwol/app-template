package io.github.lukwol.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
