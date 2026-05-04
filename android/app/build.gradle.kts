plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.app"

    compileSdk = 36   // 🔥 MUST (main fix)

    ndkVersion = "28.2.13676358"

    defaultConfig {
        applicationId = "com.example.app"
        minSdk = 21
        targetSdk = 36   // recommended
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            isShrinkResources = false
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

flutter {
    source = "../.."
}