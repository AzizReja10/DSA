import java.util.*;
class Solution {
    public int nthUglyNumber(int n) {
        if (n == 1) return 1;
        PriorityQueue<Long> heap = new PriorityQueue<>();
        Set<Long> seen = new HashSet<>();
        int[] primes = {2, 3, 5};
        heap.offer(1L);
        seen.add(1L);
        long currentUgly = 1L;
        for (int i = 0; i < n; i++) {
            currentUgly = heap.poll(); 
            for (int prime : primes) {
                long next = currentUgly * prime;
                if (!seen.contains(next)) {
                    seen.add(next);
                    heap.offer(next);
                }
            }
        }
        return (int) currentUgly;
    }
}