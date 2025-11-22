class Solution {
    public List<String> summaryRanges(int[] nums) {
          List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return result;
        int left = 0, right = 1;
        while (right < nums.length) {
            if (nums[right - 1] + 1 != nums[right]) {
                if (left == right - 1)
                    result.add(String.valueOf(nums[left]));  
                else
                    result.add(nums[left] + "->" + nums[right - 1]); 

                left = right;
            }
            right++;
        }
        if (left == nums.length - 1)
            result.add(String.valueOf(nums[left]));
        else
            result.add(nums[left] + "->" + nums[nums.length - 1]);

        return result;
}
}