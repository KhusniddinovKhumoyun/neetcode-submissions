class Solution {
    fun isPalindrome(s: String): Boolean {
 val str = s.trim().lowercase().toCharArray()
        var left = 0
        var right = str.size - 1
        while (left < right) {
            val a = str[left]
            val b = str[right]
            if (!str[left].isLetterOrDigit()) {
                left++
                continue
            }
            if (!str[right].isLetterOrDigit()) {
                right--
                continue
            }
            if (a != b) {
                return false
            }
            left++
            right--
        }
        return true
    }
}
