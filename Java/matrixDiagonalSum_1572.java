import java.util.Arrays;

public class matrixDiagonalSum_1572 {
    public static int diagonalSum(int[][] mat) {
        return primaryDiagonalSum(mat) + antiDiagonalSum(mat);
    }

    public static int primaryDiagonalSum (int[][] mat) {
        int n = mat.length;
        int sums = 0;

        for (int i = 0; i < n; i++) {
            sums += mat[i][i];
        }
        return sums;
    }

    public static int antiDiagonalSum (int[][] mat) {
        int n = mat.length;
        int currentLen = n - 1;
        int sums = 0;

        for (int i = 0; i < n; i++) {
            sums += mat[i][currentLen];
            currentLen -= 1;
        }
        return sums;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = 1;
            }
        }

        int[][] oddMatrix = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = 1;
            }
        }
        System.out.println(diagonalSum(matrix));
        // System.out.println(diagonalSum(oddMatrix));
    }

}
