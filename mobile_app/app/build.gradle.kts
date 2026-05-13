plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
    kotlin("kapt")
}

android {

    namespace = "com.example.lecturehelper"

    compileSdk = 34

    defaultConfig {

        applicationId = "com.example.lecturehelper"

        minSdk = 26

        targetSdk = 34

        versionCode = 1

        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {

        release {

            isMinifyEnabled = false

            proguardFiles(

                getDefaultProguardFile(
                    "proguard-android-optimize.txt"
                ),

                "proguard-rules.pro"
            )
        }
    }

    compileOptions {

        sourceCompatibility =
            JavaVersion.VERSION_17

        targetCompatibility =
            JavaVersion.VERSION_17
    }

    kotlinOptions {

        jvmTarget = "17"
    }

    buildFeatures {

        compose = true
    }

    composeOptions {

        kotlinCompilerExtensionVersion =
            "1.5.14"
    }
}

dependencies {

    implementation(platform(libs.compose.bom))

    implementation(libs.compose.ui)

    implementation(libs.compose.material3)

    implementation(libs.activity.compose)

    implementation(libs.lifecycle.runtime)

    implementation(libs.lifecycle.viewmodel)

    implementation(libs.navigation.compose)

    implementation(libs.hilt.android)

    kapt(libs.hilt.compiler)

    implementation(
        libs.hilt.navigation.compose
    )

    implementation(libs.retrofit)

    implementation(libs.retrofit.gson)

    implementation(libs.okhttp)

    implementation(libs.okhttp.logging)

    implementation(libs.coroutines.core)

    implementation(libs.coroutines.android)

    implementation(libs.room.runtime)

    implementation(libs.room.ktx)

    kapt(libs.room.compiler)

    implementation(libs.work.runtime)
}