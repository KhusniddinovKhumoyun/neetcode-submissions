class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val set = HashSet<Int>()
        nums.forEach {
            set.add(it)
        }
        var longestSequence = 0
        set.forEach {

            if (!set.contains(it - 1)) {
                var num = it
                var count = 0
                while (set.contains(num)) {
                    count++
                    num++
                }
                longestSequence = max(longestSequence, count)
            }
        }
        return longestSequence
    }
}
