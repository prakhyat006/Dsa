class Solution {
    static Queue<int[]> q;
    public int orangesRotting(int[][] grid) {
        q=new LinkedList<>();
         int n=grid.length;
        int m=grid[0].length;
        int c=0;
        int f=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1)f++;
                if(grid[i][j]==2)q.add(new int[]{i,j,0});
            }
        }
        int max=0;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            grid[cur[0]][cur[1]]=0;
            max=Math.max(max,cur[2]);
            dfs(grid, cur[0] + 1, cur[1], cur[2]);
            dfs(grid, cur[0] - 1, cur[1], cur[2]);
            dfs(grid, cur[0], cur[1] + 1, cur[2]);
            dfs(grid, cur[0], cur[1] - 1, cur[2]);
        }
        for (int[] row : grid) {
            for (int cell : row) {
                if (cell == 1) return -1;
            }
        }
        return max;
    }
    public static void dfs(int grid[][],int r,int c,int t){
        if(r<0||r>=grid.length||c<0||c>=grid[0].length||grid[r][c]==0||grid[r][c]==2)return ;
        grid[r][c]=2;
        q.add(new int[]{r,c,t+1});
    }
}