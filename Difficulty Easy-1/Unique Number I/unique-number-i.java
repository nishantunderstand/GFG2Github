class Solution {
    public int findUnique(int[] arr) {
        int curr = arr[0];
        for(int i=1;i<arr.length;i++){
            curr = curr^arr[i];
        }
        return curr;
    }
}