class Solution {
    int maxSubarraySum(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        int csum = 0;
        for(int i=0;i<arr.length;i++){
            csum +=  arr[i];
            maxi = Math.max(maxi,csum);
            if(csum<0) csum = 0;
        }
        return maxi;
    }
}
