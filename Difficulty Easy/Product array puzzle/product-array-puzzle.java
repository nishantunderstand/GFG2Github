class Solution {
    public static int[] productExceptSelf(int arr[]) {
        
        int n = arr.length;
        
        int[] prefixProd = new int[n];
        int [] suffixProd = new int[n];
        
        // Base Value 
        prefixProd[0]=1; // 1st Element
        suffixProd[n-1]=1; // Last Element
        
        
        for(int i=1;i<n;i++){
            prefixProd[i]=prefixProd[i-1]*arr[i-1];
        }
        
        for(int i=n-2;i>=0;i--){
            suffixProd[i]=suffixProd[i+1]*arr[i+1];
        }
        
        int[] res = new int[n];
        
        
        for(int i=0;i<n;i++){
            res[i] = prefixProd[i] * suffixProd[i];
        }
        
        return res;
    }
}
