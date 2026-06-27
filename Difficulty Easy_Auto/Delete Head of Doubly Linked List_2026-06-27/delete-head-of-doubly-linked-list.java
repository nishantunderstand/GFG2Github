// GFG : Delete Head of Doubly Linked List

class Solution {
    public static Node deleteHead(Node head) {
        // DLL is Empty
        if(head==null) return null;
        
        // DLL Single Element
        if(head.next==null) return null;
        
        // DLL More than 1 Element  And It is not 
        head = head.next;
        head.prev = null;
        
        return head;
        
    }
}