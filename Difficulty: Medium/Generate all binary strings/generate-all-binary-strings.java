class Solution {
    public ArrayList<String> binstr(int n) {
        ArrayList<String> res = new ArrayList<>();
        helper(res,"",n);
        return res;
    }
    
    private void helper(List<String> ans, String curr, int n){
        // Base Case
        if(curr.length()==n){
            ans.add(curr);
            return;
        }
        // Recursive Call
        helper(ans,curr+"0",n);
        helper(ans,curr+"1",n);
    }
}
