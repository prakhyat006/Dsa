class Solution {
    public int compareVersion(String v1, String v2) {
        String[] parts = v1.split("\\.");
        String[] parts2 = v2.split("\\.");
        int n=0;
        if(parts.length<parts2.length){
            n=parts2.length;
        }else n=parts.length;
        int[] nums = new int[n];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }
    
        int[] nums2 = new int[n];
        for (int i = 0; i < parts2.length; i++) {
            nums2[i] = Integer.parseInt(parts2[i]);
        }
        for(int i=0;i<n;i++){
            if(nums[i]<nums2[i])return -1;
            else if(nums[i]>nums2[i])return 1;
        }
        return 0;
    }
}