class Solution {
    public int maxProfit(int[] prices) {
       int profit=0;
        int min=prices[0];
    
        for(int i=1;i<prices.length;i++)
        {
            int currprofit=prices[i]-min;
            profit=Math.max(profit,currprofit);
            min=Math.min(prices[i],min);
        }
        return profit;
    
    }
}