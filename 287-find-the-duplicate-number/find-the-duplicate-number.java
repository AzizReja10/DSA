class Solution {
    public int findDuplicate(int[] nums) {
        int left=nums[0],right=nums[0];
        do
        {
            left=nums[left];
            right=nums[nums[right]];
        }while(left!=right);
        left=nums[0];
        while(left!=right)
        {
            left=nums[left];
            right=nums[right];
        }//both left and right will show same value
        return(left);
    }
}