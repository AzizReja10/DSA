class Solution {
    int count;
    public int totalNQueens(int n) {
        char chess[][]=new char[n][n];
        board(chess,0);
        return count;
    }
  public void board(char chess[][],int row)
  {
    // base case
   if(row==chess.length)
   {
    count+=1;
    return;
   }
    //safe
    for(int j=0;j<chess.length;j++)
    {
        if(safe(chess,row,j))
        {
        chess[row][j]='Q';
        board(chess,row+1);
        chess[row][j]='.';
        }
    }
  }
  boolean safe(char chess[][],int row,int col)
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
}