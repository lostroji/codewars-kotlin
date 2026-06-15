##Multiplication Table

Generate an n × n multiplication table and return it as an Array<IntArray>.

#Approach

My initial idea was to build the table row by row.

For each number from 1 to size, I generate the corresponding row of multiples:

1 → [1, 2, 3]
2 → [2, 4, 6]
3 → [3, 6, 9]

Each row is stored in an IntArray, and the rows are collected into an Array<IntArray> representing the complete multiplication table.

I used nested loops:

- The outer loop determines the current multiplier.
- The inner loop generates all multiples for that row.
- Each completed row is inserted into the final table.

#Example

For size = 3:

[
  [1, 2, 3],
  [2, 4, 6],
  [3, 6, 9]
]

#Complexity
Time Complexity: O(n²)
Space Complexity: O(n²)

The algorithm generates every cell in the table exactly once.

#What I Learned

My first implementation used mutable lists and converted them to arrays afterward. While debugging, I discovered that reusing the same list across iterations caused every row to contain values from previous rows.

After fixing the issue, I learned how to work directly with IntArray and Array<IntArray>, which better matched the kata requirements.

I also discovered a more concise Kotlin solution using array constructors and index-based calculations:

value = (row + 1) * (column + 1)

Although my original solution uses explicit loops, solving the kata helped me understand how the same problem can often be expressed more directly by thinking about the value of each cell rather than how to build the table step by step.