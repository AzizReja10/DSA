import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, List<String> currentList, List<List<String>> result) {
        // Base case: If we've reached the end of the string, add the current partition to results
        if (start == s.length()) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            // Check if the substring from 'start' to 'end' is a palindrome
            if (isPalindrome(s, start, end)) {
                // Add the valid substring to our path
                currentList.add(s.substring(start, end + 1));
                
                // Move the pointer forward to the next character after 'end'
                backtrack(s, end + 1, currentList, result);
                
                // Remove the last element (backtrack) to try the next possible split
                currentList.remove(currentList.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) return false;
        }
        return true;
    }
}