// GFG : Common Elements

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        ArrayList<Integer> res = new ArrayList<>();
        Map<Integer, Integer> fMap = new HashMap<>();
        
        for(int x : a){
            fMap.put(x, fMap.getOrDefault(x,0)+1);
        }
        
        for(int x : b){
            if(fMap.containsKey(x)){
                
                res.add(x);
                fMap.put(x,fMap.get(x)-1);
                
                if(fMap.get(x)==0){
                    fMap.remove(x);
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}


// List<Integer> cannot be converted to ArrayList<Integer>
// You cannot code to Interface