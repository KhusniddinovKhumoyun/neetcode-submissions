class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
  val map = HashMap<Int, Int>()
                map[0] = 1

                var sum = 0
                var result = 0

                for (num in nums) {
                    sum += num

                    result += map[sum - k] ?: 0

                    map[sum] = (map[sum] ?: 0) + 1
                }

                return result
    }
}
