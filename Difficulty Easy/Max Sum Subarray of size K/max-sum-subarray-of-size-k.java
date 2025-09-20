class Solution {
    public int maxSubarraySum(int[] arr, int k) {
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
}