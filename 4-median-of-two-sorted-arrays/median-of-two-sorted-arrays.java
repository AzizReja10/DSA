class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int n=nums1.length,m=nums2.length;
        int sum[]=new int[n+m];
        for(int i=0;i<n+m;i++)
        {
            if(i<n)
            sum[i]=nums1[i];
            else
            sum[i]=nums2[i-n];
        }
        Arrays.sort(sum);
        int right=sum.length;
            if(right%2==1)
               return(sum[right/2]/1.0);
            else
                return((sum[right/2]+sum[right/2-1])/2.0);
    }
}