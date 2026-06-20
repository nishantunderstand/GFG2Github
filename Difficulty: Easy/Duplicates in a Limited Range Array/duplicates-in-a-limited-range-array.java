class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        
        for(int x  : arr){
            if(!seen.add(x)){
                duplicates.add(x);
            }
            seen.add(x);
        }
        ArrayList<Integer> res = new ArrayList<>(duplicates);
        Collections.sort(res);
        return res;
        
    }
    
    
    public ArrayList<Integer> findDuplicates2(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int x  : arr){
            if(!seen.add(x)){
                duplicates.add(x);
            }
            seen.add(x);
        }
        res.addAll(duplicates);
        Collections.sort(res);
        return res;
        
    }
}