class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long mod = 1000000007;
        long share = 0;

        Queue<long[]> delayL = new LinkedList<>();
        Queue<long[]> forgetL = new LinkedList<>();

        long[] first = {1, 1};
        delayL.offer(first);
        forgetL.offer(first);

        for (int day = 1; day <= n; day++) {

            while (!delayL.isEmpty() && delayL.peek()[0] + delay <= day) {
                share = (share + delayL.poll()[1]) % mod;
            }

            while (!forgetL.isEmpty() && forgetL.peek()[0] + forget <= day) {
                share = (share - forgetL.poll()[1] + mod) % mod;
            }

            if (share > 0 && day > 1) {
                long[] newg = {day, share};
                delayL.offer(newg);
                forgetL.offer(newg);
            }
        }

        long total = share;
        for (long[] group : delayL) {
            total = (total + group[1]) % mod;
        }

        return (int) total;
    }
}
