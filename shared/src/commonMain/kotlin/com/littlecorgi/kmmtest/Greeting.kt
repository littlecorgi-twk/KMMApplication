package com.littlecorgi.kmmtest

class Greeting(private val text: String) {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!\n$text"
    }


}