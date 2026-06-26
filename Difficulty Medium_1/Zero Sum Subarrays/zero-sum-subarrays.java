// Zero Sum Subarrays
class Solution {
    public int findSubarray(int[] arr) {
        return prefixHashMapApproach(arr);
    }
    
    // Saturday, March 15, 2025 9:30:47 PM
    // Time Complexity:O(n) | Space Complexity:O(n)
    public int prefixHashMapApproach(int[] arr) {
        int cnt = 0;
        int csum = 0;
        // Sum-i
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<arr.length;i++){
            csum+=arr[i];
            if(hm.containsKey(csum)){
                cnt += hm.get(csum);
            }
            
            hm.put(csum,hm.getOrDefault(csum,0)+1);
        }
        return cnt;
    }
}
