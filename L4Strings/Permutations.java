
// public class Permutations {

//     public static boolean isPermutation(String s1, String s2) {
//         // Check if lengths are different
//         if (s1.length() != s2.length()) {
//             return false;
//         }

//         // Create an array to count character occurrences
//         int[] charCount = new int[256]; // Assuming extended ASCII

//         // Count characters in the first string
//         for (int i = 0; i < s1.length(); i++) {
//             charCount[s1.charAt(i)]++;
//         }

//         // Decrease count based on the second string
//         for (int i = 0; i < s2.length(); i++) {
//             charCount[s2.charAt(i)]--;
//             // If count goes below zero, s2 has an extra character
//             if (charCount[s2.charAt(i)] < 0) {
//                 return false;
//             }
//         }

//         // If all counts are zero, the strings are permutations
//         return true;
//     }

//     public static void main(String[] args) {
//         String s1 = "abc";
//         String s2 = "bca";

//         System.out.println(isPermutation(s1, s2)); // Output: true

//         s1 = "hello";
//         s2 = "world";

//         System.out.println(isPermutation(s1, s2)); // Output: false
//     }
// }






public class Permutations {
    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] charCount = new int[256];
        int length = s1.length();
        char x;
        int i;
        for (i = 0; i < length; i++) {
            x = s1.charAt(i);
            charCount[x]++;
            x = s2.charAt(i);
            charCount[x]--;
        }
        for (i = 0; i < charCount.length; i++) {
            if (charCount[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bca";
        System.out.println(isPermutation(s1, s2));
    }
}
