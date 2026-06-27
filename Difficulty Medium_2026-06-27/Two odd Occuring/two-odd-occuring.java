// GFG : Two odd Occuring
class Solution {
    ArrayList<Integer> twoOddNum(int[] arr) {
        //return hashMap(arr);
        return bits(arr);
    }
    
    // Saturday, June 27, 2026 8:20:18 PM
	// TC : O(n) | SC : O(1)
    ArrayList<Integer> bits(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        
        int xor = 0; //<--
        
        for(int num : arr){
            xor^=num;
        }
        
        //int rmsb = (xor & (xor-1))^xor; //<--
        int rmsb = xor & -xor; //<--
    
        int b1 = 0;
        int b2 = 0;
        
        for(int num : arr){
            // Deciding the bucket 
            if((num & rmsb)==0){
                b1 ^=num;
            }else{
                b2 ^=num;
            }
        }
        // Descending Order
        if(b1>b2){
            res.add(b1);
            res.add(b2);
        }else{
            res.add(b2);
            res.add(b1);
        }
        
        //res.add(b1);
        //res.add(b2);
        //Collections.sort(res,Collections.reverseOrder()); //<--
        return res;
    }
    
    
    // Saturday, June 27, 2026 7:57:07 PM
	// TC : O(n) | SC : O(n)
    ArrayList<Integer> hashMap(int[] arr) {
        // BuildHashMap
        Map<Integer,Integer> fMap = new HashMap<>();
        // Whoever has Occurence 1 
        
        for(int num : arr){
            fMap.put(num,fMap.getOrDefault(num,0)+1);
        }
        
        // Add to the list and reverse it 
        ArrayList<Integer> res = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> entry:fMap.entrySet()){
            if(entry.getValue() %2 !=0){ //<--
                res.add(entry.getKey());
            }
        }
        Collections.sort(res,Collections.reverseOrder()); //<--
        return res;
    }
}

