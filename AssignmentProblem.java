import java.util.Arrays;

public class AssignmentProblem {

    // Function to find the minimum cost assignment using brute force
    // Define a global variable to store the minimum total cost
    static int minTotalCost = Integer.MAX_VALUE;

    // Function to calculate the total cost for a given permutation of job
    // assignments
    public static int calculateTotalCost(int[][] costMatrix, int[] assignment) {
        int totalCost = 0;
        for (int i = 0; i < assignment.length; i++) {
            totalCost += costMatrix[i][assignment[i]];
        }
        System.out.println(totalCost);
        return totalCost;
    }

    // Function to swap two elements in an array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to find all permutations of job assignments using backtracking
    public static void permute(int[][] costMatrix, int[] assignment, int currentJob) {
        if (currentJob == assignment.length) {
            int totalCost = calculateTotalCost(costMatrix, assignment);
            minTotalCost = Math.min(minTotalCost, totalCost);
            return;
        }

        for (int i = currentJob; i < assignment.length; i++) {
            swap(assignment, currentJob, i);
            permute(costMatrix, assignment, currentJob + 1);
            swap(assignment, currentJob, i); // backtrack to restore the original array
        }
    }

    // Function to solve the Job Assignment problem and return the minimum total
    // cost
    public static int solveJobAssignmentProblem(int[][] costMatrix) {
        int n = costMatrix.length;
        int[] assignment = new int[n];
        for (int i = 0; i < n; i++) {
            assignment[i] = i; // Initialize assignment array with the identity permutation
        }

        permute(costMatrix, assignment, 0);

        return minTotalCost;
    }

    // Example usage:
    public static void main(String[] args) {
        int[][] costMatrix = {
                {9, 2, 7, 8},
                {6, 4, 3, 7},
                {5, 8, 1, 8},
                {7, 6, 9, 4}
        };

        int minCost = solveJobAssignmentProblem(costMatrix);
        System.out.println("Minimum Total Cost: " + minCost);
    }

}
