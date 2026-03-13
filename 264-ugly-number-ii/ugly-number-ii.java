import java.util.*;

class Solution {
    public int nthUglyNumber(int n) {
        if (n == 1) return 1;
        
        // Min-Heap to always get the smallest available ugly number
        PriorityQueue<Long> heap = new PriorityQueue<>();
        // Set to avoid adding the same number multiple times (e.g., 2*3 and 3*2)
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