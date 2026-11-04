class Solution {
fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    nums.sort()

    for (i in 0 until nums.size - 3) {

        // Skip duplicate first numbers
        if (i > 0 && nums[i] == nums[i - 1]) continue

        for (j in i + 1 until nums.size - 2) {

            // Skip duplicate second numbers
            if (j > i + 1 && nums[j] == nums[j - 1]) continue

            var left = j + 1
            var right = nums.size - 1

            while (left < right) {
                val sum = nums[i].toLong() +
                          nums[j].toLong() +
                          nums[left].toLong() +
                          nums[right].toLong()

                when {
                    sum < target.toLong() -> left++

                    sum > target.toLong() -> right--

                    else -> {
                        result.add(
                            listOf(nums[i], nums[j], nums[left], nums[right])
                        )

                        left++
                        right--

                        // Skip duplicate third numbers
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++
                        }

                        // Skip duplicate fourth numbers
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--
                        }
                    }
                }
            }
        }
    }

    return result
}

}
