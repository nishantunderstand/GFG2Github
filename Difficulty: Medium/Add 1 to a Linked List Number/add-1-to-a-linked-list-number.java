/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

// 1-2-3
// 3-2-1


class Solution {
    public Node addOne(Node head) {
        head = reverseNode(head);
        Node curr = head;
        int carry = 1;
        while(curr!=null){
            int sum = curr.data + carry;
            curr.data = sum%10;
            carry = sum/10;
            if(carry==0){
                break;
            }
            if(curr.next==null && carry>0){
                curr.next = new Node(carry);
                carry = 0;
                break;
            }
            curr = curr.next;
        }
        head = reverseNode(head);
        return head;
    }
    
    public Node reverseNode(Node head){
        Node prev = null;
        Node curr = head;
        while(curr!=null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}