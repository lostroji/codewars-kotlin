# Roman Numerals Decoder

**Codewars:** 6 kyu
**Language:** Kotlin
**Completed:** 2026-06-14

Convert a Roman numeral string into its corresponding integer value.

## Approach

I started by creating a map that associates each Roman numeral character with its numeric value.

The input string is converted into a list of numbers, making it easier to compare neighboring values during the calculation phase.

To compute the result, I iterate through the list and compare the current numeral with the next one:

* If the current value is less than the next value, the pair represents a subtractive combination (e.g. IV, IX, XL).
* In this case, I add the difference between the two values and skip the next element.
* Otherwise, I add the current value to the total.

This approach handles both standard and subtractive Roman numeral notation without maintaining a list of special cases.

## Example

For the numeral `MCMXCIV`:

* M = 1000
* CM = 900
* XC = 90
* IV = 4

Result: 1994

## Complexity

* Time Complexity: O(n)
* Space Complexity: O(n)

The additional space comes from converting the Roman numeral characters into a list of numeric values before performing the calculation.

## What I Learned

While solving this kata, I focused on transforming the Roman numeral into a list of integers and then processing that list.

After completing the solution, I discovered that there are several cleaner approaches:

* Traversing the original string directly without creating an intermediate list.
* Iterating from right to left instead of left to right.
* Using Kotlin collection functions to reduce boilerplate code.

Although my solution is not the shortest possible implementation, it helped me better understand how Roman numeral subtraction rules work and how to solve the problem step by step before looking for optimizations.
