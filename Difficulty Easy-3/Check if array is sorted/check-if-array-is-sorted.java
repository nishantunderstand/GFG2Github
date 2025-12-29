// GFG Check if array is sorted
class Solution {
    public boolean isSorted(int[] arr) {
        //return isSortedv1(arr);
        return isSortedv2(arr);
    }
    
    public boolean isSortedv2(int[] arr) {
        
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){ 
                return false;
            }
        }
        return true;
    }
    
    
    public boolean isSortedv1(int[] arr) {
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){ 
                return false;
            }
        }
        return true;
    }
}

