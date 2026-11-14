class Solution {
        fun minEatingSpeed(piles: IntArray, h: Int): Int {

            var left = 1
            var right = piles.max()

            while (left <= right) {

                val mid = (left + right) / 2

                var hours = 0L

                // Calculate how many hours Koko needs
                for (pile in piles) {
                    hours += (pile + mid - 1) / mid
                }

                if (hours <= h) {
                    // Speed is enough.
                    // Try a smaller speed.
                    right = mid - 1
                } else {
                    // Speed is too slow.
                    // Try a bigger speed.
                    left = mid + 1
                }
            }

            return left
}
}