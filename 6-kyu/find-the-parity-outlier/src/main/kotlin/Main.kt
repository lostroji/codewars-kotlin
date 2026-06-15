// ===================================================================
// Kata: Find The Parity Outlier
// Rank: 6 kyu
// Link: https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/kotlin
// Date: 2026-06-15
// ===================================================================

fun find(integers: Array<Int>): Int {

    var oddNumCount = 0
    var evenNumCount = 0

    integers.forEach {
        if (it % 2 == 0) {
            evenNumCount += 1
        } else {
            oddNumCount += 1
        }
    }

    val outlier = if (oddNumCount == 1) //An oddNum is outlier
        integers.first { it % 2 != 0 }
    else    //An evenNum is outlier
        integers.first { it % 2 == 0 }

    return outlier
}

fun main() {
    val tests = arrayOf(
        arrayOf(2, 6, 8, -10, 3),
        arrayOf(206847684, 1056521, 7)
    )

    tests.forEach {
        println(find(it))
    }
}