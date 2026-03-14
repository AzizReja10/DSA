class Solution {
    class Project
    {
        int capital;
        int profit;
        Project(int capital, int profit)
        {
            this.capital=capital;
            this.profit=profit;
        }
    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        Project[] arr=new Project[capital.length];
        for(int i=0;i<capital.length;i++)
           arr[i]=new Project(capital[i],profits[i]);

        Arrays.sort(arr,new Comparator<Project>(){
            public int compare(Project p1, Project p2){
                return p1.capital-p2.capital;
            }
        });

        int i=0;
        PriorityQueue<Project> pq=new PriorityQueue<>(new Comparator<Project>(){
            public int compare(Project p1, Project p2){
                return p2.profit-p1.profit;
            }
        });
        while(k-- > 0)
        {
           while(i<arr.length && arr[i].capital<=w)
           {
             pq.add(arr[i]);
             i++;
           }
           if(pq.size()==0) break;
           w=w+pq.poll().profit;     
        } 
        return w;   
    }
}