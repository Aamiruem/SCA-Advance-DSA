public class validPalindrome {
    public static boolean isValidPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                if (ch >= 65 && ch <= 90) {
                    ch = (char) (ch + 32);
                }
                sb.append(ch);
            }
        }
        for (int start = 0, end = sb.length() - 1; start < end;) {
            if (sb.charAt(start) != sb.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isValidPalindrome(s)); // Output: true
        s = "race a car";
        System.out.println(isValidPalindrome(s)); // Output: false

        s = "12321";
        System.out.println(isValidPalindrome(s)); // Output: true
        s = "12345";
        System.out.println(isValidPalindrome(s)); // Output: false
        s = "";
        System.out.println(isValidPalindrome(s)); // Output: true
        s = " ";
        System.out.println(isValidPalindrome(s)); // Output: true
        s = "1a2b3c";
        System.out.println(isValidPalindrome(s)); // Output: false
    }
}
