// package ArrayQuestions;
// public class ReverseUsingWhileLoops {
//     public static void reversedArr(int arr[], int start, int end){
//         while(start < end){
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//         for(int i : arr){
//             System.out.print(i + " ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 5, 6, 7};
//         reversedArr(arr, 0, arr.length - 1);
//     }
// }










package out.production.ArrayQuestions;

public class ReverseUsingWhileLoops {

    public static void reversedArr(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void printArray(int arr[], int size){
        // System.out.print("This is a reversed Array is ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int arr[] = {1, 2, 3, 4, 5, 6, 7};
        // reversedArr(arr, 0, arr.length - 1);
        // printArray(arr, arr.length);



        int arr[] = {1, 2, 3, 4, 5, 6}; 
        printArray(arr, 6); 
        reversedArr(arr, 0, 5); 
        System.out.print("Reversed array is \n"); 
        printArray(arr, 6); 

    }
}
