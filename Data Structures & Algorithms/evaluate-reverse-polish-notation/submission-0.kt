class Solution {
    fun evalRPN(tokens: Array<String>): Int {
 val stack = Stack<Int>()
        for (i in tokens.indices) {
            if (tokens[i] == "-" || tokens[i] == "*" || tokens[i] == "+" || tokens[i] == "/") {
                val result = math(tokens[i], stack)
                stack.push(result.toInt())
            } else {
                stack.push(tokens[i].toInt())
            }
        }
        return stack.pop().toInt()
    }

    fun math(operation: String, stack: Stack<Int>): String {
        val first = stack.pop()
        val second = stack.pop()
        return when (operation) {
            "-" -> {
                (second - first).toString()
            }

            "+" -> {
                (second + first).toString()
            }

            "*" -> {
                (second * first).toString()
            }

            else -> {
                (second / first).toString()
            }
        }
    }
}
