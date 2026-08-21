// Sunday, June 14, 2026 8:42:37 PM
// TC : O(n) | SC : O(n)
// GFG : Substrings with K Distinct
class Solution {
    public int countSubstr(String s, int k) {
        
        return atMost(s,k)-atMost(s,k-1); //<--
    }
    
    private int atMost(String s, int k){
        if(k<0) return 0;
        
        Map<Character, Integer> freq = new HashMap<>();
        int left = 0;
        int count = 0;
        
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            
            while(freq.size()>k){
                char leftChar = s.charAt(left); //<--
                freq.put(leftChar, freq.get(leftChar)-1);
                if(freq.get(leftChar)==0){
                    freq.remove(leftChar);
                }
                left++;
            }
            count += (right-left+1);
        }
        return count;
    }
}
