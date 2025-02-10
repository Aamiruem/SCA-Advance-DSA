
import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {

    // Method to reverse a portion of the list starting from index m+1 to the end
    public static void reverse(List<Integer> arr, int m) {
        // Initialize two pointers:
        // i starts from m+1 (the index after m)
        // j starts from the last index of the list
        for (int i = m + 1, j = arr.size() - 1; i < j; i++, j--) {
            // Swap the elements at positions i and j
            int temp = arr.get(i); // Store the value at index i in a temporary variable
            arr.set(i, arr.get(j)); // Set the value at index i to the value at index j
            arr.set(j, temp); // Set the value at index j to the temporary value
        }

        // Print the list after reversing the specified portion
        System.out.println("After reversing:");
        for (int x : arr) {
            System.out.print(x + " "); // Print each element in the list
        }
        System.out.println(); // Move to the next line after printing the list
    }

    public static void main(String[] args) {
        // Create a list with an initial capacity of 6
        List<Integer> arr = new ArrayList<>(6);

        // Add elements to the list
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        // Print the list before reversing
        System.out.println("Before reversing:");
        for (int x : arr) {
            System.out.print(x + " "); // Print each element in the list
        }
        System.out.println(); // Move to the next line after printing the list

        int m = 2; // Define the index m (the portion after this index will be reversed)
        reverse(arr, m); // Call the reverse method to reverse the list from index m+1 to the end
    }
}
