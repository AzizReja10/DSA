class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;
     Stack<Integer> st=new Stack<>();
     int curr=0;
     char op='+';
     for(int i=0;i<s.length();i++)
     {
        char c=s.charAt(i);
        if(Character.isDigit(c))
        {
            curr=curr*10+(c-'0');
        }
        if(!Character.isDigit(c)&&!Character.isSpace(c)|| i == s.length() - 1)
        {
            if(op=='+')
                st.push(curr);
            else if(op=='-')
                st.push(-curr);
            else if(op=='*')
            st.push(st.pop()*curr);
            else if (op == '/') 
                    st.push(st.pop() / curr);
                
            op=c;
            curr=0;
        }
     }
     int result=0;
     while(!st.isEmpty())
     result+=st.pop();
     return result;
    }
}