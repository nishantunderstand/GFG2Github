class Solution {
    // FAILED 
    // 2 8 1
    // 9 9 9
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        Set<Integer> seen = new HashSet<>();
        
        for(int x : a){
            seen.add(x);
        }
        
        for(int x : b){
            seen.add(x);
        }
        
        return new ArrayList<>(seen);
    }
}

/**

Union of Arrays with Duplicates


HashMap 
Dump Array 1 , Create FrequencyMap

Iterate Over Array 2, 
If Not Present, Add to Result.

if Present Decrease its Frequency.
if Frequency Becomes Zero, Remove it 

*/