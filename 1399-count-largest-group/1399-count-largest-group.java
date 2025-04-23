class Solution {
    int s(int n){
        int sum=0;
        while(n>0){
            sum +=n%10;
            n /=10;
        }
        return sum;
    }
    public int countLargestGroup(int n) {
        int i=1;
        Map<Integer, Integer> map = new HashMap<>();
       
        int maxSize=0;
        while(i<=n){
             int sum=0;
         sum=s(i);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
             maxSize = Math.max(maxSize, map.get(sum));
            i++;
        }
        System.out.println(map);
        int count=0;
        for (int val : map.values()) {
            if (val == maxSize) count++;
        }
        return count;
    }
}