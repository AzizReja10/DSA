class Solution {
    public String countAndSay(int n) {
            return(cs("1",n));
    }
    private static String cs(String a,int t)
    {
        if(t==1)
        return(a);
        int count=1;
        StringBuilder l=new StringBuilder("");
        for(int i=1;i<=a.length();i++)
        {
           if(i<a.length()&&a.charAt(i)==a.charAt(i-1))
           count++;
           else
           {
               l.append(count);
               l.append(a.charAt(i-1));
               count=1;
           }
        }
          return cs(l.toString(), t - 1);
    }
}