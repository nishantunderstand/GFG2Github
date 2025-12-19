class Solution {
    public void reverseArray(int arr[]) {
        if(arr==null || arr.length<0) return;
        
        int start = 0;
        int end = arr.length-1;
        
        while(start<end){
            
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            
            start++;
            end--;
        }
    }
}