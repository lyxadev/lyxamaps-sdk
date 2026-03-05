<p align="center">
  <img src="https://lh3.googleusercontent.com/rd-gg-dl/AOI_d_9KvsTB-_hFP04snDZLHQgoZpMM_Plznq1dpZuCix8EofsdrpHBVysIrYer8xO3Rc8BA-1FpCg5hNMhgDDVQUcSHLxWh1aQjWhtJrMf6WmbYgJlqywxENs2rQ6qf9Cl_XL3_jr0xSzBl4UFcJUZNTLOhEyMmSvCTM5gPx_08UNgUrgUtPf-QpFeAtA92qJPydanY_xKofVPc4Vj1D24RilvBltV3v511BuwM2pVrRN-UgPZBfBrJZRc1HjwrtM2lvHw9JR9WSwXFgzJbDa2vxNB3h999webj-3PS3SwqD73O0dzZGHDZdO1bFoZveEnJpRAlxtoHRk7z2kaONgJ_T1OXBSERMVfL1ZI4WygfQ9iLL8w8Ui0OBdyjEBqMEtplQfTcJ-d5JbOsGRbnhnGKcRaRYa5S_nMqV_zyJv1ok5PTvYN_gF7yo7uUqtavxcy2FftQNF0HBubxnizI-DseZQUX0-L5Y4gyeSnIJVYhQOIDjtiap6haOpusOUrbQltrFTUXnAPd5OACs27wOL6VVn_FUGMc3cDAVHpGesFiQoySB6604cHszBCmkuzviQXGnD1_b1JI1fGpQ1C_EeSaHcLXbUsN9mgO0qInLaVMIYxYax2uZ44J2BaCcvPg5uMuQb0nPFqU-zHwv3XUQLj3EQytGtT3o6lfKzsMAI27KQGmEfIbNP6uaaMY-gJtfLk93ipOR784SlnZLsjie2SxOoJfwlOWwqBRhk-69wDKZboIEMv8ObT3Jm67fsf7P4of3a0oWXCimYOsilLBYotfQ8j7JoQ7DMBVd775GIckvuNjqjwO-5TDxbvSM1t4EXwZYC2_eovodyUsxeSJv4ArOeIDNQQ2_Ojdv8zIxgKhexRe6uVjC3UEVgQ2LSmzn_nOAGrk43-0xSE-uhrJCicZXdcAuQOrDlnCi6Gxwo3FeQkSYA9C93BypzDibsBvNfdjQLNQ0mSZzexkNwBVYoLJTCWdmgclas1hdcmGt31BYkH7Xg-APCFQ-Q5rGYj96ZIzNbEJXS-ohXI4MW6WwMuwt45KEk4pihcahDMQ-O6GZfajfVE6kIDWYpxHquvcV4yEpFgrhv79bwL4sG9mSSKHmhlsqEFvUQawIIkMrz6tWUYGv0WCYmrl_LGjQYl6eqo_e5G4xHGoRPTyk84vn7YR3VpHE-sUk0BaUHsUA0PmBkgnCGgayYWUQ=s1024-rj" alt="LyxaMaps Logo" width="150" height="150">
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
