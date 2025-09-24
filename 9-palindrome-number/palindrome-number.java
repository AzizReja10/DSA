class Solution {
    public boolean isPalindrome(int x) {
    if(x<0||(x%10==0&&x!=0))
    return(false);
     int reverse=0;
     while(x>0)
     {
        reverse=reverse*10+x%10;
        x/=10;
        if(reverse>=x)
        break;
     }
     return(reverse==x||reverse/10==x);   
    }
}