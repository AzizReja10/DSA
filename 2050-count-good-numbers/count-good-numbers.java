class Solution {
    long MOD=1000000007;
    public int countGoodNumbers(long n) {
        long even=n/2+n%2;
        long odd=n/2;
        long ans=(power(5,even)*power(4,odd))%MOD;
        return((int)(ans));
    }
     long power(long x,long y)
    {
        if(y==0)
        return 1;
        long ans=power(x,y/2);
        ans*=ans;
        ans%=MOD;
        if(y%2==1)
        ans*=x;
        ans%=MOD;
        return ans;
    }
    
}