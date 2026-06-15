// ===================================================================
// Kata: Multiplication Table
// Rank: 6 kyu
// Link: https://www.codewars.com/kata/5432fd1c913a65b28f000342
// Date: 2026-06-15
// ===================================================================

fun multiplicationTable(size: Int): Array<IntArray> {
    val table = Array(size) { IntArray(size) }

    for (number in 1..size) {
        val row = IntArray(size)

        var index = 0
        for (i in number..(size * number) step number) {
            row[index++] = i
        }

        table[number - 1] = row
    }

    return table
}

fun main() {

    println(multiplicationTable(3))
    println(multiplicationTable(5))

}