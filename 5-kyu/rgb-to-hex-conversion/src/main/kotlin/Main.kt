// ===================================================================
// Kata: RGB To Hex Conversion
// Rank: 5 kyu
// Link: https://www.codewars.com/kata/513e08acc600c94f01000001/kotlin
// Date: 2026-06-23
// ===================================================================

fun rgb(r: Int, g: Int, b: Int): String { //255, 255, 300

    val r = r.coerceIn(0, 255)
    val g = g.coerceIn(0, 255)
    val b = b.coerceIn(0, 255)

    val rgbList =
        mutableListOf(
            (r / 16).toString(), (r % 16).toString(),
            (g / 16).toString(), (g % 16).toString(),
            (b / 16).toString(), (b % 16).toString()
        ).map {
            when (it) {
                "10" -> "A"
                "11" -> "B"
                "12" -> "C"
                "13" -> "D"
                "14" -> "E"
                "15" -> "F"
                else -> it
            }
        }

    return rgbList.joinToString("")
}

fun main() {
    check(rgb(0, 0, 0) == "000000")
    check(rgb(0, 0, -20) == "000000")
    check(rgb(300, 255, 255) == "FFFFFF")
    check(rgb(173, 255, 47) == "ADFF2F")
    check(rgb(148, 0, 211) == "9400D3")
    check(rgb(9, 9, 9) == "090909")

    println("All test cases passed ✅")
}