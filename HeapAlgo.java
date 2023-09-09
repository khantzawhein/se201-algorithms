// Java program to print all permutations using
// Heap's algorithm
import java.io.*;
class HeapAlgo {
    // Prints the array
    void printArr(int a[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
 
    void permute(int a[], int size, int n)
    {
        if (size == 1)
            printArr(a, n);
 
        for (int i = 0; i < size; i++) {
            permute(a, size - 1, n);
 
            // if size is odd, swap 0th i.e (first) and
            // (size-1)th i.e (last) element
            if (size % 2 == 1) {
                int temp = a[0];
                a[0] = a[size - 1];
                a[size - 1] = temp;
            }
 
            // If size is even, swap ith
            // and (size-1)th i.e last element
            else {
                int temp = a[i];
                a[i] = a[size - 1];
                a[size - 1] = temp;
            }
        }
    }

    public static int knapsack(int[] values, int[] weights, int capacity) {
        int n = values.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity];
    }
 
    // Driver code
    public static void main(String args[])
    {
        // HeapAlgo obj = new HeapAlgo();
        // int a[] = { 1, 2, 3 };
        // obj.permute(a, a.length, a.length);

        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;
        int maxValue = knapsack(values, weights, capacity);
        System.out.println("Maximum value that can be obtained: " + maxValue);
    }


    
}