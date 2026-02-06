class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Integer> st=new Stack<>();
        boolean enter[]=new boolean[26];
        int last[]=new int[26];
        for(int i=0;i<s.length();i++)
        last[s.charAt(i)-'a']=i;
        for(int i=0;i<s.length();i++)
        {
            int x=s.charAt(i)-'a';
            if(enter[x])
            continue;
            enter[x]=true;
            while(!st.isEmpty()&&st.peek()>x&&last[st.peek()]>i)
            enter[st.pop()]=false;
            st.push(x);
        }
        StringBuilder sb=new StringBuilder();
        for(int i:st)
        sb.append((char)(i+'a'));
        return sb.toString();
    }
}