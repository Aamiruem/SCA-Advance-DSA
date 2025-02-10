
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class IntersectionOfTwoSortedArrays {

    public static List<Integer> findIntersection(int[] A, int[] B) {
        List<Integer> result = new ArrayList<>(); // To store the intersection
        int i = 0; // Pointer for array A
        int j = 0; // Pointer for array B

        // Traverse both arrays using two pointers
        while (i < A.length && j < B.length) {
            if (A[i] == B[j]) {
                // If the elements are equal, add to the result
                result.add(A[i]);
                i++; // Move both pointers forward
                j++;
            } else if (A[i] < B[j]) {
                // If the element in A is smaller, move the A pointer forward
                i++;
            } else {
                // If the element in B is smaller, move the B pointer forward
                j++;
            }
        }

        return result; // Return the intersection
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] A1 = {1, 2, 2, 3, 4};
        int[] B1 = {2, 2, 3};
        System.out.println("Test Case 1:");
        System.out.println("A = " + Arrays.toString(A1));
        System.out.println("B = " + Arrays.toString(B1));
        System.out.println("Intersection: " + findIntersection(A1, B1));

        // Test Case 2
        int[] A2 = {1, 2, 3};
        int[] B2 = {3, 4};
        System.out.println("\nTest Case 2:");
        System.out.println("A = " + Arrays.toString(A2));
        System.out.println("B = " + Arrays.toString(B2));
        System.out.println("Intersection: " + findIntersection(A2, B2));

        // Test Case 3
        int[] A3 = {1, 2, 3};
        int[] B3 = {4, 5, 6};
        System.out.println("\nTest Case 3:");
        System.out.println("A = " + Arrays.toString(A3));
        System.out.println("B = " + Arrays.toString(B3));
        System.out.println("Intersection: " + findIntersection(A3, B3));
    }
}
