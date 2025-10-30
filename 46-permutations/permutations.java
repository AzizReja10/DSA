class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, result);
        return result;
    }
     private void backtrack(int[] nums, int index, List<List<Integer>> result) {
        if (index == nums.length) {
            List<Integer> current = new ArrayList<>();
            for (int n : nums) current.add(n);
            result.add(current);
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            swap(nums,index,i);
            backtrack(nums,index+1,result);
            swap(nums,index,i);
        }
     }
     void swap(int nums[],int index,int i)
     {
        int temp=nums[index];
        nums[index]=nums[i];
        nums[i]=temp;
     }
}