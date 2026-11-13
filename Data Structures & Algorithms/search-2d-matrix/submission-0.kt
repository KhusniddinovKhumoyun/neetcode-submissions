class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {

        val rows = matrix.size
        val cols = matrix[0].size

        var left = 0
        var right = rows * cols - 1

        while (left <= right) {

            val middle = (left + right) / 2

            val row = middle / cols
            val col = middle % cols

            val value = matrix[row][col]

            if (target > value) {
                left = middle + 1
            } else if (target < value) {
                right = middle - 1
            } else {
                return true
            }
        }

        return false
    }
}
