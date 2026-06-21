class Solution {
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    public int inOrderSuccessor(Node root, Node x) {
        Node successor = null;
        while(root!=null){
            if(root.data<=x.data){
                root = root.right;
            }else{
                successor = root;
                root = root.left; //<--
            }
        }
        if(successor!=null){
            return successor.data;
        }else{
            return -1;
        }
    }
}