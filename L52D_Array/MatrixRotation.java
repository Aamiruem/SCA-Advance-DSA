
// public class RotateMatrix {

//     public static void rotate(int[][] matrix) {
//         int n = matrix.length;

//         // Transpose the matrix
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//             }
//         }

//         // Reverse each row
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n / 2; j++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[i][n - 1 - j];
//                 matrix[i][n - 1 - j] = temp;
//             }
//         }
//     }

//     public static void printMatrix(int[][] matrix) {
//         for (int[] row : matrix) {
//             for (int num : row) {
//                 System.out.print(num + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         System.out.println("Original Matrix:");
//         printMatrix(matrix);

//         rotate(matrix);

//         System.out.println("Rotated Matrix:");
//         printMatrix(matrix);
//     }
// }













public class MatrixRotation {

    // Main method to rotate the matrix
    public void rotate(int[][] matrix) {
        swapRows(matrix);  // Step 1: Reverse the rows of the matrix
        transpose(matrix); // Step 2: Transpose the matrix
    }

    // Method to swap rows of the matrix
    public static void swapRows(int[][] matrix) {
        int n = matrix.length; // Get the size of the matrix (assuming it's square)
        int start = 0;         // Pointer to the first row
        int end = n - 1;       // Pointer to the last row

        // Swap rows until all rows are reversed
        while (start < end) {
            int[] temp = matrix[start]; // Temporarily store the start row
            matrix[start] = matrix[end]; // Move the end row to the start
            matrix[end] = temp;          // Move the start row to the end
            start++; // Move the start pointer forward
            end--;   // Move the end pointer backward
        }
    }

    // Method to transpose the matrix
    public static void transpose(int[][] matrix) {
        int n = matrix.length; // Get the size of the matrix

        // Loop through the upper triangle of the matrix
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap elements across the diagonal
                int temp = matrix[i][j];      // Temporarily store the element at [i][j]
                matrix[i][j] = matrix[j][i];  // Move the element at [j][i] to [i][j]
                matrix[j][i] = temp;          // Move the stored element to [j][i]
            }
        }
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the rotation
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix); // Print the original matrix

        MatrixRotation obj = new MatrixRotation();
        obj.rotate(matrix); // Rotate the matrix

        System.out.println("Rotated Matrix:");
        printMatrix(matrix); // Print the rotated matrix
    }
}
