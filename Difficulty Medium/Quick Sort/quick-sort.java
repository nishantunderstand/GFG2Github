class Solution {
    public void quickSort(int[] arr, int low, int high) {
        if(low>=high) return;
        
        int pi = partition(arr,low,high);
        quickSort(arr,low,pi-1);
        quickSort(arr,pi+1,high);
        
    }

    // Lomuto Partition
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        
        int i=low;
        int j=low;
        
        while(i<high){
            if(arr[i]<=pivot){
                swap(arr,i,j);
                j++;
            }
            i++;
        }
        swap(arr,j,high); // Correct Position of Pivot
        return j;
    }
    
    
    private void swap(int[] arr, int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}