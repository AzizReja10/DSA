class Solution {
    public int kthGrammar(int n, int k) {
        return(grammar(n,k,0));
    }
    static int grammar(int n,int k,int f)
    {
    if(n==1)
    return f%2==0?0:1;
    if(k%2==0)
    return(grammar(n-1,k/2,f+1));
    return(grammar(n-1,(k+1)/2,f));
}
}