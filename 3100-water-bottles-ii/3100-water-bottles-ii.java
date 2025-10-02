class Solution {
    public int maxBottlesDrunk(int n1, int n2) {
        
        int e=n1;
        int sum=n1;
        while(e>=n2){
            e=e/n2+1;
            sum++;
            n2++;
        }
        return sum+1;
    }
}