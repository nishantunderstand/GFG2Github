class Solution {
    public int countWays(int n) {
        if(n==0||n==1) return 1;
        
        int prev2 = 1; // countWays(0)
        int prev1 = 1; // countWays(1)
        int curr = 0;
        
        for(int i=2; i<=n; i++){
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        
        return prev1;
    }
}