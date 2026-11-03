class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
val result = mutableListOf<List<Int>>()

        nums.sort()

        for (i in 0 until nums.size - 2) {

            // Пропускаем одинаковые первые числа
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue
            }

            // Если первое число больше нуля,
            // сумма уже не сможет быть равна нулю
            if (nums[i] > 0) break

            var left = i + 1
            var right = nums.size - 1

            while (left < right) {
                val sum = nums[i] + nums[left] + nums[right]

                if (sum < 0) {
                    left++
                } else if (sum > 0) {
                    right--
                } else {
                    result.add(
                        listOf(nums[i], nums[left], nums[right])
                    )

                    left++
                    right--

                    // Пропускаем одинаковые значения слева
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++
                    }

                    // Пропускаем одинаковые значения справа
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--
                    }
                }
            }
        }

        return result
    }
}
