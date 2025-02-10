
// import java.util.Arrays;

// public class FirstAndLastOccurrence {

//     // Function to find the first occurrence of K in the sorted array
//     public static int findFirstOccurrence(int[] arr, int k) {
//         int left = 0; // Start of the array
//         int right = arr.length - 1; // End of the array
//         int firstOccurrence = -1; // Initialize the first occurrence index as -1 (not found)

//         // Perform binary search to find the first occurrence
//         while (left <= right) {
//             int mid = left + (right - left) / 2; // Calculate the middle index

//             if (arr[mid] == k) {
//                 // If K is found at mid, update firstOccurrence
//                 firstOccurrence = mid;
//                 // Continue searching in the left half to find an earlier occurrence
//                 right = mid - 1;
//             } else if (arr[mid] < k) {
//                 // If K is greater than the middle element, search in the right half
//                 left = mid + 1;
//             } else {
//                 // If K is smaller than the middle element, search in the left half
//                 right = mid - 1;
//             }
//         }

//         return firstOccurrence; // Return the index of the first occurrence (or -1 if not found)
//     }

//     // Function to find the last occurrence of K in the sorted array
//     public static int findLastOccurrence(int[] arr, int k) {
//         int left = 0; // Start of the array
//         int right = arr.length - 1; // End of the array
//         int lastOccurrence = -1; // Initialize the last occurrence index as -1 (not found)

//         // Perform binary search to find the last occurrence
//         while (left <= right) {
//             int mid = left + (right - left) / 2; // Calculate the middle index

//             if (arr[mid] == k) {
//                 // If K is found at mid, update lastOccurrence
//                 lastOccurrence = mid;
//                 // Continue searching in the right half to find a later occurrence
//                 left = mid + 1;
//             } else if (arr[mid] < k) {
//                 // If K is greater than the middle element, search in the right half
//                 left = mid + 1;
//             } else {
//                 // If K is smaller than the middle element, search in the left half
//                 right = mid - 1;
//             }
//         }

//         return lastOccurrence; // Return the index of the last occurrence (or -1 if not found)
//     }

//     // Main function to find the first and last occurrence of K
//     public static int[] findFirstAndLastOccurrence(int[] arr, int k) {
//         // Find the first occurrence of K
//         int first = findFirstOccurrence(arr, k);
//         // Find the last occurrence of K
//         int last = findLastOccurrence(arr, k);

//         // Return the result as an array containing the first and last occurrence indices
//         return new int[]{first, last};
//     }

//     public static void main(String[] args) {
//         // Test Case 1
//         int[] arr1 = {0, 5, 5, 6, 6, 6};
//         int k1 = 3;
//         System.out.println("Test Case 1:");
//         System.out.println("ARR = " + Arrays.toString(arr1));
//         System.out.println("K = " + k1);
//         System.out.println("Output: " + Arrays.toString(findFirstAndLastOccurrence(arr1, k1)));

//         // Test Case 2
//         int[] arr2 = {0, 0, 1, 1, 2, 2, 2, 2};
//         int k2 = 2;
//         System.out.println("\nTest Case 2:");
//         System.out.println("ARR = " + Arrays.toString(arr2));
//         System.out.println("K = " + k2);
//         System.out.println("Output: " + Arrays.toString(findFirstAndLastOccurrence(arr2, k2)));

//         // Test Case 3
//         int[] arr3 = {1, 2, 3, 4, 5, 6, 6, 6, 7};
//         int k3 = 6;
//         System.out.println("\nTest Case 3:");
//         System.out.println("ARR = " + Arrays.toString(arr3));
//         System.out.println("K = " + k3);
//         System.out.println("Output: " + Arrays.toString(findFirstAndLastOccurrence(arr3, k3)));
//     }
// }













import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastOccurrenceArrayList {

    // Function to find the first occurrence of K in the sorted ArrayList
    public static int findFirstOccurrence(ArrayList<Integer> arr, int k) {
        int left = 0;
        int right = arr.size() - 1;
        int firstOccurrence = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr.get(mid) == k) {
                firstOccurrence = mid;
                right = mid - 1; // Search in the left half
            } else if (arr.get(mid) < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return firstOccurrence;
    }

    // Function to find the last occurrence of K in the sorted ArrayList
    public static int findLastOccurrence(ArrayList<Integer> arr, int k) {
        int left = 0;
        int right = arr.size() - 1;
        int lastOccurrence = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr.get(mid) == k) {
                lastOccurrence = mid;
                left = mid + 1; // Search in the right half
            } else if (arr.get(mid) < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return lastOccurrence;
    }

    // Main function to find the first and last occurrence of K
    public static int[] findFirstAndLastOccurrence(ArrayList<Integer> arr, int k) {
        int first = findFirstOccurrence(arr, k);
        int last = findLastOccurrence(arr, k);
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        // Test Case 1
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(0, 5, 5, 6, 6, 6));
        int k1 = 3;
        System.out.println("Test Case 1:");
        System.out.println("ARR = " + arr1);
        System.out.println("K = " + k1);
        System.out.println("Output: " + Arrays.toString(findFirstAndLastOccurrence(arr1, k1)));

        // Test Case 2
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(0, 0, 1, 1, 2, 2, 2, 2));
        int k2 = 2;
        System.out.println("\nTest Case 2:");
        System.out.println("ARR = " + arr2);
        System.out.println("K = " + k2);
        System.out.println("Output: " + Arrays.toString(findFirstAndLastOccurrence(arr2, k2)));

        // Test Case 3
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 6, 7));
        int k3 = 6;
        System.out.println("\nTest Case 3:");
        System.out.println("ARR = " + arr3);
        System.out.println("K = " + k3);
        System.out.println("Output: " + Arrays.toString(findFirstAndLastOccurrence(arr3, k3)));
    }
}
