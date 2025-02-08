Solution : ArrayList
1. ArrayList is a predefined class in Java .
2. It comes from the package java.util
3. Not required to mention size while declaring the ArrayList
4. Growable
5. Like array it is also indexed
6. Allows duplicate data
7. Insertion order preserved
8. Has a huge set of predefined methods for performing
various operations like add, delete, retrieve, search ,
update, sort etc   explain every line
Here’s a detailed explanation of each line in the solution about ArrayList in Java:

1. ArrayList is a predefined class in Java.
ArrayList is a built-in class in Java that is part of the Java Collections Framework.

It is defined in the java.util package.

It provides a dynamic array-like structure that can grow or shrink in size as needed.

2. It comes from the package java.util.
The ArrayList class is part of the java.util package, which contains utility classes and interfaces for collections, date-time operations, random number generation, etc.

To use ArrayList, you need to import it:

java
Copy
import java.util.ArrayList;
3. Not required to mention size while declaring the ArrayList.
Unlike arrays, you do not need to specify the size of an ArrayList when declaring it.

The size of an ArrayList is dynamic, meaning it automatically adjusts as elements are added or removed.

Example:

java
Copy
ArrayList<String> list = new ArrayList<>(); // No size specified
4. Growable.
ArrayList is growable, meaning it can increase or decrease its size dynamically.

Internally, it uses an array to store elements. When the array is full, it creates a new array with a larger capacity (usually 1.5 times the current size) and copies the elements to the new array.

Example:

java
Copy
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10); // Adds 10 to the list
numbers.add(20); // Adds 20 to the list
// The list grows automatically as elements are added.
5. Like array, it is also indexed.
ArrayList is indexed, meaning each element in the list has a specific position (index) starting from 0.

You can access elements using their index, just like in arrays.

Example:

java
Copy
ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
System.out.println(fruits.get(0)); // Output: Apple (accessed using index 0)
6. Allows duplicate data.
ArrayList allows duplicate elements, meaning you can store the same value multiple times.

Example:

java
Copy
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Apple"); // Duplicate allowed
System.out.println(list); // Output: [Apple, Apple]
7. Insertion order preserved.
ArrayList preserves the insertion order, meaning the elements are stored in the order they are added.

When you iterate over the list, the elements are retrieved in the same order they were inserted.

Example:

java
Copy
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.add("Mango");
System.out.println(list); // Output: [Apple, Banana, Mango] (order preserved)
8. Has a huge set of predefined methods for performing various operations like add, delete, retrieve, search, update, sort, etc.
ArrayList provides a wide range of methods to manipulate and interact with the list. Some of the most commonly used methods include:

Add elements:

java
Copy
list.add("Apple"); // Adds an element to the end
list.add(1, "Banana"); // Inserts an element at a specific index
Remove elements:

java
Copy
list.remove("Apple"); // Removes the first occurrence of "Apple"
list.remove(0); // Removes the element at index 0
Retrieve elements:

java
Copy
String fruit = list.get(0); // Retrieves the element at index 0
Search for elements:

java
Copy
int index = list.indexOf("Banana"); // Returns the index of "Banana"
boolean contains = list.contains("Mango"); // Checks if "Mango" exists
Update elements:

java
Copy
list.set(1, "Orange"); // Replaces the element at index 1 with "Orange"
Sort elements:

java
Copy
Collections.sort(list); // Sorts the list in natural order
Check size and emptiness:

java
Copy
int size = list.size(); // Returns the number of elements
boolean isEmpty = list.isEmpty(); // Checks if the list is empty
Summary
ArrayList is a dynamic, growable, and indexed data structure in Java.

It allows duplicate elements and preserves insertion order.

It provides a rich set of methods for adding, removing, retrieving, searching, updating, and sorting elements.

It is part of the java.util package and does not require a predefined size.
================================================================
Creating An ArrayList
=============|
1.ArrayList numList1=new ArrayList); // Type unsafe ArrayList
2. ArrayList < Integer> numList2=new ArrayList<>);// TypeSafe ArrayList
Exa:
numList1.add (10);// OK
numList1.add("Jan");//0K
numList1.add (true);//OK
int a=numList1.get(0);// ERROR
int a =(int)numList1.get(0);
Exa:
===
numList2.add (10);// OK
numList2.add("Jan");//ERROR
numList2.add (true);//ERROR
int a=numList2.get(0);//  
Let’s break down the code and explain each line in a simple and easy-to-understand way:

