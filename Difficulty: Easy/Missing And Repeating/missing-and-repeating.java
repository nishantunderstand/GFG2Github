class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int[] freqArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            freqArr[arr[i]-1]++;
        }
    
        int missing = -1;
        int repeating = -1;
        for(int i=0;i<freqArr.length;i++){
            if(freqArr[i]==0){
                missing = i+1;
            }else if(freqArr[i]==2){
                repeating = i+1;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(repeating);
        res.add(missing);
        return res;
    }
}
