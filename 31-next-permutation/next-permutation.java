import java.util.Arrays;
class Solution {
    public void nextPermutation(int[] nums) {
      int pivot=-1;
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
            pivot=i-1;
            break;
            }
        }
        if(pivot!=-1)
        {
        int swap=nums.length-1;
        while(nums[swap]<=nums[pivot])
        swap--;
        int temp=nums[pivot];
        nums[pivot]=nums[swap];
        nums[swap]=temp;
        pivot++;
        Arrays.sort(nums,pivot,nums.length);
        }else
        Arrays.sort(nums);
        for(int i:nums)
        System.out.println(i);
    }
}