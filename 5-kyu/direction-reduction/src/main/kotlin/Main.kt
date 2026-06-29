// ===================================================================
// Kata: Directions Reduction
// Rank: 5 kyu
// Link: https://www.codewars.com/kata/550f22f4d758534c1100025a/train/kotlin
// Date: 2026-06-28
// ===================================================================

object DirReduction {

    fun dirReduc(arr: Array<String>): Array<String> {

        val arrList = arr.toMutableList()
        var index = 1

        while (index < arrList.size) {

            if ((arrList[index] == "NORTH" && arrList[index - 1] == "SOUTH") || (arrList[index] == "SOUTH" && arrList[index - 1] == "NORTH")
                || (arrList[index] == "EAST" && arrList[index - 1] == "WEST") || (arrList[index] == "WEST" && arrList[index - 1] == "EAST")
            ) {
                arrList.removeAt(index)
                arrList.removeAt(index - 1)
                index = 1
            } else {
                index++
            }
        }
        return arrList.toTypedArray()
    }
}

fun main() {
    val testCases = listOf(
        arrayOf("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST") to arrayOf("WEST"),
        arrayOf("NORTH", "WEST", "SOUTH", "EAST") to arrayOf("NORTH", "WEST", "SOUTH", "EAST"),
        arrayOf("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "NORTH") to arrayOf("NORTH"),
        arrayOf(
            "NORTH", "EAST", "NORTH", "EAST",
            "WEST", "WEST", "EAST", "EAST",
            "WEST", "SOUTH"
        ) to arrayOf("NORTH", "EAST"),
        arrayOf("") to arrayOf("")
    )

    testCases.forEachIndexed { index, (input, expected) ->
        val actual = DirReduction.dirReduc(input)

        println("Test ${index + 1}")
        println("Input:    ${input.contentToString()}")
        println("Expected: ${expected.contentToString()}")
        println("Actual:   ${actual.contentToString()}")
        println("Passed:   ${actual.contentEquals(expected)}")
        println()
    }
}