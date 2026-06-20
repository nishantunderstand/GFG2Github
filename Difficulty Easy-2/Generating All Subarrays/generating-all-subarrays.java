// User function Template for Java
class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        //return bruteForce(arr);
        return optimizedOne(arr);
    }
    
    // TC O(n^2) || SC O(n^2)
    private List<List<Integer>> optimizedOne(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        int len = arr.length;
        
        for(int i=0;i<len;i++){
            List<Integer> inner = new ArrayList<>();
            for(int j=i;j<len;j++){
                inner.add(arr[j]);
                res.add(new ArrayList<>(inner));
                // Every time inner.add(arr[j]) runs, a new valid subarray is formed
                // That must be added immediately
            }
        }
        return res;
    }
    
    
    // TC O(n^3) || SC O(n^3)
    private List<List<Integer>> bruteForce(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        int len = arr.length;
        
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                List<Integer> inner = new ArrayList<>();
                
                for(int k=i;k<=j;k++){
                    inner.add(arr[k]);
                }
                res.add(inner);
            }
        }
        return res;
    }
}