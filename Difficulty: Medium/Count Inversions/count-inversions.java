// Thursday, June 25, 2026 10:01:48 PM
// TC : O(nlogn) | SC : O(n)
class Solution {
    static int inversionCount(int arr[]) {
        //return bruteForce(arr);
        return mergeSort(arr,0,arr.length-1);
    }
    
    private static int mergeSort(int[] arr,int left,int right){
        if(left>=right) return 0;
        int cnt=0;
        int mid = left + (right-left)/2;
        cnt+= mergeSort(arr,left,mid);
        cnt+= mergeSort(arr,mid+1,right);
        cnt+= merge2Arr(arr,left,mid,right);
        return cnt;
    }
    
    private static int merge2Arr(int[] arr, int left,int mid, int right){
        int[] leftArr = Arrays.copyOfRange(arr,left,mid+1);
        int[] rightArr = Arrays.copyOfRange(arr,mid+1,right+1);
        
        int i=0;
        int j=0;
        int k = left; //<--
        int cnt = 0;
        while(i<leftArr.length && j<rightArr.length){
            if(leftArr[i]<=rightArr[j]){
                arr[k++]=leftArr[i++];
            }else{
                // arr[left] > arr[right]
                cnt += leftArr.length-i; //<--
                arr[k++] = rightArr[j++];
            }
        }
        
        while(i<leftArr.length){
            arr[k++]=leftArr[i++];
        }
        while(j<rightArr.length){
            arr[k++] = rightArr[j++];
        }
        return cnt; //<--
    }
    
    
    
    
    
    // Brute Force Approach
    // TLE
    static int bruteForce(int arr[]) {
        int cnt = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]) cnt++;
            }
        }
        return cnt;
    }
}