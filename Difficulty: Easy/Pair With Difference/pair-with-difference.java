// Find Pair Given Difference
class Solution {
    public boolean findPair(int[] arr, int x) {
        if(arr==null || arr.length<2){
            return false;
        }
        Arrays.sort(arr);
        
        int start = 0;
        int end = 1;
        
        while(start<arr.length && end<arr.length){
            // EXPLAIN ME 
            if(start==end){
                end++;
                continue;
            }
            
            int diff = arr[end] - arr[start];
            if(diff==x){
                return true;
            }else if(diff<x){
                end++;
            }else if(diff>x){
                start++;
            }
        }
        return false;
    }
}
