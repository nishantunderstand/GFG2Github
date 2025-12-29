// GFG : Common Elements

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        //return hashMapApproach(a,b);
        return twoPointerApproach(a,b);
    }
    
    public static ArrayList<Integer> twoPointerApproach(int a[], int b[]) {
        ArrayList<Integer> res = new ArrayList<>();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int i = 0;
        int j = 0;
        
        // How to handle Duplicates ???
        
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                res.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]>b[j]){
                j++;
            }else if(a[i]<b[j]){
                i++;
            }
        }
        
        return res;
    }
    
    
    
    public static ArrayList<Integer> hashMapApproach(int a[], int b[]) {
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