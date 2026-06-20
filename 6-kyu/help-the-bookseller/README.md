# Stock Summary Kata (Kotlin)

**Codewars:** 6 kyu
**Language:** Kotlin
**Completed:** 2026-06-20

## Problem

Given:

* A list of stock codes and quantities
* A list of categories

Return a summary of the quantities for each category.

Example:

Input:

```text
Articles:
ABAR 200
CDXE 500
BKWR 250
BTSQ 890
DRTY 600

Categories:
A
B
```

Output:

```text
(A : 200) - (B : 1140)
```

---

## My First Solution

### Idea

For every category:

1. Loop through all articles.
2. Check whether the article belongs to the current category.
3. Sum the quantities.
4. Build the output string.

### Advantages

* Easy to understand.
* Straightforward implementation.
* Good for learning loops and string manipulation.

### Drawbacks

* Scans the entire article list once for every category.
* Performs repeated work.
* Less efficient when the input becomes large.

Pseudo process:

```text
For category A:
    scan all articles

For category B:
    scan all articles again

For category C:
    scan all articles again
```

---

## Improved Solution

### Idea

Create a map that stores totals per category.

Example:

```text
B -> 1290
C -> 515
D -> 600
```

Then:

1. Scan the article list only once.
2. Store totals in a map.
3. Loop through the requested categories.
4. Retrieve totals from the map using `getOrDefault`.

### Advantages

* Only one pass through the article list.
* Cleaner separation of calculation and formatting.
* Scales better for larger inputs.

Pseudo process:

```text
Build map:
    B -> 1290
    C -> 515
    D -> 600

Generate output:
    A -> 0
    B -> 1290
    C -> 515
    D -> 600
```

---

## Edge Cases

If either:

* Article list is empty
* Category list is empty

Return:

```text
""
```

---

## Lessons Learned

* Using a `Map` can avoid repeated scanning of data.
* `getOrDefault(key, 0)` is useful for missing categories.
* Separating data processing from output formatting makes code easier to reason about.
* Passing kata tests often requires careful handling of edge cases, not just correct core logic.
