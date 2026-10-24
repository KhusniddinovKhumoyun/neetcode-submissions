class Solution {
 fun decodeString(s: String): String {
        val countStack = Stack<Int>()
        val stringStack = Stack<String>()

        var currentString = StringBuilder()
        var currentNum = 0

        for (ch in s) {
            when {
                ch.isDigit() -> {
                    currentNum = currentNum * 10 + (ch - '0')
                }

                ch == '[' -> {
                    countStack.push(currentNum)
                    stringStack.push(currentString.toString())

                    currentNum = 0
                    currentString = StringBuilder()
                }

                ch == ']' -> {
                    val count = countStack.pop()
                    val previousString = stringStack.pop()

                    currentString = StringBuilder(
                            previousString + currentString.toString().repeat(count)
                    )
                }

                else -> {
                    currentString.append(ch)
                }
            }
        }

        return currentString.toString()
    }
}
