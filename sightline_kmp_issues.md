# Sightline GitHub Issues (KMP SDK)

## Phase 1: CI/CD and Project Setup

### Issue: Initialize Kotlin Multiplatform Project
- [ ] Set up shared module with `commonMain`, `androidMain`, `iosMain`, `jsMain`
- [ ] Configure Gradle Multiplatform plugin and Kotlin version
- [ ] Confirm builds for all three targets

### Issue: Configure CI with GitHub Actions
- [ ] Set up CI workflows for Android, iOS, and JS
- [ ] Build shared module on all targets
- [ ] Run tests from `commonTest`

### Issue: Package and Publish Artifacts
- [ ] Android: create `.aar` and configure publishing to MavenCentral or GitHub Packages
- [ ] iOS: generate `XCFramework`, support CocoaPods and/or SwiftPM
- [ ] Web: bundle JS with TypeScript typings and prep NPM publishing

### Issue: Automate Versioning
- [ ] Automate version bumping on release tag
- [ ] Integrate semantic versioning or tag-based version injection

## Phase 2: Android Integration

### Issue: Implement Android VisibilitySignalProvider
- [ ] Track visibility using `ViewTreeObserver`
- [ ] Use `getGlobalVisibleRect` to compute visible area percent

### Issue: Register Views and Track
- [ ] Provide `VisibilityTracker.register(view: View, ...)` extension
- [ ] Hook into lifecycle or scroll changes to observe visibility

### Issue: Android Test App
- [ ] Build sample app with Compose + XML views
- [ ] Log view tracking events
- [ ] Validate percent thresholds and duration logic

## Phase 3: iOS Integration

### Issue: Implement iOS VisibilitySignalProvider
- [ ] Track `UIView` visibility using geometry math
- [ ] Compare frame to screen bounds to compute percent

### Issue: Swift-Friendly API
- [ ] Expose bridging API via CocoaPods or SPM
- [ ] Add `Sightline.shared.register(view:)` method

### Issue: iOS Test App
- [ ] Build UIKit and/or SwiftUI sample views
- [ ] Test different thresholds and log events

## Phase 4: Web Integration

### Issue: Implement VisibilityObserver with IntersectionObserver
- [ ] Track element visibility using `IntersectionObserver`
- [ ] Forward changes to shared state machine in Kotlin/JS

### Issue: Web Test Page
- [ ] Create HTML test harness with scrollable content
- [ ] Validate timing and percent visibility logic

### Issue: NPM Package Prep
- [ ] Package JS/TS output via `wasm` or `kotlin.js`
- [ ] Publish NPM bundle or prepare for internal registry
