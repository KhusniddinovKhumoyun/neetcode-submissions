class Solution {
    fun sortArray(nums: IntArray): IntArray {
 // Диапазон чисел:
        // от -50000 до 50000
        // Всего: 100001 возможных значений
        val count = IntArray(100001)

        // 1. Считаем, сколько раз встречается каждое число
        for (num in nums) {
            count[num + 50000]++
        }

        // 2. Записываем числа обратно в nums
        var index = 0

        for (i in count.indices) {

            // Пока это число ещё нужно добавить
            while (count[i] > 0) {

                // Возвращаем исходное число:
                // при подсчёте мы делали +50000,
                // поэтому теперь делаем -50000
                nums[index] = i - 50000

                index++

                // Одно вхождение уже использовали
                count[i]--
            }
        }

        return nums
    }
}
