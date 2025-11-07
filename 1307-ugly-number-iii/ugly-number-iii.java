class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {
        return (int)search(n,a,b,c);
    }
    long search(long nn,long aa,long bb,long cc)
    {
        long n=nn;
        long a=aa;
        long b=bb;
        long c=cc;
        long o=0;
        long low=1;
        long high=Integer.MAX_VALUE;
        while(low<high)
        {
            long mid=(low+high)/2;
            o=(int)((mid/a)+(mid/b)+(mid/c)-(mid/lcm(a,b))-(mid/lcm(b,c))-
            (mid/lcm(c,a))+(mid/lcm(a,lcm(b,c))));
            if(o<nn)
            low=mid+1;
            else
            high=mid;
        }
        return((int)low);
    }
    long lcm(long a,long b)
    {
        return a*b/gcd(a,b);
    }
    long gcd(long a,long b)
    {
        if(a>b)
        return gcd(b,a);
        if(a==0)
        return b;
        else
        return gcd(a,b%a);
    }
}