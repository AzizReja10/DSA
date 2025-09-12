class Solution {
    public int trap(int[] heights) {
         int maxLeft[]=new int[heights.length];
        int maxRight[]=new int[heights.length];
        maxLeft[0]=heights[0];
        maxRight[heights.length-1]=heights[heights.length-1];
        int total=0;
           for(int i=1;i<heights.length;i++)
        {
        maxLeft[i]=Math.max(heights[i],maxLeft[i-1]);
        maxRight[heights.length-(i+1)]=Math.max(heights[heights.length-(i+1)],maxRight[heights.length-(i)]);
    }
        //for(int i=heights.length-2;i>=0;i--)
        //maxRight[i]=Math.max(heights[i],maxRight[i+1]);
        for(int i=1;i<heights.length;i++)
        {
            int trappedWater=Math.min(maxLeft[i],maxRight[i]);
            total+=trappedWater-heights[i];
        }
        return(total);
    }
}