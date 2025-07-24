class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
       PriorityQueue<Integer> ls=new PriorityQueue<>();
       for(int i=0;i<costs.length;i++)ls.offer(costs[i]);
       long sum=0;
       while(k-->0){
        sum +=ls.poll();
       } 
       return sum;
    }
}