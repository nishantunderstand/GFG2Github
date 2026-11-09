class Solution {
    static int sumOfDigits(int n) {
        return iterative(n);
        //return recursive(n,0);
    }
    
    static int recursive(int n,int sum ) {
        if(n==0) return sum; // Base
        sum += n%10; // Work 
        return recursive(n/10,sum); // Recursive Function
    }
    
    
    static int iterative(int n) {
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum += rem;
            n = n/10;
        }
        return sum;
    }
}
