class Solution {
    static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        return hashSetApproach(arr1,arr2);
    }
    
    
    // Sunday, November 8, 2026 5:14:24 PM    
    // TC : O(n+m) | SC : O(n)
    static ArrayList<Integer> hashSetApproach(int arr1[], int arr2[]) {
        HashSet<Integer> seen = new HashSet<>();
        
        for(int arr : arr1){
            seen.add(arr); 
        }
        
        
        ArrayList<Integer> res = new ArrayList<>();
        
        
        // Approach One : Remove 
        // for(int arr : arr2){
        //     if(seen.remove(arr)){ 
        //         res.add(arr);
        //     }
        // }
        
        
        
        // Approach Two : Contains + Remove
        for(int arr : arr2){
            if(seen.contains(arr)){ 
                res.add(arr);
                seen.remove(arr);
            }
        }
        
        
        
        return res;
    }
}


