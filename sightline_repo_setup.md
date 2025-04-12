# Sightline GitHub Repository Setup Guide

## Repository Structure

\`\`\`
sightline/
├── shared/                  # KMP shared logic
│   ├── src/commonMain/
│   ├── src/androidMain/
│   ├── src/iosMain/
│   ├── src/jsMain/
│   └── build.gradle.kts
├── android-app/            # Test app for Android
├── ios-app/                # Test app for iOS
├── web-app/                # Test harness for Web
├── build.gradle.kts
└── settings.gradle.kts
\`\`\`

## GitHub Labels

### Type Labels (\`type:\`)
- \`type: bug\`
- \`type: enhancement\`
- \`type: documentation\`
- \`type: question\`

### Status Labels (\`status:\`)
- \`status: needs triage\`
- \`status: in progress\`
- \`status: blocked\`
- \`status: ready for review\`
- \`status: done\`

### Priority Labels (\`priority:\`)
- \`priority: high\`
- \`priority: medium\`
- \`priority: low\`

### Platform Labels (\`platform:\`)
- \`platform: android\`
- \`platform: ios\`
- \`platform: web\`
- \`platform: shared\`

### Contributor Label
- \`good first issue\`

## Milestones
- **Phase 1: CI/CD and Project Setup**
- **Phase 2: Android Integration**
- **Phase 3: iOS Integration**
- **Phase 4: Web Integration**

## Implementation Steps

1. **Create Labels**
   - Go to the repository's "Labels" section and add the labels listed above.
   
2. **Establish Milestones**
   - Create milestones for each phase of the implementation plan.

3. **Assign Labels and Milestones**
   - Apply relevant labels and milestones to all issues and PRs for visibility and clarity.

4. **Review and Update Regularly**
   - Periodically update issue statuses, milestone completion percentages, and reassign labels if needed.

## Optional Automations
- Automate label creation using [GitHub Label Sync tools](https://github.com/marketplace/actions/github-label-sync).
- Automate milestone tracking using GitHub Actions or [project boards](https://docs.github.com/en/issues/planning-and-tracking-with-projects).
- Use [semantic-release](https://github.com/semantic-release/semantic-release) or similar tools for automated versioning and changelog generation.

This setup will ensure clear tracking, reproducible CI builds, and an organized developer workflow for the Sightline SDK project.
