/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
// complete the below function
class Solution {
    public static int count(Node head, int key) {
        if(head==null) return 0;
        int cnt=0;
        while(head!=null){
            if(head.data ==key){
                cnt++;
            }
            head = head.next;
        }
        return cnt;
    }
}