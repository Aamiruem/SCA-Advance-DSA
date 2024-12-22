// Time Complexity: O(n)
// Auxiliary Space: O(1), as no extra space is used



// package out.production.ArrayQuestions;

public class MinMax {
    public static int getMin(int arr[], int n){
        int min = arr[0];
        for(int i = 1; i < n; i++){
            // if(arr[i] < min){
            //     min = arr[i];
            // }
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    public static int getMax(int arr[], int n){
        int max = arr[0];
        for(int i = 1; i < n; i++){
            // if(arr[i] > max){
            //     max = arr[i];
            // }
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {23, 45, 67, 45, 12, 9, 89};
        System.out.println("Minimum Element is = " + getMin(arr, arr.length));
        System.out.println("Maximum Element is = " + getMax(arr, arr.length));
    }
}
