// Define a public class named BinarySearch
public class BinarySearch {

    // Method to perform binary search on a sorted array
    public static int binarySearch(int[] arr, int target) {
        int left = 0; // Initialize the left pointer to the start of the array
        int right = arr.length - 1; // Initialize the right pointer to the end of the array

        // Continue searching while the left pointer is less than or equal to the right pointer
        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index to avoid overflow

            // Check if the middle element is the target value
            if (arr[mid] == target) {
                return mid; // Return the index of the found element
            }

            // If the target is greater, ignore the left half by moving 'left' to mid + 1
            if (arr[mid] < target) {
                left = mid + 1;
            } 
            // If the target is smaller, ignore the right half by moving 'right' to mid - 1
            else {
                right = mid - 1;
            }
        }

        // If the target value is not found, return -1
        return -1;
    }

    // Main method to test the binarySearch function
    public static void main(String[] args) {
        // Define a sorted integer array
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };

        // Test case 1: Search for a value present in the array (e.g., 40)
        int index1 = binarySearch(arr, 40);
        System.out.println("Index of 40: " + index1); // Expected output: 3

        // Test case 2: Search for a value NOT present in the array (e.g., 25)
        int index2 = binarySearch(arr, 25);
        System.out.println("Index of 25: " + index2); // Expected output: -1
    }
}
