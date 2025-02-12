// import java.util.*;

// public class JumpingNumbers {
//     public static void main(String[] args) {
//         int N = 30; // You can change this value to test with different inputs
//         List<Integer> jumpingNumbers = findJumpingNumbers(N);
//         System.out.println(jumpingNumbers);
//     }

//     public static List<Integer> findJumpingNumbers(int N) {
//         List<Integer> result = new ArrayList<>();
//         if (N >= 0) {
//             result.add(0); // 0 is always a Jumping Number
//         }

//         // Start BFS from 1 to 9
//         for (int i = 1; i <= 9; i++) {
//             bfs(i, N, result);
//         }

//         // Sort the result list
//         Collections.sort(result);
//         return result;
//     }

//     private static void bfs(int start, int N, List<Integer> result) {
//         Queue<Integer> queue = new LinkedList<>();
//         queue.add(start);

//         while (!queue.isEmpty()) {
//             int current = queue.poll();

//             // If the current number is less than or equal to N, add it to the result
//             if (current <= N) {
//                 result.add(current);

//                 // Get the last digit of the current number
//                 int lastDigit = current % 10;

//                 // If the last digit is not 0, append (lastDigit - 1) to the current number
//                 if (lastDigit > 0) {
//                     int nextNumber = current * 10 + (lastDigit - 1);
//                     queue.add(nextNumber);
//                 }

//                 // If the last digit is not 9, append (lastDigit + 1) to the current number
//                 if (lastDigit < 9) {
//                     int nextNumber = current * 10 + (lastDigit + 1);
//                     queue.add(nextNumber);
//                 }
//             }
//         }
//     }
// }







import java.util.ArrayList;

public class JumpingNumbers {

    // Method to find all Jumping Numbers less than or equal to n
    public static ArrayList<Integer> findJumpingNumbers(int n) {
        // ArrayList to store the result
        ArrayList<Integer> arr = new ArrayList<>();

        // Iterate through all numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            int x = i; // Temporary variable to process the current number
            int prevDigit = x % 10; // Get the last digit of the number
            x = x / 10; // Remove the last digit

            // Flag to check if the number is a Jumping Number
            boolean isJumpingNumber = true;

            // Process the remaining digits of the number
            while (x != 0) {
                int currDigit = x % 10; // Get the current last digit
                // Check if the absolute difference between current and previous digit is not 1
                if (Math.abs(prevDigit - currDigit) != 1) {
                    isJumpingNumber = false; // Not a Jumping Number
                    break; // Exit the loop
                }
                prevDigit = currDigit; // Update the previous digit
                x = x / 10; // Remove the last digit
            }

            // If the number is a Jumping Number, add it to the result list
            if (isJumpingNumber) {
                arr.add(i);
            }
        }

        // Return the list of Jumping Numbers
        return arr;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        int n = 30; // Input value
        System.out.println(findJumpingNumbers(n)); // Print the result
    }
}
