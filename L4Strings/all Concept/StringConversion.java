
import java.util.Arrays;

public class StringConversion {
    public static void main(String[] args) {
        // Converting int to String
        int num = 10;
        String str1 = String.valueOf(num);
        System.out.println("Int to String: " + str1); // Output: 10

        // Converting double to String
        double value = 10.5;
        String str2 = String.valueOf(value);
        System.out.println("Double to String: " + str2); // Output: 10.5

        // Converting char to String
        char ch = 'A';
        String str3 = String.valueOf(ch);
        System.out.println("Char to String: " + str3); // Output: A

        // Converting boolean to String
        boolean flag = true;
        String str4 = String.valueOf(flag);
        System.out.println("Boolean to String: " + str4); // Output: true







        // a.Convert to Char Array
        String str = "Hello";
        char[] charArray = str.toCharArray();
        System.out.println(Arrays.toString(charArray)); // Output: [H, e, l, l, o]



        // b.Convert from Char Array
        char[] charArray1 = {'H', 'e', 'l', 'l', 'o'};
        String s = new String(charArray1);
        System.out.println(s); // Output: Hello


    }
}

// toString method to convert to String object with String representation of the object
//eg:- "Hello"  
