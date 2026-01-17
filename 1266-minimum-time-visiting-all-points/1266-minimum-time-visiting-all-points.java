class Solution {
    public int minTimeToVisitAllPoints(int[][] p) {
        int x=p[0][0];
        int y=p[0][1];
        int sum=0;  
        int n=p.length;  
        for(int i=1;i<n;i++){
            sum =sum+Math.max(Math.abs(p[i-1][0]-p[i][0]),Math.abs(p[i-1][1]-p[i][1]));
        }
        return sum;
    }
}