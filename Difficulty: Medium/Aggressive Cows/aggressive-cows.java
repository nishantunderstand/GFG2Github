// GFG : Aggressive Cows
class Solution {
    public int aggressiveCows(int[] arr, int k) {
        // return linearSeach(arr,k);
        return binarySearch(arr,k);
        
    }
    
    // Thursday, November 12, 2026 11:07:05 PM    
    // TC : O(N log N + N * log D) | SC : O(1)
    // Polarity 
    private int binarySearch(int[] arr, int k){
        Arrays.sort(arr);
        int low = 1;
        int high = arr[arr.length-1]-arr[0];  
        
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(isPossible(arr,mid,k)){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return high; // Whyn't low ?
    }
    

    // Thursday, November 12, 2026 11:07:05 PM    
    // TC : O(N log N + N * D) | SC : O(1)


    public int linearSeach(int[] arr, int k) {
        Arrays.sort(arr);
        int low = 1;
        int high = arr[arr.length-1]-arr[0]; 
        int ans = 0;
        for(int dis=low;dis<=high;dis++){
            if(isPossible(arr,dis,k)){
                ans = dis;
            }else{
                break;
            }
        }
        return ans;
    }
    
    // Thursday, November 12, 2026 11:07:05 PM    
    // TC : O(n) | SC : O(1)
    
    // Greedy Placement 
    private boolean isPossible(int[] arr, int dis , int k){
        int cows = 1;
        int last = arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=dis){
                cows++;
                last = arr[i];
            }
        }
        if(cows>=k) return true;
        return false;
    }
}