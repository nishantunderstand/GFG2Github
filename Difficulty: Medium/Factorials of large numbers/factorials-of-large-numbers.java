import java.math.BigInteger;
class Solution {
    
    public static ArrayList<Integer> factorial(int n) {
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