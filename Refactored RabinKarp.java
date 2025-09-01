Refactored RabinKarp.java:

Removed interactive Scanner input from main()

Converted method to search(String text, String pattern) returning List<Integer> instead of printing

Improved edge case handling (empty/null strings, text shorter than pattern)

Removed magic number q = 101 → replaced with a constant PRIME = 101

Reduced variable scope for readability

Added unit tests in RabinKarpTest.java using JUnit 5:

✅ Basic match test

✅ No match test

✅ Multiple matches test

✅ Empty string handling

📈 Benefits

Code is now reusable, testable, and production-friendly

Matches the repo’s non-interactive algorithm style

Unit tests improve reliability and future maintainability

✅ Checklist

 Code compiles without errors

 JUnit tests added and passing

 Documentation/comments updated for clarity

 Follows existing repo style and guidelines

💡 Commit Message
refactor: improve Rabin-Karp algorithm and add JUnit tests

- Removed console input and printing
- Refactored search method to return List<Integer>
- Added null/empty string handling
- Added unit tests for multiple scenarios
- Improved readability and maintainability
