// User function Template for Java
class Solution {
    static int setBits(int n) {
        int cnt = 0;
        
        for(int i=0;i<32;i++){
            if((n & (1<<i))!=0) cnt++;
        }
        return cnt;
        
    }
}