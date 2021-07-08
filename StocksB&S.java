class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int maxprice = prices[0];
        int maxprofit =0;
        for(int i=1;i<prices.length;i++){
            if(minprice <= prices[i] && prices[i] <= maxprice){
                continue;
            }
            maxprice = Math.max(maxprice,prices[i]);
           if(minprice > prices[i]) {
               minprice  = prices[i];
               maxprice = prices[i];
           } 
           maxprofit = Math.max(maxprofit,maxprice-minprice);
        }
        return maxprofit;
    }
}
