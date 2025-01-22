public class LongPressedName {
    public boolean isLongPressedName(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int i = 0;
        int j = 0;
        while (i < s1.length() && j < s2.length()) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(j);
            if (ch1 == ch2) {
                i++;
                j++;
            } else if (i > 0 && ch2 == s1.charAt(i - 1)) {
                j++;
            } else {
                return false;
            }
        }
        if (i == s1.length() && j == s2.length()) {
            return true;
        }
        if (i < s1.length()) {
            return false;
        }
        while (j < s2.length()) {
            if (s2.charAt(j) != s1.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        LongPressedName obj = new LongPressedName();
        System.out.println(obj.isLongPressedName("alex", "aaleex")); // true
        System.out.println(obj.isLongPressedName("saeed", "ssaaedd")); // false
    }
}
