package com.example.kmm_test

import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        val firstWord = if (Random.nextBoolean()) "Hi!" else "Hello!"
        return "$firstWord [$num] Guess what this is! > ${platform.name.reversed()}!"
    }
}