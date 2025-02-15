public class MinimumSubarrayWithRequiredSum {

    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = { 13, 7, 6, 12 };
        int x1 = 13;
        int[] result1 = findMinimumSubarray(arr1, x1);
        printResult(result1); // Output: [13, 7]

        // Test Case 2
        int[] arr2 = { 1, 2, 3, 4, 5 };
        int x2 = 6;
        int[] result2 = findMinimumSubarray(arr2, x2);
        printResult(result2); // Output: [3, 4]
    }

    /**
     * Finds the minimum-length subarray whose sum is strictly greater than X.
     *
     * @param arr The input array of positive integers.
     * @param x   The target sum.
     * @return The minimum-length subarray whose sum is strictly greater than X.
     */
    public static int[] findMinimumSubarray(int[] arr, int x) {
        int n = arr.length;
        int minLength = Integer.MAX_VALUE; // Initialize minimum length to a large value
        int startIndex = -1; // Initialize start index of the subarray
        int endIndex = -1; // Initialize end index of the subarray

        // Iterate through the array to find the minimum-length subarray
        for (int i = 0; i < n; i++) {
            int currentSum = 0; // Initialize current sum for the subarray starting at index i
            for (int j = i; j < n; j++) {
                currentSum += arr[j]; // Add the current element to the sum

                // If the current sum is greater than X and the subarray length is smaller than
                // the current minimum
                if (currentSum > x && (j - i + 1) < minLength) {
                    minLength = j - i + 1; // Update the minimum length
                    startIndex = i; // Update the start index
                    endIndex = j; // Update the end index
                    break; // Break inner loop since we found a valid subarray starting at index i
                }
            }
        }

        // If no valid subarray is found, return an empty array
        if (startIndex == -1) {
            return new int[0];
        }

        // Extract the subarray from the original array
        int[] result = new int[minLength];
        for (int i = 0; i < minLength; i++) {
            result[i] = arr[startIndex + i];
        }

        return result;
    }

    /**
     * Prints the result subarray.
     *
     * @param result The subarray to print.
     */
    public static void printResult(int[] result) {
        if (result.length == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
                if (i < result.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
