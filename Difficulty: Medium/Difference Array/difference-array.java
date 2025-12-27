class Solution {
    public ArrayList<Integer> diffArray(int[] arr, int[][] opr) {
        int n = arr.length;
        int[] diff = new int[n];
        
        for(int i=0;i<opr.length;i++){
            int l = opr[i][0];
            int r = opr[i][1];
            int val = opr[i][2];
            
            diff[l] += val;
            
            if(r+1<n){
                diff[r+1] -= val;
            }
            
        }
        
        for(int i=1;i<n;i++){
            diff[i] += diff[i-1];
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            res.add(diff[i]+arr[i]);
        }
        return res;
    }
}
