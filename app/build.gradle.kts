plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "io.github.duzhaokun123.fuckcainiao"
    compileSdk = 36

    defaultConfig {
        applicationId = "io.github.duzhaokun123.fuckcainiao"
        minSdk = 24
        targetSdk = 36
        versionCode = 8
        versionName = "0.2.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            isShrinkResources = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    buildFeatures {
        buildConfig = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    packaging.resources.excludes.add("**")
}

kotlin {
    jvmToolchain(11)
}

dependencies {
    compileOnly(libs.xposed.api)
    implementation(libs.ezXHelper)

}