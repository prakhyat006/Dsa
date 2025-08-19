class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n-1];
        for(int i=1;i<n;i++){
            arr[i-1]=nums[i-1]-nums[i];
        }
        if(n>=3){
            int val=arr[0];
            int c=1;
            int ans=0;
            for(int i=1;i<n-1;i++){
                if(val==arr[i]){
                    c++;
                }else {
                    c++;
                    if(c>=3)ans=ans+((c-1)*(c-2))/2;
                    c=1;
                    val=arr[i];
                }
            }
            System.out.println(c);
            c++;
            if(c>=3)ans=ans+((c-1)*(c-2))/2;
            return ans;
        }else return 0;
    }
}