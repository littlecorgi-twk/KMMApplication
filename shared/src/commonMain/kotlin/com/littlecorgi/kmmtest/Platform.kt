package com.littlecorgi.kmmtest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
