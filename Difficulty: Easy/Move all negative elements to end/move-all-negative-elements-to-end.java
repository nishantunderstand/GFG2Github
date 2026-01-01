// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        overwriteApproach(arr);
    }
    
    // Overwrite Approach
    public void overwriteApproach(int[] arr) {
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