// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int armNum = 0;
        int ogNum = n;
        
        while(n!=0){
            int rem = n%10;
            n = n/10;
            armNum += rem*rem*rem;
        }
        return armNum==ogNum;
    }
}