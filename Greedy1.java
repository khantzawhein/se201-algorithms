/**
 * Khant Zaw Hein
 * 65211511
 */

import java.util.Arrays;

public class Greedy1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 6, 7, 3, 2 };

        System.out.println("Input: " + Arrays.toString(arr));
        System.out.println("Output: " + maxSum(arr));
    }

    public static int maxSum(int[] arr) {
        int max = 0;
        Arrays.sort(arr);
        
        System.out.println("Sorted: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            max += arr[i] * (i);
        }
        return max;
    }
}
