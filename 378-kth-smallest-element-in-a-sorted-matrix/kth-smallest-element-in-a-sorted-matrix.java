class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] arr = new int[n * n];
        int idx = 0;

        for (int[] row : matrix)
            for (int num : row)
                arr[idx++] = num;

        Arrays.sort(arr);
        return arr[k - 1];
    }
}
