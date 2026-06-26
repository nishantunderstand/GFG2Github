class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        insertionSort(arr,0);
    }
    
    private void insertionSort(int[] arr, int start){
        if(start>= arr.length-1) return;
        
        int minIndex = start;
        for(int i=start+1;i<arr.length;i++){
            if(arr[i]<arr[minIndex]){
                minIndex = i;
            }
        }
        swap(arr, start, minIndex);
        insertionSort(arr, start+1);
    }
    
    private void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}