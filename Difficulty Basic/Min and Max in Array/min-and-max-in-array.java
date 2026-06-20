class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int min = findMin(arr,arr.length-1);
        int max = findMax(arr,arr.length-1);
        ArrayList<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(max);
        return result;
    }
    
    private int findMin(int[] arr,int idx){
        if(idx==0) return arr[0];
        int recursiveMin = findMin(arr,idx-1);
        return Math.min(arr[idx],recursiveMin);
    }
    
    private int findMax(int[] arr,int idx){
        if(idx==0) return arr[0];
        int recursiveMax = findMax(arr,idx-1);
        return Math.max(arr[idx],recursiveMax);
    }
}
