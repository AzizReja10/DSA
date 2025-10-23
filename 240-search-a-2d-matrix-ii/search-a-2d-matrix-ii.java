class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Start from top-right corner
        return search(matrix, target, 0, matrix.length - 1, 0, matrix[0].length - 1);
    }

    static boolean search(int[][] matrix, int target, int top, int bottom, int left, int right) {
        int row = top;

        while (row <= bottom && right >= 0) {
            if (matrix[row][right] == target)
                return true;
            else if (matrix[row][right] > target)
                right--; // move left
            else
                row++;   // move down
        }
        return false;
    }
}
