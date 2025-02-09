// public class ImportantArrayList {
    
// }


// Some Impt Methods Of ArrayList

// 1. public boolean add(Object)
// 2. public void add(int, Object)
// 3. public Object set(int, Object)
// 4. public Object get(int)
// 5. public int size()
// You're absolutely right! The ArrayList class in Java provides several important methods that are commonly used to manipulate and access elements in the list. Below is a detailed explanation of the methods you mentioned, along with examples:

// 1. public boolean add(Object element)
// Purpose: Adds the specified element to the end of the list.

// Return Type: boolean (always returns true because ArrayList allows duplicates and dynamically resizes itself).

// Example:

// java
// Copy
// ArrayList<String> list = new ArrayList<>();
// list.add("Apple");
// list.add("Banana");
// System.out.println(list); // Output: [Apple, Banana]
// 2. public void add(int index, Object element)
// Purpose: Inserts the specified element at the specified position in the list. Shifts the existing elements (if any) to the right.

// Parameters:

// index: The position at which the element is to be inserted.

// element: The element to be added.

// Example:

// java
// Copy
// ArrayList<String> list = new ArrayList<>();
// list.add("Apple");
// list.add("Banana");
// list.add(1, "Mango"); // Insert "Mango" at index 1
// System.out.println(list); // Output: [Apple, Mango, Banana]
// 3. public Object set(int index, Object element)
// Purpose: Replaces the element at the specified position in the list with the specified element.

// Parameters:

// index: The position of the element to be replaced.

// element: The new element to be stored at the specified position.

// Return Type: The previous element that was replaced.

// Example:

// java
// Copy
// ArrayList<String> list = new ArrayList<>();
// list.add("Apple");
// list.add("Banana");
// String replaced = list.set(1, "Mango"); // Replace "Banana" with "Mango"
// System.out.println("Replaced: " + replaced); // Output: Replaced: Banana
// System.out.println(list); // Output: [Apple, Mango]
// 4. public Object get(int index)
// Purpose: Returns the element at the specified position in the list.

// Parameters:

// index: The position of the element to retrieve.

// Return Type: The element at the specified position.

// Example:

// java
// Copy
// ArrayList<String> list = new ArrayList<>();
// list.add("Apple");
// list.add("Banana");
// String element = list.get(1); // Get element at index 1
// System.out.println("Element at index 1: " + element); // Output: Element at index 1: Banana
// 5. public int size()
// Purpose: Returns the number of elements in the list.

// Return Type: int (the size of the list).

// Example:

// java
// Copy
// ArrayList<String> list = new ArrayList<>();
// list.add("Apple");
// list.add("Banana");
// int size = list.size();
// System.out.println("Size of the list: " + size); // Output: Size of the list: 2
// Full Example Combining All Methods:
// Here’s a complete example demonstrating the use of all the methods mentioned above:

// java
// Copy
import java.util.ArrayList;

public class ArrayListMethodsExamples {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 1. Add elements to the end of the list
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println("After adding elements: " + fruits); // [Apple, Banana]

        // 2. Insert an element at a specific position
        fruits.add(1, "Mango");
        System.out.println("After inserting Mango at index 1: " + fruits); // [Apple, Mango, Banana]

        // 3. Replace an element at a specific position
        String replaced = fruits.set(2, "Cherry");
        System.out.println("Replaced element: " + replaced); // Replaced element: Banana
        System.out.println("After replacing Banana with Cherry: " + fruits); // [Apple, Mango, Cherry]

        // 4. Get an element at a specific position
        String element = fruits.get(1);
        System.out.println("Element at index 1: " + element); // Element at index 1: Mango

        // 5. Get the size of the list
        int size = fruits.size();
        System.out.println("Size of the list: " + size); // Size of the list: 3
    }
}


// Output:
// Copy
// After adding elements: [Apple, Banana]
// After inserting Mango at index 1: [Apple, Mango, Banana]
// Replaced element: Banana
// After replacing Banana with Cherry: [Apple, Mango, Cherry]
// Element at index 1: Mango
// Size of the list: 3
// Summary of Methods:
// Method	Purpose
// add(Object element)	Adds an element to the end of the list.
// add(int index, Object element)	Inserts an element at the specified position.
// set(int index, Object element)	Replaces the element at the specified position.
// get(int index)	Retrieves the element at the specified position.
// size()	Returns the number of elements in the list.
// These methods are fundamental to working with ArrayList in Java. Let me know if you need further clarification or additional examples!
