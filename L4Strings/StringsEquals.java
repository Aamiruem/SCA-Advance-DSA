
// public class StringsEquals {

//     @SuppressWarnings("StringEquality")
//     public static void main(String[] args) {
//         String str1 = "Hello"; // single copy of string "Hello" 
//         String str2 = "Hello";
//         System.out.println(str1.equals(str2)); // true
//         System.out.println(str1 == str2); // true

//         String str3 = "Hello";
//         System.out.println(str1.equals(str3)); // true
//     }
// }












public class StringsEquals {
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
        @SuppressWarnings("RedundantStringConstructorCall")
        String str1 = new String("Hello"); // due to make a new copy of String constructor that is called
        @SuppressWarnings("RedundantStringConstructorCall")
        String str2 = new String("Hello"); // due to make a new copy of String constructor that is called
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1 == str2); // false
        
        String str3 = "Hello";
        System.out.println(str1.equals(str3)); // true
    }
}
