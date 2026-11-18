class Solution {
    fun search(nums: IntArray, target: Int): Boolean {
 var left = 0
    var right = nums.size - 1

    while (left <= right) {
        val middle = left + (right - left) / 2

        if (nums[middle] == target) {
            return true
        }

        // Special case: duplicates
        if (nums[left] == nums[middle] &&
            nums[middle] == nums[right]) {
            left++
            right--
            continue
        }

        // Left half is sorted
        if (nums[left] <= nums[middle]) {
            if (target >= nums[left] && target < nums[middle]) {
                right = middle - 1
            } else {
                left = middle + 1
            }
        }
        // Right half is sorted
        else {
            if (target > nums[middle] && target <= nums[right]) {
                left = middle + 1
            } else {
                right = middle - 1
            }
        }
    }

    return false
    }
}
