// package Array;

import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {
        // Declare the array
        int[] arr = new int[5];
        Scanner kb = new Scanner(System.in);

        // Input values into the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value for arr[" + i + "]:");
            arr[i] = kb.nextInt();
        }

        // Display the array values
        System.out.println("Here is what you entered:");
        for (int x : arr) {
            System.out.println(x);
        }

        kb.close(); // Close the scanner to prevent resource leaks
    }
}
