class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>(seen);
        for(int x  : arr){
            if(seen.contains(x)){
                res.add(x);
            }
            seen.add(x);
        }
        
        Collections.sort(res);
        return res;
        
    }
}