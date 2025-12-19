// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        
        if(arr==null || arr.length<=1) return;
        
        int n = arr.length;
        // Normamlize d
        
        d = d%n;
        if(d<0) d = d+n;
        
        
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);
    }
    
    public static void reverseArray(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}