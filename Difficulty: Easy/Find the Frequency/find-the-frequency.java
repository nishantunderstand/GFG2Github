class Solution {
    int findFrequency(int arr[], int x) {
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                cnt++;
            }
        }
        return cnt;
    }
}