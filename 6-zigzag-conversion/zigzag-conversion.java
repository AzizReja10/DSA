class Solution {
    public String convert(String s, int numRows) {
        StringBuilder ans[]=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
        ans[i]=new StringBuilder();
        int i=0;
        while(i<s.length())
        {
            for(int j=0;j<numRows&&i<s.length();j++)
            ans[j].append(s.charAt(i++));
            for(int j=numRows-2;j>0&&i<s.length();j--)
            ans[j].append(s.charAt(i++));
        }
        StringBuilder finale=new StringBuilder();
            for (StringBuilder row : ans) finale.append(row);
        return(finale.toString());
    }
}