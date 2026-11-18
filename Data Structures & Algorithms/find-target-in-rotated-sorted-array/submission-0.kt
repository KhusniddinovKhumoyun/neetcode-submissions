class Solution {
    fun search(nums: IntArray, target: Int): Int {
 var left = 0
    var right = nums.size - 1

    while (left <= right) {
        val middle = left + (right - left) / 2

        if (nums[middle] == target) {
            return middle
        }

        // Check if the left part is sorted
        if (nums[left] <= nums[middle]) {

            if (target >= nums[left] && target < nums[middle]) {
                right = middle - 1
            } else {
                left = middle + 1
            }

        } else {
            // Right part is sorted
            if (target > nums[middle] && target <= nums[right]) {
                left = middle + 1
            } else {
                right = middle - 1
            }
        }
    }

    return -1
    }
}
