class Solution {
    fun maxProfit(prices: IntArray): Int {
          var allProfits = 0
        var start = 0
        var profit = 0
        for (i in 1 until prices.size) {
            if (prices[i] > prices[i - 1]) {
                profit = max(profit, prices[i] - prices[start])

            } else {
                start = i
                allProfits += profit
                profit = 0
            }
        }
        allProfits+=profit
        return allProfits
    }
}
