class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        double[] num=new double[m+n];
        int i=0;
        for( i=0;i<n;i++)
        num[i]=nums1[i];
        for( i=0;i<m;i++)
        num[i+n]=nums2[i];
        Arrays.sort(num);
        if((m+n)%2!=0) return num[(m+n-1)/2];
        else return ((num[(m+n)/2])+(num[(m+n)/2-1]))/2;
    }
}