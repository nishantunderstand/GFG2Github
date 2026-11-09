// GFG : Factorial

class Solution {
    int factorial(int n) {
        //return iterative(n);
        return recursive(n);
    }
    
    
    // Monday, November 9, 2026 9:27:20 PM    
    // TC : O(n) | SC : O(n)
    int recursive(int n) {
        if(n==0 || n==1) return 1;
        return n * recursive(n-1);
    }
    
    
    // Monday, November 9, 2026 9:27:25 PM    
    // TC : O(n) | SC : O(1)    
    int iterative(int n) {
        int ans = 1;
        for(int i=2;i<=n;i++){
            ans = ans * i;
        }
        return ans;
    }
}





    
