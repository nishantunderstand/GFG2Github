// GFG : Longest Substring with K Uniques
// Question : When I need Frequency Or Index
class Solution {
    public int longestKSubstr(String s, int k) {
        Map<Character, Integer> fMap = new HashMap<>();
        int left = 0;
        int maxLen = -1; //<--
        for(int right=0;right<s.length();right++){
            char rightChar = s.charAt(right);
            fMap.put(rightChar,fMap.getOrDefault(rightChar,0)+1);
            
            while(fMap.size()>k){
                char leftChar = s.charAt(left);
                fMap.put(leftChar,fMap.get(leftChar)-1);
                if(fMap.get(leftChar)==0){
                    fMap.remove(leftChar);
                }
                left++;
            }
            
            if(fMap.size()==k){
                maxLen = Math.max(maxLen, right-left+1);    
            }
        }
        return maxLen;
    }
}