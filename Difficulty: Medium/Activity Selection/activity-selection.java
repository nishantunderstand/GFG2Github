
class Solution {
    public int activitySelection(int[] start, int[] finish) {
        PriorityQueue<int[]> pq = 
            new PriorityQueue<>((a,b)-> Integer.compare(a[1],b[1]));
        
        for(int i=0;i<start.length;i++){
            int[] pair = new int[2];
            pair[0]=start[i];
            pair[1]=finish[i];
            pq.offer(pair);
        }
        
        int lastEnd = 0;
        int selectedJob = 0;
        
        while(!pq.isEmpty()){
            int[] job = pq.poll();
            if(lastEnd<job[0]){
                selectedJob++;
                lastEnd= job[1];
            }
        }
        return selectedJob;
    }
}


/**
    Length Mismatch => Error 
    I need PriorityQueue

*/