<p align="center">
  <img src="https://lh3.googleusercontent.com/rd-gg-dl/AOI_d_8eMUjRIBoZ69W_YlZYPyuA5WQUHHcEyyZiXlorDRSquxaTrujEWo7uy0mLlmPG6ZfV3FjCo8Ro2FUj-K9oAo-mJVNRgsh7e1ODy4yNxCkewCw1BegLOvBZluyHN2hn_zUyWllWWt7EnznTzvIVT3xeX7bAyw8_oZ9jlIopnTc78nDbcF27eZVagiAbzpHxirkHf7Vm7aEsKB7SxjJYTQwU5RKjf0yjX7-nk_83jhiZGl2S7ReMCQspLXiYXZ86aIjRI1a_157CgDVIWBnB--CbttqliOgor7eGjsiJNP5fuQhuxlAIWhCoDY1aYVVlCoi3WqQBnoQZeVG_3c-YN8daAldQ-wKuTThRO919VDUwR4olkeyGbfN_tFp4dC3UVJvbh0i-XJZWXKyaGONImLwliYucBnq2aMnVvVZuCOqYROKeFjPaakrDz75E_q0tU8YyW01YqaY5jCRiFedQAmppGfbixnxw6yP5P0cfr6ESKeIP7kWKwg3j6ywdEyxEFy36TwxsyaB6dLnATvi9_VDAhnU0M3HgVcTJSrWn_R73vaG6SIA14qdVmElPCKMeryfo4ZplneK7-zhmpmvAWDHaPAyvoz8b5beCj7ctHqAg1KzueAhroFNPPqe1AQW3ZDFhFTcsoaCt-svLojcmQXbUVMEvxOOTV0piNk3FP1h3HwoXU5ut_1afqyLLZX01M1iatDNfkqLN9V_IT54AGUDds0FDrC7kLjWP2wbqb7pf8dWAi-5eeqoLq-TuwmPhkwp1q0yShKfJYKBrbkbhaVvNu-LQ4z5-mhOOZxcypKkTmu6oSbaVAM-5TSnRsCMMdmv4-SLI1QN862WiDp1cXcsUSvJP0VBDWPb0pxGEdtVlUyLpvAxJimHaezIbF9dUbBUsNbnmO3l-a5eDw5gKroGadzn9WBLPw8qprEWH1IwqrO8ucu3toWBuUgEwDsDI-Pq3ncfy4vnZsSe8TeRj8nDbD9SMHIO8im2lGtzeLErTAsAyrwAzC_ssJ-LyDFi4I-G5M86gHkVQvMQXnJWvh3pVhmRNIQSXioj6tKCNibhD29JARnjrkOy5gM-7P7FUw_1mUBP4ANl3FjNioD1Nh-R67v3z_-uZlQlZDUY2U7iGDu13Czk-btHRf4lsc4pVNJ2cJEHzuZ-A-gT0x6Bdp_hb2R2z869_UYa5cNHghP9y8j9PgbR7gTU=s1024-rj" alt="LyxaMaps Logo" width="150" height="150">
</p>

<h1 align="center">🌍 LyxaMaps SDK for Android</h1>

<p align="center">
  <strong>The Ultimate, Hyper-Optimized Mapping & Geospacial Engine for Android.</strong><br>
  <em>100% Global Coverage. Enterprise-Grade Precision. Disruptive Pricing (100x More Cost-Effective).</em>
</p>

<p align="center">
  <a href="https://android-arsenal.com/api?level=21"><img src="https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat" alt="API"></a>
  <a href="https://github.com/EVALDECODE1/lyxamaps-sdk/actions"><img src="https://img.shields.io/github/actions/workflow/status/EVALDECODE1/lyxamaps-sdk/build.yml?branch=main" alt="Build Status"></a>
  <a href="https://opensource.org/licenses/MIT"><img src="https://img.shields.io/badge/License-MIT-blue.svg" alt="License"></a>
  <a href="https://jitpack.io/#EVALDECODE1/lyxamaps-sdk"><img src="https://jitpack.io/v/EVALDECODE1/lyxamaps-sdk.svg" alt="JitPack"></a>
</p>

---

## 🚀 Overview

**LyxaMaps SDK** is a cutting-edge, vector-based mapping library engineered for the modern Android ecosystem. Built completely with **Kotlin, Coroutines, StateFlow, and Jetpack Compose**, it provides an unparalleled 60FPS rendering pipeline, minimal battery drain, and offline-first resilience.

Whether you are building a ride-hailing app, a logistics tracker, or a complex geospatial dashboard, LyxaMaps guarantees a zero-crash, highly scalable infrastructure.

### 👑 Core Capabilities

- **🗺️ Next-Gen Vector Rendering:** Hardware-accelerated map rendering using custom Vulkan/OpenGL bindings.
- **📍 Ultra-Precise Geocoding Engine:** Millisecond-latency forward and reverse geocoding with extreme accuracy.
- **🛰️ Anti-Fragile Location Tracking:** Self-correcting GPS telemetry that automatically handles Process Death, Null GPS signals, and seamless network handovers.
- **🧩 100% Jetpack Compose Native:** Fully reactive declarative UI. No legacy `AndroidView` wrappers required.
- **🔒 Enterprise Security:** End-to-end payload encryption and secure API key validation.

---

## 🏗️ Architecture Design

The SDK enforces **Clean Architecture** and **MVVM** principles natively. 
- **Data Layer:** Uses encrypted local SQLite caching for map tiles.
- **Domain Layer:** Pure Kotlin use-cases for geocoding calculations and route mapping.
- **Presentation Layer:** StateFlow driven Compose states.

---

## 📦 Installation

We distribute the SDK via JitPack. Ensure you have the repository configured in your root `settings.gradle` or `build.gradle`:

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url '[https://jitpack.io](https://jitpack.io)' }
    }
}
