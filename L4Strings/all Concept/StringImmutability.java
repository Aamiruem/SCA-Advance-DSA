// package all Concept;

public class StringImmutability {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str); // Output: Hello, World!
        str = "Hello, Java!";
        System.out.println(str); // Output: Hello, Java!
        String str1 = "Hello, Java!";
        str1.concat(",  Programming");
        System.out.println(str1); // Output: Hello, Java!, Programming
    }
}
