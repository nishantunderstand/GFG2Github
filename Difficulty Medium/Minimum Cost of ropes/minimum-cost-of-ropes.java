class Solution {
    
    public static int minCost(int[] arr) {
        // return bruteForce(arr);
        return heapApproach(arr);
    }
    
    // Sunday, July 5, 2026 9:10:47 AM
	// TC : O(2^n^2nlognk) | SC : O(1n2^nlogkh)
    private static int heapApproach(int[] arr) {
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        
        for(int a : arr){
            minPQ.offer(a);
        }
        int cost = 0;
        while(minPQ.size()>1){
            int p1 = minPQ.poll();
            int p2 = minPQ.poll();
            int newRope = p1+p2;
            cost += newRope;
            minPQ.offer(newRope);
        }
        return cost;
    }
    
    
    
    // Brute Force
    // Sunday, July 5, 2026 9:07:21 AM
	// TC : O(n) | SC : O(n)
	// TLE
    private static int bruteForce(int[] arr) {
        // Build Array -> List
        List<Integer> rope = new ArrayList<>();
        
        for(int a : arr){
            rope.add(a);
        }
        int cost  = 0;
        while(rope.size()>1){
            Collections.sort(rope);
            int p1 = rope.remove(0); //<--
            int p2 = rope.remove(0);  //<--
            int newRope = p1+p2;
            cost += newRope; //<--
            rope.add(newRope); // Add 1 New Cost Back
        }
        return cost;
    }
}