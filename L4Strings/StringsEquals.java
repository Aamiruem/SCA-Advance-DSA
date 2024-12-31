public class StringsEquals {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1 == str2); // false
        
        String str3 = "Hello";
        System.out.println(str1.equals(str3)); // true
    }
}
