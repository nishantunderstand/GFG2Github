import java.util.Scanner;
class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // code here
        Solution obj = new Solution();
        int ans = obj.sumOfNaturals(n);
        System.out.println(ans);
    }
}


// User function Template for Java
class Solution {
    static int sumOfNaturals(int n) {
        int ans =  helper(0,n);
        return ans;
    }
    public static int helper(int sum, int n){
        if(n==0) return 0;
        return n + helper(sum,n-1);
    }
}