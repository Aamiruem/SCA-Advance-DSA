// public class CompressString {
//     public static void compressString(String str) {
//         StringBuilder sb = new StringBuilder();
//         int count = 1;
//         for (int i = 1; i < str.length(); i++) {
//             if (str.charAt(i) == str.charAt(i - 1)) {
//                 count++;
//             } else {
//                 sb.append(str.charAt(i - 1));
//                 if (count > 1) {
//                     sb.append(count);
//                 }
//                 count = 1;
//             }
//         }
//         sb.append(str.charAt(str.length() - 1));
//         if (count > 1) {
//             sb.append(count);
//         }
//         System.out.println(sb.toString());
//     }
//     public static void main(String[] args) {
//         compressString("aabcccccaaa");
//         compressString("abcd");

//     }
// }












// public class CompressString {

//     public static void compressString(String str) {
//         if (str == null || str.isEmpty()) {
//             System.out.println("");
//             return;
//         }

//         @SuppressWarnings("StringBufferMayBeStringBuilder")
//         StringBuffer sb = new StringBuffer();
//         int i = 0;

//         while (i < str.length()) {
//             char ch = str.charAt(i);
//             int count = 0;

//             // Count consecutive occurrences of the current character
//             while (i < str.length() && str.charAt(i) == ch) {
//                 count++;
//                 i++;
//             }

//             // Append the character and its count if greater than 1
//             sb.append(ch);
//             if (count > 1) {
//                 sb.append(count);
//             }
//         }

//         System.out.println(sb.toString());
//     }

//     public static void main(String[] args) {
//         compressString("aabcccccaaa"); // Output: a2bc5a3
//         compressString("abcd");       // Output: abcd
//         compressString("");           // Output: (empty string)
//         compressString(null);         // Output: (empty string)
//     }
// }














public class CompressString {

    public static void compressString(String str) {
        @SuppressWarnings("StringBufferMayBeStringBuilder")
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            int count = 0;
            while (i < str.length()) {
                if (ch == str.charAt(i)) {
                    count++;
                    i++;
                } else {
                    break;
                }
            }
            sb.append(ch);
            if (count > 1) {
                sb.append(count);
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        compressString("aabcccccaaa");
        compressString("abcd");
    }
}
