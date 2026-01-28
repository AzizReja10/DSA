class Solution {
    public String decodeString(String s) {
        Stack<Integer> num=new Stack<>();
        Stack<StringBuilder> st=new Stack<>();
        int k=0;
        StringBuilder curr=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                k=(k*10)+(c-'0');
            }
            else if(c=='[')
            {
                num.push(k);
                st.push(curr);
                k=0;
                curr=new StringBuilder();
            }
            else if(c==']')
            {
                StringBuilder res=curr;
                curr=st.pop();
                int times=num.pop();
                while(times-->0)
                {
                    curr.append(res);
                }
            }else
            {
                curr.append(c);
            }
        }
        return curr.toString();
    }
}