class Solution {
    public void reverseArray(int arr[]) {
        helper(arr, 0 , arr.length-1);
    }
    
    public void helper(int[] arr, int beg, int end){
        if(beg>end) return;
        swap(arr, beg,end);
        helper(arr,beg+1,end-1);
    }
    
    public void swap(int[] arr, int beg, int end){
        int temp = arr[beg];
        arr[beg] = arr[end];
        arr[end] = temp;
    }
}