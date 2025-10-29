import java.util.*;
class Solution {
private int nums[];
private int original[];
private Random rand = new Random();
    public Solution(int[] nums) {
        this.nums=new int[nums.length];
        original=new int[nums.length];
        this.nums=nums.clone();
        original=nums.clone();;
    }
    
    public int[] reset() {
        nums=original.clone();
        return nums;
    }
    
    public int[] shuffle() {
          for (int i = 0; i < nums.length; i++) {
            int j = i + rand.nextInt(nums.length - i);
            
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }
}

