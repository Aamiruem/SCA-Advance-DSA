import java.util.Scanner;

class TwodArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][4]; // 2D Array declaration
        Scanner kb = new Scanner(System.in);

        // Input values
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Enter no:");
                arr[i][j] = kb.nextInt();
            }
        }

        // Display values
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line
        }

        kb.close(); // Close the Scanner
    }
}
