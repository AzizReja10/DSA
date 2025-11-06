import java.util.Arrays;

class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int radius = 0;
        for (int house : houses) {
            int left = 0, right = heaters.length - 1;
            int min = Integer.MAX_VALUE;
            while (left <= right) {
                int mid = (left + right) / 2;
                int diff = heaters[mid] - house;
                min = Math.min(min, Math.abs(diff));
                if (heaters[mid] < house)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            radius = Math.max(radius, min);
        }
        return radius;
    }
}
