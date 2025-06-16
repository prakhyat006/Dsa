class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
    int m=f.length;
    int zero =0;
    for(int i=0;i<m;i++){
        if(f[i]==0){
            boolean l=(i==0||f[i-1]==0);
            boolean r=(i==m-1||f[i+1]==0);
            if(l && r){
                f[i]=1;
                zero++;
                if(zero>=n)return true;
            }
        }
    }  
    return zero >= n;
    }
}