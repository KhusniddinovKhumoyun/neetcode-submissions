class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
           val result = IntArray(2)
        var left = 0
        var right = numbers.size-1
        while (left < right) {
            if (numbers[left] + numbers[right] > target) {
                right--
            } else if (numbers[left] + numbers[right] < target) {
                left++
            } else {
                result[0] = left+1
                result[1] = right+1
                return result
            }
        }
        return result
    }
}
