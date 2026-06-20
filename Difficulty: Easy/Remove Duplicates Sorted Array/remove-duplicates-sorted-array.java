class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        
        // UnSortedCase
        // Cannot we use LinkedHashSet For Maintaining the Order
        //Set<Integer> seen = new HashSet<>();
        Set<Integer> seen = new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            seen.add(arr[i]);
        }
        
        ArrayList<Integer> res = new ArrayList<>(seen);
        //Collections.sort(res);
        return res;
    }
    
    
    ArrayList<Integer> removeDuplicatesSortedCase(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(arr[0]);
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                res.add(arr[i]);
            }
        }
        return res;
    }
}
/**
FAILED 1  2  2  3 4  5 6 6


*/