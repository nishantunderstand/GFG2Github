class Solution {
	public void reverseArray(int arr[]) {
		// Arrays.sort(arr, (a,b)->Integer.compare(b,a)); || Failed Due to Primitive Data Type
		
		
		int i = 0;
		int j = arr.length-1;
		
		while(i<j){
		    int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		    i++;
		    j--;
		}
	}
}
