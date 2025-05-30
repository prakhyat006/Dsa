class Solution {
    public static int area(int a,int b){
        return a*b;
    }
    public int maxArea(int[] height) {
    int max=0,sum=0;
    for(int i=0;i<height.length-1;i++){
    for(int j=i+1;j<height.length;j++){
        if(height[i]>height[j]) sum=area(height[j],j-i);
        else sum=area(height[i],j-i);
        if(sum>max) max=sum;
    }
    }
    return max;
    }
}