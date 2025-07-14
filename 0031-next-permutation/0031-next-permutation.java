class Solution {
    public void rev(int[] nums,int s,int e){
        while(s<e){
            nums[e]=nums[e]+nums[s]-(nums[s]=nums[e]);
            s++;
            e--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int indx=-1;
        int i=n-2;
        while(i>=0){
            if(nums[i]<nums[i+1]){
                indx=i;
                break;
            }
            i--;
        }

        if(indx==-1){
        rev(nums,0,n-1);
    }
        else{
            i=n-1;
            while(i>=indx){
                if(nums[i]>nums[indx]){
                    nums[i]=nums[i]+nums[indx]-(nums[indx]=nums[i]);
                    break;
                }
                i--;
            }
            rev(nums,indx+1,n-1);
        }
        
    }
}