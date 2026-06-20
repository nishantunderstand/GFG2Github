class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        
        Map<Integer,Integer> fMap = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            fMap.put(arr[i],fMap.getOrDefault(arr[i],0)+1);
        }
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> entry : fMap.entrySet()){
            ArrayList<Integer> inner = new ArrayList<>();
            inner.add(entry.getKey());
            inner.add(entry.getValue());
            res.add(inner);
        }
        return res;
        
    }
}
// Frequency of Elements
