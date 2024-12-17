// Time Complexity: O(n) The reverse method typically has linear time complexity.

// Auxiliary Space Complexity: O(1)
 // This solution uses an extra space to store the reversed array.
 // However, the space complexity is O(1) because the original array is not modified.
 // The reverse method in Java's Arrays class uses an in-place algorithm to reverse the array, which means it modifies the original array itself.
 // This is a more efficient solution than the previous one as it avoids creating a new array.
 // Note: In-place reversal is possible in Java only for arrays of primitive types, not for arrays of objects.
 // Also, the in-built reverse method in Java does not return a new array, but modifies the original array in-place.
// Additional space is not used to store the reversed array, as the in-built array method “reverse()” swaps the values in a given range in in-place fashion.





package out.production.ArrayQuestions;
import java.util.Arrays;
public class InbuiltArrayMethods {
    public static void main(String[] args) {
        int [] originalArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = originalArray.length;
        int reversedArray[] = new int[n];

        for(int i = 0; i < n; i++){
            reversedArray[i] = originalArray[n - i - 1];
        }
        System.out.println("This is the using inbuilt methods Reversed Array " + Arrays.toString(reversedArray));
    }
}
