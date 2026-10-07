class Solution {
public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            Set<Character> columnSudoku = new HashSet<>();
            Set<Character> rowSudoku = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
               if (board[i][j] != '.') {
                    if (!rowSudoku.add(board[i][j])) return false;
                }
                if (board[j][i] != '.') {
                    if (!columnSudoku.add(board[j][i])) return false;

                }
            }
        }
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                if (!isValid(board, row, col)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(char[][] board, int startColumn, int startRow) {
        Set<Character> isValid = new HashSet<>();
        for (int i = startColumn; i < startColumn + 3; i++) {
            for (int j = startRow; j < startRow + 3; j++) {
                if (board[i][j] != '.') if (!isValid.add(board[i][j])) return false;
            }
        }
        return true;
    }
}
