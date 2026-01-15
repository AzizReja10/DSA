import java.util.Arrays;

class Solution {
    public int countElements(int[] nums, int k) {
        int n = nums.length;
        if (k >= n) return 1;
         if(k==0) return nums.length;
        Arrays.sort(nums);
        int count = 0;

        for (int i = 0; i < n; i++) {
            int firstGreater = upperBound(nums, nums[i]);
            if (firstGreater != -1 && n - firstGreater >= k) {
                count++;
            }
        }
        return count;
    }

    // first index where nums[j] > target
    private int upperBound(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1, ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > target) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
}
