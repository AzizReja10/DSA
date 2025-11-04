class Solution {
    public boolean exist(char[][] board, String word) {
        char arr[]=word.toCharArray();
        char target=arr[0];
        for(int i=0;i<board.length;i++)
   {
            for(int j=0;j<board[0].length;j++)
              {
                if(board[i][j]==target)
                {
                    if(safe(board,arr,i,j,0))
                    return true;
                }
              }
        }
        return false;
    }
    boolean safe(char board[][],char arr[],int i,int j,int idx){
        //base case
        if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]=='*'||board[i][j]!=arr[idx])
        return false;
        //recursion
        
        char ch=board[i][j];
        if(idx==arr.length-1)
        return true;
        board[i][j]='*';
        boolean x=safe(board,arr,i+1,j,idx+1)||safe(board,arr,i-1,j,idx+1)||safe(board,arr,i,j+1,idx+1)||safe(board,arr,i,j-1,idx+1);
        //backtracking
        board[i][j]=ch;
        return x;
    }
}