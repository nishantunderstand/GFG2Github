class Solution {
    boolean isPalindrome(String s) {
        return isPalindromeHelper(s,0,s.length()-1);
    }
    
    public boolean isPalindromeHelper(String str,int beg, int end){
        if(beg>=end) return true;
        //if(beg<0) return;  // WHY NOT NEEDED 
        //if(end>s.length()-1) return; // WHY NOT NEEDED ???
        
        if(str.charAt(beg) != str.charAt(end)){
            return false;
        }
        
        return isPalindromeHelper(str,beg+1,end-1);
    }
}