class Solution {
    public int numWaterBottles(int n1, int n2) {
        int sum=n1+n1/n2;
        int dif=n1%n2;
        int val=n1/n2+dif;
        while(val>=n2){
            sum+=1;
            val=val-n2+1;
        }
        return sum;
    }
}