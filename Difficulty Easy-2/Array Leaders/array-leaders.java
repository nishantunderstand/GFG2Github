// Array Leaders

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        
        int maxFromRight = arr[arr.length-1];
        res.add(maxFromRight);
        
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=maxFromRight){
                res.add(arr[i]);
                maxFromRight = arr[i];
            }
        }
        
        Collections.reverse(res);
        return res;
    }
}
