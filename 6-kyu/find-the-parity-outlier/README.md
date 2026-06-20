# Find The Parity Outlier (Kotlin)

**Codewars:** 6 kyu
**Language:** Kotlin
**Completed:** 2026-06-15

This repository contains my solution to the Codewars kata **“Find The Parity Outlier”** (6 kyu).

Problem link: https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/kotlin

---

## 🧠 Problem Description

You are given an array of integers where:

- All numbers are mostly **even with one odd outlier**,  
  OR  
- Mostly **odd with one even outlier**

The task is to find and return the single outlier.

---

## 🚀 Approach

The solution uses a simple two-pass strategy:

1. Iterate through the array and count:
   - Even numbers
   - Odd numbers

2. Determine which group is the minority:
   - If `oddNumCount == 1`, the outlier is odd
   - Otherwise, the outlier is even

3. Use Kotlin’s `first {}` function to extract the outlier efficiently.

---

## ⏱ Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

## 🧾 Key Concepts

- Parity checking using `% 2`
- Counting occurrences in a single pass
- Conditional logic based on frequency
- Kotlin standard library function `first {}`

---

## ▶️ Example Usage

```kotlin
fun main() {
    println(find(arrayOf(2, 6, 8, -10, 3))) 
    // Output: 3

    println(find(arrayOf(206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781)))
    // Output: 206847684
}