class Solution {
    public String simplifyPath(String path) {
        Stack<String> ob=new Stack<>();
        StringBuilder res=new StringBuilder("");
        String p[]=path.split("/");

        for(int i=0;i<p.length;i++)
        {
            if(!p[i].isEmpty()&&p[i].equals(".."))
            {
                if(!ob.isEmpty())
                ob.pop();
            }
            else if(!p[i].equals("")&&!p[i].equals(".")&&!p[i].equals(".."))
            ob.push(p[i]);
        } 
        if(ob.isEmpty())
        return("/");
        while(!ob.isEmpty())
        res.insert(0,ob.pop()).insert(0,"/");
        return(res.toString());
    }
}