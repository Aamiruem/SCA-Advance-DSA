// Define a public class named LinearSearch
public class LinearSearch {

    // Method to perform linear search on an array
    public static int linearSearch(int[] arr, int val) {
        // Step 1: Traverse the array using a for loop
        for (int i = 0; i < arr.length; i++) {
            // Step 2: Check if the current element matches the search value
            if (arr[i] == val) {
                return i; // Return the index of the found element
            }
        }
        // Step 3: If the value is not found, return -1
        return -1;
    }

    // Main method to test the linearSearch function
    public static void main(String[] args) {
        // Step 1: Define an integer array with some values
        int[] arr = { 10, 20, 30, 40, 50 }; // Input array

        // Test case 1: Search for the value 30 in the array
        int index1 = linearSearch(arr, 30);
        System.out.println("Index of 30: " + index1); // Expected output: 2

        // Test case 2: Search for the value 60 in the array (not present)
        int index2 = linearSearch(arr, 60);
        System.out.println("Index of 60: " + index2); // Expected output: -1
    }
}
