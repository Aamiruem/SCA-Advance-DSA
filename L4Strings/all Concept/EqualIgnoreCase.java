

public class EqualIgnoreCase {
    public static void main(String[] args) {
        String s1 = new String("He");
        String s2 = new String("He");
        String s3 = new String("he");

        System.out.println(s1.equalsIgnoreCase(s2)); // true
        System.out.println(s1.equalsIgnoreCase(s3)); // true







        String s4 = new String("Hello");
        String s5 = new String("Hello");
        System.out.println(s1 == s2);             // false
        System.out.println(s1.equals(s2));        // true

        String s6 = new String("ello");
        System.out.println(s4.equals(s5));        // false


    }
}
