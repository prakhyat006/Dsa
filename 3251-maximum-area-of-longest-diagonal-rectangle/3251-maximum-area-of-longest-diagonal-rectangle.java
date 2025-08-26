class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        int n=d.length;
        double ans=0;
        int max=0;
        for(int i=0;i<n;i++){
            int x=d[i][0];
            int y=d[i][1];
            double val=Math.sqrt((x*x)+(y*y));
            if(val>ans){
                ans=val;
                max=x*y;
            }
        }
        return max;
    }
}