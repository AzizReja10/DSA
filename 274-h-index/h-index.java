import java.util.Arrays;
class Solution {
    public int hIndex(int[] citations) {
        int h_index=0;
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++)
        {
            int count=citations.length-i;
            if(citations[i]>=count)
            h_index++;
        }
        return(h_index);
    }
}