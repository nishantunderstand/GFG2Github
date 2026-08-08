class Solution {
    int countTriplets(int sum, int arr[]) {
        Arrays.sort(arr);
        int cnt = 0;
        
        for(int i=0;i<arr.length;i++){
            int L = i+1;
            int R = arr.length-1;
            while(L<R){
                int csum = arr[i] + arr[L] + arr[R];
                
                if(csum<sum){
                    cnt += (R-L); //<--
                    L++;
                }else{
                    R--;
                }
            }
        }
        return cnt;
    }
}
// GFG : Triplets with Smaller Sum
