// Function to rotate an array by d elements in counter-clockwise direction.
// Reversal Algorithm 
// Left or Right || Will Impact Code 

class Solution {
    
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        // Normamlize d
        d = d%n;
        if(d<0){
            d = d+n;
        }
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        
    }
    
    private static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}