class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        
        // PriorityQueue + Descending Order
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((a,b) -> b-a);
        
        
        
        // Add All Element
        for(int a : arr){
            maxPQ.offer(a);
        }
        
        
        // Pick k + Add to list 
        ArrayList<Integer> res = new ArrayList<>();
        while(!maxPQ.isEmpty() && k>0){
            res.add(maxPQ.poll()); 
            k--;
        }
        
        return res;
        
    }
}

// GFG : k Largest Elements
// Wednesday, August 12, 2026 8:46:53 PM
// TC : O(nlogn) | SC : O(n)