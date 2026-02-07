class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<num.length();i++)
        {
            int c=num.charAt(i)-'0';
            while(!st.isEmpty()&&k>0&&st.peek()>c)
            {
                st.pop();
                k--;
            }
            st.push(c);
        }
        while(k>0&&!st.isEmpty())
        {
            k--;
            st.pop();
        }
        StringBuilder sb=new StringBuilder();
        for(int i:st)
        {
               if(i==0&&sb.length()==0)
               continue;
               sb.append((char)(i+'0'));
        }
        return sb.length()==0?"0":sb.toString();
    }
}