package com.example.sightline.shared

import kotlinx.browser.window

actual class Platform actual constructor() {
    actual val platform: String = "JavaScript (${window.navigator.userAgent})"
}
