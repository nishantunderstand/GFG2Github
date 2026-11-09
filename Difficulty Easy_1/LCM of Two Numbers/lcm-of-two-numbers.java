// GFG : LCM of Two Numbers
// Monday, November 9, 2026 8:16:38 PM    
// TC : O(n) | SC : O(1)
class Solution {
    public int lcm(int a, int b) {
        if(a==0 || b==0) return 0;
        
        int gcd = findGCD(a,b);
        // return (a*b)/gcd; // Possible of IntegerOverflow
        return (a/gcd)*b; // Avoid IntegerOverflow
    }
    
    // TC : O(log(min(a,b))) | SC : O(log(min(a,b)))
    private int findGCD(int a,int b){
        if(b==0) return a;
        return findGCD(b,a%b);
    }
}