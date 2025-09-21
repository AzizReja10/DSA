class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int left=0,right=(matrix.length*matrix[0].length)-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            int row=mid/matrix[0].length,col=mid%matrix[0].length;
            if(target==matrix[row][col])
            return(true);
            else if(target<matrix[row][col])
            right=mid-1;
            else
            left=mid+1;
        }
        return(false);
    }
}