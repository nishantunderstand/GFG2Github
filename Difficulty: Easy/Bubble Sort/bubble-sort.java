class Solution {
    public void bubbleSort(int[] arr) {
        bubbleSort(arr, arr.length);
    }
    
    private void bubbleSort(int[] arr, int n){
        if(n==1) return;
        
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                swap(arr,i,i+1);
            }
        }
        bubbleSort(arr, n-1);
    }
    
    private void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}