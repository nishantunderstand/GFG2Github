//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            ArrayList<Integer> array2 = new ArrayList<Integer>();

            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            line = read.readLine();
            tokens = line.split(" ");
            for (String token : tokens) {
                array2.add(Integer.parseInt(token));
            }

            // ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr1 = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr1[idx++] = i;

            int[] arr2 = new int[array2.size()];
            idx = 0;
            for (int i : array2) arr2[idx++] = i;

            String v = new Solution().calc_Sum(arr1, arr2);

            // for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");

            System.out.println(v);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    
    // Wednesday, January 1, 2025 11:20:44 PM
    // Time Complexity:O(n) | Space Complexity:O(1)
    String calc_Sum(int arr1[], int arr2[]) {
        // Complete the function
        int[] res = new int [Math.max(arr1.length,arr2.length)+1];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=res.length-1;
        int c=0;
        int dig =0;
        // Time Complexity:O(n) | Space Complexity:O(1)
        while(i>=0 || j>=0||c>0){
            dig=c;
            if(i>=0) dig +=arr1[i--];
            if(j>=0) dig +=arr2[j--];
            c=dig/10;
            res[k--]=dig%10;
        }
        
        StringBuilder result = new StringBuilder();
        boolean leadingZero=true;
        
        // Time Complexity:O(n) | Space Complexity:O(1)
        for(int x=0;x<res.length;x++){
            if(leadingZero && res[x]==0) continue;
            leadingZero=false;
            result.append(res[x]);
            
        }
        return result.length()==0? "0":result.toString();
    }
}
