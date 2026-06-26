class Solution {
    int missingNum(int arr[]) {
        int n = arr.length;
        int[] freqArr = new int[n+2];
        
        for(int i=0;i<n;i++){
            freqArr[arr[i]]++;
        }
        
        for(int i=1;i<=n+1;i++){
            if(freqArr[i]==0){
                return i;
            }
        }
        return -1;
        
    }
}