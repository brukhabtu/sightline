plugins {
    alias(libs.plugins.jetbrains.kotlin.multiplatform)
    alias(libs.plugins.android.library)
}

kotlin {
    androidTarget()
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    // Explicitly configure Cocoapods integration if needed later
    // cocoapods {
    //    summary = "Some description for the Shared Module"
    //    homepage = "Link to the Shared Module homepage"
    //    ios.deploymentTarget = "14.1"
    //    framework { baseName = "shared" }
    // }

    js(IR) {
        browser()
        binaries.executable()
        nodejs {
            downloadBaseUrl = "https://nodejs.org/dist/"
        }
    }

    sourceSets {
        val commonMain by getting
        val androidMain by getting {
            dependsOn(commonMain)
        }
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
        val jsMain by getting {
            dependsOn(commonMain)
        }
    }
}

android {
    namespace = "com.example.sightline.shared"
    compileSdk = 34 // Or your target SDK
    defaultConfig {
        minSdk = 21 // Or your minimum SDK
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
