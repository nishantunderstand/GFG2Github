import java.math.BigInteger;
class Solution {
    
    public static ArrayList<Integer> factorial(int n) {
        // return bigIntergerApproach(n);
        return usingDigitArray(n);
    }
    
    // Saturday, July 26, 2025 3:19:09 PM
    // Time Complexity:O(n)logn) | Space Complexity:O(logn)
    public static ArrayList<Integer> usingDigitArray(int n){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        
        
        for(int x=2;x<=n;x++){
            int carry = 0;
            
            for(int i=0;i<result.size();i++){
                int val = result.get(i)*x + carry;
                result.set(i,val%10);
                carry = val/10;
            }
            
            while(carry>0){
                result.add(carry%10);
                carry = carry/10;
            }
        }
        Collections.reverse(result);
        return result;
    }
    
    
    // Saturday, July 26, 2025 3:19:22 PM
    // Time Complexity:O(n^2) | Space Complexity:O(n)
    public static ArrayList<Integer> bigIntergerApproach(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        BigInteger fact = recursive(n);
        for(char ch : fact.toString().toCharArray()){
            res.add(ch-'0');
        }
        return res;
    }
    
    public static BigInteger recursive(int n){
        if(n==0||n==1) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(recursive(n-1));
    }
    
}