class Solution {
    public int evalRPN(String[] tokens) {
        return polish(tokens);
    }
   public static int polish(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {
            // If the token is an operator
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                // Pop the two operands (Note: the second pop is the left operand)
                int b = stack.pop();
                int a = stack.pop();

                if (s.equals("+")) stack.push(a + b);
                else if (s.equals("-")) stack.push(a - b);
                else if (s.equals("*")) stack.push(a * b);
                else if (s.equals("/")) stack.push(a / b);
            } else {
                // If it's a number, convert to int and push
                stack.push(Integer.parseInt(s));
            }
        }
        // The final result is the only thing left in the stack
        return stack.pop();
    }
}