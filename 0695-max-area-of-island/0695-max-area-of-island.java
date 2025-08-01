class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int c=0;
        int val=0;
        for(int i=0;i<n;i++){
    
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    val=Math.max(val,dfs(grid,i,j));
                }

            }
            // System.out.println("------");
        }
        return val;  
    }
    public static int dfs(int grid[][],int r,int c){
        if(r<0||r>=grid.length||c<0||c>=grid[0].length||grid[r][c]==0)return 0;
        grid[r][c]=0;
        int l= dfs(grid,r+1,c);
        int g=dfs(grid,r-1,c);
        int d=dfs(grid,r,c+1);
        int u=dfs(grid,r,c-1);
       
        return l+g+d+u+1;
    }
}