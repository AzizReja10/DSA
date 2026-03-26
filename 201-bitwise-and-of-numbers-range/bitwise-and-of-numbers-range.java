class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shiftCount = 0;
        
        // Keep shifting right until left and right meet
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shiftCount++;
        }
        
        // Shift back to the left to restore the trailing zeros
        return left << shiftCount;
    }
}