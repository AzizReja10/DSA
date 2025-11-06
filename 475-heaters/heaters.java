class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int radius=0;
        for(int i:houses)
        {
        int min=Integer.MAX_VALUE;
        for(int j:heaters)
        min=Math.min(min,Math.abs(i-j));
        radius=Math.max(min,radius);
        }
        return radius;
    }
}