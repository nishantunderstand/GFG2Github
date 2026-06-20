class Solution {
    int countFreq(int[] arr, int target) {
        // Find First and Last Occurence 
        // lastOccurence - firstOccurence+1
        int lb = findLB(arr,target);
        if(lb == arr.length || arr[lb]!=target){
            return 0;
        }
        int ub = findUB(arr,target);
        return ub-lb;
    }
    
    private int findLB(int[] nums, int k){
        int low = 0;
        int high = nums.length-1;
        int ans = nums.length;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>=k){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    
    private int findUB(int[] nums, int k){
        int low = 0;
        int high = nums.length-1;
        int ans = nums.length;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>k){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}



