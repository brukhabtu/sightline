# Sightline Kotlin Multiplatform Implementation Plan

## Phase 1: CI/CD and Project Setup
- [ ] Set up project structure using Kotlin Multiplatform Gradle plugin
- [ ] Configure targets: Android, iOS, JS (required)
- [ ] Configure CI to build shared module and test apps (Android + iOS)
- [ ] Android: build `.aar` for MavenCentral/GitHub
- [ ] iOS: produce `XCFramework` with SPM support
- [ ] Web: build NPM bundle or raw JS module (required)
- [ ] Automate version bumping and tagging

## Phase 2: Android Integration
- [ ] Implement `VisibilitySignalProvider` using `ViewTreeObserver`
- [ ] Provide extension function to register a `View`
- [ ] Add visibility detection using `getGlobalVisibleRect`
- [ ] Hook into Android lifecycle (e.g., `LifecycleObserver`)
- [ ] Build a test app using Jetpack Compose and traditional views
- [ ] Test behavior for scrollable and non-scrollable views

## Phase 3: iOS Integration
- [ ] Implement `VisibilitySignalProvider` in `iosMain` using `UIView`
- [ ] Create bridging layer via CocoaPods/SPM or direct Xcode framework
- [ ] Use Geometry comparisons (e.g., `convertRect`, `intersects`) for visibility
- [ ] Provide Swift-friendly API (e.g., `Sightline.shared.register(...)`)
- [ ] Build a UIKit and/or SwiftUI test app
- [ ] Log element view events with different thresholds

## Phase 4: Web Integration
- [ ] Set up Kotlin/JS target
- [ ] Use `IntersectionObserver` in JS/TS for DOM visibility
- [ ] Connect visibility changes to shared state machine
- [ ] Build a small HTML/JS test page
