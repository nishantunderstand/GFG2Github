class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visted = new boolean[adj.size()];
        
        dfsUtil(adj,res,visted,0);
        // Why are we not running For loop ?
        
        return res;
    }
    
    public void dfsUtil(ArrayList<ArrayList<Integer>> graph,ArrayList<Integer> res,boolean[] visted, int node){
        visted[node]=true;
        res.add(node);
        for(int nbr : graph.get(node)){
            if(visted[nbr]==false){
                dfsUtil(graph,res,visted,nbr);
            }
        }
    }
}