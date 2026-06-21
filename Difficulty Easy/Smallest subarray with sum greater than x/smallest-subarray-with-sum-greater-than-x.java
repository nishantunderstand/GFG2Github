// Friday, February 7, 2025 9:57:30 PM
// Time Complexity:O(n) | Space Complexity:O(1)
class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // Slinding Window Dynamic
        int windowSum = 0;
        int startIdx = 0;
        int minLen = Integer.MAX_VALUE;
        int len = arr.length;
        for(int i=0;i<len;i++){
            windowSum+=arr[i];
            
            while(windowSum>x){ //<--
                minLen = Math.min(minLen,i-startIdx+1);
                windowSum = windowSum-arr[startIdx]; //<--
                startIdx++;
            }
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}
