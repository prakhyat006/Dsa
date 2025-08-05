class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
        int n=f.length;
        int m=b.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(f[i]<=b[j]){
                    b[j]=0;
                    f[i]=0;
                    break;
                }
            }
        }
        int c=0;
        for(int i:f)if(i>0)c++;
        return c;
    }
}