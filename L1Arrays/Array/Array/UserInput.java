// package Array;
// import java.util.Scanner;
// public class UserInput {
//     public static void main(String[] args) {
//         // Declaration of the array
//         int[] arr = new int[5];
//         // User input
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter " + arr.length + " numbers:");
//         // Input into the array
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
// System.out.println();
//         // Print the entire array after all inputs are received
//         System.out.println("Here is what you entered:");
//         for (int x : arr) {
//             System.out.println(x);
//         }
//         // Close the scanner
//         sc.close();
//     }
// }











package Array;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        // Declaration of the array
        int[] arr = new int[5];


        
        // Input into the array
        try ( // User input
                Scanner sc = new Scanner(System.in)) {
            // Input into the array
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter " + (i + 1) + " numbers:");
                arr[i] = sc.nextInt();
            }



            System.out.println();
            // Print the entire array after all inputs are received
            System.out.println("Here is what you entered:");
            for (int x : arr) {
                System.out.println(x);
            }
            // Close the scanner
        }
    }
}
