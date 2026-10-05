class NumMatrix(matrix: Array<IntArray>) {
  private val prefix: Array<IntArray>

    init {
        val m = matrix.size
        val n = matrix[0].size
        prefix = Array(m + 1) { IntArray(n + 1) }
        for (r in 0 until m) {
            for (c in 0 until n) {
                prefix[r + 1][c + 1] = prefix[r + 1][c] + prefix[r][c + 1] - prefix[r][c] + matrix[r][c]
            }
        }
    }

    fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {
        var sum = 0
        val big = prefix[row2 + 1][col2 + 1]
        val top = prefix[row1][col2 + 1]
        val left = prefix[row2 + 1][col1]
        val overlap = prefix[row1][col1]
        return big - top - left + overlap
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * var obj = NumMatrix(matrix)
 * var param_1 = obj.sumRegion(row1,col1,row2,col2)
 */
