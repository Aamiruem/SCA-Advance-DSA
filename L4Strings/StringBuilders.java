public class StringBuilders {
        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder("Hello");

            // Append
            sb.append(" World");
            System.out.println(sb); // Output: Hello World

            // Insert
            sb.insert(5, ",");
            System.out.println(sb); // Output: Hello, World

            // Replace
            sb.replace(6, 7, " Beautiful");
            System.out.println(sb); // Output: Hello Beautiful World

            // Delete
            sb.delete(6, 16);
            System.out.println(sb); // Output: Hello World

            // Reverse
            sb.reverse();
            System.out.println(sb); // Output: dlroW olleH

            // Length
            System.out.println(sb.length()); // Output: 11
        }
    }


