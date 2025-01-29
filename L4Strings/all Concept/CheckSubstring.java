public class CheckSubstring {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.contains("Hello")); // true
        System.out.println(str.contains("World")); // true
        System.out.println(str.contains("Java")); // false


        String str1 = "Hello, World!";
        System.out.println(str1.indexOf("World")); // Output: 7
//indexOf() method returns the index of the first occurrence of the specified substring in the given string. If the substring is not found, it returns -1. returns the index of the first occurrence of the specified substring in the given string. If the substring is not found, it returns -1.
    }
}
