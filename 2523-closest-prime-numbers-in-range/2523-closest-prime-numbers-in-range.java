class Solution {
    static boolean prime(long n){
    if( (n%2==0 && n!=2) || (n%3==0 && n!=3))
    return false;
    for(long i=5;i*i<n+1;i+=6)
    if(n%i==0 || (i*i<n+1 && n%(i+2)==0))
    return false;
    return true;
}
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> ls=new ArrayList<>();
        int[] re=new int[2];
        int one=0;
        if(left==1) left++;
        while(left<=right){
        if(prime(left)){
            ls.add(left);
        }
            left++;
        }
        System.out.println(ls);
        long diff=100000000;
        if(ls.size()<2){
            re[0]=re[1]=-1;
            return re;
        }
        for(int i=0;i<ls.size()-1;i++){
            if(diff>ls.get(i+1)-ls.get(i)){
                diff=ls.get(i+1)-ls.get(i);
                re[0]=ls.get(i);
                re[1]=ls.get(i+1);
            }

        }
        return re;
    }
}