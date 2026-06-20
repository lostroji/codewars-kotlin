package solution

object StockList {
    fun stockSummary(lstOfArt: Array<String>, lstOfCat: Array<String>): String {
        val stringList = mutableListOf<String>()
        val artAndCatMap = mutableMapOf<String, Int>()

        for (char in lstOfCat) { // char = A
            var counter = 0

            lstOfArt.forEach {
                if (it.first().toString() == char) {
                    counter += it.substringAfter(" ").toInt()
                }
            }
            stringList.add("($char : $counter)")
        }

        if (lstOfArt.isEmpty() || lstOfCat.isEmpty()) return ""

        return stringList.joinToString(" - ")
    }
}


fun main() {

    val testCases = listOf(
        Pair(
            arrayOf("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600"),
            arrayOf("A", "B", "C", "D")
        ),
        Pair(
            arrayOf("ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"),
            arrayOf("A", "B")
        ),
        Pair(
            emptyArray<String>(),
            arrayOf("A", "B", "C")
        ),
        Pair(
            arrayOf("ABAR 200", "BKWR 250"),
            emptyArray<String>()
        ),
        Pair(
            arrayOf("ABAR 100", "AXYZ 50", "BKWR 200"),
            arrayOf("A", "B", "C")
        )
    )

    testCases.forEachIndexed { index, (arts, cats) ->
        println("Test ${index + 1}")
        println(StockList.stockSummary(arts, cats))
        println()
    }
}