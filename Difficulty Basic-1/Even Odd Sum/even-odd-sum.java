// GFG Even Odd Sum
class Solution {
    ArrayList<Integer> EvenOddSum(int N, int Arr[]) {
        int oddSum = 0;
        int evenSum = 0;
        for(int i=0;i<Arr.length;i++){
            if(i%2==0){ // odd place (1-Based)
                oddSum += Arr[i];
            }else{
                evenSum += Arr[i];
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(oddSum);
        res.add(evenSum);
        return res;
    }
}