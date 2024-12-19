// package ArrayQuestions;

import java.util.Arrays;

public class findDuplicate {
    public static int findDup(int arr[]) {
        int n = arr.length;
        int Dup = -1;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                Dup = arr[i];
                break;
            }
        }
        return Dup;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 4};
        int duplicate = findDup(arr);
        System.out.println("Duplicate number is " + duplicate);
    }
}
