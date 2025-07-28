class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        int number = 0;
        int flag = 1;
        int i = 0;

        // Skip leading spaces
        while (i < n && ch[i] == ' ') {
            i++;
        }

        // Check for sign
        if (i < n) {
            if (ch[i] == '-') {
                flag = -1;
                i++;
            } else if (ch[i] == '+') {
                i++;
            }
        }

        // Parse digits
        for (; i < n; i++) {
            if (ch[i] < '0' || ch[i] > '9') {
                break; // stop on non-digit
            }

            int digit = ch[i] - '0';

            // Check overflow before adding digit
            if (number > (Integer.MAX_VALUE - digit) / 10) {
                return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            number = number * 10 + digit;
        }

        return number * flag;
    }
}
