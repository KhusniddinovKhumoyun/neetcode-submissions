class Solution {
     fun asteroidCollision(asteroids: IntArray): IntArray {
        val stack = Stack<Int>()
        stack.push(asteroids[0])
        for (i in 1 until asteroids.size) {
            addAsteroid(asteroids[i], stack)
        }
        return stack.toIntArray()
    }

    private fun addAsteroid(ast: Int, stack: Stack<Int>) {
        if ( ast < 0 && stack.isNotEmpty() && stack.peek() > 0) {
            var isBreaked=false
            while (stack.isNotEmpty() && stack.peek() > 0) {
                if (stack.peek() + ast < 0) {
                    stack.pop()
                } else if (stack.peek()+ast==0){
                    stack.pop()
                    isBreaked=true
                    break
                } else{
                    isBreaked=true
                    break
                }
            }
            if(!isBreaked){
            stack.push(ast)
            }
        } else {
            stack.push(ast)
        }

    }
}
