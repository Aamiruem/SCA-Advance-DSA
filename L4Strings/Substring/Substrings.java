package Substring;

public class Substrings {
    public static void showSubstrings(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
    //Total no. of string length
    public static int totalNoOfSubstrings(String str) {
        int length = str.length();
        return length * (length + 1) / 2;// total no. of string length 

    }

    // To find the longest substring with no repeating characters
    public static String longestSubstring(String str) {
        int length = str.length();
        String longest = "";
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String substring = str.substring(i, j);
                if (substring.length() == substring.chars().distinct().count()) {
                    if (substring.length() > longest.length()) {
                        longest = substring;
                    }
                }
            }
        }
        return longest;
    }

    // To find the shortest substring with no repeating characters
    public static String shortestSubstring(String str) {
        int length = str.length();
        String shortest = " ";
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String substring = str.substring(i, j);
                if (substring.length() == substring.chars().distinct().count()) {
                    if (substring.length() < shortest.length() || shortest.equals(" ")) {
                        shortest = substring;
                    }
                }
            }
        }
        return shortest;
    }

    public static void appendSubstrings(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            @SuppressWarnings("StringBufferMayBeStringBuilder")
            StringBuffer sb = new StringBuffer();
            for (int j = i; j < length; j++) {
                sb.append(str.charAt( j));
                System.out.println(sb);

                // To remove the last character
                sb.deleteCharAt(sb.length() - 1);


                System.out.println(sb.append(str.substring(i, j)));
            }
        }
    }

    public static void main(String[] args) {
        showSubstrings(" Aamir");

        System.out.println("Total number of substrings: " + totalNoOfSubstrings("Aamir"));

        System.out.println("Longest substring with no repeating characters: " + longestSubstring(" Aamir"));


        System.out.println("Shortest substring with no repeating characters: " + shortestSubstring(" Hussain"));

        appendSubstrings(" Hello ");


        System.out.println("All substrings: ");
        appendSubstrings("Aamir");

        

    }

}
