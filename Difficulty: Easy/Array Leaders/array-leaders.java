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


/**
BRUTE FORCE APPROACH

2 For Loops
1st Loop : Iterate over Element
2nd Loop : Check For Greater Element
    If something is greater then discard it, 
    Start from next idx
If till the end, Nothing found.  Add to the List.



OPTIMAL APPROACH
Stack NGE or NSE,
    This kind of Concept


*/