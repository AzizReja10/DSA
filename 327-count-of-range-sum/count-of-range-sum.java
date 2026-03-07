class Solution {
    int count = 0;
    int lower, upper;
    public int countRangeSum(int[] nums, int lower, int upper) {
        int n = nums.length;
        this.lower = lower;
        this.upper = upper;
        long[] sums = new long[n + 1];
        for (int i = 0; i < n; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }
        mergeSort(sums, 0, n);
        return count;
    }
    private void mergeSort(long[] sums, int start, int end) {
        if (end <= start) return;
        int mid = start + (end - start) / 2;
        mergeSort(sums, start, mid);
        mergeSort(sums, mid + 1, end);
        int j = mid + 1, k = mid + 1;
        for (int i = start; i <= mid; i++) {
            while (j <= end && sums[j] - sums[i] < lower) j++;
            while (k <= end && sums[k] - sums[i] <= upper) k++;
            count += (k - j);
        }
        long[] temp = new long[end - start + 1];
        int left = start, right = mid + 1, t = 0;
        while (left <= mid && right <= end) {
            temp[t++] = (sums[left] < sums[right]) ? sums[left++] : sums[right++];
        }
        while (left <= mid) temp[t++] = sums[left++];
        while (right <= end) temp[t++] = sums[right++];
        System.arraycopy(temp, 0, sums, start, temp.length);
    }
}