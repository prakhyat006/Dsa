class Solution {
    public int[] countBits(int n) {
        int num[] =new int[n+1];
        num[0]=0;
        if(n==0)return num;
        num[1]=1;
        if(n==1)return num;
        num[2]=1;
        for(int i=3;i<=n;i++){
            num[i]=num[i/2]+i%2;
        }
        return num;
    }
}