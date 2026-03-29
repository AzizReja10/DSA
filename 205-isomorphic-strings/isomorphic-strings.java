class Solution {
    public boolean isIsomorphic(String s, String t) {
         HashMap<Character,Character> hm=new HashMap<>();
        HashMap<Character,Character> mn=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
           char c=s.charAt(i);
           char d=t.charAt(i);
           if(hm.containsKey(c))
           {
            if(hm.get(c)!=d)
            return false;
           }else
           hm.put(c,d);
        if(mn.containsKey(d))
        {
            if(mn.get(d)!=c)
            return false;
        }else
        mn.put(d,c);
        }
        return true;
    }
}