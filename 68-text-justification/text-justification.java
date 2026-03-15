class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
         List<String> result=new ArrayList<>();
        int idx=0;
        while(idx<words.length)
        {
            int count=words[idx].length();
            int last=idx+1;
            while(last<words.length)
            {
                if(words[last].length()+count+1>maxWidth)
                break;
                count+=words[last].length()+1;
                last++;
            }
            StringBuilder sb=new StringBuilder("");
            int diff=last-idx-1;
            if(last==words.length||diff==0)
            {
                for(int i=idx;i<last;i++)
                {
                    sb.append(words[i]);
                    if(i<last-1)
                    sb.append(" ");
                }
                while(sb.length()<maxWidth)
                sb.append(" "); 
            }else
            {
                int spaces=(maxWidth-count)/diff;
                int extra=(maxWidth-count)%diff;
               for (int i = idx; i < last; i++) {
                    sb.append(words[i]);
                    if (i < last - 1) 
                    {
                        int spacesToApply = 1 + spaces + ((i - idx <  extra) ? 1 : 0);
                        for (int s = 0; s < spacesToApply; s++) {
                            sb.append(" ");
                        }
                    }
                }
            }

            result.add(sb.toString());
            idx = last;
        }
        return result;
    }
}