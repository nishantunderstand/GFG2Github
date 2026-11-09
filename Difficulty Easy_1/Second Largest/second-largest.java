class Solution {
    public int getSecondLargest(int[] arr) {
        //return getSecondLargestOnePassSolution(arr);
        //return getSecondLargestOnePassSolution2(arr);
        //return sortingApproach(arr);
        return streamApproach(arr);
        
    }
    private int streamApproach(int[] arr){
        return Arrays.stream(arr)
        .distinct()
        .boxed()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst()
        .orElse(-1);
    }    
    
    private int sortingApproach(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){ //<--
                return arr[i];
            }
        }
        return -1;
    }
    
    
    public int getSecondLargestOnePassSolution2(int[] arr) {
        if(arr==null || arr.length<2) return -1;
        int max = -1;
        int secMax = -1;
        // int max = null; // INCORRECT SENTIAL VALUE 
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){ 
                secMax=max; 
                max=arr[i];
            }else if(arr[i]<max && arr[i]>secMax){
                secMax=arr[i];
            }
        }
        return (secMax==-1)?-1:secMax;
    }
    
    public int getSecondLargestOnePassSolution(int[] arr) {
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
