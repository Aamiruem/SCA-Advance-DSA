// // sortZeroOne
// package Array;

// public class sort0And1 {

//     public static void sortZeroAndOne(int[] arr) {
//         int left = 0;
//         int right = arr.length - 1;
//         while (left < right) {
//             if (arr[left] == 1) {
//                 if (arr[right] != 1) {
//                     // Swap arr[left] and arr[right]
//                     int temp = arr[left];
//                     arr[left] = arr[right];
//                     arr[right] = temp;
//                 }
//                 right--;
//             } else {
//                 left++;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
//         sortZeroAndOne(arr);
        
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }






 // different way to solve
 // sortZeroOne

 
// package Array;

import java.util.Arrays;

public class sort0And1s {

    public static void sortZeroAndOne(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 1) {
                if (arr[right] != 1) {
                    // Swap arr[left] and arr[right]
                    arr[left] = arr[right];
                    arr[right] = 1;
                }
                right--;
            } else {
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        sortZeroAndOne(arr);
        System.out.println(Arrays.toString(arr));
    }
}
