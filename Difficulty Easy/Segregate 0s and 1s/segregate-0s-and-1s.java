

// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        int i=0;
        int len = arr.length;
        int j = len-1;
        while(i<j){
            if(arr[i]==1){
                swap(arr,i,j);
                j--;
            }else if(arr[i]==0){
                i++;
            }
        }
    }
        public void swap(int[] A,int a,int b){
        int temp = A[a];
        A[a]=A[b];
        A[b]=temp;
    }
}
