class Solution {
    public int hammingWeight(int a) {
              int count=0;
        StringBuilder bit=new StringBuilder("");
       while(a>0)
        {
            int n=a&1;
            bit.append(n);
            a=a>>1;
        }
        for(int i=0;i<bit.length();i++)
        //count=bit.charAt(i)=='1'?count++:count;
        {
            if(bit.charAt(i)=='1')
            count++;
        }
        return(count);
    }
}