class Solution {
    public static int[] productExceptSelf(int arr[]) {
        
        int n = arr.length;
        
        int[] prefixProd = new int[n];
        int [] suffixProd = new int[n];
        
        prefixProd[0]=arr[0]; // 1st Element
        suffixProd[n-1]=arr[n-1]; // Last Element
        
        
        
        for(int i=1;i<n;i++){
            prefixProd[i]=prefixProd[i-1]*arr[i];
        }
        
        for(int i=n-2;i>=0;i--){
            suffixProd[i]=suffixProd[i+1]*arr[i];
        }
        
        int[] res = new int[n];
        
        
        // Edge Case
        res[0]=suffixProd[1];
        res[n-1]=prefixProd[n-2];
        
        
        
        for(int i=1;i<=n-2;i++){
            res[i] = prefixProd[i-1] * suffixProd[i+1];
        }
        
        return res;
    }
}
