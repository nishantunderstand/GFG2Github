//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String st = sc.next();

            char ans = new Solution().nonRepeatingChar(st);

            if (ans != '$')
                System.out.println(ans);
            else
                System.out.println(-1);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java



// Saturday, February 8, 2025 6:11:37 PM
    // Time Complexity:O(n) | Space Complexity:O(n)
class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
        int len = s.length();
        for(int i=0;i<len;i++){
            char curr = s.charAt(i);
            hm.put(curr,hm.getOrDefault(curr,0)+1); //<--
        }
        
        for(int i=0;i<len;i++){
            char curr = s.charAt(i);
            if(hm.get(curr)==1) return curr; //<--
        }
        return '$';
    }
}
