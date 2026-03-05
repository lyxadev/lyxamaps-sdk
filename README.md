<p align="center">
  <img src="https://raw.githubusercontent.com/lyxadev/lyxamaps-sdk/main/lyxamaps.jpg" alt="LyxaMaps+Engine Logo" width="150" height="150">
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
