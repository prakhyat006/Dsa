class Solution {
    public int maximum69Number (int num) {
        int n=0;
        int x=num;
        while(x>0){
            n=x%10+n*10;
            x=x/10;
        }
        int flag=0;
        while(n>0){
            int digi = n%10;
            if(digi==6&&flag==0){
                flag=1;
                x=x*10+9;
            }else{
                x=x*10+digi;
            }
            n=n/10;
            // System.out.println(digi);
        }
        // System.out.println(n);
        return x;
    }
}