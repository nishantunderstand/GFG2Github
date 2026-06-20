/* Structure of doubly linked list node
class Node {
    int data;
    Node next;
    Node prev;
    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node insertInTail(Node head, int data) {
        Node newNode = new Node(data);
        if(head==null) return newNode;
        
        
        Node curr = head;
        
        while(curr.next!=null){
            curr = curr.next;
        }
        // Now I reach the end 
        
        curr.next = newNode;
        newNode.prev = curr;
        
        return head;
    }
}
// Sunday, June 14, 2026 9:35:47 PM
// TC : O(n) | SC : O(1)
// GFG : Doubly Linked List Tail Insert
