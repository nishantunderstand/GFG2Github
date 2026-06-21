class Solution {

    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        return sortingApproach(arr, target);
    }

    public ArrayList<Integer> sortingApproach(int[] arr, int target) {

        if (arr == null || arr.length < 2) {
            return new ArrayList<>();
        }

        Arrays.sort(arr);

        int lo = 0;
        int hi = arr.length - 1;

        int bestSum = Integer.MAX_VALUE;
        int bestDiff = Integer.MIN_VALUE;

        int first = -1;
        int second = -1;

        while (lo < hi) {

            int currSum = arr[lo] + arr[hi];
            int currDiff = Math.abs(arr[hi] - arr[lo]);

            if (Math.abs(target - currSum) < Math.abs(target - bestSum)
                || (Math.abs(target - currSum) == Math.abs(target - bestSum)
                    && currDiff > bestDiff)) {

                bestSum = currSum;
                bestDiff = currDiff;

                first = arr[lo];
                second = arr[hi];
            }

            if (currSum < target) {
                lo++;
            } else {
                hi--;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        if (first != -1) {
            ans.add(first);
            ans.add(second);
        }

        return ans;
    }
}