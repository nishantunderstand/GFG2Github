class Solution {
    public static int largest(int[] arr) {
        return iterative(arr);
        //return recursive(arr,arr.length-1);
    }
    
    private static int iterative(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxi = Math.max(maxi,arr[i]);
        }
        return maxi;
    }
    
    // TLE 
    private static int recursive(int[] arr, int idx) {
        // Base case 
        if(idx==0) return arr[0];
        int maxi = recursive(arr,idx-1);
        return Math.max(maxi, arr[idx]);
    }
}
