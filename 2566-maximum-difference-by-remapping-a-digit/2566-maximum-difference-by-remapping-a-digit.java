class Solution {
    public int minMaxDifference(int num) {
        String numStr = String.valueOf(num);
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        // Try all digits 0-9 for max
        for (char d = '0'; d <= '9'; d++) {
            String replaced = numStr.replace(d, '9');
        //     System.out.println("Replaced :"+replaced);
            int value = Integer.parseInt(replaced);
            maxVal = Math.max(maxVal, value);
        }

        // Try all digits 1-9 for min (to avoid leading 0)
        for (char d = '1'; d <= '9'; d++) {
            String replaced = numStr.replace(d, '0');
            System.out.println("Replaced :"+replaced);
            int value = Integer.parseInt(replaced);
            minVal = Math.min(minVal, value);
        }
        // System.out.println("MaxValue : "+maxVal);
        // System.out.println("MinValue : "+minVal);
        return maxVal - minVal;
    }
}