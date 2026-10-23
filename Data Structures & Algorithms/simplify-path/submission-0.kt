class Solution {
    fun simplifyPath(path: String): String {
          val stack = Stack<String>()
    val parts = path.split(Regex("/+")).filter { it.isNotEmpty() }

    parts.forEach {
        when (it) {
            "." -> {
                // Current directory: do nothing
            }
            ".." -> {
                // Go back one directory
                if (stack.isNotEmpty()) {
                    stack.pop()
                }
            }
            else -> {
                // Normal directory name, including "..."
                stack.push(it)
            }
        }
    }

    return "/" + stack.joinToString("/")
    }
}
