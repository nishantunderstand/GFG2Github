class Solution {
    public void segregateElements(int[] arr) {
        overwriteApproach(arr);
        //inPlaceApproach(arr);
    }
    
    // FAILED
    // Try Insertion Sort Approach
    public void inPlaceApproach(int[] arr) {
        int nonNeg = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                swap(arr,i,nonNeg);
                nonNeg++;
            }
        }
    }
    private void swap(int[] arr, int start, int end){
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
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
        //System.arraycopy(temp,0,arr,0,arr.length);
        System.arraycopy(temp,0,arr,0,temp.length);
        
    }
}