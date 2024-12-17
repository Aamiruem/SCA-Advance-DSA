package out.production.ArrayQuestions;
import java.util.Arrays;
public class LibraryMinMax {
    public static int getMin(int arr[], int n){
        return Arrays.stream(arr).min().getAsInt();
    }

    public static int getMax(int arr[], int n){
        return Arrays.stream(arr).max().getAsInt();
    }

    public static void main(String[] args) {
        int arr[] = {23, 45, 67, 45, 12, 9, 89};
        System.out.println("Minimum Element is = " + getMin(arr, arr.length));
        System.out.println("Maximum Element is = " + getMax(arr, arr.length));
    }
    
}
