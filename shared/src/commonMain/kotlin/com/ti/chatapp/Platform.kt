package com.ti.chatapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform