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

    val a = arrayOf("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600")
    val b = arrayOf("A", "B", "C", "D")
    println(StockList.stockSummary(a, b))
    val c = arrayOf("ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600")
    val d = arrayOf("A", "B")
    println(StockList.stockSummary(c, d))
}