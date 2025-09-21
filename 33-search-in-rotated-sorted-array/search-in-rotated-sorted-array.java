class Solution {
    public int search(int[] nums, int target) {
    int bp=nums.length-1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]>nums[i])
            {
                bp=i;
                break;
            }
        }
        int x=sort(nums,0,bp-1,target);
        if(x==-1)
        x=sort(nums,bp,nums.length-1,target);
        return(x);
    }
    static int sort(int nums[],int left,int right,int target)
    {
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]==target)
            return(mid);
            else if(nums[mid]<target)
            left=mid+1;
            else
            right=mid-1;
        }
        return(-1);
    }
}