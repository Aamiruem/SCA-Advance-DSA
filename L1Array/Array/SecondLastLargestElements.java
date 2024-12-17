// package Array;
// import java.util.Arrays;
// public class SecondLastLargestElements {
//     public static int findSecondLargest(int[] arr){
//         Arrays.sort(arr);
//         // for same array using this code 
//         for(int i = arr.length-1; i > 0; i--){
//             if(arr[i]!= arr[i-1]){
//                 return arr[i-1];
//             }
//         }
//         return Integer.MIN_VALUE;
//     }
//     public static void main(String[] args) {
//         int[] arr = {34, 2, 30, 4, 50};
//         int secondLargest = findSecondLargest(arr);
//         System.out.println("Second last largest element is: " + secondLargest);
//     }
// }


// second way to solve this questions 

// package Array;

public class SecondLastLargestElements {

    public static int findSecondLargest(int[] arr) {
        int max, secMax;
        max = Integer.MIN_VALUE;
        secMax = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max) {
                secMax = max;
                max = x;
            } else {
                if (x > secMax && x != max) {
                    secMax = x;
                }
            }
        }
        return secMax;
    }

    public static void main(String[] args) {
        int[] arr = { 34, 2, 30, 4, 50, 39 };
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second last largest element is: " + secondLargest);
    }
}
