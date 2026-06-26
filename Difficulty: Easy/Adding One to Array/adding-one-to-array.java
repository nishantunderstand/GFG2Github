// User function Template for Java

class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        Vector<Integer> res = new Vector<>();
        int carry = 1;
        for(int i=arr.length-1;i>=0;i--){
            int sum =  carry + arr[i];
            res.add(sum%10);
            carry = sum/10;
        }
        
        if(carry!=0){
            res.add(carry);
        }
        Collections.reverse(res);
        return res;
    }
    
    
    Vector<Integer> addOneCorrectRuntimeErorr(int[] arr) {
        Vector<Integer> res = new Vector<>();
        int carry = 1;
        for(int i=arr.length-1;i>=0;i--){
            int sum =  carry + arr[i];
            res.add(0,sum%10);
            carry = sum/10;
        }
        
        if(carry!=0){
            res.add(0,carry);
        }
        return res;
    }
}
// Runtime Error