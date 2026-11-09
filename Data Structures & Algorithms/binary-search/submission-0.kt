class Solution {
    fun search(nums: IntArray, target: Int): Int {
              var start = 0
        var end = nums.size - 1
        while (start <= end) {
             val middle = (start +end) / 2
            if (target > nums[middle]) {
                start = middle+1
           
            } else if (target == nums[middle]) {
                return middle
            } else {
                end = middle-1
            }
        }
        return -1
    }
}
