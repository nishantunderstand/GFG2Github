//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int target = Integer.parseInt(br.readLine());

            Solution ob = new Solution();
            List<Integer> res = ob.sumClosest(arr, target);
            if (res.isEmpty()) {
                System.out.print("[]");
            } else {
                for (Integer num : res) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        //return sortingApproach(arr,target);
        return sortingApproachMOD(arr,target);
    }
    
    public List<Integer> sortingApproach(int[] arr, int target) {
        int len = arr.length;
        if(arr==null||len<2) return new ArrayList<>();
        
        Arrays.sort(arr);
        
        // 2 Pointer 
        int lo = 0;
        int hi = len-1;
        
        int maxSum = Integer.MAX_VALUE;
        int maxDiff = Integer.MIN_VALUE;
        
        int first = -1;
        int second = -1;
        
        while(lo<hi){
            int csum = arr[lo]+arr[hi];
            int cdiff = Math.abs(arr[hi]-arr[lo]);
            
            if( Math.abs(target-csum) < Math.abs(target-maxSum) || 
                Math.abs(target-csum) == Math.abs(target-maxSum) && cdiff>maxDiff ){
                    
                maxSum = csum;
                maxDiff = cdiff;
                first = arr[lo];
                second = arr[hi];
            }
            
            if(csum<target) lo++;
            else hi--;
        }
            
        return first==-1? new ArrayList<>() : Arrays.asList(first,second);
    }
    
    
    
    public List<Integer> sortingApproachMOD(int[] arr, int target) {
        int len = arr.length;
        if(arr==null||len<2) return new ArrayList<>();
        
        Arrays.sort(arr);
        
        // 2 Pointer 
        int lo = 0;
        int hi = len-1;
        
        int maxSum = Integer.MAX_VALUE;
        int maxDiff = Integer.MIN_VALUE;
        
        int first = -1;
        int second = -1;
        
        while(lo<hi){
            int csum = arr[lo]+arr[hi];
            int cdiff = Math.abs(arr[hi]-arr[lo]);
            
            if( Math.abs(target-csum) < Math.abs(target-maxSum) || 
                Math.abs(target-csum) == Math.abs(target-maxSum) && cdiff>maxDiff ){
                    
                maxSum = csum;
                maxDiff = cdiff;
                first = arr[lo];
                second = arr[hi];
            }
            
            if(csum<target) lo++;
            else hi--;
        }
            
        return first==-1? new ArrayList<>() : Arrays.asList(first,second);
    }
    
}