class Solution {
    public int[] countOddEven(int[] arr) {
        int oddCnt = 0;
        int evenCnt = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCnt++;
            }else{
                oddCnt++;
            }
        }
        return new int[]{oddCnt,evenCnt};
        
        
    }
}