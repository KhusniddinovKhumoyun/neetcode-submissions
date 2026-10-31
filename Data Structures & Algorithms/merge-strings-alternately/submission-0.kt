class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
                val length = max(word1.length, word2.length)
        val stringBuilder = StringBuilder()
        for (i in 0 until length) {
            if (i < word1.length)
                stringBuilder.append(word1[i])
            if (i < word2.length)
                stringBuilder.append(word2[i])
        }
        return stringBuilder.toString()
    }
}
