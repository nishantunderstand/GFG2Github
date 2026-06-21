class Solution {
    public int nthRoot(int n, int m) {
        if(m==0) return 0;
        
        int low = 1;
        int high = m;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int compRes = comparePow(mid,n,m);
            if(compRes==0) return mid;
            
            if(compRes<0){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
    private int comparePow (int base, int exp, int tar){
        long powVal = 1;
        while(exp-->0){
            powVal *=base;
            if(powVal>tar) return 1;
        }
        if(powVal==tar) return 0;
        return -1;
    }
}