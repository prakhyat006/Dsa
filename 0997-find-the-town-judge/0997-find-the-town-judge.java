class Solution {
    public int findJudge(int n, int[][] t) {
        int[] arr1=new int[n+1];
        int[] arr2=new int[n+1];
        for(int i=0;i<t.length;i++){
            arr1[t[i][0]] +=1;
            arr2[t[i][1]] +=1;
        }
        for(int i=0;i<=n;i++){
            if(arr1[i]==0 && arr2[i]==n-1)return i;
        }
        return -1;
    }
}