public class StringToInteger {
    public int myAtoi(String s) {
        // Trim leading and trailing spaces
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        int i = 0, sign = 1;
        long res = 0;

        // Check for optional sign
        char op = s.charAt(0);
        if (op == '-') {
            sign = -1;
            i++;
        } else if (op == '+') {
            i++;
        }

        // Parse the string for digits
        while (i < s.length()) {
            char ch = s.charAt(i);

            // Check if the character is a digit
            if (ch < '0' || ch > '9') {
                break;
            }

            int digit = ch - '0';
            res = res * 10 + digit;

            // Handle overflow
            if (sign == -1 && -res <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (sign == 1 && res >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            i++;
        }

        return (int) (res * sign);
    }

    public static void main(String[] args) {
        System.out.println(new StringToInteger().myAtoi("42"));         // Output: 42
        System.out.println(new StringToInteger().myAtoi("   -42"));      // Output: -42
        System.out.println(new StringToInteger().myAtoi("4193 with words")); // Output: 4193
        System.out.println(new StringToInteger().myAtoi("words and 987"));   // Output: 0
        System.out.println(new StringToInteger().myAtoi("-91283472332"));    // Output: -2147483648
    }

}
