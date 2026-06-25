# RGB to Hex Conversion (Kotlin)

A solution to the Codewars **5 kyu** kata: **RGB To Hex Conversion**.

## Kata Information

- **Kata:** RGB To Hex Conversion
- **Difficulty:** 5 kyu
- **Language:** Kotlin
- **Challenge Link:** https://www.codewars.com/kata/513e08acc600c94f01000001/kotlin

## Problem

The goal is to convert RGB decimal values into a hexadecimal color representation.

### Rules

- Each RGB component (`r`, `g`, `b`) must be represented by **two hexadecimal characters**.
- Values less than `0` must be treated as `0`.
- Values greater than `255` must be treated as `255`.
- The final result should be a 6-character hexadecimal string.

### Examples

| RGB Input | Hex Output |
|------------|------------|
| (0, 0, 0) | `000000` |
| (255, 255, 255) | `FFFFFF` |
| (255, 255, 300) | `FFFFFF` |
| (148, 0, 211) | `9400D3` |
| (173, 255, 47) | `ADFF2F` |

---

## My Approach

1. Clamp each RGB value into the valid range of `0..255` using Kotlin's `coerceIn()`.
2. Convert each component into hexadecimal by:
   - Dividing by `16` to get the first digit.
   - Using modulo (`% 16`) to get the second digit.
3. Replace decimal values `10-15` with hexadecimal characters `A-F`.
4. Combine all six hexadecimal digits into a single string.

This solution manually performs the hexadecimal conversion rather than relying on built-in formatting functions.

---


## Complexity Analysis

| Operation | Complexity |
|------------|------------|
| Clamping values | O(1) |
| Hex conversion | O(1) |
| Building result | O(1) |

**Time Complexity:** `O(1)`

**Space Complexity:** `O(1)`

---

## What I Learned

While solving this kata, I practiced:

- Working with number systems (decimal → hexadecimal)
- Using `coerceIn()` for boundary validation
- Kotlin collections and transformations
- Mapping numeric values to hexadecimal characters
- Building solutions without relying on built-in formatting helpers

---

## Author

**Kotlin solution by:** GitHub Repository Owner

**Completed:** June 23, 2026