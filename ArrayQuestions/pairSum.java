
// public class pairSum {

//     public static int pairSums(int[] arr, int target) {
//         int count = 0;
//         int sum;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 // if (arr[i] + arr[j] == target) {
//                 //     sum++;
//                 // }
//                 sum = arr[i] + arr[j];
//                 if (sum == target) {
//                     ++count;
//                 }
//             }
//         }
//         return count;
//     }

//     public static int betterPairSum(int[] arr, int target) {
//         int count = 0;
//         int sum;
//         int start = 0;
//         int end = arr.length - 1;

//         while (start < end) {
//             sum = arr[start] + arr[end];
//             if (sum == target) {
//                 count++;
//                 start++;
//                 end--;
//             } else if (sum < target) {
//                 start++;
//             } else {
//                 end--;
//             }
//         }
//         return count;

//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int target = 6;
//         System.out.println("Number of pairs with sum " + target + " is: " + pairSums(arr, target));
//         System.out.println("Number of pairs with sum " + target + " is: " + betterPairSum(arr, target));
//     }
// }







import java.util.HashSet;

public class pairSum {
    public static int optimizedPairSum(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> usedPairs = new HashSet<>();
        int count = 0;

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement) && !usedPairs.contains(complement)) {
                count++;
                usedPairs.add(num);
                usedPairs.add(complement);
            }
            seen.add(num);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 8};
        int target = 9;
        System.out.println("Number of pairs with sum " + target + " is: " + optimizedPairSum(arr, target));
    }
}
