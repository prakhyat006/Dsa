class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
         PriorityQueue<int[]> ls = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int n=nums.size();
   
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            List<Integer> l=nums.get(i);
            for(int j=0;j<l.size();j++){
                ls.offer(new int[]{
                    l.get(j),i
                });
            }
        }
        int l=0;
        int r=0;
        int val=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int[] a=new int[2];
        HashSet<Integer> hs=new HashSet<>();
        while(!ls.isEmpty()){
            hs.add(ls.peek()[1]);
            if(hs.size()<=1){
                System.out.println(ls.peek()[0]+" hi");
                val=ls.peek()[0];
            }
            System.out.println(hs+""+ls.peek()[0]);
            if(hs.size()==n){
                System.out.println(val);
                if(ls.peek()[0]-val+1<min){
                    min=ls.peek()[0]-val+1;
                    a[0]=val;
                    a[1]=ls.peek()[0];
                }
                hs.clear();
                val=Integer.MIN_VALUE;
            }
            ls.poll();
        }
        return a;
    }
}