class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int oldmax=arrays.get(0).get(arrays.get(0).size()-1);
        int oldmin=arrays.get(0).get(0);
        int res=0;
        for(int i=1;i<arrays.size();i++)
        {
            List<Integer> array=arrays.get(i);
            int currmin=array.get(0);
            int currmax=array.get(array.size()-1);
            res=Math.max(res,Math.abs(currmax-oldmin));
            res=Math.max(res,Math.abs(oldmax-currmin));
            oldmin=Math.min(oldmin,currmin);
            oldmax=Math.max(oldmax,currmax);
        }
        return res;
    }
}