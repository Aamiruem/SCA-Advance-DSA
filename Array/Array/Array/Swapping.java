// swapping its self 
package Array;

public class Swapping {

    public static void swapAlternate(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Before swapping array: ");
        for (int x : arr) {
            System.out.println(x);
        }
        System.out.println("\nAfter swapping : ");
        swapAlternate(arr);
        for (int x : arr) {
            System.out.println(x);
        }
        // System.out.println("\nArray after swapping alternate elements: ");
    }
}
