class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        long number = 0; // Changed to long
        long result = 0; // Changed to long
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push((int)result); // Cast to int for the stack
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * number;
                number = 0;
                result *= stack.pop(); // Pop sign
                result += stack.pop(); // Pop previous result
            }
        }
        
        result += sign * number;
        return (int)result; // Cast back to int for the return type
    }
}