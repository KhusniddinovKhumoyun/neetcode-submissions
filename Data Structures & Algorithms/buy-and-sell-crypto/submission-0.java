class Solution {
    public int maxProfit(int[] prices) {
         int result = 0;
        int length = prices.length;
        if (length == 1) return result;
        int previous = 0;
        for (int i = 1; i < prices.length; i++) {
            result = Integer.max(result, prices[i] - prices[previous]);
            if (prices[i] < prices[previous]) {
                previous=i;
            }
        }
        return result;
    }
}
