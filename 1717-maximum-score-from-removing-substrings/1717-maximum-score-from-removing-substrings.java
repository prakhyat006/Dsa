class Solution {
    int forba(String s1,Character f,Character se,int x,int y){
        int c=0;
        Stack<Character> s=new Stack<>();
        int n=s1.length();
        for(int i=0;i<n;i++){
            if(!s.isEmpty() &&(s.peek()==f && s1.charAt(i)==se)){
                c++;
                s.pop();
            }else s.push(s1.charAt(i));
        }
        StringBuilder remaining = new StringBuilder();
        for (char ch : s) {
            remaining.append(ch);
        }
        int k = 0;
        Stack<Character> stack2 = new Stack<>();
        for (char ch : remaining.toString().toCharArray()) {
            if (!stack2.isEmpty() && stack2.peek() == se && ch == f) {
                k++;
                stack2.pop();
            } else {
                stack2.push(ch);
            }
        }

        return c*y+k*x;
    }
    public int maximumGain(String s1, int x, int y) {
        int c=0;
        if(x>=y){
            return forba(s1,'a','b',y,x);
        }else return forba(s1,'b','a',x,y);
    }
}