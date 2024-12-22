// package ArrayQuestions;
// public class RecursiveMinMax {
//     public static int getMin(int arr[], int i, int n){
//         if(i == n - 1){
//             return arr[i];
//         }
//         int min = getMin(arr, i + 1, n);
//         return Math.min(min, arr[i]);
//     }
//     public static int getMax(int arr[], int i, int n){
//         if(i == n - 1){
//             return arr[i];
//         }
//         int max = getMax(arr, i + 1, n);
//         return Math.max(max, arr[i]);
//     }
//     public static void main(String[] args) {
//         int arr[] = {23, 45, 67, 45, 12, 9, 89};
//         System.out.println("Minimum Element is = " + getMin(arr, 0, arr.length));
//         System.out.println("Maximum Element is = " + getMax(arr, 0, arr.length));
//     }
// }









// Time Complexity: O(n)
// Auxiliary Space: O(n), as implicit stack is used due to recursion

// package out.production.ArrayQuestions;

public class RecursiveMinMax {

    public static int getMin(int arr[], int i, int n) {
        return (n == 1) ? arr[i] : Math.min(arr[i], getMin(arr, i + 1, n - 1));

        //or
        // above and below code both are same meaning 

        
        //if(i == n - 1){
        //             return arr[i];
        //         }
        //         int max = getMax(arr, i + 1, n);
        //         return Math.max(max, arr[i]);
    }

    public static int getMax(int arr[], int i, int n) {
        return (n == 1) ? arr[i] : Math.max(arr[i], getMax(arr, i + 1, n - 1));

        //or
        // if(i == n - 1){
        //             return arr[i];
        //         }
        //         int max = getMax(arr, i + 1, n);
        //         return Math.max(max, arr[i]);
    }

    public static void main(String[] args) {
        int arr[] = {12, 1234, 45, 67, 1};
        int n = arr.length;
        System.out.print("Minimum element of array: "
                + getMin(arr, 0, n) + "\n");
        System.out.println("Maximum element of array: "
                + getMax(arr, 0, n));
    }

}
