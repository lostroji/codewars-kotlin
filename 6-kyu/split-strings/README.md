# Split Strings

**Kata:** Split Strings
**Rank:** 6 kyu
**Language:** Kotlin

## Description

Complete the solution so that the function splits the string into pairs of two characters.

If the string contains an odd number of characters, the final pair should be completed with an underscore (`_`).

### Examples

```text
"abc"    -> ["ab", "c_"]
"abcdef" -> ["ab", "cd", "ef"]
```

## Solution

The implementation first checks whether the input string has an odd length. If so, an underscore is appended to make the length even. The string is then split into chunks of two characters using Kotlin's `chunked()` function.

## Complexity

* Time Complexity: O(n)
* Space Complexity: O(n)
