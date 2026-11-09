/* Linked List Node Structure
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node removeLastNode(Node head) {
        // Case 1 : Empty LL
        if(head==null) return null;
        
        if(head.next==null) return null; // Case 2 : Single Node 
        
        // Case 2 : General Case
        
        // Find the 2nd Last Element End of LL
        Node slast = head;
        
        
        while(slast.next.next!=null){
            slast = slast.next;
        }
        
        // Now i setting slast to null
        slast.next  = null; // I am setting next to null
        
        return head;
        
    }
}