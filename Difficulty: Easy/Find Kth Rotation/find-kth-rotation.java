class Solution {
    public int findKRotation(int arr[]) {
        int low = 0;
        int high = arr.length-1;
        while(low<high){ //<--
            int mid = low + (high-low)/2;
            
            if(arr[mid]>arr[high]){
                low = mid+1;
            }else{
                high = mid; //<--
            }
        }
        return low;
    }
}

// Sunday, June 14, 2026 5:49:56 PM
// TC : O(logn) | SC : O(1)
// GFG : Find Kth Rotation