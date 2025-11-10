class Solution {
    public int minMoves(int[] nums) {
        int count=0;
        int min=Integer.MAX_VALUE;
        for(int i:nums)
        {
            min=Math.min(min,i);
            count+=i;
        }
        return((int)count-min*nums.length);
    }
}