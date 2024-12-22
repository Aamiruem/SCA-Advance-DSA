package Array;

import java.util.Arrays;

public class SortZeroOneAndTwo {
    public static void sort012(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        var curr = 0;
        int temp;

        //three pointer approach 
        while (curr <= right) {
            if (arr[curr] == 0) {
                temp = arr[left];
                arr[left] = arr[curr];
                arr[curr] = temp;
                left++;
                curr++;
            } else if (arr[curr] == 2) {
                temp = arr[curr];
                arr[curr] = arr[right];
                arr[right] = temp;
                right--;
            } else {
                curr++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort012(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}
