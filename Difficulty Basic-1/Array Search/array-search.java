class Solution {
    public int search(int arr[], int x) {
        return linearsearch(arr,x);
        
    }
    
    private int linearsearch(int arr[], int x) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x) return i;
        }
        return -1;
    }
}