/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
} */

class Solution {
    public Node deleteHead(Node head) {
        if(head==null) return null; // Case 1 : No LL
        return head.next; // Case 2 : General Case
        
    }
}