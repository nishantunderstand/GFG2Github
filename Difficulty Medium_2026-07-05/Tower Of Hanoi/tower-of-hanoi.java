class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        if(n==0) return 0;
        
        int leftMoves = towerOfHanoi(n-1, from,aux,to);
        int rightMoves = towerOfHanoi(n-1,aux,to,from);
        return leftMoves + 1 + rightMoves;
        
    }
}
