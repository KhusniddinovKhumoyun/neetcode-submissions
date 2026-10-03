class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val hashMap = HashMap<Int, Int>()
        nums.forEach {
            var value = hashMap[it] ?: 0
            hashMap[it] = ++value
        }

        val buckets = Array(nums.size + 1) {
            mutableListOf<Int>()
        }

        for ((num, count) in hashMap) {
            buckets[count].add(num)
        }

        val result = IntArray(k)
        var index = 0

        for (frequency in buckets.lastIndex downTo 1) {

            for (num in buckets[frequency]) {
                result[index] = num
                index++

                if (index == k) {
                    return result
                }
            }
        }

        return result
    }
}
