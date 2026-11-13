/* class Node {
	int data;
	Node next;
	Node prev;
	
	Node(int d) {
		data = d;
		next = null;
		prev = null;
	}
} */

// 0-Based Indexing

class Solution {
	public Node createDLL(int arr[]) {
		// 1. Empty Case
		if (arr == null || arr.length == 0)
			return null;
		
		// Why are we not Handling when length is 1
		
		Node head = new Node(arr[0]);
		Node curr = head;
		
		// General Case
		
		// Start From 1
		for (int i = 1; i<arr.length; i++) {
			curr.next = new Node(arr[i]);
			
			curr.next.prev = curr; // Should i need to check for null Cases ??
			
			curr = curr.next;
		}
		
		return head; }
	}
