import java.util.*;
class Solution {
    public int findMinDifference(List<String> timePoints) {
        int diff[] = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); i++) {
            String time = timePoints.get(i);
            String[] parts = time.split(":");
            int hour = Integer.parseInt(parts[0]);
            int min = Integer.parseInt(parts[1]);
            diff[i] = hour * 60 + min;
        }
        Arrays.sort(diff);
        int small = Integer.MAX_VALUE;
        for (int i = 1; i < diff.length; i++) {
            small = Math.min(small, diff[i] - diff[i - 1]);
        }
        int circularDiff = 1440 - diff[diff.length - 1] + diff[0];
        small = Math.min(small, circularDiff);
        return small;
    }
}
