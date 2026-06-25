class Solution {

    void mergeSort(int arr[], int l, int r) {
        
        // Base Case
        if(l>=r) return; //<-- 
        
        int mid = l + (r-l)/2;
        
        // Divide
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        
        merge2LL(arr,l,mid,r); //<-- 
    }
    
    private void merge2LL(int[] arr, int left, int mid,int right){
        
        int[] leftArr = Arrays.copyOfRange(arr,left,mid+1); //<--
        int[] rightArr = Arrays.copyOfRange(arr,mid+1,right+1); //<--
        
        int i = 0;
        int j = 0;
        
        int k = left; //<--
        
        // Merging 
        while(i<leftArr.length && j<rightArr.length){
            if(leftArr[i]<=rightArr[j]){
                arr[k++] = leftArr[i++];
            }else{
                arr[k++] = rightArr[j++];
            }
        }
        // left + leftOver
        while(i<leftArr.length){
            arr[k++]=leftArr[i++];
        }
        
        // right + left Over
        while(j<rightArr.length){
            arr[k++]=rightArr[j++];
        }
    }
}