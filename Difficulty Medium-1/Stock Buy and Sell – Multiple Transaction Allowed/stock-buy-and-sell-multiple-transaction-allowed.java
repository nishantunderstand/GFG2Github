// User function Template for Java

// Stock Buy and Sell – Multiple Transaction Allowed

class Solution {
    public int maximumProfit(int prices[]) {
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