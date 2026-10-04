class Solution {

 fun encode(strs: List<String>): String {
        val result = StringBuilder()
        for (i in strs.indices) {

            result.append("${strs[i].length}#${strs[i]}")
        }
        return result.toString()
    }

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()

        var i = 0

        while (i < str.length) {

            // Находим '#'
            var j = i
            while (str[j] != '#') {
                j++
            }

            // Получаем длину строки
            val length = str.substring(i, j).toInt()

            // Начало самой строки
            val start = j + 1

            // Берём ровно length символов
            val str = str.substring(start, start + length)

            result.add(str)

            // Переходим к следующей строке
            i = start + length
        }

        return result
    }
}
