
public class PrintSpiral {

    public static void printSpiral(int[][] arr) {
        if (arr.length == 0) {
            return;
        }

        int sRow = 0, sCol = 0;
        int eRow = arr.length - 1, eCol = arr[0].length - 1;
        int total = arr.length * arr[0].length;
        int count = 0;

        while (count < total) {
            // Print top row (left to right)
            for (int i = sCol; i <= eCol && count < total; i++) {
                System.out.print(arr[sRow][i] + " ");
                count++;
            }
            sRow++;

            // Print right column (top to bottom)
            for (int i = sRow; i <= eRow && count < total; i++) {
                System.out.print(arr[i][eCol] + " ");
                count++;
            }
            eCol--;

            // Print bottom row (right to left)
            for (int i = eCol; i >= sCol && count < total; i--) {
                System.out.print(arr[eRow][i] + " ");
                count++;
            }
            eRow--;

            // Print left column (bottom to top)
            for (int i = eRow; i >= sRow && count < total; i--) {
                System.out.print(arr[i][sCol] + " ");
                count++;
            }
            sCol++;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.print("Spiral Matrix Print: ");
        printSpiral(arr);
    }
}
