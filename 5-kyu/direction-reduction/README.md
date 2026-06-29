# Directions Reduction (Kotlin)

A solution to the Codewars **5 kyu** kata: **Directions Reduction**.

## Kata Information

* **Kata:** Directions Reduction
* **Difficulty:** 5 kyu
* **Language:** Kotlin
* **Challenge Link:** https://www.codewars.com/kata/550f22f4d758534c1100025a

---

## Problem

Given an array of directions, remove adjacent pairs of opposite directions until no more reductions can be made.

Opposite directions are:

* `NORTH` ↔ `SOUTH`
* `EAST` ↔ `WEST`

A reduction may create new adjacent opposite pairs, so the process must continue until the path can no longer be simplified.

### Example

```text
["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"]
```

Step-by-step reduction:

```text
["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"]
↓
["SOUTH", "EAST", "WEST", "NORTH", "WEST"]
↓
["SOUTH", "NORTH", "WEST"]
↓
["WEST"]
```

Result:

```text
["WEST"]
```

---

## Approach

1. Convert the input array into a mutable list.
2. Traverse the list while checking adjacent directions.
3. If two neighboring directions are opposites, remove both.
4. Restart the scan from the beginning after a reduction.
5. Continue until no more opposite pairs exist.
6. Convert the final list back to an array.

This approach repeatedly simplifies the route until the shortest possible path remains.

---


## Complexity Analysis

### Time Complexity

Worst case: **O(n²)**

The algorithm may restart scanning from the beginning after each reduction.

### Space Complexity

**O(n)**

A mutable copy of the original array is created.

---

## What I Learned

While solving this kata, I practiced:

* Working with Kotlin arrays and mutable lists
* Removing elements safely while iterating
* Handling index shifts after deletions
* Converting between `Array` and `MutableList`
* Debugging `IndexOutOfBoundsException`
* Understanding how repeated reductions affect adjacent elements

---

## Author

**Language:** Kotlin

**Completed:** June 28, 2026
