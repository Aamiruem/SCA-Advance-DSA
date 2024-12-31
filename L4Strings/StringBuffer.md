What is StringBuffer?
StringBuffer is a class in Java that represents a mutable sequence of characters, similar to StringBuilder. The key difference is that StringBuffer is thread-safe, meaning it can be safely used in multi-threaded environments. This thread safety is achieved by synchronizing its methods, which makes it slightly slower than StringBuilder in single-threaded scenarios.

Key Features of StringBuffer:
Mutability:

Allows modification of the same object without creating new ones, unlike immutable String.
Thread Safety:

All public methods of StringBuffer are synchronized, ensuring safe operations in multi-threaded programs.
Performance:

Slower than StringBuilder due to synchronization overhead but faster than using immutable strings for frequent modifications.
Dynamic Size:

Automatically resizes its internal buffer as needed to accommodate additional characters.
Common Methods in StringBuffer:
java
Copy code
public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Append
        sb.append(" World");
        System.out.println(sb); // Output: Hello World

        // Insert
        sb.insert(5, ",");
        System.out.println(sb); // Output: Hello, World

        // Replace
        sb.replace(6, 7, " Beautiful");
        System.out.println(sb); // Output: Hello Beautiful World

        // Delete
        sb.delete(6, 16);
        System.out.println(sb); // Output: Hello World

        // Reverse
        sb.reverse();
        System.out.println(sb); // Output: dlroW olleH

        // Length
        System.out.println(sb.length()); // Output: 11
    }
}
Why Use StringBuffer?
Thread-Safe String Manipulations:

When multiple threads access and modify the same string, StringBuffer ensures data integrity through synchronized methods.
Efficient for Frequent Modifications:

Reduces memory overhead compared to using immutable strings (String) in scenarios with frequent concatenation, insertion, or deletion.
Comparison of StringBuffer, StringBuilder, and String:
Feature	String	StringBuffer	StringBuilder
Mutability	Immutable	Mutable	Mutable
Thread Safety	Not thread-safe	Thread-safe (synchronized)	Not thread-safe
Performance	Slow for frequent changes	Slower due to synchronization	Faster for single-threaded
Memory Usage	Higher	Lower	Lower
When to Use StringBuffer:
In multi-threaded applications where multiple threads need to access and modify the same string.
When string manipulations involve append, insert, delete, or replace operations in a thread-safe environment.
Example of Multi-threaded Usage:
java
Copy code
public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Thread 1
        Thread t1 = new Thread(() -> {
            sb.append(" World");
            System.out.println("Thread 1: " + sb);
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            sb.append(" Everyone");
            System.out.println("Thread 2: " + sb);
        });

        t1.start();
        t2.start();
    }
}
Key Takeaway:
Use StringBuffer when you need thread-safe string manipulation.
If thread safety is not a concern, prefer StringBuilder for better performance.
For immutable and lightweight strings, stick with String.
