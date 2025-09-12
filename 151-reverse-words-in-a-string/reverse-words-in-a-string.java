class Solution {
    public String reverseWords(String s) {
          StringBuilder ans=new StringBuilder("");
         StringBuilder fin=new StringBuilder("");
        s=" "+s;
        int k=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char g=s.charAt(i);
            if(g!=' ')
            {
                ans.insert(0,g);
                k=0;
            }else if(k<1)
            {
                fin.append(ans);
                fin.append(" ");
                ans.setLength(0);
                k++;
            }
        }
       
        return(fin.toString().trim());
    }
}