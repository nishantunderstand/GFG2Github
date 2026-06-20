class Solution {
    public int setBit(int n) {
        for(int i=0;i<32;i++){
            if((n & (1<<i))==0){
                return n | (1<<i);    
            }
        }
        return n;
    }
}

/**
 * // Check Whether it is Set or Not 
        // Set => Do Nothing
            n & (1<<i) !=0
        // Unset => Set
            n | (1<<i)
            
*/