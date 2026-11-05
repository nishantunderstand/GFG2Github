// GFG : Meeting Rooms
class Solution {
    static boolean canAttend(int[][] arr) {
        //return twoVariable(arr);
        return directApproach(arr);
    }
    
    
    static boolean directApproach(int[][] arr) {
        if(arr.length<=1) return true;

        Arrays.sort(arr, (a,b)-> Integer.compare(a[0],b[0]));

        for(int i=1;i<arr.length;i++){
            int currStart = arr[i][0];
            int previous = arr[i-1][1];
            if(currStart<previous){
                return false;
            }
        }
        return true;
    }

    
    
    static boolean twoVariable(int[][] arr) {
        // Sorted : No 
        Arrays.sort(arr, (a,b)->Integer.compare(a[0],b[0]));
        
        int s1 = arr[0][0];
        int e1 = arr[0][1];
        
        for(int i=1;i<arr.length;i++){
            int s2 = arr[i][0];
            int e2 = arr[i][1];
            
            // Overlap
            if(s2<e1){ //<--
                return false;
            }else{ // No Overlap || Continue 
                s1 = s2;
                e1 = e2;
            }
        }
        return true;
    }
}

