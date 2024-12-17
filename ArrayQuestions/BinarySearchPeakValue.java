package out.production.ArrayQuestions;

// import java.util.*;

public class BinarySearchPeakValue {

    /**
     * Helper method to find a peak element using binary search.
     * @param arr The input array.
     * @param low The lower index of the current search range.
     * @param high The upper index of the current search range.
     * @param n The size of the array.
     * @return The index of any peak element.
     */
    public static int findPeakUtil(int arr[], int low, int high, int n) {
        // Find the index of the middle element
        int mid = low + (high - low) / 2;

        // Compare the middle element with its neighbors (if they exist)
        if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
            // If the middle element is a peak, return its index
            return mid;
        } 
        // If the middle element is not a peak and its left neighbor is greater than it,
        // then the peak must be in the left half
        else if (mid > 0 && arr[mid - 1] > arr[mid]) {
            return findPeakUtil(arr, low, mid - 1, n);
        } 
        // If the middle element is not a peak and its right neighbor is greater than it,
        // then the peak must be in the right half
        else {
            return findPeakUtil(arr, mid + 1, high, n);
        }
    }

    /**
     * Wrapper method to initiate the binary search for a peak element.
     * @param arr The input array.
     * @return The index of any peak element.
     */
    public static int findPeak(int arr[]) {
        int n = arr.length;
        return findPeakUtil(arr, 0, n - 1, n);
    }

    public static void main(String[] args) {
        // Sample array
        int arr[] = { 1, 3, 20, 4, 1, 0 };
        // Find and print the index of a peak element
        System.out.println("Index of a peak point is " + findPeak(arr));
    }
}
