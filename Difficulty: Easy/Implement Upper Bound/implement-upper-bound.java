class Solution {
    int upperBound(int[] arr, int target) {
        // Upper Bound , Value that is greater than
        // AVOID EQUAL CONDITION
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>target){ //<-- NEED TO UNDERSTAND AND DRY RUN
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}
