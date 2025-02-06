public class SetZeroMatrix {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean colSet = false;

        // First pass: Identify which rows and columns need to be set to zero
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                colSet = true;
            }
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Second pass: Set matrix elements to zero based on markers
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j > 0; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (colSet) {
                matrix[i][0] = 0;
            }
        }
    }
    
    public static void main(String[] args) {
        SetZeroMatrix s = new SetZeroMatrix();
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        s.setZeroes(matrix);
        for (int[] element : matrix) {
                    for (int j = 0; j < matrix[0].length; j++) {
                        System.out.print(element[j] + " ");
                    }
                    System.out.println();
                }
    }
}
