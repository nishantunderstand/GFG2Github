/* Structure of Doubly Linked List Node
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

// 0-Based Indexing 
// After p 

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // Empty => New Node And Add it and Return it
        
        // Otherwise Iterate It and p-1 
        // 1. Exists => p-1 || New Node || You need to update prev and next
        // 2. Out oF Bound => Head Return 
        
        // Case 1 : Handle It 
        if(head==null){
            return new Node(x); // What About prev and next ?
        }
        
        // Case 2 : General Case 
        Node curr = head;
        
        
        for(int i=0;i<p && curr!=null;i++){
            curr = curr.next;
        }
        
        if(curr==null) return head;
        
        // New Node Pointer Updation
        Node newNode = new Node(x);
        newNode.next = curr.next;
        newNode.prev = curr;
        
        
        // Connecting Node next & prev Updation 
        
        if(curr.next!=null){
            curr.next.prev = newNode;
        }
        
        curr.next = newNode;
        
        
        return head;
        
        
        
    }
}