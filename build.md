# Building Sightline

## Requirements
- JDK 17+
- Gradle (via wrapper)
- Android SDK
- Xcode (for iOS builds)
- Node.js (for Web target)

## Build Targets

### Android
\`\`\`bash
./gradlew :android-app:assembleDebug
\`\`\`

### iOS (via Xcode)
\`\`\`bash
./gradlew :ios-app:build
\`\`\`

### Web
\`\`\`bash
./gradlew jsBrowserProductionWebpack
\`\`\`

### Shared Tests
\`\`\`bash
./gradlew allTests
\`\`\`
