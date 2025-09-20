//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine().trim());

        Solution ob = new Solution();

        while (testCases-- > 0) {
            // Read the array from input line
            String[] input = br.readLine().trim().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            // Invoke the function and print the result
            List<List<Integer>> result = ob.getSubArrays(arr);

            System.out.print("[");
            for (int i = 0; i < result.size(); i++) {
                List<Integer> subarray = result.get(i);
                System.out.print("[");
                for (int j = 0; j < subarray.size(); j++) {
                    System.out.print(subarray.get(j));
                    if (j != subarray.size() - 1) {
                        System.out.print(",");
                    }
                }
                System.out.print("]");
                if (i != result.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        int len = arr.length;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                List<Integer> curr = new ArrayList<>();
                for(int k=i;k<=j;k++){
                    curr.add(arr[k]);
                }
                res.add(curr);
            }
        }
        return res;
    }
}