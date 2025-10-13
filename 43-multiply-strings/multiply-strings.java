class Solution {
    public String multiply(String num1, String num2) {
        int a=num1.length();
        int b=num2.length();
        int c[]=new int[a+b];
        for(int i=num1.length()-1;i>=0;i--)
        {
            for(int j=num2.length()-1;j>=0;j--)
            {
                int pos1=num1.charAt(i)-'0';
                int pos2=num2.charAt(j)-'0';
                int prod=pos1*pos2;
                int sum=prod+c[i+j+1];
                c[i+j+1]=sum%10;
                c[i+j]+=sum/10;
            }
        }
            StringBuilder sb=new StringBuilder("");
            for(int digit:c)
            {
                if(!(digit==0&&sb.length()==0))
                sb.append(digit);
            }
            return sb.length()==0?"0":sb.toString();
        }
    }
