class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int barrier=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' '&&barrier==0)
            {
             continue;
            }else if(s.charAt(i)!=' ')
            {
                count++;
                barrier++;
            }else if(s.charAt(i)==' '&&barrier>0)
            break;
        }
        return(count);
    }
}