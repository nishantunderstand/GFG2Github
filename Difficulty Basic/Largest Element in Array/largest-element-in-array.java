class Solution {
    public static int largest(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxi = Math.max(maxi,arr[i]);
        }
        return maxi;
    }
}
