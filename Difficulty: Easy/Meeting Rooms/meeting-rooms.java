class Solution {
    static boolean canAttend(int[][] arr) {
        if(arr.length<=1) return true;
    
        Arrays.sort(arr, (a,b)-> Integer.compare(a[0],b[0]));
        
        
        for(int i=1;i<arr.length;i++){
            int currStart = arr[i][0];
            int previous = arr[i-1][1];
            if(currStart<previous){
                return false;
            }
        }
        return true;
    }
}