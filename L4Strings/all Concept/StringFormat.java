public class StringFormat {
    public static void main(String[] args) {
        String str = String.format("Hello, %s! You are %d years old.", "John", 25);
        System.out.println(str); // Output: Hello, John! You are 25 years old.
    }
}
// The format method in Java is used to create a formatted string using a format string and arguments. The format string contains placeholders that are replaced by the arguments passed to the method. The placeholders are defined using the % symbol followed by a character that specifies the type of argument to be inserted. For example, %s is used for strings, %d is used for integers, and %f is used for floating-point numbers.
