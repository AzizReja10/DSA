import java.util.*;

class Solution {

    List<List<String>> result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
         char chess[][]=new char[n][n];
               for (int i = 0; i < n; i++) {
            Arrays.fill(chess[i], '.');
        }
        board(chess,0);
        return result;
    }
      void board(char[][] chess, int row) {
        // base case
        if (row == chess.length) {
            addBoard(chess);
            return;
        }

        // try all columns
        for (int col = 0; col < chess.length; col++) {
            if (safe(chess, row, col)) {
                chess[row][col] = 'Q';
                board(chess, row + 1);
                chess[row][col] = '.';
            }
        }
    }

    static boolean safe(char chess[][],int row,int col)
    {
        for(int i=row-1;i>=0;i--)
        {
            if(chess[i][col]=='Q')
            return false;
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
        {
            if(chess[i][j]=='Q')
            return false;
        }
        for(int i=row-1,j=col+1;i>=0&&j<chess.length;i--,j++)
        {
            if(chess[i][j]=='Q')
            return false;
        }
        return true;
    }
    void addBoard(char[][] chess) {
        List<String> board = new ArrayList<>();
        for (int i = 0; i < chess.length; i++) {
            board.add(new String(chess[i]));
        }
        result.add(board);
    }
}