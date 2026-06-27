class Solution {
    int maxLength(int arr[]) {
        // We need to use prefixhashMap Approach
        
        // k : Sum , V : Index
        Map<Integer,Integer> prefix = new HashMap<>();
        prefix.put(0,-1);
        
        int len = 0;
        int csum = 0;
        
        for(int i=0;i<arr.length;i++){
            csum += arr[i];
            
            if(prefix.containsKey(csum)){
                len = Math.max(len, i-prefix.get(csum));
            }else{
                prefix.put(csum,i);    
            }
            
        }
        return len;
    }
}

// Sunday, June 14, 2026 2:32:38 PM
// TC : O(2^nnlognk) | SC : O(2^n1logkh)
// GFG : Largest subarray with 0 sum