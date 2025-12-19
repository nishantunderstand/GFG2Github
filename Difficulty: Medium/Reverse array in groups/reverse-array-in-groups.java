class Solution {
    public void reverseInGroups(int[] arr, int k) {
        if(arr==null || arr.length<=1 || k<=1 ) return;
        // Index Jumping 
        for(int i=0;i<arr.length;i+=k){
            int start = i;
            int end = Math.min(i+k-1,arr.length-1);
            reverseArray(arr,start,end);    
        }
    }
    public void reverseArray(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}

// 
// 5 6 8 9 || 5