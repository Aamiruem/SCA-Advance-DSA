// Time Complexity: O(n). The recursion goes through each element once, so it’s linear.

// Auxiliary Space Complexity: O(n) for non in-place, O(log n) for in-place (due to recursion stack).





package out.production.ArrayQuestions;

public class RecursionReversedArrays {
    public static void reversedArray(int arr[], int start, int end){
        if(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            reversedArray(arr, start, end);
        }
    }
    public static void printArray(int arr[], int size){
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Original array is: ");
        printArray(arr, 6);
        System.out.println("Reversing array using recursion: ");
        reversedArray(arr, 0, 5);
        // reversedArray(arr, start, end);
        printArray(arr, 6);
    }
}
