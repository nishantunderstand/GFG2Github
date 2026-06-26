class Solution {
    public long subarrayXor(int arr[], int k) {
        int n = arr.length;
        long cnt = 0;
        
        Map<Integer, Integer> prefix = new HashMap<>();
        prefix.put(0,1);
        
        int xor = 0;
        
        for(int i=0;i<n;i++){
            xor = xor ^ arr[i];
            int target = xor^k;
            
            if(prefix.containsKey(target)){
                 cnt += prefix.get(target);   
            }
            prefix.put(xor, prefix.getOrDefault(xor,0)+1);
            
        }
        return cnt;
    }
}

// Sunday, June 14, 2026 2:36:38 PM
// TC : O(n) | SC : O(n)
// GFG : Count Subarrays with given XOR
