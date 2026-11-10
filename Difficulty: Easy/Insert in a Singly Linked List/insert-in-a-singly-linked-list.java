/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        this.data = x;
        this.next = null;
    }
} */

// GFG : Insert in a Singly Linked List

// Tuesday, November 10, 2026 2:39:25 PM    
// TC : O(n) | SC : O(1)
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        // pos = 1
        // Present 
        // Absent 
        // 1-Based Indexing
        
        
        if(pos==1){
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;
        }
        
        
        Node curr = head;
        
        for(int i=1;i<pos-1 && curr!=null;i++){
            curr = curr.next;
        }
        
        if(curr==null) return head; // Index Out of Bound Solution
        
        Node newNode = new Node(val); // Added the Node 
        newNode.next = curr.next; // Join 
        curr.next = newNode; // Break 
        
        
        return head;
        
        
    }
}