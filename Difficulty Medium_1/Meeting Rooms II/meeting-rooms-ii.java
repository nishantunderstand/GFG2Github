// GFG : Meeting Rooms II
class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        //return twoPointerApproach(start,end);
        return lineSweepApproach(start,end);
    }
    
    // Thursday, November 5, 2026 2:33:30 PM    
    // TC : O(n) | SC : O(n)
    public int lineSweepApproach(int[] start, int[] end) {
            TreeMap<Integer,Integer> map = new TreeMap<>();
            for(int i=0;i<start.length;i++){
                map.put(start[i],map.getOrDefault(start[i],0)+1);
                map.put(end[i],map.getOrDefault(end[i],0)-1);
            }
            int cnt = 0;
            int maxRooms = 0;
            for(int time : map.keySet()){
                cnt += map.get(time);
                maxRooms = Math.max(maxRooms,cnt);
            }
            return maxRooms;
        }
    
    
    public int twoPointerApproach(int[] start, int[] end) {
        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0;
        int j = 0;

        int cnt = 0;
        int maxRooms = 0;

        while(i<start.length){

            if(start[i]<end[j]){
                cnt++;
                maxRooms = Math.max(cnt,maxRooms);
                i++;
            }else{
                cnt--;
                j++;
            }
        }

        return maxRooms;
    }
}