class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        int startrow=0,startcolumn=0,endrow=matrix.length-1,endcolumn=matrix[0].length-1;
        while(startrow<=endrow&&startcolumn<=endcolumn)
        {
            for(int j=startcolumn;j<=endcolumn;j++)
            spiral.add(matrix[startrow][j]);
            for(int i=startrow+1;i<=endrow;i++)
            spiral.add(matrix[i][endcolumn]);
            for(int j=endcolumn-1;j>=startcolumn;j--)
            {
                if(startrow==endrow)
                break;
                spiral.add(matrix[endrow][j]);
        }
            for(int i=endrow-1;i>=startrow+1;i--)
            {
                if(startcolumn==endcolumn)
                break;
            spiral.add(matrix[i][startcolumn]);
            }
            System.out.println();
            startrow++;
            startcolumn++;
            endrow--;
            endcolumn--;
        }
        return(spiral);
    }
}