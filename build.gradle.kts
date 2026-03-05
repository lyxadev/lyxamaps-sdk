plugins { 
    kotlin("multiplatform") version "1.9.20"
    kotlin("plugin.serialization") version "1.9.20"
    id("com.android.library") version "8.1.4"
}

kotlin { 
    androidTarget { 
        compilations.all { 
            kotlinOptions { 
                jvmTarget = "11" 
            } 
        } 
    } 
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets { 
        val commonMain by getting { 
            dependencies { 
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3") 
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0") 
                implementation("io.ktor:ktor-client-core:2.3.5") 
            } 
        } 
        val commonTest by getting { 
            dependencies { 
                implementation(kotlin("test")) 
            } 
        } 
        val androidMain by getting { 
            dependencies { 
               implementation("io.ktor:ktor-client-android:2.3.5") 
               implementation("androidx.core:core:1.12.0") 
            } 
        } 
        val iosMain by getting { 
            dependencies { 
                implementation("io.ktor:ktor-client-darwin:2.3.5") 
            } 
        } 
    } 
}

android { 
    namespace = "com.lyxamaps.sdk" 
    compileSdk = 36 
    defaultConfig { 
        minSdk = 24 
        targetSdk = 36 
    } 
}