class Solution {
    fun calPoints(operations: Array<String>): Int {
         val stack = Stack<Int>()
            operations.forEach {
            if (it == "C") {
                stack.pop()
            } else if (it == "D") {
                val value = stack.peek()
                stack.push(value * 2)
            } else if (it == "+") {
                val last = stack.pop()
                val previous = stack.peek()

                stack.push(last)
                stack.push(last + previous)
            } else {
                stack.push(it.toInt())
            }
        }

        return stack.sum()
    }
}
