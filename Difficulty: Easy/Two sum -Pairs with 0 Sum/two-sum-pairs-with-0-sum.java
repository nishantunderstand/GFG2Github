// User function Template for Java
import java.util.*;

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(arr==null || arr.length<2) return res;
        Arrays.sort(arr);
        
        int left = 0, right = arr.length-1;
        while(left<right){
            int csum = arr[left] + arr[right];
            if(csum==0){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                res.add(pair);
                
                int leftVal = arr[left];
                while(left<right && arr[left]==leftVal) left++;
                
                int rightVal = arr[right];
                //while(right>0 && arr[right]==rightVal) right--;
                while(left<right && arr[right]==rightVal) right--;
            }else if(csum>0){
                right--;
            }else{
                left++;
            }
        }
        return res;
    }
}


