class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        return trav(mat, row, col, new int[row * col]);
    }

    int[] trav(int[][] mat, int row, int col, int[] arr) {
        int i = 0, j = 0, c = 0;
        boolean up = true;

        while (c < row * col) {
            arr[c++] = mat[i][j];

            if (up) {
                if (i == 0 && j != col - 1) {
                    j++;
                    up = false;
                } else if (j == col - 1) {
                    i++;
                    up = false;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (j == 0 && i != row - 1) {
                    i++;
                    up = true;
                } else if (i == row - 1) {
                    j++;
                    up = true;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return arr;
    }
}
