class Solution {
    public boolean isPalindrome(int x) {
     if(x<0)
     return(false);
     StringBuilder ans=new StringBuilder(String.valueOf(x));
     ans.reverse();
     boolean check=ans.toString().equals(String.valueOf(x));
     return(check);   
    }
}