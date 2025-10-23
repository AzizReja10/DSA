class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      return divide_conquer(matrix, target, 0, matrix.length - 1, 0, matrix[0].length - 1);
        //return search(matrix, target, 0, matrix.length - 1, 0, matrix[0].length - 1);
    }

    static boolean search(int[][] matrix, int target, int top, int bottom, int left, int right) {
        int row = top;

        while (row <= bottom && right >= 0) {
            if (matrix[row][right] == target)
                return true;
            else if (matrix[row][right] > target)
                right--; 
            else
                row++;  
        }
        return false;
    }
    static  boolean divide_conquer(int[][] matrix, int target, int top, int bottom, int left, int right)
    {
        if(top>bottom|| left>right)
        return false;
        int row=top;
        int mid=left+(right-left)/2;
        while(row<=bottom&&matrix[row][mid]<=target)
        {
            if(matrix[row][mid]==target)
            return true;
            row++;
        }
        return(divide_conquer(matrix,target,row,bottom,left,mid-1)||divide_conquer(matrix,target,top,row-1,mid+1,right));
    }
}
