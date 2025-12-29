// Subarrays with sum K
class Solution {
    public int cntSubarrays(int[] arr, int k) {
        Map<Integer, Integer> fMap = new HashMap<>();
        int csum = 0;
        int cnt = 0;
        fMap.put(0,1);
        
        // csum-preSum = k
        // preSum = csum-k
        
        for(int i=0;i<arr.length;i++){
            csum += arr[i];
            if(fMap.containsKey(csum-k)){
                cnt += fMap.get(csum-k);
            }
            // Repeated Occurence
            fMap.put(csum,fMap.getOrDefault(csum,0)+1);
            
        }
        return cnt;
    }
}