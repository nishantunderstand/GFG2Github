// User function Template for Java
class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        return bruteForce(arr);
    }
    
    // TC O(n^3) || SC O(n^3)
    private List<List<Integer>> optimizedOne(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        int len = arr.length;
        
        for(int i=0;i<len;i++){
            List<Integer> inner = new ArrayList<>();
            for(int j=i;j<len;j++){
                
                
                for(int k=i;k<=j;k++){
                    inner.add(arr[k]);
                }
                res.add(inner);
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