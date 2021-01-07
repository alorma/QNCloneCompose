plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdkVersion(30)

    defaultConfig {
        applicationId = "com.alorma.qnclone"

        minSdkVersion(23)
        targetSdkVersion(30)

        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        javaCompileOptions {
            annotationProcessorOptions {
                argument("room.schemaLocation", "$projectDir/schemas")
                argument("room.incremental", "true")
                argument("room.expandProjection", "true")
            }
        }
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.0-alpha09"
        kotlinCompilerVersion = "1.4.21"
    }

    buildTypes {
        named("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
        freeCompilerArgs = listOf(
            "-Xallow-jvm-ir-dependencies", "-Xskip-prerelease-check",
            "-Xuse-experimental=kotlinx.coroutines.ExperimentalCoroutinesApi"
        )
    }
}

dependencies {
    implementation(platform("org.jetbrains.kotlinx:kotlinx-coroutines-bom:1.4.1"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android")

    implementation(platform("com.google.firebase:firebase-bom:26.2.0"))
    implementation("com.google.firebase:firebase-auth-ktx")
    implementation("com.google.firebase:firebase-analytics-ktx")
    implementation("com.google.firebase:firebase-messaging-ktx")
    implementation("com.google.firebase:firebase-firestore-ktx")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.4.2")

    implementation("com.jakewharton.timber:timber:4.7.1")

    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:1.1.1")

    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.0-rc01")

    implementation("androidx.core:core-ktx:1.3.2")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("com.google.android.material:material:1.2.1")

    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0")

    implementation("org.koin:koin-android:2.2.1")
    implementation("org.koin:koin-androidx-scope:2.2.1")
    implementation("org.koin:koin-androidx-viewmodel:2.2.1")
    implementation("org.koin:koin-androidx-fragment:2.2.1")
    implementation("org.koin:koin-androidx-compose:2.2.1")
    implementation("org.koin:koin-androidx-ext:2.2.1")

    implementation("androidx.compose.ui:ui:1.0.0-alpha09")
    implementation("androidx.ui:ui-tooling:1.0.0-alpha07")
    implementation("androidx.compose.foundation:foundation:1.0.0-alpha09")
    implementation("androidx.compose.material:material:1.0.0-alpha09")
    implementation("androidx.compose.material:material-icons-core:1.0.0-alpha09")
    implementation("androidx.compose.material:material-icons-extended:1.0.0-alpha09")

    implementation("com.vanpra.compose-material-dialogs:core:0.2.8")
    implementation("com.vanpra.compose-material-dialogs:datetime:0.2.8")

    implementation("androidx.room:room-runtime:2.2.6")
    kapt("androidx.room:room-compiler:2.2.6")

    // optional - Kotlin Extensions and Coroutines support for Room
    implementation("androidx.room:room-ktx:2.2.6")

    testImplementation("junit:junit:4.13.1")
    testImplementation("io.strikt:strikt-core:0.28.1")
}