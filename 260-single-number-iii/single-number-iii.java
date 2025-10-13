class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i:nums)
        xor^=i;
        int diff=xor&(-xor);
        int a=0,b=0;
        for(int i=0;i<nums.length;i++)
        {
           if((nums[i]&diff)!=0)
            a^=nums[i];
           else
           b^=nums[i];
        }
        return new int[]{a,b};
}
}