package Array;
import java.util.Arrays;
public class CreateArray {
    public static void main(String[] args) {
        // Create an array
String[] fruits = {"apple", "banana", "cherry"};

// Access an element
System.out.println(fruits[0]); // Output: apple

// Modify an element
fruits[1] = "mango";
System.out.println(Arrays.toString(fruits)); // Output: [apple, mango, cherry]

// Add an element (not directly possible, need to create a new array)
String[] newFruits = Arrays.copyOf(fruits, fruits.length + 1);
newFruits[3] = "orange";
System.out.println(Arrays.toString(newFruits)); // Output: [apple, mango, cherry, orange]
    }
}
