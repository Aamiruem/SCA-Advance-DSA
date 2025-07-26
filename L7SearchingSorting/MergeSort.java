// public class MergeSort {

//     // Main function to sort an array using Merge Sort
//     public static void mergeSort(int[] arr, int left, int right) {
//         // Check if the current subarray has more than one element
//         if (left < right) {
//             // Find the middle point to divide the array into two halves
//             int mid = left + (right - left) / 2; // Avoids overflow compared to (left + right) / 2

//             // Recursively sort the first half (from left to mid)
//             mergeSort(arr, left, mid);

//             // Recursively sort the second half (from mid+1 to right)
//             mergeSort(arr, mid + 1, right);

//             // Merge the two sorted halves
//             merge(arr, left, mid, right);
//         }
//     }

//     // Function to merge two sorted subarrays
//     private static void merge(int[] arr, int left, int mid, int right) {
//         // Calculate the sizes of the two subarrays to be merged
//         int n1 = mid - left + 1; // Size of the left subarray
//         int n2 = right - mid; // Size of the right subarray

//         // Create temporary arrays to hold the two halves
//         int[] leftArray = new int[n1]; // Temporary array for the left half
//         int[] rightArray = new int[n2]; // Temporary array for the right half

//         // Copy data from the original array to the temporary leftArray
//         for (int i = 0; i < n1; i++) {
//             leftArray[i] = arr[left + i]; // Copy elements from left to mid
//         }

//         // Copy data from the original array to the temporary rightArray
//         for (int j = 0; j < n2; j++) {
//             rightArray[j] = arr[mid + 1 + j]; // Copy elements from mid+1 to right
//         }

//         // Merge the two temporary arrays back into the original array
//         int i = 0, j = 0; // Initial indices for leftArray and rightArray
//         int k = left; // Initial index for the merged subarray in the original array

//         // Compare elements from leftArray and rightArray and merge them in sorted order
//         while (i < n1 && j < n2) {
//             if (leftArray[i] <= rightArray[j]) {
//                 // If the current element in leftArray is smaller, copy it to the original array
//                 arr[k] = leftArray[i];
//                 i++; // Move to the next element in leftArray
//             } else {
//                 // If the current element in rightArray is smaller, copy it to the original
//                 // array
//                 arr[k] = rightArray[j];
//                 j++; // Move to the next element in rightArray
//             }
//             k++; // Move to the next position in the original array
//         }

//         // Copy any remaining elements from leftArray (if any)
//         while (i < n1) {
//             arr[k] = leftArray[i];
//             i++;
//             k++;
//         }

//         // Copy any remaining elements from rightArray (if any)
//         while (j < n2) {
//             arr[k] = rightArray[j];
//             j++;
//             k++;
//         }
//     }

//     // Utility function to print the array
//     public static void printArray(int[] arr) {
//         // Iterate through the array and print each element
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println(); // Move to the next line after printing the array
//     }

//     // Main method to test the Merge Sort implementation
//     public static void main(String[] args) {
//         // Input array to be sorted
//         int[] arr = { 12, 11, 13, 5, 6, 7 };

//         // Print the original array
//         System.out.println("Original array:");
//         printArray(arr);

//         // Perform Merge Sort on the array
//         mergeSort(arr, 0, arr.length - 1);

//         // Print the sorted array
//         System.out.println("Sorted array:");
//         printArray(arr);
//     }
// }















public class MergeSort {

    //todo Merge function to combine two sorted subarrays
    public static void merge(int[] arr, int start, int end) {
        // Calculate the middle point of the array
        int mid = (start + end) / 2;

        // Initialize pointers for the two subarrays and the temporary array
        int first = start; // Pointer for the first subarray (start to mid)
        int sec = mid + 1; // Pointer for the second subarray (mid+1 to end)
        int pos = 0; // Pointer for the temporary array

        // Create a temporary array to store the merged result
        int[] brr = new int[end - start + 1];

        // Merge the two subarrays into the temporary array
        while (first <= mid && sec <= end) {
            if (arr[first] <= arr[sec]) {
                // If the element in the first subarray is smaller, add it to the temporary
                // array
                brr[pos] = arr[first];
                first++;
            } else {
                // If the element in the second subarray is smaller, add it to the temporary
                // array
                brr[pos] = arr[sec];
                sec++;
            }
            pos++; // Move to the next position in the temporary array
        }

        // Copy any remaining elements from the first subarray (if any)
        while (first <= mid) {
            brr[pos] = arr[first];
            first++;
            pos++;
        }

        // Copy any remaining elements from the second subarray (if any)
        while (sec <= end) {
            brr[pos] = arr[sec];
            sec++;
            pos++;
        }

        // Copy the merged elements from the temporary array back to the original array
        for (int i = 0; i < brr.length; i++) {
            arr[start + i] = brr[i];
        }
    }

    // Split function to recursively divide the array into subarrays
    public static void split(int[] arr, int start, int end) {
        // Check if the current subarray has more than one element
        if (start < end) {
            // Calculate the middle point of the array
            int mid = (start + end) / 2;

            // Recursively split the first half (start to mid)
            split(arr, start, mid);

            // Recursively split the second half (mid+1 to end)
            split(arr, mid + 1, end);

            // Merge the two sorted halves
            merge(arr, start, end);
        }
    }

    // Main method to test the Merge Sort implementation
    public static void main(String[] args) {
        // Input array to be sorted
        int[] arr = { 10, 4, 6, 11, 9, 12 };

        // Perform Merge Sort on the array
        split(arr, 0, arr.length - 1);

        // Print the sorted array
        for (int x : arr) {
            System.out.println(x);
        }



        
    }
}
