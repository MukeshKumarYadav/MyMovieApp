plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
}

android {
    namespace = "com.mukesh.mymovieapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mukesh.mymovieapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        buildConfigField("String", "API_KEY", "\"bc25d9552d048be6b200561cc242e329\"")
        buildConfigField("String","BASE_URL","\"https://api.themoviedb.org/3/\"") //
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
    buildFeatures {
        dataBinding = true
       buildConfig = true
    }
}

dependencies {
    val lifecycle_version = "2.7.0"
    val room_version = "2.6.1"
    val dagger_version = "2.51.1"
    val retrofit_version = "2.11.0"
    val glide_version = "4.16.0"
    val coroutines_version = "1.8.0"

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // ViewModel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    // LiveData
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
    // Saved state module for ViewModel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle_version")
    // Annotation processor
    //kapt "androidx.lifecycle:lifecycle-compiler:$lifecycle_version"
    implementation ("androidx.lifecycle:lifecycle-common-java8:$lifecycle_version")

    //Room
    implementation ("androidx.room:room-runtime:$room_version")
    kapt ("androidx.room:room-compiler:$room_version")
    implementation ("androidx.room:room-ktx:$room_version")

    //Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutines_version")

    //Dagger
    implementation ("com.google.dagger:dagger:$dagger_version")
    implementation ("com.google.dagger:dagger-android-support:$dagger_version")
    kapt ("com.google.dagger:dagger-android-processor:$dagger_version")
    kapt ("com.google.dagger:dagger-compiler:$dagger_version")

    //Retrofit
    implementation ("com.squareup.retrofit2:retrofit:$retrofit_version")
    implementation ("com.squareup.retrofit2:converter-gson:$retrofit_version")
    implementation ("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.6")

    //Glide
    implementation ("com.github.bumptech.glide:glide:$glide_version")
    annotationProcessor ("com.github.bumptech.glide:compiler:$glide_version")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}