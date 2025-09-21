class Solution {
    public int findPeakElement(int[] nums) {
        int val=0;
           for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]>nums[i])
               return(i-1);
            else
            val=i;
        }
        return(val);
    }
}