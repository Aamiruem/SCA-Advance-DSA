// package Array;

public class FindDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 2, 3, 5, 6, 7, 8, 9, 4, 5};
        findDuplicates(arr);
    }

    public static void findDuplicates(int arr[]) {
        int n = arr.length;
        System.out.println("Duplicate numbers are: ");

        for (int i = 0; i < n; i++) {
            int x = Math.abs(arr[i]);
            if (arr[x - 1] >= 0) {
                arr[x - 1] = -arr[x - 1];
            } else {
                System.out.print(x + " ");
                System.out.println("Duplicate found: " + arr[i] + " at index " + i);
            }
        }
    }
}
