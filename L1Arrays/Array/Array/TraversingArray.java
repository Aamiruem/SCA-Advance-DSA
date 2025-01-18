// Traversing an Array

// 1. using normal loop
// for, while, do..while

// package Array;

// public class TraversingArrays {
//     public static void main(String[] args) {

//         int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};

//         for (int i = 0; i < arr.length; i++) {  
//             System.out.println(arr[i]);
//         }
//     }
// }

// 2. using enhanced loop
// for each
// for (type var : array) { }


// package Array;

public class TraversingArray {
    public static void main(String[] args) {

        //array declaration
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

        for (int x : arr) {
            System.out.println(x);
        }
    }
}
