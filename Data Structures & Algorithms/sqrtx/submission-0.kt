class Solution {
    fun mySqrt(x: Int): Int {
          if (x < 2) return x

        var left = 1
        var right = x / 2
        var ans = 0

        while (left <= right) {
            val mid = (left + right) / 2

            // Using division to avoid integer overflow
            if (mid <= x / mid) {
                ans = mid
                left = mid + 1 // Try looking for a larger valid square root
            } else {
                right = mid - 1 // Too large, search the lower half
            }
        }

        return ans
    }
}