1. Type-Unsafe ArrayList
java
Copy
ArrayList numList1 = new ArrayList(); // Type-unsafe ArrayList
This creates an ArrayList without specifying the type of elements it will store.

It is type-unsafe, meaning it can store any type of object (e.g., Integer, String, Boolean, etc.).

This is not recommended because it can lead to runtime errors if you try to use the wrong type.

Adding Elements to Type-Unsafe ArrayList
java
Copy
numList1.add(10); // OK
numList1.add("Jan"); // OK
numList1.add(true); // OK
Since numList1 is type-unsafe, it can store any type of object:

10 is an Integer.

"Jan" is a String.

true is a Boolean.

This flexibility can cause problems when retrieving and using the elements.

Retrieving Elements from Type-Unsafe ArrayList
java
Copy
int a = numList1.get(0); // ERROR
This line will cause a compile-time error because numList1.get(0) returns an Object, and you cannot directly assign an Object to an int.

The compiler doesn’t know the type of the element at index 0, so it cannot guarantee type safety.

Fixing the Error with Type Casting
java
Copy
int a = (int) numList1.get(0); // OK
To fix the error, you need to type-cast the result of numList1.get(0) to int.

This tells the compiler that you are sure the element at index 0 is an Integer.

However, if the element is not an Integer (e.g., if it’s a String or Boolean), this will cause a runtime error (ClassCastException).

2. Type-Safe ArrayList
java
Copy
ArrayList<Integer> numList2 = new ArrayList<>(); // Type-safe ArrayList
This creates an ArrayList that can only store Integer objects.

It is type-safe, meaning the compiler will enforce that only Integer objects can be added to the list.

This is the recommended way to use ArrayList because it prevents runtime errors and makes the code more readable.

Adding Elements to Type-Safe ArrayList
java
Copy
numList2.add(10); // OK
numList2.add("Jan"); // ERROR
numList2.add(true); // ERROR
numList2 can only store Integer objects:

10 is an Integer, so it is allowed.

"Jan" is a String, so it causes a compile-time error.

true is a Boolean, so it also causes a compile-time error.

The compiler ensures that only Integer objects are added, preventing type-related issues.

Retrieving Elements from Type-Safe ArrayList
java
Copy
int a = numList2.get(0); // OK
Since numList2 is type-safe, the compiler knows that numList2.get(0) will return an Integer.

You can directly assign the result to an int variable without type-casting.

This eliminates the risk of runtime errors and makes the code cleaner.

Key Differences Between Type-Unsafe and Type-Safe ArrayList
Feature	Type-Unsafe ArrayList (ArrayList)	Type-Safe ArrayList (ArrayList<Integer>)
Type Safety	Not type-safe	Type-safe
Allowed Elements	Any type of object	Only Integer objects
Compile-Time Errors	No type checking	Enforces type checking
Runtime Errors	Possible (ClassCastException)	Avoided
Type Casting	Required	Not required
Why Use Type-Safe ArrayList?
Prevents Runtime Errors: Ensures that only the correct type of objects are added to the list.

Cleaner Code: No need for type-casting when retrieving elements.

Better Readability: Makes the code easier to understand and maintain.

Compiler Support: The compiler helps catch type-related errors during development.

Example Code
java
Copy
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Type-unsafe ArrayList
        ArrayList numList1 = new ArrayList();
        numList1.add(10); // OK
        numList1.add("Jan"); // OK
        numList1.add(true); // OK
        int a = (int) numList1.get(0); // Type-casting required
        System.out.println("Type-unsafe ArrayList: " + numList1);

        // Type-safe ArrayList
        ArrayList<Integer> numList2 = new ArrayList<>();
        numList2.add(10); // OK
        // numList2.add("Jan"); // ERROR: Compile-time error
        // numList2.add(true); // ERROR: Compile-time error
        int b = numList2.get(0); // No type-casting required
        System.out.println("Type-safe ArrayList: " + numList2);
    }
}
Output
Copy
Type-unsafe ArrayList: [10, Jan, true]
Type-safe ArrayList: [10]
Summary
Type-unsafe ArrayList (ArrayList) can store any type of object but requires type-casting and can cause runtime errors.

Type-safe ArrayList (ArrayList<Integer>) ensures that only Integer objects are stored, eliminating the need for type-casting and preventing runtime errors.

Always prefer type-safe ArrayLists for better code quality and reliability
