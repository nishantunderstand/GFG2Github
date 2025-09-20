class Solution {
    // Divisor  = b
    // Dividend = a
    // Euclidian GCD 
    // Saturday, September 13, 2025 9:33:40 PM
    // Time Complexity:O(log(min(a,b))) | Space Complexity:O(log(min(a,b)))
    public static int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b,a%b);
    }
}

// Dry run For 20,28, 