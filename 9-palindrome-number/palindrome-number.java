class Solution {
    public boolean isPalindrome(int x) {
     if(x<0)
     return(false);
     StringBuilder ans=new StringBuilder(String.valueOf(x));
     StringBuilder two=new StringBuilder(ans);
     two.reverse();
     boolean check=ans.toString().equals(two.toString());
     return(check);   
    }
}