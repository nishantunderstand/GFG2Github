class Solution {
    public boolean isBalanced(String s) {
        
        if(s.length()%2==1) return false;
        
        Map<Character,Character> freqMap = new HashMap<>();
        freqMap.put(')','(');
        freqMap.put('}','{');
        freqMap.put(']','[');
        
        //Stack<Character> st = new Stack<>();
        Deque<Character> st = new ArrayDeque<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            // Closing Bracket 
            if(freqMap.containsKey(ch)){
                if(st.isEmpty()) return false;
                if(st.peek() !=freqMap.get(ch)) return false;
                st.pop();
            }else{
                st.push(ch); 
            // Opening Bracket || Added to Stack                
            }
        }
        
        return st.isEmpty();
    }
}

// Monday, June 15, 2026 8:14:45 PM
// TC : O(n) | SC : O(n)
// GFG : Parenthesis Checker
