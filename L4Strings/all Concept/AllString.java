// package all Concept;

public class AllString {
    public static void main(String[] args) {

        // Create a string
        //using String Literals
        String str1 = "Hello World!";

        // Using new keyword
        @SuppressWarnings("RedundantStringConstructorCall")
        String str2 = new String("Hello Aamir!");
        
        // Print the content of the strings
        System.out.println(str1);
        System.out.println(str2);

        //a. length()
        System.out.println("Length of s1: " + str1.length()); // 12
        System.out.println("Length of s2: " + str2.length()); // 12



// b.charAt(int index )
// Returns the character at the specified index.java Copy code
System.out.println(str1.charAt(1)); // Output: e
        

// c.substring(int beginIndex, int endIndex)
// Extracts a portion of the string
 String str = "Hello, World!";
 System.out.println("Substring: " + str.substring(7, 12)); // Output: World
        

//d.toUpperCase() and toLowerCase()
// Converts the string to uppercase or lowercase
System.out.println(str2.toUpperCase()); // Output: HELLO WORLD!
System.out.println(str1.toLowerCase()); // Output: hello world!

//e. equals(Object obj)
// Compares two strings lexicographically
System.out.println(str1.equals(str2)); // Output: false
System.out.println(str1.equals("Hello World!")); // Output: true

//f. trim()
// Removes leading and trailing whitespace from the string
String str3 = "  Hello World!  ";
System.out.println(str3.trim()); // Output: Hello World!

//replace()
// Replace characters or substrings in a string 
String str4 = "Hello, World!";
System.out.println(str4.replace("World", "Aamir")); // Output: Hello, Aamir!


//         In programming, "lexicographically" refers to the way strings are compared based on the order of their characters
//         . This is similar to dictionary order
//         . When comparing two strings lexicographically:

//         The 
//         first characters of both strings are compared

// If the first characters are different, the string with the smaller character(based on Unicode value
//         ) is considered smaller.If the first characters are the same
//         , the comparison moves to the next character in both strings

// This process continues until a difference is found or the end of one of the strings is reached

// For example
// "apple" is lexicographically smaller than "banana" because 'a' comes before 'b'.
// "apple" is lexicographically smaller than "apricot" because 'p' comes before 'r'.
// "apple" is lexicographically equal to "apple" because all characters are the same

//3. String Comparison
//a. equals()
// Compares two strings lexicographically
System.out.println(str1.equals(str2)); // Output: false
System.out.println(str1.equals("Hello World!")); // Output: true

//b. compareTo()
// Compares two strings lexicographically
System.out.println("Compare:" + str1.compareTo(str2)); // Output: -1
System.out.println("Compare:" + str1.compareTo("Hello World!")); // Output: 0

//c. equalsIgnoreCase()
// Compares two strings lexicographically, ignoring case differences
String str5 = "Hello World!";
String str6 = "hello world!";
System.out.println("Equal Ignore case:" + str5.equalsIgnoreCase(str6)); // Output: true
System.out.println(str1.equalsIgnoreCase("Hello World!")); // Output: true

//d. compareToIgnoreCase()
// Compares two strings lexicographically, ignoring case differences
System.out.println(str1.compareToIgnoreCase(str2)); // Output: 22 this is a unicode

//         In programming, each character is assigned a unique number called a Unicode value
//         . Unicode is a standard that assigns a unique number to every character in every language, script
//         , and symbol
//         . This allows for consistent encoding, representation, and handling of {
//             text.

// When 
        
//         }comparing strings lexicographically, the comparison is based on the Unicode values of the characters
//         . For example
//         :

// The Unicode value of 'a' is 97.
// The Unicode value of 'b' is 98.
// The Unicode value of 'A' is 65.
// So
//         , when comparing "apple" and "banana":

// 'a' (97) is compared with 'b' (98).
// Since 97 < 98, "apple" is considered lexicographically smaller than "banana".
// Similarly
//         , when comparing "Apple" and "apple":

// 'A' (65) is compared with 'a' (97).
// Since 65 < 97, "Apple" is considered lexicographically smaller than "apple".


System.out.println(str1.compareToIgnoreCase("Hello World!")); // Output: 0

//4. String Concatenation
//a. concat()
// Concatenates two strings
System.out.println(str1.concat(str2)); // Output: Hello World!Hello Aamir!
System.out.println(str1.concat(" ").concat(str2)); // Output: Hello World!Hello Aamir!

//b. + operator
// Concatenates two strings
System.out.println(str1 + " " + str2); // Output: Hello World!Hello Aamir!

//c. StringBuilder and StringBuffer
// StringBuilder
StringBuilder sb = new StringBuilder(str1);
sb.append(str2);
System.out.println(sb); // Output: Hello World!Hello Aamir!


    }
}
