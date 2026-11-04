class Solution {
    int search(String pat, String txt) {
        int m = txt.length();
        int n = pat.length();
        
        
        if(n>m) return 0;
        
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : pat.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        
        
        int start = 0;
        int cnt = 0;
        
        Map<Character, Integer> window = new HashMap<>();
        
        for(int end=0;end<m;end++){
            
            char right = txt.charAt(end);
            window.put(right,window.getOrDefault(right,0)+1);
            
            if(end-start+1==n){
                
                if(map.equals(window)){
                    cnt++;
                }   
                
                char left = txt.charAt(start);
                window.put(left,window.get(left)-1);
                
                if(window.get(left)==0){
                    window.remove(left);
                }
                start++;
            }
            
            
        }
        
        return cnt;
        
    }
}


// GFG : Count Occurences of Anagrams
