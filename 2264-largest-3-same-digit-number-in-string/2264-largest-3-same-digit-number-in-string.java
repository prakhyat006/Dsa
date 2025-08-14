class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        int n = num.length();
        int c = 1;
        char val = num.charAt(0);

        for (int i = 1; i < n; i++) {
            if (val == num.charAt(i)) {
                c++;
                if (c == 3) { // exactly 3
                    String triple = String.valueOf(val).repeat(3);
                    if (ans.isEmpty() || triple.compareTo(ans) > 0) {
                        ans = triple;
                    }
                }
            } else {
                val = num.charAt(i);
                c = 1;
            }
        }
        return ans;
    }
}
