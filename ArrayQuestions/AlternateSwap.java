// package SCA-Advance-DSA.ArrayQuestions;

public class AlternateSwap {
    public static int swapAlternate(int arr[]) {
        for (int i = 0; i < arr.length; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {9, 3, 6, 12, 4, 32};
        System.out.println("Array before swapping alternate elements: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        swapAlternate(arr);
        System.out.println("Array after swapping alternate elements: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
