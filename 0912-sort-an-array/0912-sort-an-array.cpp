class Solution {
public:
void merge(int s,int mid ,int e,vector<int> &nums){
        int i = s;
        int j = mid+1;
        vector<int> temp(nums.size());
        int k = 0;

        while(i<=mid && j<=e){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
            }
        }

        while(i<=mid) temp[k++] = nums[i++];
        while(j<=e) temp[k++] = nums[j++];

        for(int i=s;i<=e;i++){
            nums[i] = temp[i-s];
        }

    }

    void mergeSort(int s,int e,vector<int> &nums){
        if(s<e){
            int mid = s + (e-s)/2;
            mergeSort(s,mid,nums);
            mergeSort(mid+1,e,nums);
            merge(s,mid,e,nums);
        }
    }
    vector<int> sortArray(vector<int>& nums) {
        mergeSort(0,nums.size()-1,nums);
        return nums;
    }
};