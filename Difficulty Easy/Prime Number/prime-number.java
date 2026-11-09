class Solution {
    static boolean isPrime(int n) {
        if(n<=1) return false;
        for(int div=2;div*div<=n;div++){
            if(n%div==0) return false;
        }
        return true;
    }
}