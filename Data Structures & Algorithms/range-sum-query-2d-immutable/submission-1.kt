class NumMatrix(matrix: Array<IntArray>) {
  private var prefix: Array<IntArray>

    init {
        val rows = matrix.size
        val cols = matrix[0].size
        prefix = Array(rows + 1) { IntArray(cols + 1) }
        for (row in 1 .. rows) {
            for (col in 1 .. cols) {
                prefix[row][col] =
                        prefix[row - 1][col] +
                                prefix[row][col - 1] -
                                prefix[row - 1][col - 1] +
                                matrix[row - 1][col - 1]
            }
        }
    }

    fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {
           
        return prefix[row2 + 1][col2 + 1] -
                prefix[row1][col2 + 1] -
                prefix[row2+1][col1] +
                prefix[row1][col1]
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * var obj = NumMatrix(matrix)
 * var param_1 = obj.sumRegion(row1,col1,row2,col2)
 */
