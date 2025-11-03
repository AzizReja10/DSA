class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder current=new StringBuilder("");
        generate(0, 0, n, current, result);
        return(result);
    }
    void generate(int open, int close, int n, StringBuilder current, List<String> result) {
        // base case
        if (open == n && close == n) {
            result.add(current.toString());
            return;
        }
        if (open < n) {
            generate(open + 1, close, n, current.append("("), result);
            current.deleteCharAt(current.length()-1);
        }
        if (close < open) {
            generate(open, close + 1, n, current.append(")"), result);
            current.deleteCharAt(current.length()-1);
        }
    }
}