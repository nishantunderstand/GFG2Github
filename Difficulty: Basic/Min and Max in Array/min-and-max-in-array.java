import java.util.*;

class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
        }
        
        // return new Arrays.asList(min,max); // WRONG 
        // List<Integer> res = new ArrayList<>(); // WHY Incompatiable
        ArrayList<Integer> res = new ArrayList<>();
        res.add(min);
        res.add(max);
        return res;
    }
}
