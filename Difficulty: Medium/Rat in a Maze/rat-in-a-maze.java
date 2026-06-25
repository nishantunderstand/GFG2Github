// Thursday, June 25, 2026 7:42:51 PM
// TC : O(4^n*n) | SC : O(n*n)
// GFG :Rat in a Maze

class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> res = new ArrayList<>();
        int n = maze.length;
        dfs(maze,0,0,n,res,"");
        //Collections.sort(res);
        return res;
    }
    
    private void dfs(int[][] maze, int i, int j, int n, ArrayList<String> res, String curr){
        
        // Correct Order : Guard → Check → Base
        
        // Guard Case
        if(i<0 || j<0 || i>=n || j>=n) return ;
        
        // Check
        if(maze[i][j]==0) return;
        
        // Base Case
        if(i==n-1 && j==n-1){
            res.add(curr);
            return;
        }
        
        // Do
        maze[i][j] = 0; 
        // Recurse // Lexiographically Order Or Else You need Collections.sort 
        dfs(maze,i+1,j,n,res,curr+"D");
        dfs(maze,i,j-1,n,res,curr+"L");
        dfs(maze,i,j+1,n,res,curr+"R"); 
        dfs(maze,i-1,j,n,res,curr+"U");
        
        // UnDo
        maze[i][j] = 1; 
    }
}