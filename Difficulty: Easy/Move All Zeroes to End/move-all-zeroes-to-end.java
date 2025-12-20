class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        // Swap zero Idx with Non-zero Idx
        int nonZeroIdx = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                swap(arr,i,nonZeroIdx);    
                nonZeroIdx++;
            }
        }
    }
    
    private void swap(int[] arr, int start, int end){
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }
}

// Don't i need Both Zero and Non-Zero Idx