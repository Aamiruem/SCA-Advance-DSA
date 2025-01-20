// public class palindrome {
//     public static boolean isPalindrome(String str) {
//         int i = 0, j = str.length() - 1;
//         while (i < j) {
//             if (str.charAt(i) != str.charAt(j)) {
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         System.out.println(isPalindrome("radar")); // true
//     }
// }


public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        int i, j;
        for (i = 0, j = str.length() - 1; i < j; i++, j--) {
            char left = str.charAt(i);
            char right = str.charAt(j);
            if (left != right) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("naman")); // true
        System.out.println(isPalindrome("naveen")); // false
        System.out.println(isPalindrome("abba")); // true
    }
}
