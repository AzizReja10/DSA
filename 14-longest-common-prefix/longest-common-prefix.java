class Solution {
    public String longestCommonPrefix(String[] s) {
         StringBuilder add=new StringBuilder();
        for(int i=0;i<s[0].length();i++)
        {
            char g=s[0].charAt(i);
            int count=0;
            for(int j=1;j<s.length;j++)
            {
                 if (i >= s[j].length() || s[j].charAt(i) != g) {
                    return add.toString(); 
                }
            }
          
            add.append(g);
        }
        return(add.toString());
    }
}