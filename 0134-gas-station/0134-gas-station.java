class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int totalc=0;
        int n=gas.length;
        for(int i=0;i<n;i++){
            total +=gas[i];
            totalc +=cost[i];
        }
        if(total<totalc)return -1;
        int cur=0;
        int start=0;
        for(int i=0;i<n;i++){
            cur=cur+gas[i]-cost[i];
            if(cur<0){
                cur=0;
                start=i+1;
            }
        }
        return start;
    }
}