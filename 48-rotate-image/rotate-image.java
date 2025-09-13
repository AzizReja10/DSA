class Solution {
    public void rotate(int[][] matrix) {
        int rotate[][]=new int[matrix.length][matrix[0].length];
         for(int i=0;i<matrix.length;i++)
         {
             for(int j=0;j<matrix[0].length;j++)
                 rotate[i][j]=matrix[matrix[0].length-j-1][i];
             
         }
           for(int i=0;i<matrix.length;i++)
         {
             for(int j=0;j<matrix[0].length;j++)
              matrix[i][j]=rotate[i][j];
            
            }
    }
}