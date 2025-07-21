import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] num = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = arr[i];  
        }

        Arrays.sort(num, (a, b) -> {
            int bitCountA = Integer.bitCount(a);
            int bitCountB = Integer.bitCount(b);
            if (bitCountA != bitCountB) {
                return bitCountA - bitCountB;
            } else {
                return a - b;  // Sort by value if bit count is equal
            }
        });

        // Convert Integer[] back to int[]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num[i];
        }

        return arr;
    }
}
