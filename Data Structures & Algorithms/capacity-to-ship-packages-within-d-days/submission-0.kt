class Solution {
    fun shipWithinDays(weights: IntArray, days: Int): Int {
      var left = weights.max()
        var right = weights.sum()

        while (left <= right) {

            val mid = (left + right) / 2

            var daysNeeded = 1
            var currentWeight = 0

            for (weight in weights) {

                if (currentWeight + weight <= mid) {
                    currentWeight += weight
                } else {
                    daysNeeded++
                    currentWeight = weight
                }
            }

            if (daysNeeded <= days) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        return left
    }
}
