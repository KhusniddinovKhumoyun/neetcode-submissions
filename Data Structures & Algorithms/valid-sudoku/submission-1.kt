class Solution {
   fun isValidSudoku(board: Array<CharArray>): Boolean {
        for (i in 0 until 9) {
            val rows = HashSet<Char>()
            val columns = HashSet<Char>()
            for (j in 0 until 9) {
                if (board[i][j] != '.') if (!columns.add(board[i][j])) return false
                if (board[j][i] != '.') if (!rows.add(board[j][i])) return false
            }
        }

        for (i in 0 until 9 step 3) {
            for (j in 0 until 9 step 3) {
                if (!isValid(i, j, board)) return false
            }
        }
        return true
    }

    private fun isValid(startRow: Int, startColumn: Int, board: Array<CharArray>): Boolean {
        val result = HashSet<Char>()
        for (i in startRow until startRow + 3) {
            for (j in startColumn until startColumn + 3) {
                if (board[i][j] != '.') if (!result.add(board[i][j])) return false
            }
        }
        return true
    }
}
