package org.cardenascode

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform