
public class DiagonalSum {

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];          // Primary diagonal
            sum += mat[i][n - i - 1];  // Secondary diagonal
        }

        // If the matrix has an odd size, subtract the middle element (it was added twice)
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Diagonal Sum: " + diagonalSum(mat));
    }
}
