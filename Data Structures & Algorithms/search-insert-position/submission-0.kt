class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
          var start = 0
        var end = nums.size - 1
            var middle = 0
        while (start <= end) {
            middle=(start+end)/2
            if (target > nums[middle]) {
                start = middle+1
            } else if (target == nums[middle]) {
                return middle
            } else {
                end = middle-1
            }
        }

        return if(target>nums[middle]) middle+1 else middle
    }
}
