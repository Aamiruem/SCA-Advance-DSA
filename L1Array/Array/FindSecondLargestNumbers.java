// package SCA-Advance-DSA.L1Array.Array;

import java.util.Arrays;
public class FindSecondLargestNumbers {
    public static int findLargest(int[] arr){
        Arrays.sort(arr);
        for(int i=arr.length-1; i>0; i--){
            if(arr[i] != arr[i-1]){
                return arr[i-1];
            }
        }
        return Integer.MIN_VALUE;
    }
    public static void main(String[] args) {
        int[] arr = {9, 12, 4, 11, 6, 3, 21, 5};
        int secondLargest = findLargest(arr);
        System.out.println("Second largest element is: " + secondLargest);
    }
}
