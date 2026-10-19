class MyStack() {

  var q: Queue<Int> = LinkedList()

    fun push(x: Int) {
        q.add(x)

        val size = q.size

        for (i in 0 until size - 1) {
            q.add(q.remove())
        }
    }

    fun pop(): Int {
        return q.remove()
    }

    fun top(): Int {
        return q.peek()
    }

    fun empty(): Boolean {
        return q.isEmpty()
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * val obj = MyStack()
 * obj.push(x)
 * val param_2 = obj.pop()
 * val param_3 = obj.top()
 * val param_4 = obj.empty()
 */
