// GFG : Highest and Lowest Frequencies

class Solution {
	public int findDiff(int[] arr) {
		// 1. Build HashMap
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		// 2. How to find Max and Min ?
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		// Should i declare 2 variable to find Max and Min
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int freq = entry.getValue();
			max = Math.max(max, freq);
			min = Math.min(min, freq);
		}
		return max - min;
	}
}
