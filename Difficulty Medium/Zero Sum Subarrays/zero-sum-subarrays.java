//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Number of test cases
        sc.nextLine();        // Consume the newline

        while (t-- > 0) {
            String input = sc.nextLine(); // Input array as a space-separated string
            String[] inputArray = input.split(" ");
            int[] arr = new int[inputArray.length];

            // Parse the input array
            for (int i = 0; i < inputArray.length; i++) {
                arr[i] = Integer.parseInt(inputArray[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.findSubarray(arr));
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends



class Solution {
    public int findSubarray(int[] arr) {
        return prefixHashMapApproach(arr);
    }
    
    // Saturday, March 15, 2025 9:30:47 PM
    // Time Complexity:O(n) | Space Complexity:O(n)
    public int prefixHashMapApproach(int[] arr) {
        int cnt = 0;
        int i = -1;
        int csum = 0;

        // Sum-i
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        
        while(i<arr.length-1){ //<--
            i++;
            csum+=arr[i];
            
            
            if(hm.containsKey(csum)){
                cnt += hm.get(csum);
            }
            
            hm.put(csum,hm.getOrDefault(csum,0)+1);
        }
        
        return cnt;
    }
}
