#!/bin/bash
set -e

# Config
REPO="brukhabtu/sightline"
BRANCH="main"
COMMIT_MSG="${1:-chore: update}"

# Step 1: Commit and push
echo "[1/3] Committing changes..."
git add .
git commit -m "$COMMIT_MSG" || echo "No changes to commit"
echo "[2/3] Pushing to $BRANCH..."
git push origin "$BRANCH"

# Step 3: Wait for GitHub Actions
echo "[3/3] Waiting for GitHub Actions to start..."
sleep 5
RUN_ID=$(gh run list --repo "$REPO" --limit 1 --json databaseId -q '.[0].databaseId')
echo "Watching workflow run ID $RUN_ID..."
gh run watch "$RUN_ID" --repo "$REPO"

# Final result
STATUS=$(gh run view "$RUN_ID" --repo "$REPO" --json conclusion -q '.conclusion')
echo "Final Status: $STATUS"
if [[ "$STATUS" != "success" ]]; then
  echo "Workflow failed or did not succeed. Exiting with error."
  exit 1
fi
