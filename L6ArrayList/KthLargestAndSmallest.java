import java.util.ArrayList;
import java.util.Collections;

public class KthLargestAndSmallest {

    // Method to find the Kth largest and Kth smallest elements in the ArrayList
    public static ArrayList<Integer> findKthLargestAndSmallest(ArrayList<Integer> arr, int k) {
        // Step 1: Sort the ArrayList in ascending order
        Collections.sort(arr);

        // Step 2: Find the Kth smallest element
        // Since the list is sorted in ascending order, the Kth smallest element is at
        // index (k-1)
        int kthSmallest = arr.get(k - 1);

        // Step 3: Find the Kth largest element
        // The Kth largest element is the (N - K)th element in the sorted list (where N
        // is the size of the list)
        int kthLargest = arr.get(arr.size() - k);

        // Step 4: Create a new ArrayList to store the results
        ArrayList<Integer> result = new ArrayList<>();
        result.add(kthLargest); // Add Kth largest element to the result list
        result.add(kthSmallest); // Add Kth smallest element to the result list

        // Step 5: Return the result ArrayList
        return result;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Test Case 1
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(5);
        arr1.add(6);
        arr1.add(7);
        arr1.add(2);
        int k1 = 4;
        System.out.println("Test Case 1:");
        System.out.println("Input ARR: " + arr1 + ", K: " + k1);
        ArrayList<Integer> result1 = findKthLargestAndSmallest(arr1, k1);
        System.out.println("Output: 4th smallest is " + result1.get(0)); // Expected Output: [2, 7]
        System.out.println("Output: 4th largest is " + result1.get(1));

        System.out.println();
        // Test Case 2
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(5);
        arr2.add(4);
        int k2 = 3;
        System.out.println("Test Case 2:");
        System.out.println("Input ARR: " + arr2 + ", K: " + k2);
        ArrayList<Integer> result2 = findKthLargestAndSmallest(arr2, k2);
        System.out.println("Output: 3rd smallest is " + result2.get(0)); // Expected Output: [2, 4]
        System.out.println("Output: 3rd largest is " + result2.get(1));
    }
}
