/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        // C1- Empty LL || => Create New One
        // C2 - General Case 
        // 1 Based Indexing 
        
        
        if(head==null) return new Node(x);
        
    
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        
        curr.next = new Node(x);
        return head;
        
    }
}