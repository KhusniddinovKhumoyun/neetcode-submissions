class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
       var firstMissingElement = 1
        val set = HashSet<Int>()
        nums.forEach {
            if (it > 0)
                set.add(it)
        }

        set.forEach { _ ->
            if (!set.contains(firstMissingElement)) {
                return firstMissingElement
            }
            firstMissingElement++
        }
        return firstMissingElement
    }
}
