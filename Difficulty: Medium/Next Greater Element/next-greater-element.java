class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        
        Deque<Integer> st = new ArrayDeque<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]>=st.peek()){ //<--
                st.pop();
            }
            if(st.isEmpty()){
                res.add(-1);
            }else{
                res.add(st.peek());
            }
            
            st.push(arr[i]);
        }
        Collections.reverse(res); //<--
        return res;
    }
}// Monday, June 15, 2026 9:47:46 PM
// TC : O(n) | SC : O(n)
// GFG : Next Greater Element
