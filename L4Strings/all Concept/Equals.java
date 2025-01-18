// package all Concept;

public class Equals {

    public static void main(String[] args) {
        @SuppressWarnings("RedundantStringConstructorCall")
        String s1 = new String("Hello");
        @SuppressWarnings("RedundantStringConstructorCall")
        String s2 = new String("Hello");
        System.out.println(s1.equalsIgnoreCase(s2)); // true

        @SuppressWarnings("RedundantStringConstructorCall")
        String s3 = new String("hello");
        System.out.println(s1.equalsIgnoreCase(s3)); // true

        @SuppressWarnings("RedundantStringConstructorCall")
        String s4 = new String("Hello");
        System.out.println(s1.equals(s4)); // true
    }
}
