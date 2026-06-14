// ===================================================================
// Kata: Roman Numerals Decoder
// Rank: 6 kyu
// Link: https://www.codewars.com/kata/51b6249c4612257ac0000005/kotlin
// Date: 2026-06-12
// ===================================================================

fun decode(str: String): Int {
    // Handling empty space - error handling
    if (str.isBlank())
        return 0
    // Numbers and lowercase
    val charList = str.toMutableList()
    val romanDictionary = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    // Transform roman to numbers
    val numList = charList.map {
        romanDictionary[it]
    }

    var value = 0
    var nextNum: Int
    var index = 0
    // Calculating
    while (index <= numList.size - 1) {
        val currentNum = numList[index]
        nextNum = if (index == numList.size - 1) {
            currentNum!!
        } else {
            numList[index + 1]!!
        }

        if (currentNum!! < nextNum) {
            value += nextNum - currentNum
            index++
        } else {
            value += currentNum
        }
        index++
    }
    return value
}

fun main() {
    println("Enter a roman numeral to be decoded: ")
    val userInput = readln()
    println(decode(userInput))
}
