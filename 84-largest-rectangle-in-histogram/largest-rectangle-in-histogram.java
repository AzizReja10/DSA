class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length==0||heights==null)
        return 0;
       Stack<Integer> stack=new Stack<>();
       int maxAr=0;
       int n=heights.length;
       for(int i=0;i<=n;i++)
       {
        int curr=(i==n)?0:heights[i];
        while(!stack.isEmpty()&&curr<heights[stack.peek()])
        {
            int height=heights[stack.pop()];
            int width=stack.isEmpty()?i:i-stack.peek()-1;
            maxAr=Math.max(maxAr,height*width);
        }
        stack.push(i);
       }
       return maxAr;
    }
}