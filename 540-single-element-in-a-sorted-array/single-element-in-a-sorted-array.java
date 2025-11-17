class Solution {
    public int singleNonDuplicate(int[] nums) {
        int store=0;
        for(int i:nums)
        {
            store^=i;
        }
        return store;
    }
}