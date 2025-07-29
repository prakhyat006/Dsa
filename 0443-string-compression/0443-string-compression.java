import java.util.HashMap;
import java.util.Map;

class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i=0;
        if(n==1)return 1;
        int j=i+1;
        int start=1;
        char s =chars[0];
        int count=1;
        while(start<n){
            if(chars[start]==s)count++;
            else {
                chars[i++] = s;
                 if (count > 1) {
                    String cnt = String.valueOf(count);
                    for (int k = 0; k < cnt.length(); k++) {
                        chars[i++] = cnt.charAt(k); // write count digits
                    }
                }
                 s = chars[start]; // reset for next group
                count = 1;
            }
            start++;
        }
        chars[i++] = s;
                 if (count > 1) {
                    String cnt = String.valueOf(count);
                    for (int k = 0; k < cnt.length(); k++) {
                        chars[i++] = cnt.charAt(k); // write count digits
                    }
                }
        return i;
    }
}
