class Solution {
    public int[] twoSum(int[] nums, int target) {
        int p=0;
        for(int i=1;p<nums.length;i++)
        {
            if(nums[i]+nums[p]==target)
            return(new int[]{i,p});
            else
            {
                if(i==nums.length-1)
                {
                    p++;
                    i=p;
                }
            }
        }
        return new int[]{};
    }
}