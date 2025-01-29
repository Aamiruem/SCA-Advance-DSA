
public class Equals1 {

    public static void main(String[] args) {
        // Creating two string objects with the same content
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        // Comparing content using equals()
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true

        // Creating another string object with different case
        String s3 = new String("hello");

        // Comparing content with case sensitivity
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // false

        // Comparing content ignoring case
        System.out.println("s1.equalsIgnoreCase(s3): " + s1.equalsIgnoreCase(s3)); // true

        // Using == to compare references
        System.out.println("s1 == s2: " + (s1 == s2)); // false
        System.out.println("s1 == s3: " + (s1 == s3)); // false
    }
}
