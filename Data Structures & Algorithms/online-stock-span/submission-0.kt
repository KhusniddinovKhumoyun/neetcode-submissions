class StockSpanner() {

    private val historyArr = ArrayList<Int>()
    fun next(price: Int): Int {
        historyArr.add(price)
        var count = 0
        for (i in historyArr.size - 1 downTo 0) {
            if (historyArr[historyArr.size - 1] >= historyArr[i]) {
                count++
            } else break
        }
        return count}
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * val obj = StockSpanner()
 * val param_1 = obj.next(price)
 */
