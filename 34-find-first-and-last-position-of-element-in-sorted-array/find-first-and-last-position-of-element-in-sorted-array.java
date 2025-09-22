class Solution {
    public int[] searchRange(int[] nums, int target) {
    
    int[] res = searchRanges(nums, target);
    return(res);
    
    }
      public static int[] searchRanges(int[] nums, int target) {
        int[] ans = {-1, -1};  // default if not found
        int left = 0, right = nums.length - 1;

        // find first occurrence
        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] >= target) right = mid - 1;
            else left = mid + 1;
        }
        if(left < nums.length && nums[left] == target) ans[0] = left;

        // reset and find last occurrence
        left = 0; right = nums.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] <= target) left = mid + 1;
            else right = mid - 1;
        }
        if(right >= 0 && nums[right] == target) ans[1] = right;

        return ans;
}
}