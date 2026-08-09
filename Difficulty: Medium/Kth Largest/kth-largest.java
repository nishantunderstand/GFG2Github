class Solution {
    public static int kthLargest(int arr[], int k) {
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        
        for(int i=0;i<arr.length;i++){
            minPQ.offer(arr[i]);
            if(minPQ.size()>k){
                minPQ.poll();
            }
        }
        return minPQ.peek();
    }
}
// GFG : Kth Largest
