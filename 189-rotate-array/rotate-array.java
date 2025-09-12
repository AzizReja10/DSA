class Solution {
    public void rotate(int[] nums, int k) {
          int n = nums.length;
        k = k % n;   // handle case where k > n
        int ans[] = new int[n];
        int x = 0;

        // copy last k elements
        for(int i=n-k;i<n;i++)
            ans[x++] = nums[i];

        // copy first n-k elements
        for(int i=0;i<n-k;i++)
            ans[x++] = nums[i];

        // copy back to nums
        for(int i=0;i<n;i++)
            nums[i] = ans[i];
    }
}