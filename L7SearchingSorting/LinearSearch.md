Linear Search Algorithm
The Linear Search Algorithm is a simple method for finding the index of the first occurrence of a given value (VAL) in an array. If the value is not present in the array, the algorithm returns -1.

Problem Statement
Given an array and an integer VAL, write a method that returns the index of the first occurrence of VAL in the array. If VAL is not present, return -1.

Algorithm Steps
Start from the first element of the array.

Compare each element of the array with VAL.

If a match is found, return the index of that element.

If the end of the array is reached and no match is found, return -1.

Implementation in Java
java
Copy
public class LinearSearch {

    // Method to perform linear search
    public static int linearSearch(int[] arr, int val) {
        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element matches the search value
            if (arr[i] == val) {
                return i; // Return the index of the found element
            }
        }
        // If the value is not found, return -1
        return -1;
    }

    // Main method to test the linearSearch function
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 }; // Input array

        // Test case 1: Search for the value 30
        int index1 = linearSearch(arr, 30);
        System.out.println("Index of 30: " + index1); // Expected output: 2

        // Test case 2: Search for the value 60
        int index2 = linearSearch(arr, 60);
        System.out.println("Index of 60: " + index2); // Expected output: -1
    }
}
Explanation of the Code
Method linearSearch:

Takes two inputs: an array (arr) and a value to search (val).

Uses a for loop to traverse the array.

If the current element matches val, it returns the index (i).

If no match is found after traversing the entire array, it returns -1.

Main Method:

Tests the linearSearch method with two test cases:

Search for 30 in the array {10, 20, 30, 40, 50} → Expected output: 2.

Search for 60 in the array {10, 20, 30, 40, 50} → Expected output: -1.

Time Complexity Analysis
Best Case:

The element to be searched (VAL) is found at the 0th index.

Only 1 comparison is needed.

Time Complexity: O(1).

Worst Case:

The element to be searched (VAL) is either at the last index or not present in the array.

n comparisons are needed, where n is the size of the array.

Time Complexity: O(n).

Average Case:

The element to be searched (VAL) can be at any position in the array with equal probability.

The average number of comparisons is:

 ×(1+2+3+⋯+n)= 

n(n+1)
​

n+1
​
 
Time Complexity: O(n).

Space Complexity
The algorithm uses constant extra space (only a few variables like i and val).

Space Complexity: O(1).

Example Output
Copy
Index of 30: 2
Index of 60: -1
Key Points
Linear search is a simple and intuitive algorithm.

It is suitable for small arrays or unsorted data.

For large datasets, more efficient algorithms like binary search (for sorted arrays) or hash-based search are preferred.
