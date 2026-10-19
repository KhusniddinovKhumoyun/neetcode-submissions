class MyQueue() {

 val stack = Stack<Int>()
    val second = Stack<Int>()
    fun push(x: Int) {
        second.push(x)
    }

    fun pop(): Int {
                if(stack.isEmpty()){
        while (!second.empty()) {
            stack.push(second.pop())
        }}
        return stack.pop()
    }

    fun peek(): Int {
        if(stack.isEmpty()){
   while (!second.empty()) {
            stack.push(second.pop())
        }
        }
     
       return stack.peek()
    }

    fun empty(): Boolean {
        return stack.isEmpty() && second.isEmpty()
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * val obj = MyQueue()
 * obj.push(x)
 * val param_2 = obj.pop()
 * val param_3 = obj.peek()
 * val param_4 = obj.empty()
 */
