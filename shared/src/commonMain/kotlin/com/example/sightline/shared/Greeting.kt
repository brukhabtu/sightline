package com.example.sightline.shared

class Greeting {
    fun greet(): String {
        return "Hello, ${Platform().platform}!"
    }
}

expect class Platform() {
    val platform: String
}
