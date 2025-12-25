// Longest Subarray with Sum K
// Sliding Window : Failed (Negative Number)

class Solution {
    public int longestSubarray(int[] arr, int k) {
        Map<Integer,Integer> fMap = new HashMap<>();
        
        fMap.put(0,-1);  // IMPORTANT: prefix sum 0 at index -1
        
        int csum = 0;
        int maxLen =  0;
        
        for(int i=0;i<arr.length;i++){
            csum +=arr[i];
            
            if(fMap.containsKey(csum-k)){
                maxLen = Math.max(maxLen, i-fMap.get(csum-k));
            }
            
            fMap.putIfAbsent(csum,i);
        }
        return maxLen;
    }
}
