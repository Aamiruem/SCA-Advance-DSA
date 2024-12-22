// package out.production.ArrayQuestions;

public class FindPeakElement {
    /**
     * Finds a peak element in the array. An element is considered a peak if it is
     * greater than or equal to its neighbors.
     * @param arr The input array.
     * @param n The size of the array.
     * @return The index of any peak element, or -1 if no peak is found.
     */
    public static int findPeak(int arr[], int n) {
        // If the array has only one element, that element is the peak
        if (n == 1) {
            return 0;
        }

        // Check if the first element is a peak
        if (arr[0] > arr[1]) {
            return 0;
        }

        // Check if the last element is a peak
        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }

        // Check for peak in the rest of the array
        for (int i = 1; i < n - 1; i++) {
            // An element is a peak if it is greater than its neighbors
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }
        }

        // Return -1 if no peak element is found
        return -1;
    }

    public static void main(String[] args) {
        // Sample array
        int arr[] = {1, 3, 4, 20, 6, 7, 87, 9, 10};
        int n = arr.length;

        // Find the peak element
        int peakIndex = findPeak(arr, n);

        // Output the result
        if (peakIndex != -1) { // Check if a peak was found
            System.out.println("Peak element is at index: " + peakIndex + " with value: " + arr[peakIndex]);
        } else {
            System.out.println("No peak element found in the array");
        }
    }
}
