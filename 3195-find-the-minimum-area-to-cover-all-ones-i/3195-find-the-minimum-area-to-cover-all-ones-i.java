class Solution {
    public int minimumArea(int[][] g) {
        int n=g.length;
        int m=g[0].length;
        ArrayList<Val> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(g[i][j]==1)ls.add(new Val(i,j));
            }
        }
        int mx=9999;
        int my=9999;
        int maxx=0;
        int maxy=0;
        if (ls.isEmpty()) return 0;
        for(int i=0;i<ls.size();i++){
            int ax=ls.get(i).x;
            mx=Math.min(mx,ax);
            maxx=Math.max(maxx,ax);
            int ay=ls.get(i).y;
            my=Math.min(my,ay);
            maxy=Math.max(maxy,ay);
        }
        int height = maxx - mx + 1;
        int width = maxy - my + 1;

        return height * width;
    }
}
class Val{
    int x;
    int y;
    Val(int x,int y){
        this.x=x;
        this.y=y;
    }
}