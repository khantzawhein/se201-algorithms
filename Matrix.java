import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrixOriginal = {
                {1, 0, 1, 1, 0},
                {0, 1, 1, 1, 0},
                {1, 0, 1, 0, 1},
                {1, 1, 0, 0, 1},
                {0, 0, 1, 1, 0}
        };
        int n = 5;
        int[][] newMatrixArr = countOnes(matrixOriginal, n);

        System.out.println("Input: " + Arrays.deepToString(matrixOriginal));
        System.out.println("Output: " + Arrays.deepToString(newMatrixArr));
    }

    public static int[][] countOnes(int[][] matrix, int n) {
        int[][] result = new int[n][n];
        result[0][0] = matrix[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j >= 1) {
                    if (matrix[i][j] == 1) {
                        result[i][j] = result[i][j - 1] + 1;
                    } else {
                        result[i][j] = result[i][j - 1];
                    }
                }
                if (j == 0 && i >= 1) {
                    if (matrix[i][j] == 1) {
                        result[i][j] = result[i - 1][j] + 1;
                    } else {
                        result[i][j] = result[i - 1][j];
                    }
                }
                if (i > 0 && j > 0) {
                    if (matrix[i][j] == 1) {
                        result[i][j] = result[i - 1][j] + result[i][j - 1] - result[i - 1][j - 1] + 1;
                    } else {
                        result[i][j] = result[i - 1][j] + result[i][j - 1] - result[i - 1][j - 1];
                    }
                }
            }
        }
        return result;
    }

}