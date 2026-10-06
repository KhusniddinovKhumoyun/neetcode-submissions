class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val length = nums.size - 1
        val lefts = IntArray(length + 1)
        val right = IntArray(length + 1)
        var leftMultiplies = 1
        for (i in 0..length) {
            lefts[i] = leftMultiplies
            leftMultiplies *= nums[i]
        }
        var rightMultiplies = 1
        for (i in length downTo 0) {
            right[i] = rightMultiplies
            rightMultiplies *= nums[i]
        }
        val result = IntArray(length + 1)
        for (i in 0..length) {
            result[i] = lefts[i] * right[i]
        }
        return result
    }
}
