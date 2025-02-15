import java.util.ArrayList;

public class SmallestSubArray {

    public static ArrayList<Integer> subArray(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int minLength = n + 1; // Initialize minimum length to a value larger than the array size
        int start = 0; // Initialize start index of the subarray

        // Iterate through the array to find the minimum-length subarray
        for (int i = 0; i < n; i++) {
            int sum = 0; // Initialize sum for the current subarray
            for (int j = i; j < n; j++) {
                sum += arr.get(j); // Add the current element to the sum

                // If the sum is greater than x and the subarray length is smaller than the
                // current minimum
                if (sum > x && (j - i + 1) < minLength) {
                    minLength = j - i + 1; // Update the minimum length
                    start = i; // Update the start index
                    break; // Break inner loop since we found a valid subarray starting at index i
                }
            }
        }

        // If no valid subarray is found, return an empty ArrayList
        if (minLength == n + 1) {
            return new ArrayList<>();
        }

        // Extract the subarray from the original ArrayList
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = start; i < start + minLength; i++) {
            result.add(arr.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        // Test Case 1
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(13);
        arr1.add(7);
        arr1.add(6);
        arr1.add(12);
        int x1 = 13;
        ArrayList<Integer> result1 = subArray(arr1, x1);
        System.out.println(result1); // Output: [13, 7]

        // Test Case 2
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        int x2 = 6;
        ArrayList<Integer> result2 = subArray(arr2, x2);
        System.out.println(result2); // Output: [3, 4]
    }
}
