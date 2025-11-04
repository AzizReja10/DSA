class Solution {
    List<String>result=null;
     String letters[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
    result=new ArrayList<>();
    if(digits.length()>0)
    comb(0,digits,new StringBuilder());
    return result;
    }
    void comb(int len,String digits,StringBuilder gen){
        if(len==digits.length())
        {
            result.add(gen.toString());
            return;
        }
        char ch=digits.charAt(len);
        String str=letters[ch-'0'];
        for(char c:str.toCharArray()){
            gen.append(c);
            comb(len+1,digits,gen);
            gen.deleteCharAt(gen.length()-1);
        }
    }
}