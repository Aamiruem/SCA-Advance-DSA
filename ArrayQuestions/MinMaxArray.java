package out.production.ArrayQuestions;
import java.util.Arrays;
public class MinMaxArray {
    public static void main(String[] args) {
        int arr[] = {23, 45, 67, 45, 12, 9, 89};
        Arrays.sort(arr); 

        System.err.println("Min values is = " + arr[0]);
        System.err.println("Max values is = " + arr[arr.length - 1]);
    }
}


//Time complexity = O(n log n)
//Space complexity = O(1)
