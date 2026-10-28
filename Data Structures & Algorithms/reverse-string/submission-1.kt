class Solution {
    fun reverseString(s: CharArray) {
                for (i in 0 until s.size/2) {
            val charecter=s[i]
            s[i]=s[s.size-1-i]
            s[s.size-1-i]=charecter
    }}
}
