class Solution {
    public int findKRotation(int arr[]) {
        int minIdx = 0;
        int minVal = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<minVal){
                minIdx = i;
                minVal = arr[i];
            }
        }
        return minIdx;
    }
}