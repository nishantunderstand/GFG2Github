import java.util.*;

class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Max Priority Queue 
        PriorityQueue<Integer> maxPQ = 
            new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            maxPQ.offer(arr[i]);
            if(maxPQ.size()>k){
                maxPQ.poll();
            }
        }
        return maxPQ.poll();
    }
}
