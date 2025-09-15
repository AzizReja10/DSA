class Solution {
    public String addBinary(String a, String b) {
        StringBuilder total=new StringBuilder();
        int x=a.length()-1,y=b.length()-1;
        int carry=0;
        while(x>=0||y>=0||carry>0)
        {
            int p=(x>=0)?Character.getNumericValue(a.charAt(x)):0;
            int q=(y>=0)?Character.getNumericValue(b.charAt(y)):0;
            int sum=p^q^carry;//1^1=0 carry 1
            total.append(sum);
            carry=(p&q)|(p&carry)|(q&carry);
            x--;
            y--;
        }
        return(total.reverse().toString());
    }
}