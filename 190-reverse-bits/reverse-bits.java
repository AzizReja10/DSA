class Solution {
    public int reverseBits(int n) {
         StringBuilder total = new StringBuilder(32);
        for (int i = 31; i >= 0; i--) {
            int bit = (n >> i) & 1;  
            total.append(bit);
        }
      
        total.reverse();
         int result = 0;
        for (int i = 0; i < total.length(); i++) {
            result <<= 1;  // shift left
            if (total.charAt(i) == '1') {
                result |= 1;  // add current bit
            }
        }
        return result;
    }
}