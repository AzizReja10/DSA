class Solution {
    public boolean judgeSquareSum(int c) {
        long left=0,right=(long)Math.sqrt(c);
        while(left<=right)
        {
            long mid=(left+right)/2;
            long cal=left*left+right*right;
            if(cal==c)
            {
                   return true;
            }
            else if(cal>c)
            right--;
            else
            left++;
        }
        return false;
    }
}