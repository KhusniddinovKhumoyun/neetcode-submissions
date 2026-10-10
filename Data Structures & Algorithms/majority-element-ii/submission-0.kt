class Solution {
    fun majorityElement(nums: IntArray): List<Int> {
    val set = HashMap<Int, Int>()
        nums.forEach {
            var count = set[it] ?: 0
            set[it] = ++count
        }
        val countOfNums: Double = nums.size.toDouble() / 3
        val result = arrayListOf<Int>()
        set.forEach { (num, count) ->
            if (count > countOfNums) {
                result.add(num)
            }
        }
        return result
    }
}
