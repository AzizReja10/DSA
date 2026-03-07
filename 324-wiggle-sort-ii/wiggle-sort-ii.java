import java.util.Arrays;

class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        // 1. Sort the array to easily pick small and large elements
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        
        // 2. Use two pointers starting from the end of each half
        // Left half: 0 to (n-1)/2
        // Right half: (n-1)/2 + 1 to n-1
        int left = (n - 1) / 2; 
        int right = n - 1;
        
        // 3. Fill the original array
        for (int i = 0; i < n; i++) {
            // Even indices get the smaller values
            if (i % 2 == 0) {
                nums[i] = sorted[left--];
            } 
            // Odd indices get the larger values
            else {
                nums[i] = sorted[right--];
            }
        }
    }
}