// package placement.twodarray;

import java.util.Scanner;

public class JaggedBasicIo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int[][] arr = new int[2][];  // Corrected declaration
        arr[0] = new int[4];  // First row has 4 columns
        arr[1] = new int[3];  // Second row has 3 columns

        // Input values
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr[i].length; j++) {  // Corrected loop condition
                System.out.println("Enter number for arr[" + i + "][" + j + "]:");
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println("Here is what you inputted:");

        // Output values
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr[i].length; j++) {  // Fixed loop range
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  // Move to next line after each row
        }

        kb.close();  // Close scanner
    }
}
