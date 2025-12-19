class Solution {
    public int getSecondLargest(int[] arr) {
        
        if(arr==null || arr.length<2) return -1;
        
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){ 
                secMax=max; 
                max=arr[i];
            }else if(arr[i]<max && arr[i]>secMax){
                secMax=arr[i];
            }
        }
        
        return (secMax==Integer.MIN_VALUE)?-1:secMax;
        
    }
}
/**
    10 5 10
    max 10
    secMax 10 
*/
