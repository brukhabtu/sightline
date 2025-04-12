#!/bin/bash
set -e

echo "Verifying shared Kotlin code..."
./gradlew clean build allTests

echo "Building Android test app..."
./gradlew :android-app:assembleDebug

echo "Building JS bundle..."
./gradlew jsBrowserProductionWebpack

echo "All verifications passed!"
