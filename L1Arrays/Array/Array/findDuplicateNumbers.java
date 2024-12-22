// package Array;
// import java.util.Arrays;
// public class findDuplicateNumbers {
//     public static void findDuplicate(int arr[]){
//         Arrays.sort(arr);
//         int n = arr.length;
//         for (int i = 0; i < n-1; i++) {
//             if(arr[i] == arr[i+1]){
//                 System.out.println("Duplicate found at index " + i + " of " + arr[i] + " is a duplicate ");
//                 break;

//             }
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {0, 2, 3, 6, 7, 8, 3, 5, 3};
//         findDuplicate(arr);
//         // expected output: Duplicate found at index 6 3

//     }
// }







package Array;

import java.util.HashSet;

public class findDuplicateNumbers {
    public static void findDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        boolean found = false;
        
        for (int i = 0; i < arr.length; i++) {
            if (seen.contains(arr[i])) {
                System.out.println("Duplicate found: " + arr[i] + " at index " + i);
                found = true;
            } else {
                seen.add(arr[i]);
            }
        }
        
        if (!found) {
            System.out.println("No duplicates found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 6, 7, 8, 3, 5, 3, 2, 7};
        findDuplicates(arr);
        // expected output: Duplicate found: 3
    }
}
