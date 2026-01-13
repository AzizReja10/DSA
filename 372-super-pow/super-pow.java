class Solution {
    private static final int m = 1337;

    public int superPow(int a, int[] b) {
        a %= m;
        int result = 1;
        for (int i = b.length - 1; i >= 0; i--) {
            result = (result * helper(a, b[i])) % m;
            a = helper(a, 10);
        }
        return result;
    }

    private int helper(int a, int b) {
        int res = 1;
        a %= m;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (res * a) % m; 
            }
            a = (a * a) % m;
            b /= 2;
        }
        return res;
    }
}