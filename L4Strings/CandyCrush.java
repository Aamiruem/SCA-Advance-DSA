public class CandyCrush {
    public static void reduceString(String str) {
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while (i < sb.length() - 1) {
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(i + 1);
            if (ch1 == ch2) {
                sb.delete(i, i + 2);
                if (i != 0) {
                    i--;
                    continue;
                }
            }
            i++;
        }
        System.out.println(sb);
    }
    
    public static void main(String[] args) {
        reduceString("google"); 
        reduceString("oppo");
        reduceString("apple");
        reduceString("good");
    }
}









// public class CandyCrush {
//     public static void reduceString(String str) {
//         StringBuilder sb = new StringBuilder(str);
//         int i = 0;

//         while (i < sb.length() - 1) {
//             if (sb.charAt(i) == sb.charAt(i + 1)) {
//                 sb.delete(i, i + 2); // Remove the adjacent pair
//                 i = Math.max(0, i - 1); // Move back one step to check for new pairs
//             } else {
//                 i++; // Move forward if no match
//             }
//         }

//         System.out.println(sb);
//     }

//     public static void main(String[] args) {
//         reduceString("google");  // Output: "gle"
//         reduceString("oppo");    // Output: ""
//         reduceString("apple");   // Output: "ale"
//         reduceString("good");    // Output: ""
//     }
// }
