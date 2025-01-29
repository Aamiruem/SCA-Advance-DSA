public class StringConstantPool {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2); // Output: true

    }
}



// How the String Constant Pool Works
// Example 1: Using String Literals
// java
// Copy code
// String s1 = "Hello";
// String s2 = "Hello";
// System.out.println(s1 == s2); // Output: true
// Explanation:
// Both s1 and s2 refer to the same string object in the pool.
// The == operator checks if s1 and s2 reference the same memory location, which they do.
