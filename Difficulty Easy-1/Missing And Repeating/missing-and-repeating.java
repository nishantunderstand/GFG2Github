// Missing And Repeating

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        
        if (arr == null || arr.length == 0) return new ArrayList<>();

        int[] fMap = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            fMap[arr[i]-1]++;
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        int repeating = -1, missing = -1;
        
        for(int i=0;i<fMap.length;i++){
            if(fMap[i]==2) repeating = i+1;
            else if(fMap[i]==0) missing = i+1;
        }
        
        res.add(repeating);
        res.add(missing);
        
        return res;
        
    }
}

/**
PASSED
6 5 8 7 1 4 1 3 2
[9, 1]
[1, 9]


FAILED 
5 1 6 2 4 6


Create a FrequencyMap of Array Instead of HashMap
*/