class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[9];
            boolean[] col = new boolean[9];
            boolean[] box = new boolean[9];
            for (int j = 0; j < 9; j++) {
                // row
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    if (row[num]) return false;
                    row[num] = true;
                }
                // column
                if (board[j][i] != '.') {
                    int num = board[j][i] - '1';
                    if (col[num]) return false;
                    col[num] = true;
                }
                //box
                int crow = 3 * (i / 3);
                int ccol = 3 * (i % 3);
                char c = board[crow + j / 3][ccol + j % 3];
                if (c != '.') {
                    int num = c - '1';
                    if (box[num]) return false;
                    box[num] = true;
                }
            }
        }
        return true;
    }
}

