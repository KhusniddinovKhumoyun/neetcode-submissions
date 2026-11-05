class Solution {
   fun rotate(nums: IntArray, k: Int): Unit {

        /*
                - If k < nums.size, we need k rotations.
                - If k == nums.size, no actual rotation is needed.
                - If k > nums.size, we only need the remainder.
        */

        val steps = k % nums.size

        reverse(nums, 0, nums.size - 1)
        reverse(nums, 0, steps - 1)
        reverse(nums, steps, nums.size - 1)
    }

    private fun reverse(nums: IntArray, start: Int, end: Int) {
        var left = start
        var right = end
        while (left < right) {
            val temp = nums[right]
            nums[right] = nums[left]
            nums[left] = temp
            left++
            right--
        }
    }
}
