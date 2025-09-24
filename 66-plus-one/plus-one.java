import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
          StringBuilder ans=new StringBuilder("");
        for(int i:digits)
        ans.append(i);
       BigInteger a=new BigInteger(ans.toString());
        a=a.add(BigInteger.ONE);
         String g=String.valueOf(a);
        int arr[]=new int[g.length()];
        for(int i=0;i<arr.length;i++)
          arr[i] = Character.getNumericValue(g.charAt(i));
          return(arr);
    }
}