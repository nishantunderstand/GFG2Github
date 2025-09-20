//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int k = Integer.parseInt(br.readLine());

            Solution ob = new Solution();
            int ans = ob.maximumSumSubarray(arr, k);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java


// Friday, February 7, 2025 9:34:59 PM
// Time Complexity:O(n) | Space Complexity:O(n)
class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
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