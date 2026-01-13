class Solution {
    public int maxProduct(String[] words) {
         int state[]=new int[words.length];
         int ans=0;
        for(int i=0;i<words.length;i++)
        {
           for(int k=0;k<words[i].length();k++)
            {
                char c=words[i].charAt(k);
                state[i]|=1<<(c-'a');
            }
            for(int j=0;j<i;j++)
            {
                if((state[i]&state[j])==0)
                {
                    if(words[i].length()*words[j].length()>ans)
                    {
                        ans=words[i].length()*words[j].length();
                    }
                }
            }
        }
        return ans;
    }
}