class Solution {
    public void gameOfLife(int[][] board) {
    
        int m = board.length, n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sent=game(board,i,j,m,n);
                if(board[i][j]==1&&(sent<2||sent>3))
                    board[i][j]=-1;
                if(board[i][j]==0&&sent==3)
                    board[i][j]=2;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j]==-1)
                board[i][j]=0;
                else if(board[i][j]==2)
                board[i][j]=1;
            }
        }
    }
    static int game(int[][] boards,int i,int j,int m,int n)
    {
        int count=0;
        for(int a=-1;a<2;a++)
        {
            for(int b=-1;b<2;b++)
            {
                int r=a+i,c=b+j;
                if(r==i&&c==j)
                    continue;
                if(r>=0&&r<m&&c>=0&&c<n)
                {
                    if (Math.abs(boards[r][c]) == 1) { 
                        count++;
                    }
                }
            }
        }
        return(count);
    }
}