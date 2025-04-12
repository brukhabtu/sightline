# Contributing to Sightline

Welcome! This repo implements a cross-platform visibility tracking SDK using Kotlin Multiplatform.

## Structure
- Shared logic lives in `shared/`
- Platform-specific implementations are in `androidMain`, `iosMain`, and `jsMain`
- Test apps for Android, iOS, and Web are in sibling directories

## How to Contribute
1. Pick an issue from the GitHub Issues list.
2. Ensure it’s assigned to you (or self-assign if allowed).
3. Follow the implementation plan in `sightline_kmp_plan.md`.
4. Make your changes.
5. Use `scripts/push-and-watch.sh` to commit, push, and wait for CI.
6. Only open a PR once the script confirms success.

## For LLM Agents
- Always follow milestone order.
- Do not open PRs with failing CI.
- Use only defined scripts unless instructed otherwise.
