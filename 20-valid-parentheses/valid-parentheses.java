class Solution {
    public boolean isValid(String s) {
        Stack<Character> ob=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='(')
            ob.push(')');
            else if(c=='[')
            ob.push(']');
            else if(c=='{')
            ob.push('}');
            else if(ob.isEmpty()||c!=ob.pop())
            return false;
        }
        return ob.isEmpty();
    }
}