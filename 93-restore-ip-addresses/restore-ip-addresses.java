import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) return result;
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, List<String> current, List<String> result) {
        // Base case: If we have 4 segments and used all characters
        if (current.size() == 4) {
            if (start == s.length()) {
                result.add(String.join(".", current));
            }
            return;
        }

        // Try segments of length 1, 2, and 3
        for (int len = 1; len <= 3; len++) {
            if (start + len > s.length()) break;

            String segment = s.substring(start, start + len);
            
            if (isValid(segment)) {
                current.add(segment);
                backtrack(s, start + len, current, result);
                current.remove(current.size() - 1); // Backtrack
            }
        }
    }

    private boolean isValid(String segment) {
        // Check for leading zeros (e.g., "01", "00")
        if (segment.length() > 1 && segment.startsWith("0")) return false;
        
        // Check numerical range
        int val = Integer.parseInt(segment);
        return val >= 0 && val <= 255;
    }
}