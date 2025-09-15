class Solution {
    public int hammingWeight(int a) {
              int count=0;
       while(a>0)
        {
            int n=a&1;
             if(n==1)
            count++;
            a=a>>1;
        }
  
        return(count);
    }
}