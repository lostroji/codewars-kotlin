// ===================================================================
// Kata: Split Strings
// Rank: 6 kyu
// Link: https://www.codewars.com/kata/515de9ae9dcfc28eb6000001/train/kotlin
// Date: 2026-06-30
// ===================================================================

fun solution(s: String): List<String> {

    val str = if (s.length % 2 == 1) s.plus("_") else s
    val strList = str.chunkedSequence(2).toList()

    return strList
}

fun main() {
    println(solution("abcdef"))
    println(solution("abcdefg"))
}