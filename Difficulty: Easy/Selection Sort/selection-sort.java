class Solution {
    void selectionSort(int[] arr) {
        
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(isSmaller(arr,j,min)){
                    min = j;
                }
                
            }
            swap(arr, i,min);
        }
        
    }
    
    public void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public boolean isSmaller(int[] arr, int i, int j){
        return arr[i]<arr[j];
    }
}