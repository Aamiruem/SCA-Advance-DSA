public class CountOccurrences {
    // Function to count the occurrences of x in the sorted array
    public static int countOccurrences(int[] arr, int x) {
        int n = arr.length;

        // Find the first occurrence of x
        int first = findFirstOccurrence(arr, x, 0, n - 1);

        // If x is not present, return 0
        if (first == -1) {
            return 0;
        }

        // Find the last occurrence of x
        int last = findLastOccurrence(arr, x, 0, n - 1);

        // Calculate the frequency
        return last - first + 1;
    }

    // Helper function to find the first occurrence of x
    private static int findFirstOccurrence(int[] arr, int x, int low, int high) {
        if (low > high) {
            return -1; // x is not present in the array
        }

        int mid = low + (high - low) / 2;

        if ((mid == 0 || arr[mid - 1] < x) && arr[mid] == x) {
            return mid; // First occurrence found
        } else if (arr[mid] < x) {
            return findFirstOccurrence(arr, x, mid + 1, high); // Search in the right half
        } else {
            return findFirstOccurrence(arr, x, low, mid - 1); // Search in the left half
        }
    }

    // Helper function to find the last occurrence of x
    private static int findLastOccurrence(int[] arr, int x, int low, int high) {
        if (low > high) {
            return -1; // x is not present in the array
        }

        int mid = low + (high - low) / 2;

        if ((mid == arr.length - 1 || arr[mid + 1] > x) && arr[mid] == x) {
            return mid; // Last occurrence found
        } else if (arr[mid] > x) {
            return findLastOccurrence(arr, x, low, mid - 1); // Search in the left half
        } else {
            return findLastOccurrence(arr, x, mid + 1, high); // Search in the right half
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 2, 2, 2, 3, 3 };
        int x1 = 2;
        System.out.println("Frequency of " + x1 + ": " + countOccurrences(arr1, x1)); // Output: 4

        int[] arr2 = { 1, 1, 2, 2, 2, 2, 3, 3 };
        int x2 = 3;
        System.out.println("Frequency of " + x2 + ": " + countOccurrences(arr2, x2)); // Output: 2

        int[] arr3 = { 1, 1, 2, 2, 2, 2, 3, 3 };
        int x3 = 1;
        System.out.println("Frequency of " + x3 + ": " + countOccurrences(arr3, x3)); // Output: 2

        int[] arr4 = { 1, 1, 2, 2, 2, 2, 3, 3 };
        int x4 = 4;
        System.out.println("Frequency of " + x4 + ": " + countOccurrences(arr4, x4)); // Output: 0
    }
}
