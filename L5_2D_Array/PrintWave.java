
public class PrintWave {

    public static void printWave(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        for (int j = 0; j < cols; j++) {
            if (j % 2 == 0) {
                // Going down
                for (int i = 0; i < rows; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                // Going up
                for (int i = rows - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Wave Print: ");
        printWave(arr);
    }
}
