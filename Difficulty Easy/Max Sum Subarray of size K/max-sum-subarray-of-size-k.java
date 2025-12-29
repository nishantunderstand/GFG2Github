class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        return maxSubarraySum1(arr,k);
        //return maxSubarraySum2(arr,k);
    }
    
    
    public int maxSubarraySum1(int[] arr, int k) {
        int maxSum=0,windowSum=0,windowStart=0;
        for(int windowEnd=0;windowEnd<arr.length;windowEnd++){
            windowSum += arr[windowEnd];
            if(windowEnd>=k-1){ //<-- 
                maxSum = Math.max(windowSum,maxSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
    
    public int maximumSumSubarray2(int[] arr, int k) {
        int maxSum = 0;
        int windowSum  = 0;
        for(int i=0;i<k;i++){
            windowSum+=arr[i];
            
        }
        maxSum = windowSum;
        int len = arr.length;
        for(int i=k;i<len;i++){
            windowSum +=arr[i]-arr[i-k];
            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
}