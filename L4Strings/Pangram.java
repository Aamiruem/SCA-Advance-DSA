// public class Pangram {
//     public static boolean isPangram(String s) {
//         s = s.toLowerCase();
//         for (int i = 0; i < 26; i++) {
//             if (s.indexOf((char) ('a' + i)) == -1) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         System.out.println(isPangram("The quick brown fox jumps over the lazy dog")); // true

//         System.out.println(isPangram("The quick brown fox jumps over the dog")); // false
//     }
// }











public class Pangram {

    public static boolean isPangram(String str) {
        boolean []result = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch)) {
                ch = Character.toUpperCase(ch);
                int index = ch - 'A';
                result[index] = true;
            }
        }
        for (boolean x : result) {
            if (x == false) {
                return false;
            }
        }
        return true;
    }
        

    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog")); // true

        System.out.println(isPangram("The quick brown fox jumps over the dog")); // false
    }
}
