class Solution {
    public int maxProfit(int[] prices) {
            int maxprofit=0;
       int minprice=prices[0];
        for(int price : prices){
           if(price-minprice<0)
               minprice=price;
            maxprofit=Math.max(price-minprice,maxprofit);
        }
        return(maxprofit);
    }
}