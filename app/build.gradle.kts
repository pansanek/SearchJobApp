plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "ru.potemkin.searchjobapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "ru.potemkin.searchjobapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
dependencies {
    implementation(project(":messages"))
    implementation(project(":favourite"))
    implementation(project(":buildConf"))
    implementation(project(":responces"))
    implementation(project(":core"))
    implementation(project(":shared"))
    implementation(project(":profile"))
    implementation(project(":home:main"))
    implementation(project(":home:search"))
}

