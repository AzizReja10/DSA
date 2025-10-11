class Solution {
    public int[][] generateMatrix(int n) {
        int array[][]=new int[n][n];
        int x=1;
        int startrow=0,startcolumn=0,endrow=array.length-1,endcolumn=array[0].length-1;
        while(startrow<=endrow&&startcolumn<=endcolumn)
        {
            for(int i=startcolumn;i<=endcolumn;i++)
            array[startrow][i]=x++;
            for(int i=startrow+1;i<=endrow;i++)
            array[i][endcolumn]=x++;
            if (startrow < endrow) {
                for (int i = endcolumn - 1; i >= startcolumn; i--)
                    array[endrow][i] = x++;
            }
             if (startcolumn < endcolumn) {
                for (int i = endrow - 1; i > startrow; i--)
                    array[i][startcolumn] = x++;
            }
            startcolumn++;
            startrow++;
            endcolumn--;
            endrow--;
        }
        return array;
    }
}