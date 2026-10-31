class Solution {
    fun validPalindrome(s: String): Boolean {
val str = s.trim()
    val reversed = str.reversed()
    if (str == reversed) return true

    val str1 = str.removeRange(0, 1)
    if (str1 == str1.reversed()) return true

    val length = str.length
    val str2 = str.removeRange(length - 1, length)
    if (str2 == str2.reversed()) return true

    var left = 0
    var right = str.length - 1
    var isChanceUsed = false

    while (left < right) {
        val a = str[left]
        val b = str[right]

        if (a == b) {
            left++
            right--
        } else {
            if (isChanceUsed) return false

            isChanceUsed = true

            // Try removing the left character
            val strLeft = str.removeRange(left, left + 1)
            if (strLeft == strLeft.reversed()) return true

            // Try removing the right character
            val strRight = str.removeRange(right, right + 1)
            if (strRight == strRight.reversed()) return true

            return false
        }
    }

    return true
    }
}
