class Solution {
    fun sortColors(nums: IntArray) {
  var countsOf1 = 0
            var countsOf2 = 0
            var countOf0 = 0
            val length = nums.size

            for (i in 0 until length) {
                if (nums[i] == 1) countsOf1++
                else if (nums[i] == 2) countsOf2++
                else countOf0++
            }
            for (i in 0 until countOf0) {
                nums[i] = 0
            }
            for (i in countOf0 until countsOf1 + countOf0) {
                nums[i] = 1
            }
            for (i in countsOf1+countOf0 until countsOf2 + countsOf1 + countOf0) {
                nums[i] = 2
            }
    }
}
