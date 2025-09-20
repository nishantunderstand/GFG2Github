//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        while (T > 0) {
            int x = Integer.parseInt(br.readLine().trim());
            String[] input = br.readLine().trim().split(" ");
            int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

            Solution solution = new Solution();
            System.out.println(solution.smallestSubWithSum(x, arr));

            T--;

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

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
            
            while(windowSum>=x){
                minLen = Math.min(minLen,i-startIdx+1);
                windowSum = windowSum-arr[startIdx]; //<--
                startIdx++;
            }
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
        
    }
}
