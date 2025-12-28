class Solution {
    boolean twoSum(int arr[], int target) {
        if(arr==null || arr.length<2) return false;
        
        Arrays.sort(arr);
        
        int left = 0, right = arr.length-1;
        while(left<right){
            int csum = arr[left]+arr[right];
            if(csum==target) return true;
            else if(csum>target) right--;
            else left++;
        }
        return false;
    }
}