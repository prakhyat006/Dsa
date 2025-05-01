class Solution {
    public int[] findEvenNumbers(int[] d) {
        Set<Integer> ls = new TreeSet<>(); 
        int n=d.length;
        int num=0;
        for(int i=0;i<n;i++){
            if(d[i]!=0){
            for(int j=0;j<n;j++){
                if(i!=j){
                for(int k=0;k<n;k++){
                    if(i!=k&&j!=k){
                        num=d[i]*100+d[j]*10+d[k];
                        if(num%2==0)ls.add(num);
                    }
                }
                }
            }
            }
        }
        int[] result = new int[ls.size()];
        int idx = 0;
        for (int nu : ls) {
            result[idx++] = nu;
        }
        return result;
    }
}