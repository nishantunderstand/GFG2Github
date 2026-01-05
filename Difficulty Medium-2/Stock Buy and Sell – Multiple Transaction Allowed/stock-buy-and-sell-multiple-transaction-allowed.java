// Stock Buy and Sell – Multiple Transaction Allowed
class Solution {
    public int maximumProfit(int prices[]) {
        //return maximumProfit1(prices);
        return maximumProfit2(prices);
    }
    private int maximumProfit2(int[] prices){
        if(prices==null || prices.length<1) return 0;
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]<prices[i]){
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
    
    
    private int maximumProfit1(int prices[]) {
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                maxProfit += prices[i]-prices[i-1];
            }
        }
        return maxProfit;
    }
}


/**
Profit : Buy at low and Sell at max 
How this is Different from Previous Question ?
That now we can sell at different.
*/