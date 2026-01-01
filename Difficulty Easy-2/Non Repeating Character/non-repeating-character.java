// Saturday, February 8, 2025 6:11:37 PM
// Time Complexity:O(n) | Space Complexity:O(n)
class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        return twoPassSolHashMap(s);
    }
    
    static char twoPassSolHashMap(String s) {
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
        int len = s.length();
        for(int i=0;i<len;i++){
            char curr = s.charAt(i);
            hm.put(curr,hm.getOrDefault(curr,0)+1); //<--
        }
        
        /**
        for(int i=0;i<len;i++){
            char curr = s.charAt(i);
            if(hm.get(curr)==1) return curr; //<--
        }
        */
        
        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        
        return '$';
    }
}
