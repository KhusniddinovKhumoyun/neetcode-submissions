class Solution {
    fun maxArea(heights: IntArray): Int {
        var left = 0
        var right = heights.size - 1
        var maxArea = 0
        while (left < right) {
            val w = right - left
            val h = min(heights[left], heights[right])
            maxArea = max(maxArea, w * h)
            if (heights[left] < heights[right]) {
                left++
            } else {
                right--
            }
        }
        return maxArea
    }
}
