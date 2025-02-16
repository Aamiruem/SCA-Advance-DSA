// public class Sqrt {
//     public int mySqrt(int x) {
//         // Handle edge cases where x is 0 or 1
//         if (x == 0 || x == 1) {
//             return x; // The square root of 0 is 0, and the square root of 1 is 1
//         }

//         // Initialize the search range
//         int left = 1; // Start of the search range
//         int right = x; // End of the search range
//         int result = 0; // Variable to store the result (integer square root)

//         // Perform binary search to find the integer square root
//         while (left <= right) {
//             // Calculate the middle point of the current search range
//             int mid = left + (right - left) / 2; // Avoids potential overflow compared to (left + right) / 2

//             // Check if mid is a candidate for the square root
//             // Use mid <= x / mid instead of mid * mid <= x to avoid integer overflow
//             if (mid <= x / mid) {
//                 // If mid^2 is less than or equal to x, update the result and search the right
//                 // half
//                 left = mid + 1; // Move the left boundary to mid + 1
//                 result = mid; // Update the result to the current mid (potential square root)
//             } else {
//                 // If mid^2 is greater than x, search the left half
//                 right = mid - 1; // Move the right boundary to mid - 1
//             }
//         }

//         // Return the result, which is the largest integer whose square is less than or
//         // equal to x
//         return result;
//     }
//     public static void main(String[] args) {
//         Sqrt sqrt = new Sqrt();
//         int x = 8;
//         int result = sqrt.mySqrt(x);
//         System.out.println(result);
//     }
// }





public class Sqrt {
    public int mySqrt(int x) {
        // Handle edge cases
        if (x == 0 || x == 1) {
            return x;
        }

        // Initialize search range
        long low = 1;
        long high = x / 2; // The square root of x is at most x/2 for x > 1
        long result = 0;

        // Perform binary search
        while (low <= high) {
            long mid = (low + high) / 2;
            long sqr = mid * mid;

            if (sqr == x) {
                return (int) mid; // If mid^2 equals x, return mid
            } else if (sqr < x) {
                low = mid + 1; // Search the right half
                result = mid; // Update result to the current mid
            } else {
                high = mid - 1; // Search the left half
            }
        }

        // Return the largest integer whose square is less than or equal to x
        return (int) result;
    }
    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();
        int x = 8;
        int result = sqrt.mySqrt(x);
        System.out.println(result);
    }
}
