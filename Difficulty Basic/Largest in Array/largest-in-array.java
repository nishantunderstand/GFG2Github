class Solution {
    public static int largest(int[] arr) {
        return helper(arr,0);
    }
    
    private static int helper(int[] arr, int idx){
        if(idx==arr.length-1) return arr[idx];
        int maxi = helper(arr,idx+1);
        return Math.max(maxi,arr[idx]);
    }
}
