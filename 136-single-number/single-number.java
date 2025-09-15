class Solution {
    public int singleNumber(int[] nums) {
         int store=0;
        for(int n:nums)
            store=store^n;
            return(store);
    }
}