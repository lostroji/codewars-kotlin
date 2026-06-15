# Multiplication Table

**Codewars:** 6 kyu
**Language:** Kotlin
**Completed:** 2026-06-15

## Problem Summary

Generate an `n × n` multiplication table and return it as an `Array<IntArray>`.

Example for `n = 3`:

```text
[
  [1, 2, 3],
  [2, 4, 6],
  [3, 6, 9]
]
```

## Approach

My initial idea was to build the table row by row.

For each number from `1` to `size`, I generated a row containing its multiples. Each row was stored in an `IntArray`, and all rows were collected into an `Array<IntArray>` representing the complete multiplication table.

The solution uses nested loops:

* The outer loop determines the current multiplier.
* The inner loop generates all multiples for that row.
* Each completed row is inserted into the final table.

## Complexity

* **Time Complexity:** O(n²)
* **Space Complexity:** O(n²)

Every cell in the table is generated exactly once.

## What I Learned

My first implementation used mutable lists and converted them to arrays afterward. While debugging, I discovered that reusing the same list across iterations caused every row to contain values from previous rows.

After fixing the issue, I learned how to work directly with `IntArray` and `Array<IntArray>`, which better matched the kata requirements.

I also discovered a more concise Kotlin solution using array constructors and index-based calculations:

```kotlin
(row + 1) * (column + 1)
```

Although my original solution uses explicit loops, solving this kata helped me understand that some problems become much simpler when you think about the value of each individual element rather than the steps required to build the entire structure.
