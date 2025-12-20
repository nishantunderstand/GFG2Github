class Solution {
    // FAILED 
    // 0 1 0 1 1 1 1 // IO
    // FALING
    public int maxConsecBits(int[] arr) {
        // code here
        int cnt = 1;
        int max = 1;
        
        int n = arr.length;
        
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                cnt++;
            }
            else{
                cnt=1;
            }
            max = Math.max(cnt,max);
        }
        return max;
    }
    
    // “Maximum consecutive 1s” only
    public int maxConsecBitsDifferentQuestion(int[] arr) {
        // code here
        int oneCnt = 0;
        int maxCnt = 0;
        
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                oneCnt++;
            }
            else{
                oneCnt=0;
            }
            maxCnt = Math.max(oneCnt,maxCnt);
        }
        return maxCnt;
    }
}

// FAILED
// 0 0 1 0 1 0
// Question is not Cnt Max 1 Occurence