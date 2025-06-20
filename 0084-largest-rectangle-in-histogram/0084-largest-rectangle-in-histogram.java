class Solution {
    public int largestRectangleArea(int[] he) {
        int n=he.length;
        int h=0;
        int max=0;
        Stack<Integer> stack =new Stack<>();
        for(int i=0;i<=n;i++){
            h=(i==n)?0:he[i];
            while(!stack.isEmpty()&&h<he[stack.peek()]){
                int height=he[stack.pop()];
                int width=stack.isEmpty()?i:i-stack.peek()-1;
                max=Math.max(max,height*width);
            }
            stack.push(i);
        }
        return max;
    }
}