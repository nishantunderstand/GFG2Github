class Solution {
    public int longestKSubstr(String s, int k) {
        Map<Character, Integer> fMap = new HashMap<>();
        
        int windowStart=0;
        int maxLen = -1;
        
        for(int windowEnd=0; windowEnd<s.length();windowEnd++){
            char rightChar = s.charAt(windowEnd);
            // Expand
            fMap.put(rightChar,fMap.getOrDefault(rightChar,0)+1);
            
            // Shrink
            while(fMap.size()>k){
                char leftChar = s.charAt(windowStart);
                fMap.put(leftChar,fMap.get(leftChar)-1);
                if(fMap.get(leftChar)==0){
                    fMap.remove(leftChar);
                }
                windowStart++;
            }
            if(fMap.size()==k){
               maxLen = Math.max(maxLen, windowEnd-windowStart+1); 
            }
        }
        return maxLen;
        
    }
}