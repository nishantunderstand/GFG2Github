/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}*/

class Solution {
    public int height(Node root) {
        if(root==null) return 0;
        return helper(root);
    }
    
    private int helper(Node root){
        if(root==null) return -1; // Base Case 
        int left = helper(root.left);
        int right = helper(root.right);
        return Math.max(left,right)+1;
        
    }
}