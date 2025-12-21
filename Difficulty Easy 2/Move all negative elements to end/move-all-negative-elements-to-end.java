import java.util.*;


// Move all negative elements to end
class Solution {
    // Overwrite Approach
    public void segregateElements(int[] arr) {
        int idx = 0;
        int[] temp = new int[arr.length];
        
        // Step 1: place non-negative elements
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                temp[idx++]=arr[i];
            }
        }
        
        // Step 2: place negative elements
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                temp[idx++]=arr[i];
            }
        }
        // Step 3 : Move temp back to arr
        System.arraycopy(temp,0,arr,0,arr.length);
        
    }
    
}
/**
1 -1 3 2 -7 -5 11 6

*/