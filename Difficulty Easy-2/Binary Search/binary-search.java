class Solution {
    public int binarysearch(int[] arr, int k) {
        return binarySearchImplement(arr,k);
    }
    
    private int binarySearchImplement(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                ans = mid;        // store answer
                high = mid - 1;   // move left for first occurrence
            } 
            else if (arr[mid] < k) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
