/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/

// Indexing : 1 Based
class Solution {
    Node deleteNode(Node head, int x) {
        // Case 1 : Empty 
        // Case 2: Single Head
        // Case 3 : Last Node
        // Case 4 : General Case
        
        if(head==null) return null; //1 
        
        if(x==1){ // 2
            return head.next;
        }
    
        // 3 + 4 
        Node curr = head;
        Node prev = null;
        
        for(int i=1;i<x && curr!=null;i++){ // 1 Based Indexing
            prev = curr;
            curr = curr.next;
        }
        
        if(curr==null) return head;
            
        prev.next = curr.next;
        
    
        return head;
        
        
        
    }
}